package selenium.interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class prices_list {
    public static void main(String[]args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();

        ChromeOptions c = new ChromeOptions();
        c.addArguments("--disable-popup");
        c.addArguments("--disable-notifications");
        c.addArguments("--remote-allow-origins=*");
        c.addArguments("--no-sandbox");
        c.addArguments("--disable-dev-shm-usage");
        ChromeDriver s = new ChromeDriver(c);
        s.get("https://rahulshettyacademy.com/AutomationPractice/");
        s.manage().window().maximize();
        s.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        System.out.println("instructor|course|price");
        System.out.println("----------------");
        System.out.println("=== Table 1 ===");
        List<WebElement> wet = s.findElements(By.xpath("//div[@class='left-align']/fieldset/table/tbody/tr"));
        for (WebElement row : wet) {
            List<WebElement> Co = row.findElements(By.tagName("td"));
            if (Co.size() == 3) {
                String ins = Co.get(0).getText();
                String course = Co.get(1).getText();
                String price = Co.get(2).getText();
                System.out.println(ins + "|" + course + "|" + price);
            }
            }

        System.out.println("=== Table 2 ===");
            List<WebElement> le = s.findElements(By.xpath("//div[@class='tableFixHead']//table/tbody/tr"));
            for (WebElement left : le) {
                List<WebElement> te = left.findElements(By.tagName("td"));
              //  System.out.println("Table 2 row count: " + le.size());


                if (te.size() == 4) {
                    String right_ins = te.get(0).getText();
                    String right_course = te.get(1).getText();
                    String right_price = te.get(2).getText();
                    String right_city = te.get(3).getText();
                    System.out.println(right_ins + "|" + right_course + "|" + right_price + "|" + right_city);
                }
            }

            s.close();
        }
    }
