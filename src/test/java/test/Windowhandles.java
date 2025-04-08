package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Windowhandles {
    public static void main(String[]args)
    {
        ChromeDriver d= new ChromeDriver();
        d.get("https://rahulshettyacademy.com/loginpagePractise/");
        d.findElement(By.cssSelector(".blinkingText")).click();
        d.manage().window().maximize();
        Set<String>win= d.getWindowHandles();//[parent and child window]
        Iterator<String> it = win.iterator();
      String paraent =   it.next();
        String Child =   it.next();
        d.switchTo().window(Child);
        System.out.println(d.findElement(By.cssSelector(".im-para.red")).getText());
     d.findElement(By.cssSelector(".im-para.red")).getText();
        String email =  d.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
       d.switchTo().window(paraent);
        WebDriverWait w = new WebDriverWait(d, Duration.ofSeconds(5));
        w.until(ExpectedConditions.elementToBeClickable(By.id("username")));
        d.findElement(By.id("username")).sendKeys("email");
    }
}
