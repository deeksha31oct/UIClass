package selenium.interview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class rahul_sheet_fullpage
{
    public static  void main(String[]args)
    {
        ChromeOptions ot = new ChromeOptions();
        ot.addArguments("--disable-popup","--disable-notifications","--remote-allow_origins=*","--no-sandbox","--disable-dev-shm-usage");
        ChromeDriver d = new ChromeDriver(ot);
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.manage().window().maximize();
        System.out.println("print radio button");
       WebElement we =  d.findElement(By.xpath("//div[@id='radio-btn-example']//fieldset"));
       we.getText();


    }
}

