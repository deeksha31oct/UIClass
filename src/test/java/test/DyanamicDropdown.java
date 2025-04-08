package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropdown
{
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver c = new ChromeDriver();
        c.get("https://rahulshettyacademy.com/dropdownsPractise/");
        c.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       // Thread.sleep(1000);
        c.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(1000);
        //c.findElement(By.xpath("//a[@value='BHO'][1]")).click();// FIRST option with indexing
        c.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BHO']")).click();//second option with parent child relationship
    }

}
