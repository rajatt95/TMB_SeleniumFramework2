/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.utils;

import com.google.common.util.concurrent.Uninterruptibles;
import com.learning.config.ConfigFactory;
import com.learning.driver.DriverManager;
import com.learning.enums.WaitType;
import com.learning.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static com.learning.constants.FrameworkConstants.*;

public class SeleniumUtils {

    private static WebElement waitUntilPresenceOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    private static WebElement waitUntilElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    private static WebElement waitUntilElementToBeVisible(By by) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public static void sendKeys(By by, String value) {
//          WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
//        wait.until(ExpectedConditions.presenceOfElementLocated(by));
//        return  DriverManager.getDriver().findElement(by).getText();
        WebElement element = waitUntilPresenceOfElementLocated(by);
        element.sendKeys(value);
//        ExtentLogger.pass("Value: " + value + " is successfully passed in textBox: " + element.getText());
        ExtentLogger.pass("Value: " + value + " is successfully passed in textBox: " + element.getText(), true);
    }

    public static void sendKeys(By by, String value, String elementName) {
//          WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
//        wait.until(ExpectedConditions.presenceOfElementLocated(by));
//        return  DriverManager.getDriver().findElement(by).getText();
        WebElement element = waitUntilPresenceOfElementLocated(by);
        element.sendKeys(value);
//        ExtentLogger.pass("Value " + BOLD_START + value + BOLD_END + " is successfully passed in "
        //              + BOLD_START + elementName + BOLD_END + " textbox.");
        ExtentLogger.pass("Value " + BOLD_START + value + BOLD_END + " is successfully passed in "
                + BOLD_START + elementName + BOLD_END + " textbox.", true);
    }


    public static void click(By by) {
//        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
//        wait.until(ExpectedConditions.elementToBeClickable(by));
//        DriverManager.getDriver().findElement(by).click();
        WebElement element = waitUntilElementToBeClickable(by);
        element.click();
//        ExtentLogger.pass("Element: " + element.getText() + " is clicked successfully.");
        //ExtentLogger.pass(element.getText() + " is clicked successfully.", true);
        ExtentLogger.pass("Clicking on: " + BOLD_START + element.getText() + BOLD_END, true);

    }

    public static void click(By by, WaitType waitType) {
        WebElement element = getElementAfterWait(by, waitType);
        //  ExtentLogger.pass("Element: " + BOLD_START + element.getText() + BOLD_END + " is clicked successfully");
        //  ExtentLogger.pass(BOLD_START + element.getText() + BOLD_END + " is clicked successfully", true);
        ExtentLogger.pass("Clicking on: " + BOLD_START + element.getText() + BOLD_END, true);
        element.click();

    }

    private static WebElement getElementAfterWait(By by, WaitType waitType) {
        //waitUntilElementToBeClickable(by).click();
        WebElement element = null;
        if (waitType == WaitType.PRESENCE) {
            element = waitUntilPresenceOfElementLocated(by);
        } else if (waitType == WaitType.CLICKABLE) {
            element = waitUntilElementToBeClickable(by);
        } else if (waitType == WaitType.VISIBLE) {
            element = waitUntilElementToBeVisible(by);
        }
        return element;
    }

    public static void click(By by, WaitType waitType, String elementName) {
        WebElement element = getElementAfterWait(by, waitType);
//        ExtentLogger.pass("Element: " + BOLD_START + elementName + BOLD_END + " is clicked successfully.");
        //ExtentLogger.pass(BOLD_START + elementName + BOLD_END + " is clicked successfully.", true);
        ExtentLogger.pass("Clicking on: " + BOLD_START + elementName + BOLD_END, true);
        element.click();

    }


    public static String getElementText(By by) {
//        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), ConfigFactory.getConfig().timeout());
//        wait.until(ExpectedConditions.presenceOfElementLocated(by));
//        return  DriverManager.getDriver().findElement(by).getText();
        WebElement element = waitUntilPresenceOfElementLocated(by);
        ExtentLogger.info("Element Text: " + BOLD_START + element.getText() + BOLD_END);
        return element.getText();
    }

    public static String getPageTitle() {
        String title = DriverManager.getDriver().getTitle();
        ExtentLogger.info("Page title: " + BOLD_START + title + BOLD_END);
        return title;
    }


    public static WebElement getElement(By by) {
        return waitUntilElementToBeVisible(by);
    }

    public static void captureScreenshot() {
        ExtentLogger.captureScreenshot();
    }

    public static void waitForSomeTime() {
        Uninterruptibles.sleepUninterruptibly(WAIT, TimeUnit.SECONDS);
    }

    public static void waitForGivenTime(long time) {
        Uninterruptibles.sleepUninterruptibly(time, TimeUnit.SECONDS);
    }

    public static String getWebPageURL() {
        String url = DriverManager.getDriver().getCurrentUrl();
        //ExtentLogger.info("Page URL: " + BOLD_START + url + BOLD_END);
        ExtentLogger.info("Page URL: " + "<a href=" + url + "><b>" + url + "</b></a>");

        return url;
    }

}
