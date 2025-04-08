package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arenema_Contact {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://arenema.com/");
        d.manage().window().maximize();
        d.findElement(By.id("menu-item-29258")).click();
        d.findElement(By.cssSelector("input[class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required']")).sendKeys("Deeksha");
        d.findElement(By.cssSelector("input[class='wpcf7-form-control wpcf7-email wpcf7-validates-as-required wpcf7-text wpcf7-validates-as-email']")).sendKeys("deeksha@gmail.com");

        d.findElement(By.cssSelector("input[class='wpcf7-form-control wpcf7-text']")).sendKeys("Test end to end automation for contact page in arenema");

        d.findElement(By.cssSelector("textarea[class='wpcf7-form-control wpcf7-textarea']")).sendKeys("I am learning automation testing with java and selenium with the help of this cousre i am automate end end workflow for arenama query in contact page");
        d.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(2000);
        System.out.println(d.findElement(By.cssSelector("div[class='wpcf7-response-output']")));

    }
}
