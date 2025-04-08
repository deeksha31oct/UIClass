package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertTION
{
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert .assertFalse(d.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
        d.findElement(By.id("//input[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
        Assert .assertTrue(d.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']']")).isSelected());
       // Assert.assertFalse(false);

    }
}
