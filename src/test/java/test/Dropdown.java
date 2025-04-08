package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    public static void main(String []args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement staticDropdown = d.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(2);
        Thread.sleep(2000);
        dropdown.selectByVisibleText("USD");
        Thread.sleep(1000);
        dropdown.selectByValue("INR");
        d.close();



    }
}
