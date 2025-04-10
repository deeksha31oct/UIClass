package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Calenderexample {
    public static void main(String[]args) throws InterruptedException {
        String month = "5";
        String year = "2028";
        String day = "25";
        String[] expected  = {month,day,year};
        ChromeDriver d = new ChromeDriver();
        d.get("https://www.globalsqa.com/demo-site/datepicker/");
        d.manage().window().maximize();
        WebElement fr =  d.findElement(By.cssSelector("iframe[data-src*='datepicker']"));
        d.switchTo().frame(fr);
        d.findElement(By.id("datepicker")).click();
        Thread.sleep(2000);
       WebElement years =  d.findElement(By.cssSelector("select[class='ui-datepicker-year']"));
       years.sendKeys(year);

       WebElement months = d.findElement(By.cssSelector("ui-datepicker-month"));
       months.sendKeys(month);
       d.findElement(By.xpath("//a[text()='"+day + " ']")).click();
        Thread.sleep(2000);
        List<WebElement> actual = d.findElements(By.id("datepicker"));
        for(int i = 0 ; i<actual.size();i++)
        {
            System.out.println(actual.get(i).getAttribute("value"));
            Assert.assertEquals(actual.get(i).getAttribute("value"),expected[i]);
        }
        d.close();


    }
}
