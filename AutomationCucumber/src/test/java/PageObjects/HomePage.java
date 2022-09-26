package PageObjects;

import utils.HelperMethods;
import utils.TestSetup;
import org.openqa.selenium.By;

public class HomePage {
    // Constructor.
    TestSetup testSetup;
    // Home Page Elements.
    By SignInBtn = By.xpath("//a[normalize-space()='Sign in']");
    By EmailTextBox = By.id("email");
    By PasswordTextBox = By.id("passwd");
    By LoginBtn = By.id("SubmitLogin");
    By NavigationPage = By.xpath("//span[@class='navigation_page']");

    // Home Page Methods.

    public HomePage(TestSetup driver) {
    }
    public void homePageIsDisplayed() {
        HelperMethods.isEleVisible(SignInBtn);
    }
    public void clickSignIn() {
        HelperMethods.click(SignInBtn);
    }
    public void logIn(String username, String password) {
        HelperMethods.enterText(EmailTextBox, username);
        HelperMethods.enterText(PasswordTextBox, password);
        HelperMethods.click(LoginBtn);
    }
    public void isAccountPageDisplayed() {
        HelperMethods.isEleVisible(NavigationPage);
    }
}
