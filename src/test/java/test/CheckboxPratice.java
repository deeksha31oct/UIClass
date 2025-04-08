package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPratice {
    public static void main (String[]args) throws InterruptedException {
        ChromeDriver s = new ChromeDriver();
        s.get("https://rahulshettyacademy.com/AutomationPractice/");
       // Thread.sleep(2000);
        s.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected();
        s.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
        Thread.sleep(2000);
        s.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
       System.out.println(s.findElement(By.cssSelector("input[id='checkBoxOption1']")));
       s.findElement(By.cssSelector("input[id='checkBoxOption1']")).getSize();

    }
}
