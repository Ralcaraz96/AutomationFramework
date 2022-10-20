package stepDefinition;

import PageObjects.BuyProductPage;
import PageObjects.CreateAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import utils.TestSetup;

import java.io.IOException;


public class BuyProductStepDefinition {
    TestSetup testSetup;
    BuyProductPage BuyProductPage;


    public BuyProductStepDefinition(TestSetup testSetup) {
        this.testSetup = testSetup;
        this.BuyProductPage = testSetup.pageObjectManager.getBuyProductPage();
    }
    @Then("User move cursor over Women link and click on sub menu T-Shirts")
    public void userMoveCursorOverWomenLinkAndClickOnSubMenuTShirts() {
        BuyProductPage.MoveCursorOverWomenLinkAndClickOnSubmenu();
    }


    @Then("User validates that same product is displayed on searched page")
    public void userValidatesThatSameProductIsDisplayedOnSearchedPage() {
        BuyProductPage.VerifyProducts();
    }

    @Then("User Get Text of the first product displayed on the page")
    public void userGetTextOfTheFirstProductDisplayedOnThePage() {
        BuyProductPage.GetTextOfTheProduct();
    }

    @Then("User Search the text from {string} and {int} of the product displayed and click search button")
    public void userSearchTheTextFromAndRowNumberOfTheProductDisplayedAndClickSearchButton(String sheetname, Integer rowNumber) throws IOException, InvalidFormatException {
        BuyProductPage.SearchProduct(sheetname, rowNumber);
    }
}
