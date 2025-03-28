import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngtest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Use WebDriverManager to handle ChromeDriver
        //  WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testGoogleHomePage() {
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        System.out.println("Page Title is: " + title);
        assert title.contains("Google");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
