package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ArenamaLinkCount
{
    public static void main(String[]args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://arenema.com/");
        //total no of link
        System.out.println(d.findElements(By.tagName("a")).size());
        //total no of header link
        WebElement headerlink = d.findElement(By.xpath("//*[@id=\"top\"]/div/div/div[2]/nav/ul[1]/li"));
        System.out.println(headerlink.findElements(By.xpath("//*[@id=\"top\"]/div/div/div[2]/nav/ul[1]/li")).size());
        //total no of footer link
        WebElement footerlink1 = d.findElement(By.xpath("//*[@id=\"nav_menu-2\"]/div//li"));
        System.out.println(footerlink1.findElements(By.xpath("//*[@id=\"nav_menu-2\"]/div//li")).size());
        //total no of footer one coloumn link
        WebElement footercolumnlink = d.findElement(By.cssSelector("div[class='menu-arenema-menu-container']"));
        System.out.println(footercolumnlink.findElements(By.cssSelector("div[class='menu-arenema-menu-container']")));
        for (int i = 0; i < footercolumnlink.findElements(By.tagName("a")).size(); i++) {
            String clicktonewlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            footercolumnlink.findElements(By.tagName("a")).get(i).sendKeys(clicktonewlink);
            Thread.sleep(5000);
        }
        // print all the coloumn  link
            Set<String> ab = d.getWindowHandles();
            Iterator<String> it = ab.iterator();

            while (it.hasNext())
            {
                d.switchTo().window(it.next());
                System.out.println(d.getTitle());
            }
        }
    }
