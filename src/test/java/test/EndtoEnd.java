package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class EndtoEnd {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup(); // Automatically handles driver

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

            driver.findElement(By.cssSelector("input[id='ctl00_mainContent_rbtnl_Trip_0']")).click();

            wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@value='BLR']"))).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BHO']"))).click();

            driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date1']")).click();

            driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

            driver.findElement(By.id("ctl00_mainContent_SeniorCitizenDiv")).click();

            WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
            Select dropdown = new Select(staticDropdown);
            dropdown.selectByIndex(2);

            wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_btn_FindFlights"))).click();
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}

