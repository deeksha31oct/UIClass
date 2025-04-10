package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class Frameassign {
    public static void main(String []args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("https://the-internet.herokuapp.com/");
        WebDriverWait w = new WebDriverWait(d , Duration.ofSeconds(10));
        w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("a[href*='nested_frames']"))));
        d.findElement(By.cssSelector("a[href*='nested_frames']")).click();

        d.switchTo().frame("frame-top");
        d.switchTo().frame("frame-middle");
        System.out.println(d.findElement(By.id("content")).getText());

    }
}
