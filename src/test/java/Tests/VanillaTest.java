package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VanillaTest {

    public static void main(String[] args) {
        System.setProperty("TYPE OF DRIVER(eg. firefox)", "LOCATION OF DRIVER BINARY ON LOCAL SYSTEM");
        WebDriver driver = new FirefoxDriver();

        String baseUrl = "";
        String expectedTitle = "";
        String actualTitle = "";

        driver.get(baseUrl);

        actualTitle = driver.getTitle();

        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }

        driver.close();

    }

}

