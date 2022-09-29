package stepDefinition;

import PageObjects.CreateAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import utils.TestSetup;


public class CreateAccountPageStepDefinition {
    TestSetup testSetup;
    CreateAccountPage createAccountPage;
    public WebDriver driver;

    public CreateAccountPageStepDefinition(TestSetup testSetup) {
        this.testSetup = testSetup;
        this.createAccountPage = testSetup.pageObjectManager.getCreateAccountPage();
    }

    @Then("^User log in create an account page.$")
    public void user_log_in_create_an_account_page() {
        createAccountPage.CreateAccountPageIsDisplayed();
    }
    @And("^User provides personal information (.+), (.+), (.+) and date of birth (.+), (.+), (.+)$")
    public void user_provides_personal_information(String firstName, String lastName, String passwordPi, String days,
                                                   String months, String years) {
        createAccountPage.PersonalInformation(firstName, lastName, passwordPi, days, months, years);
    }
    @And("^User provides address information (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+), (.+)$")
    public void user_provides_address_information(String firstName, String lastName, String company, String address1, String address2
            , String city, String state, String zipcode, String country, String additionalinfo,
                                                  String phone, String phoneMobile, String alias) throws InterruptedException {
        createAccountPage.Address(firstName, lastName, company, address1, address2, city, state, zipcode,
                country, additionalinfo, phone, phoneMobile, alias);
    }
    @Then("^User submit personal information and create an account$")
    public void userSubmitPersonalInformationAndCreateAnAccount() {
        createAccountPage.userSubmitPersonalInformationAndCreateAnAccount();
    }
}