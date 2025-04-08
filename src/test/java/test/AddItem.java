package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddItem {


        public static void main(String[] args) throws InterruptedException {
            ChromeDriver c = new ChromeDriver();
            c.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            String[] item = {"Cashews", "Walnuts", "Nuts Mixture"};

            c.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            c.manage().window().maximize();

add(c,item);
            c.findElement(By.cssSelector("img[alt='Cart']")).click();
            c.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
            c.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
            c.findElement(By.cssSelector("button.promoBtn")).click();
            //Explicit wait
            WebDriverWait w = new WebDriverWait(c, Duration.ofSeconds(5));
            w.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo"))));
            System.out.println(c.findElement(By.cssSelector("span.promoInfo")).getText());
        }




            public static  void add( ChromeDriver c,String[] item) throws InterruptedException {

                int j=0;

            List<WebElement> E = c.findElements(By.cssSelector("h4[class='product-name']"));
           // Thread.sleep(2000);

            for(int i =0;i<E.size();i++)
            {
               String []dat =E.get(i).getText().split("-");
            String newdata = dat[0].trim();
            List<String>item2 = Arrays.asList(item);
                if (item2.contains(newdata))
                {
                    j++;
                    c.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                    if (j==item.length) {
                       break;
                    }
                  //

                }
            }


        }}
