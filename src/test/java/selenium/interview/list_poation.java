package selenium.interview;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class list_poation {
    public static void main (String[]args)
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions op= new ChromeOptions();
        op.addArguments("disable-popup_block");
        op.addArguments("disable-notification");
        op.addArguments("remote_allow_origins=*");
        op.addArguments("--no-sandbox");
        op.addArguments("--disable-dev-shm-usage");

        ChromeDriver d = new ChromeDriver(op);
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) d;
        js.executeScript("window.scrollBy(0,300)");
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        d.findElements(By.xpath("//div[@class='tableFixHead']//tbody/tr/td[2]")).forEach(cell -> {
            System.out.println(cell.getText());
        });
        d.close();

d.quit();

    }




}
