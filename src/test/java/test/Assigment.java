package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment
{
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d= new ChromeDriver();
        d.get("https://rahulshettyacademy.com/angularpractice/");
        d.manage().window().maximize();
        Thread.sleep(2000);
        d.findElement(By.name("name")).sendKeys("Deeksha");
        Thread.sleep(2000);
        d.findElement(By.name("email")).sendKeys("Deeksha@gmail.com");
        d.findElement(By.id("exampleInputPassword1")).sendKeys("Deeksha@");
d.findElement(By.id("exampleCheck1")).click();

d.findElement(By.cssSelector("select[id='exampleFormControlSelect1']"));
d.findElement(By.className("form-check form-check-inline")).click();
d.findElement(By.className("form-control")).isSelected();
d.findElement(By.className("btn btn-success")).click();

    }
}
