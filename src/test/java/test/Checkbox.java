package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox
{
    public static void main(String[]args)
    {
        ChromeDriver r = new ChromeDriver();
        r.get("https://rahulshettyacademy.com/dropdownsPractise/#");
       // r.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
       System.out.println( r.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        r.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        System.out.println( r.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
        //count the number of checkbox
       System.out.println( r.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
