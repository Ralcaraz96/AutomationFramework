package utils;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

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
        public static void selectDropdown(By by, String date) {//dropdown :S
            try {
                driver.findElement(by).selectByValue(date);
            } catch (NoSuchElementException e) {
                driver.close();
                Assert.fail();
            }
    }
    public static String getText(By by) {
        try {
            return driver.findElement(by).getText();
        } catch (NoSuchElementException e) {
            driver.close();
            Assert.fail();
        }
        return driver.findElement(by).getText();
    }

    public static void waitForElement(By by, Integer waitFor, Integer pollingTime)
    {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(waitFor));
        wait.pollingEvery(Duration.ofSeconds(pollingTime));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
    }
}
