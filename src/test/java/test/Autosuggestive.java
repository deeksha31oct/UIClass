package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Autosuggestive
{
    public static void main (String[]args) throws InterruptedException {
        ChromeDriver c = new ChromeDriver();
        c.get("https://rahulshettyacademy.com/dropdownsPractise/");
        c.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(2000);
        List<WebElement>op = c.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        for( WebElement options :op)
        {
           if( options.getText().equalsIgnoreCase("India"))
           {
               options.click();
               break;
           }
        }
    }
}
