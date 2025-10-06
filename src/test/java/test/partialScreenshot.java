package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class partialScreenshot {
    public static void main(String[]args) throws IOException {
        ChromeDriver d = new ChromeDriver();
        //partial screenshot of the half page
        d.get("https://rahulshettyacademy.com/angularpractice/");
       WebElement name =  d.findElement(By.cssSelector("[name='name']"));
               name.sendKeys("deeksha");


       File file = d.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file , new File("logo.png"));

        //get height and width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());

    }
}
