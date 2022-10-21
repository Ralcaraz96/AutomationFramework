package PageObjects;

import Data.Constants;
import Excel.ExcelReader;
import io.cucumber.messages.types.Product;
import lombok.experimental.Helper;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.GlobalProperties;
import utils.HelperMethods;
import utils.TestSetup;

import java.awt.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class BuyProductPage {
    // Constructor.
    TestSetup testSetup;
    // Home Page Elements.
    By WomenLink = By.xpath("//a[@title='Women']");
    By TShirtsSubMenu = By.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//li//ul//a[@title='T-shirts'][normalize-space()='T-shirts']");
    By FirstProductDisplayedText = By.xpath("//a[normalize-space()='Faded Short Sleeve T-shirts']");
    By SearchTextBox = By.id("search_query_top");//Faded Short Sleeve T-shirts $16.51
    By SubmitSearchBtn = By.xpath("//button[@name='submit_search']");
    By ProductSearched = By.xpath("//a[@title='Faded Short Sleeve T-shirts'][normalize-space()='Faded Short Sleeve T-shirts']");
    By ProductBlock = By.xpath("//div[@class='product-container']");
    By MoreBox = By.xpath("//a[@title='View']");
    By PlusQuantityBtn = By.xpath("//i[@class='icon-plus']");
    By ProductBox = By.xpath("//div[@class='box-info-product']");
    By SizeDropdownBtn = By.xpath("//div[@id='uniform-group_1']");
    By SizeDropdown = By.xpath("//select[@id='group_1']");
    By ColorBlueBox = By.id("color_14");
    By AddToCarBtn = By.xpath("//span[normalize-space()='Add to cart']");
    By ProceedToCheckOutBtn = By.xpath("//span[normalize-space()='Proceed to checkout']");
    By ProceedToCheckOutSummaryBtn = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
    By ProceedToCheckOutAddressBtn = By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
    By TermsOfServiceCheckBox = By.id("uniform-cgv");
    By ProceedToCheckOutShippingBtn = By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
    By PayByBankWireBtn = By.xpath("//a[@title='Pay by bank wire']");
    By IConfirmMyOrderBtn = By.xpath("//span[normalize-space()='I confirm my order']");
    By ProductOrderedTextBox = By.xpath("//div[@class='box']");
    By OrderCompletedMessage = By.xpath("//strong[normalize-space()='Your order on My Store is complete.']");


    public BuyProductPage(TestSetup driver) {
    }

    public void MoveCursorOverWomenLinkAndClickOnSubmenu() {
        HelperMethods.waitForElement(WomenLink);
        HelperMethods.hoverElement(WomenLink);
        HelperMethods.waitForElement(TShirtsSubMenu);
        HelperMethods.click(TShirtsSubMenu);
    }

    public void GetTextOfTheProduct() {
        HelperMethods.waitForElement(FirstProductDisplayedText);
        HelperMethods.getText(FirstProductDisplayedText);


    }

    public void SearchProduct(String sheetname, Integer rowNumber) throws IOException, InvalidFormatException {
        ExcelReader reader = new ExcelReader();
        List<Map<String, String>> testData = reader.getData(GlobalProperties.getProperties("DataSheet"), sheetname);
        String ProductName = testData.get(rowNumber).get("ProductName");
        HelperMethods.waitForElement(SearchTextBox);
        HelperMethods.enterText(SearchTextBox, ProductName);
        HelperMethods.waitForElement(SubmitSearchBtn);
        HelperMethods.click(SubmitSearchBtn);
    }

    public void VerifyProducts() {
        HelperMethods.waitForElement(ProductSearched);
        String SearchedProduct = HelperMethods.getText(ProductSearched);
        Assert.assertTrue(SearchedProduct.contains(Constants.ProductName));
    }

    public void HoverTheCursorAndClickMoreBox() {
        HelperMethods.waitForElement(ProductBlock);
        HelperMethods.hoverElement(ProductBlock);
        HelperMethods.waitForElement(MoreBox);
        HelperMethods.click(MoreBox);
    }

    public void SetClothesSpecifications() {
        HelperMethods.waitForElement(ProductBox);
        HelperMethods.waitForElement(PlusQuantityBtn);
        HelperMethods.click(PlusQuantityBtn);
        HelperMethods.click(SizeDropdownBtn);
        HelperMethods.selectDropdownByText(SizeDropdown, Constants.Size);
        HelperMethods.click(ColorBlueBox);
    }

    public void AddToCartAndCheckOut() {
        HelperMethods.click(AddToCarBtn);
        HelperMethods.waitForElement(ProceedToCheckOutBtn);
        HelperMethods.click(ProceedToCheckOutBtn);
    }

    public void OrderProcessComplete() {
        HelperMethods.waitForElement(ProceedToCheckOutSummaryBtn);
        HelperMethods.click(ProceedToCheckOutSummaryBtn);
        HelperMethods.click(ProceedToCheckOutAddressBtn);
        HelperMethods.waitForElement(TermsOfServiceCheckBox);
        HelperMethods.click(TermsOfServiceCheckBox);
        HelperMethods.click(ProceedToCheckOutShippingBtn);
        HelperMethods.waitForElement(PayByBankWireBtn);
        HelperMethods.click(PayByBankWireBtn);
        HelperMethods.waitForElement(IConfirmMyOrderBtn);
        HelperMethods.click(IConfirmMyOrderBtn);

    }

    public void VerifyOrderComplete() {
        HelperMethods.waitForElement(OrderCompletedMessage);
        String OrderIsComplete = HelperMethods.getText(OrderCompletedMessage);
        Assert.assertTrue(OrderIsComplete.contains(Constants.OrderCompleted));
    }
}


