package stepDefinition;

import PageObjects.HomePage;
import Utils.Data;
import Utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class HomePageStepDefinition {
    TestSetup testSetup;

    public HomePageStepDefinition(TestSetup testSetup) {
        this.testSetup = testSetup;
    }

    @Given("^User is on AutomationPractice page$")
    public void user_is_on_AutomationPractice_page() throws Exception {
        // start diver, navigate and verify user is in homepage.
        System.setProperty(Data.getDriver(), Data.getDriverPath());
        HomePage homePage = new HomePage();
        testSetup.driver = new ChromeDriver();
        testSetup.driver.get(Data.getUrl());
        homePage.homePageIsDisplayed();
    }

    @When("^User click sing in\\.$")
    public void user_click_sing_in() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        homePage.clickSignIn();

    }

    @Then("^User logins in with username and password$")
    public void user_logins_in_with_username_and_password() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        HomePage homePage = new HomePage();
        homePage.logIn();
    }


    @Then("User is in Account page.")
    public void userIsInAccountPage() {
        HomePage homePage = new HomePage();
        homePage.isAccountPageDisplayed();
        TestSetup.driver.quit();
    }
}
