package utils;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertTrue;


public class HelperMethods {
    public static WebDriver driver;

    public HelperMethods(WebDriver driver) {
        this.driver = driver;
    }

    public static void isEleVisible(By by) {
        try {
            assertTrue(driver.findElement(by).isDisplayed());
        } catch (AssertionError error) {
            driver.close();
            Assert.fail();
        }
    }

    public static void click(By by) {
        try {
            driver.findElement(by).click();
        } catch (NoSuchElementException e) {
            driver.close();
            Assert.fail();
        }
    }

    public static void enterText(By by, String text) {
        try {
            driver.findElement(by).sendKeys(text);
        } catch (NoSuchElementException e) {
            driver.close();
            Assert.fail();
        }
    }
}
