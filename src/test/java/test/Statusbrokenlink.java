package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Statusbrokenlink {
    public static void main(String[]args) throws IOException {
        ChromeDriver  d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        SoftAssert s = new SoftAssert();

        List<WebElement> links = d.findElements(By.cssSelector("li.gf-li a"));
      for (WebElement link:links)
        {
            String url = link.getAttribute("href");
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            con.setRequestMethod("HEAD");
            con.connect();
             int respcode = con.getResponseCode();
             System.out.println(respcode);
            s.assertTrue(respcode<400,"The link with text" + link.getText()+ "is broken with code" + respcode);
          /*   if(respcode>400)
             {
                 System.out.println("The link with text" + link.getText()+ "is broken with code" + respcode);
                 Assert.assertTrue(false);
             }*/


        }
      s.assertAll();
    }
}
