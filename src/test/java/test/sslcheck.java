package test;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class sslcheck {
    public static void main(String[]args)
    {
        ChromeOptions co = new ChromeOptions();
        Proxy p = new Proxy();
        //p.getHttpProxy("ipaddress");
        co.setCapability("proxy",p);

        Map<String, Object> prefs = new HashMap<String, Object>();

        prefs.put("download.default_directory", "/directory/path");

        co.setExperimentalOption("prefs", prefs);
        co.setAcceptInsecureCerts(true);
        ChromeDriver d = new ChromeDriver(co);
        d.get("https://expired.badssl.com/");
        System.out.println(d.getTitle());
    }
}
