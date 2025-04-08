package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Addtocard {

    public static void main(String[] args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        int j = 0;
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot","Carrot","Tomato"};

        d.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        d.manage().window().maximize();
        Thread.sleep(1000);

      //  addItems(d, itemsNeeded);

      //  d.quit();

    List<WebElement> prod = d.findElements(By.cssSelector("h4.product-name"));
        Thread.sleep(2000);

        for (int i = 0; i < prod.size(); i++) {
            String[] name = prod.get(i).getText().split("-");
            String formattedName = name[0].trim();

            List<String> itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {
                j++;
                d.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
//if(j==3)
                if (j == itemsNeeded.length) {

                    break;

                }
            }
        }
    }
}

