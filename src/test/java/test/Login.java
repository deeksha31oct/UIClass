package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
    public static void main (String[]args) throws InterruptedException {
       ChromeDriver d = new ChromeDriver();
        //FirefoxDriver d = new FirefoxDriver();
        d.get("https://sso.teachable.com/secure/9521/identity/login/password?force=true");
        d.findElement(By.id("email")).sendKeys("abc@gmail.com");
        d.findElement(By.id("email")).clear();
       // Thread.sleep(2000);
       Thread.sleep(2000);
        d.findElement(By.id("email")).sendKeys("deeksha@gmail.com");
        //d.findElement(By.id("password")).sendKeys("abc");
        d.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("abc");
        d.findElement(By.name("commit")).click();
        System.out.println(d.findElement(By.cssSelector("text-with-icon")).getText());
    }
}
