package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class hornback {
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
        WebDriverWait ww = new WebDriverWait(d, Duration.ofSeconds(5000));
        ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='hornback foldable cycle electric']"))).click();
        Thread.sleep(5000);
     d.findElements(By.xpath("//div[@data-cy='title-recipe']")).forEach(st->{
         System.out.println(st.findElement(By.xpath(".//h2/span")).getAttribute("innerText"));
     });


    }
}
