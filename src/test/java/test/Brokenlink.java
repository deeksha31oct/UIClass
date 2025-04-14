package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Brokenlink {
    public static void main(String []args) throws IOException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
    //  String url =   d.findElement(By.cssSelector("a[href*='soapui']")).getAttribute("href");//not broken link
        String url =   d.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");//broken link
        HttpURLConnection com  = (HttpURLConnection)new URL(url).openConnection();
        com.setRequestMethod("HEAD");
        com.connect();
      int respcode =   com.getResponseCode();
    System.out.println(respcode);
    }
}
