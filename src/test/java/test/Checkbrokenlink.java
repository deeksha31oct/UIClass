package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbrokenlink {
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        //broken url
        //step 1 - is to get all url tied up to the links using selenium
        //java method to call the url and get the status code
        // if status code>400 then url is not working ->link which tied to url is broken

      String url =   d.findElement(By.cssSelector("$('a[href=\"soapui\"]')")).getAttribute("href");
    }
}
