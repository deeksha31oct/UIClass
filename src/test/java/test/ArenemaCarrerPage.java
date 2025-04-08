package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ArenemaCarrerPage
{
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://arenema.com/");
        d.manage().window().maximize();
        d.findElement(By.id("menu-item-29259")).click();
        d.findElement(By.cssSelector("a[class='box-link']")).click();
      //  Thread.sleep(2000);
      List<WebElement> select= d.findElements(By.cssSelector("input[class='wpcf7-form-control wpcf7-text wpcf7-validates-as-required']"));
      for(int i = 0;i<select.size();i++)
      {
          String s = select.get(i).getText();
          if(s.contains(" Job position (required)"))
          {
              d.findElements(By.xpath("//a[contains(text(),' Job position (required)')]")).get(i).click();
              break;
          }
      }
        //d.findElement(By.xpath("//h3[text()='AUTOMATION EXPERT']/ancestor::a")).click();
        //d.findElement(By.xpath("//a[contains(text(),'AUTOMATION EXPERT')]")).click();



    }
}
