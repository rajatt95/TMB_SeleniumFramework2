/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

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
