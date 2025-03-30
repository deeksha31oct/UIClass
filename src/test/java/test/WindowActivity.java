package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivity
{
    public static void main (String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.google.com/");
        d.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
       Thread.sleep(2000);
        d.navigate().back();
        Thread.sleep(2000);
        d.navigate().forward();
      //  d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.manage().window().maximize();
        d.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
        d.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).click();
        d.close();

    }}
