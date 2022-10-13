package stepDefinition;

import Excel.ExcelReader;
import PageObjects.CreateAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utils.TestSetup;

import java.io.IOException;
import java.util.List;
import java.util.Map;


public class CreateAccountPageStepDefinition {
    TestSetup testSetup;
    CreateAccountPage createAccountPage;


    public CreateAccountPageStepDefinition(TestSetup testSetup) {
        this.testSetup = testSetup;
        this.createAccountPage = testSetup.pageObjectManager.getCreateAccountPage();
    }

    @Then("^User is in create an account page.$")
    public void user_is_in_create_an_account_page() {
        createAccountPage.CreateAccountPageIsDisplayed();
    }


    @Then("^User submit personal information and create an account$")
    public void userClickSubmitPersonalInformationAndCreateAnAccount() {
        createAccountPage.userClickSubmitPersonalInformationAndCreateAnAccount();
    }

    @And("User provides personal information and address information from given sheetname {string} and rownumber {int}")
    public void userProvidesPersonalInformationAndAddressInformationFromGivenSheetnameAndRownumberRowNumber(String sheetname, Integer rowNumber) throws IOException, InvalidFormatException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData("src/test/resources/DataCucu.xlsx", sheetname);
        // retrieve data from sheet.
        String firstName = testData.get(rowNumber).get("FirstName");
        String lastName = testData.get(rowNumber).get("LastName");
        String passwordPi = testData.get(rowNumber).get("PasswordPI");
        String days = testData.get(rowNumber).get("days");
        String months = testData.get(rowNumber).get("months");
        String years = testData.get(rowNumber).get("years");
        String company = testData.get(rowNumber).get("Company");
        String address1 = testData.get(rowNumber).get("Address");
        String address2 = testData.get(rowNumber).get("Address2");
        String city = testData.get(rowNumber).get("City");
        String state = testData.get(rowNumber).get("State");
        String zipcode = testData.get(rowNumber).get("ZipCode");
        String country = testData.get(rowNumber).get("Country");
        String additionalinfo = testData.get(rowNumber).get("AdditionalInfo");
        String phone = testData.get(rowNumber).get("Phone");
        String phoneMobile = testData.get(rowNumber).get("MobilePhone");
        String alias = testData.get(rowNumber).get("Alias");
        // Send data to method.
        createAccountPage.FillPersonalInformation(firstName, lastName, passwordPi, days, months, years);
        createAccountPage.FillAddress(firstName, lastName, company, address1, address2, city, state, zipcode,
                country, additionalinfo, phone, phoneMobile, alias);
    }
}