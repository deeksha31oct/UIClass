package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class relativeloc {
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        //locator - below , above , right of and leftof
        d.get("https://rahulshettyacademy.com/angularpractice/");
      WebElement name =  d.findElement(By.cssSelector("[name='name']"));
        System.out.println(d.findElement(with(By.tagName("label")).above(name)).getText());
   WebElement dob =  d.findElement(By.cssSelector("[for='dateofBirth']"));
d.findElement(with(By.tagName("input")).below(dob)).click();
WebElement ice = d.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
d.findElement(with(By.tagName("input")).toLeftOf(ice)).click();

WebElement RADIO = d.findElement(By.id("inlineRadio1"));
        System.out.println(d.findElement(with(By.tagName("label")).toRightOf(RADIO)).getText());
    }
}
