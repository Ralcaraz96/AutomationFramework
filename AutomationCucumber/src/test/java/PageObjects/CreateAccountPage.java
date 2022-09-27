package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import utils.HelperMethods;
import utils.TestSetup;

public class CreateAccountPage {
    // Constructor.
    TestSetup testSetup;
    //Personal Information
    By TitleMrBtn = By.id("id_gender1");
    By FirstNameTextBox = By.id("customer_firstname");
    By LastNameTextBox = By.id("customer_lastname");
    By EmailTextBoxPI = By.id("email");
    By PasswordTextBoxPI = By.id("passwd");
    By DateOfBirthDayDropDown = By.id("days");
    By DateOfBirthMonthDropDown = By.id("months");
    By DateOfBirthYearDropDown = By.id("years");
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
    By RegisterBtnAddress = By.id("submitAccount");

    // Create Account Page Methods.

    public CreateAccountPage(TestSetup driver) {
    }

    public void CreateAccountPageIsDisplayed();

    public void PersonalInformation(String firstName, String lastNam, String passwordPi, String days,
                                    String months, String years) {
        HelperMethods.click(TitleMrBtn);
        HelperMethods.enterText(FirstNameTextBox, firstName);
        HelperMethods.enterText(LastNameTextBox, lastName);
        HelperMethods.click(EmailTextBoxPI);
        HelperMethods.enterText(PasswordTextBoxPI, passwordPi);
        HelperMethods.selectDropdown(DateOfBirthDayDropDown, days);
        HelperMethods.selectDropdown(DateOfBirthMonthDropDown, months);
        HelperMethods.selectDropdown(DateOfBirthYearDropDown, years);
        HelperMethods.click(NewsletterCheckBox);
        HelperMethods.click(SpecialOffersCheckBox);


    }

    public void Address(String firstName, String lastname, String company, String address1, String address2
            , String city, String state, String zipcode, String Country, String additionalinfo,
                        String phone, String alias) {

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
        HelperMethods.enterText(AliasTextBoxAddress, alias);
        HelperMethods.click(RegisterBtnAddress);

    }


}
}
