package Components;

import Driver.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearch extends DriverFactory {

    private WebDriver driver;

    private static String GOOGLE_HOME = "https://www.google.com";

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    private WebElement searchBox;

    public GoogleSearch(WebDriver driver){
        this.driver=driver;
        driver.get(GOOGLE_HOME);
        PageFactory.initElements(driver, this);
    }

    public void performSearch() {
        searchBox.clear();
        searchBox.sendKeys("Hello Google!");
    }

}
