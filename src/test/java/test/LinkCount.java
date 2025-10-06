package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class LinkCount {
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/AutomationPractice/");
        //count of entire link in that page
        System.out.println(d.findElements(By.tagName("a")).size());
        //2- count the link only footer sections
        WebElement footerd = d.findElement(By.id("gf-BIG"));
        System.out.println(footerd.findElements(By.tagName("a")).size());
        //3- link count only first coloumn
WebElement columndriver = footerd.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());
        //4- click om each link in colomun and check if the pages are opening
        for(int i = 1 ;i<columndriver.findElements(By.tagName("a")).size();i++) {
            String clicktonewlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicktonewlink);
            Thread.sleep(5000);
        }
            Set<String> ab = d.getWindowHandles();
            Iterator<String> it = ab.iterator();

            while (it.hasNext()) {
                d.switchTo().window(it.next());
                System.out.println(d.getTitle());
                System.out.println(d.getTitle());
            }
        }
    }

