package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Browsers_Driver\\chromedriver.exe");
  //webdriver.gecko.driver
       // System.setProperties("webdriver.gecko.driver","\"C:\\Users\\user\\Downloads\\geckodriver-v0.36.0-win-aarch64 (1)\"");
//WebDriver  drvier = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/"); // Open a test URL
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }
}
