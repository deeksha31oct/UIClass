package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Newwindow {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d= new ChromeDriver();
        d.get("https://rahulshettyacademy.com/angularpractice/");
        //nevigate on window to another window
        d.switchTo().newWindow(WindowType.TAB);
      Set<String> handle =   d.getWindowHandles();
       Iterator<String> it = handle.iterator();
       String par = it.next();
       String chil = it.next();
       Thread.sleep(1000);
        //d.switchTo().window(nameorHandle)
        d.get("https://rahulshettyacademy.com/#/index");
        String couse = d.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
        Thread.sleep(2000);
        d.switchTo().window(par);
        d.findElement(By.cssSelector("[name='name']")).sendKeys("deeksha");
        Thread.sleep(2000);
        d.quit();
    }
}
