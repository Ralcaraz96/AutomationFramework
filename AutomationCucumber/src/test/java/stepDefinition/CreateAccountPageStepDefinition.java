package stepDefinition;

import PageObjects.CreateAccountPage;
import utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class CreateAccountPageStepDefinition {
    TestSetup testSetup;
    CreateAccountPage CreateAccountPage;
    public WebDriver driver;

    public CreateAccountPageStepDefinition(TestSetup testSetup) {
        this.testSetup = testSetup;
        this.CreateAccountPage = testSetup.pageObjectManager.getCreateAccountPage();
    }

    @Given("^User is on AutomationPractice page$")
    public void user_is_on_AutomationPractice_page() throws Exception {
        CreateAccountPage.CreateAccountPageIsDisplayed();
    }

    @When("^User click sing in\\.$")
    public void user_click_sing_in() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        CreateAccountPage.clickSignIn();

    }
    @Then("^User submits valid (.+)$")
    public void user_submits_valid_email(String validEmail) throws InterruptedException {
        CreateAccountPage.setvalidEmail(validEmail);
    }


    @Then("^User log in create an account page.$")
    public void user_log_in_create_an_account_page() {CreateAccountPage.isCreateAccountPageDisplayed();
    }

    @And("^User provides personal information (.+), (.+), (.+), (.+), (.+), (.+), (.+) and date of birth (.+) / (.+) / (.+)$")
    public void user_provides_personal_information(String ) throws InterruptedException {
        CreateAccountPage.setpersonalInformation();
    }

    @And("^User provides address information (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+)$")
    public void user_provides_address_information(String ) throws InterruptedException {
        CreateAccountPage.setaddressInformation();
    }
}
