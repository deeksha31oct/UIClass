package selenium.interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class running {
    public static void main(String[]args){
    System.out.println("Running test...");
    WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/AutomationPractice/");
System.out.println("Title: " + driver.getTitle());
driver.quit();

}
}