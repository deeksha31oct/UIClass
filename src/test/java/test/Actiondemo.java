package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actiondemo {
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.amazon.in/");
        d.manage().window().maximize();
        Actions a = new Actions(d);
        WebElement move = d.findElement(By.cssSelector("div[id='nav-link-accountList']"));
a.moveToElement(d.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
        //move to element
a.moveToElement(move).contextClick().build().perform();
    }
}
