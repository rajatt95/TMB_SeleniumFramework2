package com.learning.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.learning.driver.Driver;

public class BaseTest {

    @BeforeMethod
    public void beforeMethod() {
        Driver.initDriver();
    }

    @AfterMethod
    public void afterMethod() {
        Driver.quitDriver();
    }
}
