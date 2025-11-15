package selenium.screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class FullPageScreenshot {
        public static void main(String[] args) throws IOException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://arenema.com/");

            Screenshot screenshot = new AShot()
                    .shootingStrategy(ShootingStrategies.viewportPasting(1000)) // 1000 ms scroll delay
                    .takeScreenshot(driver);

            ImageIO.write(screenshot.getImage(), "JPG", new File("C:\\Users\\INDIA\\Desktop\\Automation project deeksha\\arenm_fullpage.jpg"));

            driver.quit();
        }
    }


