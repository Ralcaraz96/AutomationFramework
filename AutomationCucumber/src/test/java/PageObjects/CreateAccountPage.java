package PageObjects;

import lombok.experimental.Helper;
import org.openqa.selenium.By;
import utils.HelperMethods;
import utils.TestSetup;

import java.time.Year;

public class CreateAccountPage {
    TestSetup testSetup;

    //CreateAccountPage

    By CreateAccountPageScreen = By.id("authentication");

    //Personal Information
    By TitleMrBtn = By.id("id_gender1");
    By FirstNameTextBox = By.id("customer_firstname");
    By LastNameTextBox = By.id("customer_lastname");
    By EmailTextBoxPersonalInfo = By.id("email");
    By PasswordTextBoxPersonalInfo = By.id("passwd");
    By DayDropDownDateOfBirth = By.id("days");
    By MonthDropDownDateOfBirth = By.id("months");
    By YearDropDownDateOfBirth = By.id("years");
    By NewsletterCheckBox = By.id("newsletter");
    By SpecialOffersCheckBox = By.id("optin");

    //Your Address
    By FirstNameTextBoxAddress = By.id("firstname");
    By LastNameTextBoxAddress = By.id("lastname");
    By CompanyTextBoxAddress = By.id("company");
    By AddressTextBoxAddress = By.id("address1");
    By Address2TextBoxAddress = By.id("address2");
    By CityTextBoxAddress = By.id("city");
    By StateDropdownAddress = By.id("id_state");
    By ZipCodeTextBoxAddress = By.id("postcode");
    By CountryDropdownAddress = By.id("id_country");
    By AdditionalInfoTextBoxAddress = By.id("other");
    By HomePhoneTextBoxAddress = By.id("phone");

    By MobilePhoneTextBoxAddress = By.id("phone_mobile");
    By AliasTextBoxAddress = By.id("alias");
    By RegisterAddressBtn = By.id("submitAccount");

    // Create Account Page Methods.
    public CreateAccountPage(TestSetup driver) {
    }
    public void CreateAccountPageIsDisplayed() {
        HelperMethods.waitForElement(FirstNameTextBox);
    }
    public void PersonalInformation(String firstName, String lastName, String passwordPi, String days,
                                    String months, String years) {
        //HelperMethods.waitForElement(FirstNameTextBox);
        HelperMethods.click(TitleMrBtn);
        HelperMethods.enterText(FirstNameTextBox, firstName);
        HelperMethods.enterText(LastNameTextBox, lastName);
        HelperMethods.click(EmailTextBoxPersonalInfo);
        HelperMethods.enterText(PasswordTextBoxPersonalInfo, passwordPi);
        HelperMethods.click(DayDropDownDateOfBirth);
        HelperMethods.selectDropdown(DayDropDownDateOfBirth, days);
        HelperMethods.click(MonthDropDownDateOfBirth);
        HelperMethods.selectDropdown(MonthDropDownDateOfBirth, months);
        HelperMethods.click(YearDropDownDateOfBirth);
        HelperMethods.selectDropdown(YearDropDownDateOfBirth, years);
        HelperMethods.click(NewsletterCheckBox);
        HelperMethods.click(SpecialOffersCheckBox);
    }
    public void Address(String firstName, String lastName, String company, String address1, String address2
            , String city, String state, String zipcode, String country, String additionalinfo,
                        String phone, String phoneMobile, String alias) {
        HelperMethods.click(TitleMrBtn);
        HelperMethods.enterText(FirstNameTextBoxAddress, firstName);
        HelperMethods.enterText(LastNameTextBoxAddress, lastName);
        HelperMethods.enterText(CompanyTextBoxAddress, company);
        HelperMethods.enterText(AddressTextBoxAddress, address1);
        HelperMethods.enterText(Address2TextBoxAddress, address2);
        HelperMethods.enterText(CityTextBoxAddress, city);
        HelperMethods.selectDropdown(StateDropdownAddress, state);
        HelperMethods.enterText(ZipCodeTextBoxAddress, zipcode);
        HelperMethods.selectDropdown(CountryDropdownAddress, country);
        HelperMethods.enterText(AdditionalInfoTextBoxAddress, additionalinfo);
        HelperMethods.enterText(HomePhoneTextBoxAddress, phone);
        HelperMethods.enterText(MobilePhoneTextBoxAddress, phoneMobile);
        HelperMethods.enterText(AliasTextBoxAddress, alias);
    }
    public void userClickSubmitPersonalInformationAndCreateAnAccount() {
        HelperMethods.click(RegisterAddressBtn);
    }
}
