package PageObjects;

import Utils.Data;
import Utils.HelperMethods;
import Utils.TestSetup;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HomePage {
    // Home Page Elements.
    By SignInBtn = By.xpath("//a[normalize-space()='Sign in']");
    By EmailTextBox = By.id("email");
    By PasswordTextBox = By.id("passwd");

    By LoginBtn = By.id("SubmitLogin");

    By NavigationPage = By.xpath("//span[@class='navigation_page']");


    public void homePageIsDisplayed() {
        HelperMethods.isEleVisible(SignInBtn);
    }

    public void clickSignIn() {
        HelperMethods.click(SignInBtn);
        HelperMethods.isEleVisible(EmailTextBox);
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
