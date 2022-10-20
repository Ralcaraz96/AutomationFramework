package PageObjects;

import Data.Constants;
import Excel.ExcelReader;
import io.cucumber.messages.types.Product;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.GlobalProperties;
import utils.HelperMethods;
import utils.TestSetup;

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
    // Home Page Methods.

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
}
