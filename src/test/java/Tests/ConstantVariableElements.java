package Tests;

import Components.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConstantVariableElements {

        private WebDriver driver;
        private static final By GOOGLE_SEARCH_FIELD = By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input");

        @BeforeClass
        public static void setupClass() {
            WebDriverManager.chromedriver().setup();
        }

        @Before
        public void setupTest() {
            driver = new ChromeDriver();
        }

        @After
        public void teardown() {
            if (driver != null) {
                driver.quit();
            }
        }

        @Test
        public void test() {

            driver.get("https://google.com");
            driver.findElement(GOOGLE_SEARCH_FIELD).clear();
            driver.findElement(GOOGLE_SEARCH_FIELD).sendKeys("Hello Google!");

        }

    }


