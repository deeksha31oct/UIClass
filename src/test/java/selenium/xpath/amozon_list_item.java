package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class amozon_list_item {
public static void main(String[]args) throws InterruptedException {
    ChromeOptions op = new ChromeOptions();
    op.addArguments("disable-popup_block");
    op.addArguments("disable-notification");
    op.addArguments("remote_allow_origin=*");
     ChromeDriver d = new ChromeDriver(op);
     d.get("https://www.amazon.in/");
     d.manage().window().maximize();
    WebElement se =  d.findElement(By.id("twotabsearchtextbox"));
    se.sendKeys("hornback foldable cycle");
    WebDriverWait  wt = new WebDriverWait(d , Duration.ofSeconds(5000));
    wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='hornback foldable cycle']"))).click();
    //List<WebElement> select = d.findElements(By.xpath("//div[@aria-label='hornback foldable cycle']"));
    Thread.sleep(2000);
    //d.findElements(By.xpath("//div[@class='puisg-col-inner']")).
    d.findElements(By.xpath("//div[@data-cy='title-recipe']")).
            forEach(el->{
                System.out.println(el.findElement(By.xpath("//div[@data-cy='title-recipe']/a/h2/span")).getAttribute("innerText"));
               System.out.println(el.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='aok-offscreen']")).getAttribute("innerText"));
                System.out.println(el.findElement(By.xpath("//div[@data-cy='price-recipe']/div[2]/div/a")).getAttribute("innerText"));
            });
}
}
