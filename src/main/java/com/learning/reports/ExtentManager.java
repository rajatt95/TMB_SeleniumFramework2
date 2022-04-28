/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.reports;

import com.aventstack.extentreports.ExtentTest;

//final -> We do not want any class to extend this class
public final class ExtentManager {

    //private -> We do not want anyone to create the object of this class
    private ExtentManager() {
    }

    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    //public static ExtentTest getExtentTest() {
//		return extentTest.get();
//	}
    // Now, the scope is default - Outside this package, No one will be able to access this
    // We do not want any Automation Tester to come and use methods like addAuthors(), addTags()
    static ExtentTest getExtentTest() {
        return extentTest.get();
    }

    static void setExtentTest(ExtentTest test) {
        extentTest.set(test);
    }

    static void unload() {
        extentTest.remove();
    }

}
