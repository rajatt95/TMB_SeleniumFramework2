package com.learning.reports;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.Markup;
import com.learning.config.ConfigFactory;
import com.learning.utils.ScreenshotUtils;

import static com.learning.constants.FrameworkConstants.*;

//final -> We do not want any class to extend this class
public final class ExtentLogger {

    //private -> We do not want anyone to create the object of this class
    private ExtentLogger() {
    }

    public static void pass(String message) {
        ExtentManager.getExtentTest().pass(message);
    }

    public static void pass(Markup message) {
        ExtentManager.getExtentTest().pass(message);
    }

    public static void fail(String message) {
        ExtentManager.getExtentTest().fail(message);
    }

    public static void fail(Markup message) {
        ExtentManager.getExtentTest().fail(message);
    }

    public static void skip(String message) {
        ExtentManager.getExtentTest().skip(message);
    }

    public static void skip(Markup message) {
        ExtentManager.getExtentTest().skip(message);
    }

    public static void info(Markup message) {
        ExtentManager.getExtentTest().info(message);
    }

    public static void info(String message) {
        ExtentManager.getExtentTest().info(message);
    }

    public static void captureScreenshot() {
        ExtentManager.getExtentTest().info("Capturing Screenshot",
                MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
    }

    public static void pass(String message, boolean isScreeshotNeeded) {
        if (ConfigFactory.getConfig().passed_steps_screenshot().trim().equalsIgnoreCase(YES) && isScreeshotNeeded) {
            ExtentManager.getExtentTest().pass(message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        } else {
            pass(message);
        }
    }

    public static void pass(Markup message, boolean isScreeshotNeeded) {
        if (ConfigFactory.getConfig().passed_steps_screenshot().trim().equalsIgnoreCase(YES) && isScreeshotNeeded) {
       /*     System.out.println("----------------");
            System.out.println("ConfigFactory.getConfig().passed_steps_screenshot() = " + ConfigFactory.getConfig().passed_steps_screenshot());
            System.out.println("ConfigFactory.getConfig().passed_steps_screenshot().trim().equalsIgnoreCase(YES) = " + ConfigFactory.getConfig().passed_steps_screenshot().trim().equalsIgnoreCase(YES));
            System.out.println("isScreeshotNeeded = " + isScreeshotNeeded);
*/
            ExtentManager.getExtentTest().pass(
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
            ExtentManager.getExtentTest().pass(message);
        } else {
            pass(message);
        }
    }

    public static void fail(String message, boolean isScreeshotNeeded) {
        if (ConfigFactory.getConfig().failed_steps_screenshot().trim().equalsIgnoreCase(YES) && isScreeshotNeeded) {
            ExtentManager.getExtentTest().fail(message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        } else {
            fail(message);
        }
    }

    public static void fail(Markup message, boolean isScreeshotNeeded) {
        if (ConfigFactory.getConfig().failed_steps_screenshot().trim().equalsIgnoreCase(YES) && isScreeshotNeeded) {
            ExtentManager.getExtentTest().fail(
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
            ExtentManager.getExtentTest().fail(message);
        } else {
            fail(message);
        }
    }

    public static void skip(String message, boolean isScreeshotNeeded) {
        if (ConfigFactory.getConfig().skipped_steps_screenshot().trim().equalsIgnoreCase(YES) && isScreeshotNeeded) {
            ExtentManager.getExtentTest().skip(message,
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
        } else {
            skip(message);
        }
    }

    public static void skip(Markup message, boolean isScreeshotNeeded) {
        if (ConfigFactory.getConfig().skipped_steps_screenshot().trim().equalsIgnoreCase(YES) && isScreeshotNeeded) {
            ExtentManager.getExtentTest().skip(
                    MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtils.getBase64Image()).build());
            ExtentManager.getExtentTest().skip(message);
        } else {
            skip(message);
        }
    }

}
