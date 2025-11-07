package selenium.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class computer_list {
    public static void main(String[]args) throws InterruptedException {
        ChromeOptions o= new ChromeOptions();
        o.addArguments("disable-popup-block");
        o.addArguments("diable-notification");
        o.addArguments("remote_allow_origin=*");
        ChromeDriver d= new ChromeDriver(o);
        d.get("https://www.amazon.in/");
        d.manage().window().maximize();
        WebDriverWait ww= new WebDriverWait(d, Duration.ofSeconds(5000));
        ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Mobiles')]"))).click();


    }
}
