package stepDefinition;

import PageObjects.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.TestSetup;

public class HomePageStepDefinition {
    TestSetup testSetup;
    HomePage homePage;


    public HomePageStepDefinition(TestSetup testSetup) {
        this.testSetup = testSetup;
        this.homePage = testSetup.pageObjectManager.getHomePage();
    }

    @Given("^User is on AutomationPractice page$")
    public void user_is_on_AutomationPractice_page() throws Exception {
        homePage.homePageIsDisplayed();
    }

    @When("^User click sing in\\.$")
    public void user_click_sing_in() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        homePage.clickSignIn();

    }

    @Then("^User logins in with (.+) and (.+)$")
    public void user_logins_in_with_username_and_password(String username, String password) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        homePage.logIn(username, password);
    }

    @Then("User is in Account page.")
    public void user_is_in_account_page() {
        homePage.isAccountPageDisplayed();
    }

    @Then("^User submits invalid (.+)$")
    public void user_submits_invalid_email(String invalidEmail) throws InterruptedException {
        homePage.setInvalidEmail(invalidEmail);
    }

    @Then("^User submits valid (.+)$")
    public void user_submits_valid_Email(String validEmail) {
        homePage.setValidEmail(validEmail);
    }

    @Then("^User validates error (.+)$")
    public void user_validates_error_message(String message) throws InterruptedException {
        homePage.verifyErrorMessage(message);
    }
}
