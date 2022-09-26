package Utils;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertTrue;

public class HelperMethods {

    public static void isEleVisible(By by) {
        try {
            assertTrue(TestSetup.driver.findElement(by).isDisplayed());
        } catch (AssertionError error) {
            TestSetup.driver.close();
            Assert.fail();
        }
    }

    public static void click(By by) {
        try {
            TestSetup.driver.findElement(by).click();
        } catch (NoSuchElementException e) {
            TestSetup.driver.close();
            Assert.fail();
        }
    }

    public static void enterText(By by, String text) {
        try {
            TestSetup.driver.findElement(by).sendKeys(text);
        } catch (NoSuchElementException e) {
            TestSetup.driver.close();
            Assert.fail();
        }
    }
}
