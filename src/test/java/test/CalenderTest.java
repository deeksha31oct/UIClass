package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class CalenderTest {
    public static void main(String[]args)
    {
        String month = "5";
        String date = "15";
        String year = "2028";
        String[] expected  = {month,date,year};

        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        d.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        d.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        d.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        d.findElement(By.xpath("//button[text()='" + year +"']")).click();
        d.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)).click();
        d.findElement(By.xpath("//abbr[text()='" + date +"']")).click();
        System.out.println(d.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());
        List <WebElement> actual = d.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
        for(int i = 0 ; i<actual.size();i++)
        {
            System.out.println(actual.get(i).getAttribute("value"));
            Assert.assertEquals(actual.get(i).getAttribute("value"),expected[i]);
        }
        d.close();
    }
}
