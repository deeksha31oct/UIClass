package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Mislenous {
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
      //  d.manage().deleteCookieNamed("sessionkey");//when you click any link and login
        d.get("www.google.com");

        //
    }
}
