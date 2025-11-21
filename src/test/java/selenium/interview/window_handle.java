package selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.Set;

public class window_handle {
    public static void main(String[]args) throws InterruptedException {
        ChromeOptions c = new ChromeOptions();
        c.addArguments("--disable-notification","--disable-popup","--remote-allow_origins=*","--disable-dev-shm-usage","--no-sandbox");
        ChromeDriver  d = new ChromeDriver(c);
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.manage().window().maximize();
       WebElement e =  d.findElement(By.id("openwindow"));
       e.click();
String parent = d.getWindowHandle();
        System.out.println(parent);
Set<String> child = d.getWindowHandles();
        System.out.println(child);
        System.out.println(d.getTitle());
      // d.manage().window().maximize();
        Thread.sleep(2000);
        Iterator<String>it = child.iterator();
        String per =it.next();
        String chi = it.next();
d.switchTo().window(chi).close();
d.close();



    }
}
