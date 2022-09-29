package stepDefinition;

import PageObjects.CreateAccountPage;
import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import utils.HelperMethods;
import utils.TestSetup;


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
        HomePage.homePageIsDisplayed();
    }
    @When("^User click sing in\\.$")
    public void user_click_sing_in() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        HomePage.clickSignIn();
    }

    @Then("^User submits valid (.+)$")
    public void user_submits_valid_email(String validEmail) throws InterruptedException {
        HomePage.setValidEmail(validEmail);
    }
    @Then("^User log in create an account page.$")
    public void user_log_in_create_an_account_page() {
        CreateAccountPage.CreateAccountPageIsDisplayed();
    }
    @And("^User provides personal information (.+), (.+), (.+) and date of birth (.+), (.+), (.+)$")
    public void user_provides_personal_information(String firstName, String lastName, String passwordPi, String days,
                                                   String months, String years) {
        CreateAccountPage.PersonalInformation(firstName, lastName, passwordPi, days, months, years);
    }
    @And("^User provides address information (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+)$")
    public void user_provides_address_information(String firstName, String lastName, String company, String address1, String address2
            , String city, String state, String zipcode, String country, String additionalinfo,
                                                  String phone, String phoneMobile, String alias) throws InterruptedException {
        CreateAccountPage.Address(firstName, lastName, company, address1, address2, city, state, zipcode,
                country, additionalinfo, phone, phoneMobile, alias);
    }
    @Then("^User submit personal information and create an account$")
    public void userSubmitPersonalInformationAndCreateAnAccount() {
        CreateAccountPage.userSubmitPersonalInformationAndCreateAnAccount();
    }
}