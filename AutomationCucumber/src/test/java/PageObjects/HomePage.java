package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.HelperMethods;
import utils.TestSetup;

public class HomePage {
    // Constructor.
    TestSetup testSetup;
    // Home Page Elements.
    static By SignInBtn = By.xpath("//a[normalize-space()='Sign in']");
    By EmailTextBox = By.id("email");
    By PasswordTextBox = By.id("passwd");
    By LoginBtn = By.id("SubmitLogin");
    By NavigationPage = By.xpath("//span[@class='navigation_page']");
    static By CreateEmailTextBox = By.id("email_create");
    static By CreateAccountBtn = By.id("SubmitCreate");
    By ErrorMessage = By.id("create_account_error");
    // Home Page Methods.

    public HomePage(TestSetup driver) {
    }

    public static void homePageIsDisplayed() {
        HelperMethods.isEleVisible(SignInBtn);
    }

    public static void clickSignIn() {
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

    public void setInvalidEmail(String invalidEmail) throws InterruptedException {
        HelperMethods.enterText(CreateEmailTextBox, invalidEmail);
        HelperMethods.click(CreateAccountBtn);
        HelperMethods.waitForElement(ErrorMessage, 20, 2);
    }
    public static void setValidEmail(String validEmail) throws InterruptedException {
        HelperMethods.enterText(CreateEmailTextBox, validEmail);
        HelperMethods.click(CreateAccountBtn);

    }
    public void verifyErrorMessage(String message) throws InterruptedException {
        String errorMessage = HelperMethods.getText(ErrorMessage);
        HelperMethods.isEleVisible(ErrorMessage);
        Assert.assertEquals(errorMessage, message);
    }
}
