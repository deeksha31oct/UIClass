package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ExplicitWait
{
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver c = new ChromeDriver();

        String[] name = {"iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry"};

        c.get("https://rahulshettyacademy.com/loginpagePractise/");
        c.manage().window().maximize();
        c.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        c.findElement(By.id("password")).sendKeys("learning");
        c.findElement(By.cssSelector(".customradio:nth-child(2)"));
        WebElement options =c.findElement(By.cssSelector("select[class='form-control']"));

        Select dropdown = new Select(options);

        dropdown.selectByValue("consult");
        c.findElement(By.id("terms")).click();
        WebDriverWait wait = new WebDriverWait(c, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.id("signInBtn"))));
        c.findElement(By.id("signInBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h4.card-title")));

        // Call the add method
        add(c, name);
        c.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='btn btn-success']")));
        c.findElement(By.cssSelector("button[class='btn btn-success']")).click();
       //c.quit();
    }

        public static void add(ChromeDriver c , String[] name)
        {
        int j =0;
            List<WebElement>E = c.findElements(By.cssSelector("h4[class='card-title']"));

            for(int i = 0 ; i< E.size();i++)
            {
               String[]dat = E.get(i).getText().split("-");
                String newdata = dat[0].trim();
                List<String>name2 = Arrays.asList(name);
                if(name2.contains(newdata))

                {
                    j++;
                    c.findElements(By.cssSelector("button[class='btn btn-info']")).get(i).click();
                    if (j==name.length) {
                        break;
                    }
            }
        }

    }}
