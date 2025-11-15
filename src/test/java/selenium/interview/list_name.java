package selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class list_name {
    public static void main(String[]args)
    {
        ChromeOptions o= new ChromeOptions();
        o.addArguments("--disable-pop_up");
        o.addArguments("--disable-notifications");
        o.addArguments("--remote_allow_origins=*");
        o.addArguments("--no-sandbox");
        o.addArguments("--disable-dev-shm-usage");
        ChromeDriver d = new ChromeDriver(o);
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.manage().window().maximize();
        List<WebElement> e = d.findElements(By.xpath("//div[@class='left-align']//table[@id='product']//tbody/tr/td[2]"));
        for(WebElement we : e)
        {
            System.out.println(we.getText());
        }


    }
}
