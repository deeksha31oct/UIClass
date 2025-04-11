package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Autodrop {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("http://qaclickacademy.com/practice.php");
        d.manage().window().maximize();
        d.findElement(By.id("autocomplete")).sendKeys("ind");
        d.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        d.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        d.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        Thread.sleep(2000);
        System.out.println(d.findElement(By.id("autocomplete")).getAttribute("value"));
    }
}
