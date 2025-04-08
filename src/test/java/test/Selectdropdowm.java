package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdropdowm
{
public static void main(String []args) throws InterruptedException {
    ChromeDriver d = new ChromeDriver();
    d.get("https://rahulshettyacademy.com/dropdownsPractise/");
    d.findElement(By.id("divpaxinfo")).click();
    System.out.println( d.findElement(By.id("divpaxinfo")).getText());
    Thread.sleep(2000);
   int i = 1 ;
    while (i<5)
    {
        d.findElement(By.id("hrefIncAdt")).click();   //4 time exectue this loop
        i++;
    }
    d.findElement(By.id("divpaxOptions")).click();
   System.out.println( d.findElement(By.id("divpaxinfo")).getText());


}
}
