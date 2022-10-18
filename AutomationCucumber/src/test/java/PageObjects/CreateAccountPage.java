package PageObjects;

import org.openqa.selenium.By;
import utils.HelperMethods;
import utils.TestSetup;

public class CreateAccountPage {
    TestSetup testSetup;

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

    By RegisterBtn = By.id("submitAccount");

    //My Account Page

    By MyAccountPage = By.id("center_column");

    By MandatoryFieldsAlert = By.xpath("//div[@class='alert alert-danger']");

    By RegisterAccountBtn = By.id("submitAccount");



    // Create Account Page Methods.
    public CreateAccountPage(TestSetup driver) {
    }

    public void CreateAccountPageIsDisplayed() {
        HelperMethods.waitForElement(FirstNameTextBox);
    }

    public void FillPersonalInformation(String firstName, String lastName, String passwordPi, String days,
                                        String months, String years) {
        HelperMethods.waitForElement(FirstNameTextBox);
        HelperMethods.click(TitleMrBtn);
        HelperMethods.enterText(FirstNameTextBox, firstName);
        HelperMethods.enterText(LastNameTextBox, lastName);
        HelperMethods.click(EmailTextBoxPersonalInfo);
        HelperMethods.enterText(PasswordTextBoxPersonalInfo, passwordPi);
        HelperMethods.click(DayDropDownDateOfBirth);
        HelperMethods.selectDropdownByValue(DayDropDownDateOfBirth, days);
        HelperMethods.click(MonthDropDownDateOfBirth);
        HelperMethods.selectDropdownByValue(MonthDropDownDateOfBirth, months);
        HelperMethods.click(YearDropDownDateOfBirth);
        HelperMethods.selectDropdownByValue(YearDropDownDateOfBirth, years);
        HelperMethods.click(NewsletterCheckBox);
        HelperMethods.click(SpecialOffersCheckBox);
    }

    public void FillAddress(String firstName, String lastName, String company, String address1, String address2
            , String city, String state, String zipcode, String country, String additionalInfo,
                            String phone, String phoneMobile, String alias) {
        HelperMethods.click(TitleMrBtn);
        HelperMethods.enterText(FirstNameTextBoxAddress, firstName);
        HelperMethods.enterText(LastNameTextBoxAddress, lastName);
        HelperMethods.enterText(CompanyTextBoxAddress, company);
        HelperMethods.enterText(AddressTextBoxAddress, address1);
        HelperMethods.enterText(Address2TextBoxAddress, address2);
        HelperMethods.enterText(CityTextBoxAddress, city);
        HelperMethods.selectDropdownByText(StateDropdownAddress, state);
        HelperMethods.enterText(ZipCodeTextBoxAddress, zipcode);
        HelperMethods.selectDropdownByText(CountryDropdownAddress, country);
        HelperMethods.enterText(AdditionalInfoTextBoxAddress, additionalInfo);
        HelperMethods.enterText(HomePhoneTextBoxAddress, phone);
        HelperMethods.enterText(MobilePhoneTextBoxAddress, phoneMobile);
        HelperMethods.enterText(AliasTextBoxAddress, alias);
    }

    public void userClickSubmitPersonalInformationAndCreateAnAccount() {

        HelperMethods.click(RegisterBtn);
    }

    public void UserIsInMyAccountPage() {
        HelperMethods.isEleVisible(MyAccountPage);
    }
    public void MandatoryFieldsAlert() {
        HelperMethods.isEleVisible(MandatoryFieldsAlert);
        HelperMethods.click(RegisterAccountBtn);
    }

}
