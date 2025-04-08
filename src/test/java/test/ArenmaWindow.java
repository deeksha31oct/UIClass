package test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ArenmaWindow
{
    public static void main(String[]args) {
        ChromeDriver d = new ChromeDriver();
    d.get("https://arenema.com/");
    d.findElement(By.cssSelector(".fa.fa-linkedin")).click();
        d.manage().window().maximize();
        Set<String> win= d.getWindowHandles();//[parent and child window]
        Iterator<String> it = win.iterator();
        String paraent =   it.next();
        String Child =   it.next();
        d.switchTo().window(Child);
        System.out.println(d.findElement(By.id("ember44")).getText());
    }
}
