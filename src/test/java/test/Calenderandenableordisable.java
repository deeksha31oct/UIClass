package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {
    public static void main (String[]args) throws InterruptedException {
        ChromeDriver r = new ChromeDriver();
        r.get("https://rahulshettyacademy.com/dropdownsPractise/");
        r.manage().window().maximize();
        r.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        r.findElement(By.cssSelector("a[value='IXB']")).click();
        Thread.sleep(2000);
        r.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BHO']")).click();
        Thread.sleep(2000);
        r.findElement(By.cssSelector("a[class='ui-state-default ui-state-active']")).isSelected();
        Thread.sleep(2000);
       // System.out.println(r.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        System.out.println(r.findElement(By.id("Div1")).getDomAttribute("style"));
        r.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(r.findElement(By.id("Div1")).getDomAttribute("style"));

        //System.out.println(r.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        if(r.findElement(By.id("Div1")).getDomAttribute("style").contains("1"))
        {
            System.out.println("its enabled");
            Assert.assertTrue(true);
        }
        else
        {
            Assert.assertFalse(false);
        }

    }

}
