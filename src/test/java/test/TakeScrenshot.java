package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScrenshot {
    public static void main(String[]args) throws IOException {
    ChromeDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
        d.get("https://arenema.com/");
       File f = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f,new File("C:\\Users\\INDIA\\Desktop\\Automation project deeksha\\arenm_scr.jpg"));
        System.out.println("print "+f.getAbsolutePath());

}}
