package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Windowassignment {
    public static void main(String[]args){
        ChromeDriver d = new ChromeDriver();
        d.get("https://the-internet.herokuapp.com/");
        d.findElement(By.linkText("Multiple Windows")).click();
        d.findElement(By.cssSelector("a[href*='windows']")).click();
      //  d.manage().window().maximize();


        Set<String>win = d.getWindowHandles();
        Iterator<String> it = win.iterator();
        String par = it.next();
        d.switchTo().window(par);
        System.out.println(d.findElement(By.xpath("//div/h3")).getText());
        d.switchTo().window(par);
        System.out.println(d.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
    }
}
