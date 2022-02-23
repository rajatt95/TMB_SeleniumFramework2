package com.learning.driver;

import org.openqa.selenium.WebDriver;

//final -> We do not want any class to extend this class
public final class DriverManager {

    //private -> We do not want anyone to create the object of this class
    private DriverManager() {
    }

    private final static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return threadLocal.get();
    }

    public static void setDriver(WebDriver driver) {
        threadLocal.set(driver);
    }

}
