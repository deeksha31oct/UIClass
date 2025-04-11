package test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakeScrenshot {
    public static void main(String[]args) throws IOException {
    ChromeDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
        d.get("https://arenema.com/");
        File s = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(s , new File("C:\\api-tests//screnshot.png"));
        d.close();

}}
