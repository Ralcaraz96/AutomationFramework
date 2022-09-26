package PageObjects;

import io.cucumber.java.ro.Si;
import utils.Data;
import utils.HelperMethods;
import utils.TestSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // Constructor.
    TestSetup testSetup;

    // Home Page Elements.
    By SignInBtn = By.xpath("//a[normalize-space()='Sign in']");
    By EmailTextBox = By.id("email");
    By PasswordTextBox = By.id("passwd");
    By LoginBtn = By.id("SubmitLogin");
    By NavigationPage = By.xpath("//span[@class='navigation_page']");

    public HomePage(TestSetup driver) {
    }


    public void homePageIsDisplayed() {
        HelperMethods.isEleVisible(SignInBtn);
    }

    public void clickSignIn() {
        HelperMethods.click(SignInBtn);
    }

    public void logIn() {
        HelperMethods.enterText(EmailTextBox, Data.getEmail());
        HelperMethods.enterText(PasswordTextBox, Data.getPassword());
        HelperMethods.click(LoginBtn);
    }

    public void isAccountPageDisplayed() {
        HelperMethods.isEleVisible(NavigationPage);
    }
}
