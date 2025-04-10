package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) d;
       js.executeScript("window.scrollBy(0,500)");
       Thread.sleep(3000);
       js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
      List<WebElement> val= d.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
      int sum = 0;
      for(int i = 0;i<val.size();i++){
       System.out.println(Integer.parseInt(val.get(i).getText()));
          sum = sum+Integer.parseInt(val.get(i).getText());
       }
       System.out.println(sum);
      d.findElement(By.cssSelector(".totalAmount")).getText();
      System.out.println(sum);
      d.findElement(By.cssSelector(".totalAmount")).getText();
      int total = Integer.parseInt(d.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
        Assert.assertEquals(sum,total);
    }
}
