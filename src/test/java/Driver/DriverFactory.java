package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DriverFactory {

    public class PageObject {
        WebDriver driver;

        public PageObject(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(this.driver, this);
        }
    }
}
