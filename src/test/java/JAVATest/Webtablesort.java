package JAVATest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Webtablesort {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // Click on column header to sort
        driver.findElement(By.xpath("//tr/th[1]")).click();

        // Capture all webelements into list
        List<WebElement> elements = driver.findElements(By.xpath("//tr/td[1]"));

        // Capture text of all webelements into new (original) list
        List<String> originalList = elements.stream().map(WebElement::getText).collect(Collectors.toList());

        // Sort the list
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        // Compare both lists
        Assert.assertTrue(originalList.equals(sortedList));

        // Scan the name column for "Rice" and print the price
        List<String> price;
        do {
            List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));

            price = elementList.stream()
                    .filter(e -> e.getText().equalsIgnoreCase("Rice"))
                    .map(Webtablesort::getPriceVeggie)
                    .collect(Collectors.toList());

            price.forEach(System.out::println);

            if (price.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }

        } while (price.size() < 1);

        driver.quit();
    }

    private static String getPriceVeggie(WebElement e) {
        return e.findElement(By.xpath("following-sibling::td[1]")).getText();
    }
}

