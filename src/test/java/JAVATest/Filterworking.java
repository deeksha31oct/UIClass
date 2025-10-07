package JAVATest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;


public class Filterworking
{
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        d.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> vegi = (List<WebElement>) d.findElement(By.xpath("//tr/td[1]"));
//give 1 result
      List<WebElement> filter =   vegi.stream().filter(vegis->vegis.getText().contains("Rice"))
                .collect(Collectors.toList());
        Assert.assertEquals(vegi.size(),filter.size());
        //enter
    }
}
