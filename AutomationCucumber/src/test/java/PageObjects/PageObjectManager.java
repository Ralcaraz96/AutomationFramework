package PageObjects;

import org.openqa.selenium.WebDriver;
import utils.TestSetup;

public class PageObjectManager {
    public WebDriver driver;
    public HomePage homePage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        homePage = new HomePage((TestSetup) TestSetup.driver);
        return homePage;
    }
}
