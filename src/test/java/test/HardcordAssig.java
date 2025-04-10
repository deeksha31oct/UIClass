package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HardcordAssig {
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        d.manage().window().maximize();
        d.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]/input")).click();
        String op = d.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
        WebElement dropdowm = d.findElement(By.id("dropdown-class-example"));
        Select s= new Select(dropdowm);
        s.selectByVisibleText(op);
        d.findElement(By.name("enter-name")).sendKeys(op);
        d.findElement(By.id("alertbtn")).click();
        String tt = d.switchTo().alert().getText();
        if (tt.contains(op))
        {
        System.out.println("Alert message success");
        }
        else {
            System.out.println("Something wrong with execution");
        }
    }
}
