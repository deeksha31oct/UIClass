package selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class price_list {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-popup");
        options.addArguments("--disable-notifications");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        System.out.println("Instructor | Course | Price");
        System.out.println("----------------------------------------------");

        // Using FULL XPATH to locate all rows of the course table
        List<WebElement> rows = driver.findElements(By.xpath("/html/body/div[3]/div[1]/fieldset/table/tbody/tr"));

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() == 3) {
                String instructor = cells.get(0).getText();
                String course = cells.get(1).getText();
                String price = cells.get(2).getText();

                System.out.println(instructor + " | " + course + " | " + price);
            }
        }

        driver.quit();
    }
}
