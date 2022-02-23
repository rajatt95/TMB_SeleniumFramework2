package com.learning.utils;

import com.learning.driver.DriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//final -> We do not want any class to extend this class
public final class BrowserInfoUtils {

    //private -> We do not want anyone to create the object of this class
    //Private constructor to avoid external instantiation
    private BrowserInfoUtils() {
    }

    public static String getBrowserInfo() {
        Capabilities capabilities = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
        return capabilities.getBrowserName().toUpperCase();

    }

    public static String getBrowserVersionInfo() {
        Capabilities capabilities = ((RemoteWebDriver) DriverManager.getDriver()).getCapabilities();
        return capabilities.getVersion();

    }

}
