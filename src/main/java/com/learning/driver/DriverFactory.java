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

import com.learning.config.ConfigFactory;

import static com.learning.constants.FrameworkConstants.LOCAL;
import static com.learning.constants.FrameworkConstants.REMOTE;

//final -> We do not want any class to extend this class
public class DriverFactory {

    //private -> We do not want anyone to create the object of this class
    private DriverFactory() {
    }

    public static WebDriver getDriver(String browser) {
        WebDriver driver = null;
        String runmode = ConfigFactory.getConfig().runmode();
        if (runmode.equalsIgnoreCase(REMOTE)) {
            //   driver = setupForRemoteRunMode(browser);
            driver = DriverFactoryRemote.setupForRemoteRunMode(browser);
        } else if (runmode.equalsIgnoreCase(LOCAL)) {
            //driver = setupForLocalRunMode(browser);
            driver = DriverFactoryLocal.setupForLocalRunMode(browser);
        }
        return driver;

    }


}
