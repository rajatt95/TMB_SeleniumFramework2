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

import com.learning.reports.ExtentLogger;
import org.testng.Assert;


//final -> We do not want any class to extend this class
public final class VerificationUtils {

    //private -> We do not want anyone to create the object of this class
    private VerificationUtils() {
    }

    public static void validateResponse(Object actual, Object expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
            ExtentLogger.pass(
                    message + "   |   <b><i>Actual: </i> </b>" + actual + ", <b><i> Expected: </i> </b>" + expected);
        } catch (AssertionError assertionError) {
            ExtentLogger.fail(
                    message + "   |   <b><i>Actual: </i> </b>" + actual + ", <b><i> Expected: </i> </b>" + expected);
            Assert.fail(message);
        }
    }

    public static void validateResponse(boolean result, String message) {
        try {
            Assert.assertTrue(result);
            ExtentLogger.pass("<b><i>" + message + "</b></i>");
            // report.info("PASS : " + message);
        } catch (AssertionError assertionError) {
//			report.error("FAIL : " + message);
            ExtentLogger.fail("<b><i>" + message + "</b></i>");
            Assert.fail(message);
        }
    }

}
