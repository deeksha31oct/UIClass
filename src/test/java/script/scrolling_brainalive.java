package script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class scrolling_brainalive {
    public static void main(String[]args) throws InterruptedException {
        ChromeOptions cc = new ChromeOptions();
        cc.addArguments("--disable-block-popup");
        (cc).addArguments("--disable-notification");
        cc.addArguments("remote-allow-origins=*");
       ChromeDriver d= new ChromeDriver(cc);
        WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5000));
       // w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("d.get(https://brainalive.ai/)")));
    d.get("https://brainalive.ai/");
    d.manage().window().maximize();
    d.getTitle();
        System.out.println(d.getTitle());

        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy(0,900);");
        Thread.sleep(3000);













    }
}
