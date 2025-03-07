package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Browsers_Driver\\chromedriver.exe");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/"); // Open a test URL
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
