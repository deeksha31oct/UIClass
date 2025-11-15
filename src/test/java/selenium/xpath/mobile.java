package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class mobile {
    public static void main(String[]args) throws IOException {
        ChromeOptions op = new ChromeOptions();
        op.addArguments("disable-popup_block");
        op.addArguments("disable-notifications");
        op.addArguments("remote_allow_origins=*");
        ChromeDriver d= new ChromeDriver();
        d.get("https://www.amazon.in/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles");
        d.getTitle();
        System.out.println(d.getTitle());
WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(2000));
w.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Mobiles')]"))).click();
JavascriptExecutor js = (JavascriptExecutor) d;
js.executeScript("window.scrollBy(0,8000)");
//WebDriverWait wt =new WebDriverWait(d,Duration.ofSeconds(3000));
d.findElements(By.xpath("//ol[@class='a-carousel']")).forEach(lt->{
    System.out.println(d.findElement(By.xpath("//span[@class='dcl-truncate dcl-product-title']")).getAttribute("innertext "));
});
File f = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f,new File("C:\\Users\\INDIA\\Desktop\\Automation project deeksha\\scr23.jpg"));
        System.out.println("scr : "+f.getAbsolutePath());

    }
}
