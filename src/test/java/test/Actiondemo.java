package test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actiondemo {
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("www.amozon.com");
        Actions a = new Actions(d);

    }
}
