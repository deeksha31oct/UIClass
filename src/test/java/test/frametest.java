package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frametest {
    public static void main(String[]args)
    {
        ChromeDriver d = new ChromeDriver();
        d.get("https://jqueryui.com/droppable/");
        System.out.println(d.findElements(By.tagName("iframe")).size());
        d.switchTo().frame(0);
        d.switchTo().frame(d.findElement(By.className("demo-frame")));
        d.findElement(By.id("draggable")).click();
        Actions a = new Actions(d);
        WebElement s = d.findElement(By.id("draggable"));
        WebElement t = d.findElement(By.id("droppable"));
        a.dragAndDrop(s,t).build().perform();
        d.switchTo().defaultContent();
    }

}
