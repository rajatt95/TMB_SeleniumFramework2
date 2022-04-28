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

import com.learning.driver.DriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

//final -> We do not want any class to extend this class
public final class ScreenshotUtils {

	//private -> We do not want anyone to create the object of this class
	private ScreenshotUtils() {
	}

	public static String getBase64Image() {
		return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BASE64);
	}

}
