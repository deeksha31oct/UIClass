package test;

import org.openqa.selenium.chrome.ChromeDriver;

public class ArenemaCarrerPage
{
    public static void main(String[]args) {
        ChromeDriver d = new ChromeDriver();
        d.get("https://arenema.com/");
        d.manage().window().maximize();

    }
}
