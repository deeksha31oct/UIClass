package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aleart
{
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.findElement(By.id("name")).sendKeys("deeksha");
        d.findElement(By.id("alertbtn")).click();
        d.switchTo().alert().accept();
        Thread.sleep(2000);
        d.findElement(By.id("confirmbtn")).click();
        d.switchTo().alert().dismiss();
    }
}
