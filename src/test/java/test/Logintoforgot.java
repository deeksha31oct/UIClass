package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintoforgot
{
    public static void main (String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/locatorspractice/");
       // d.findElement(By.id("inputUsername")).sendKeys("raj@gmail.com");
       // d.findElement(By.name("inputPassword")).sendKeys("123");
      //  d.findElement(By.id("chkboxOne")).click();
     //   d.findElement(By.id("chkboxTwo")).click();
        d.findElement(By.xpath("//*[@id=\"container\"]/div[2]/form/div[2]/a")).click();
        Thread.sleep(2000);
d.findElement(By.cssSelector("input[placeholder ='Name']")).sendKeys("test");
        d.findElement(By.cssSelector("input[placeholder ='Email']")).sendKeys("test@gmail.com");
        d.findElement(By.cssSelector("input[placeholder ='Phone Number']")).sendKeys("34212");
        d.findElement(By.cssSelector(".reset-pwd-btn")).click();
        d.findElement(By.className("go-to-login-btn")).click();
        Thread.sleep(2000);
        d.findElement(By.id("inputUsername")).sendKeys("raj@gmail.com");
        d.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        d.findElement(By.id("chkboxOne")).click();
        d.findElement(By.id("chkboxTwo")).click();
        //d.findElement(By.cssSelector("//button[@class='submit signInBtn']")).click();
        //regular expression "//button[contains(@class,'submit')]"
        d.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(1000);
        d.quit();
    }}
