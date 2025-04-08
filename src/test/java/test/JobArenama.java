package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JobArenama {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://arenema.com/");
        d.manage().window().maximize();
        d.findElement(By.id("menu-item-29259")).click();
        d.findElement(By.cssSelector("a[class='box-link']")).click();
        //d.findElement(By.xpath("1")).sendKeys("javaLead");
        Thread.sleep(2000);
        d.findElement(By.xpath("//label[@xpath='1']")).sendKeys("javaLead");//(here i am facing the issue)
        d.close();

    }}
