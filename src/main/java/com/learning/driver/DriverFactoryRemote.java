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

import java.net.MalformedURLException;
import java.net.URL;

import com.learning.exceptions.FrameworkException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.learning.config.ConfigFactory;

import static com.learning.constants.FrameworkConstants.*;

//final -> We do not want any class to extend this class
public final class DriverFactoryRemote {

    //private -> We do not want anyone to create the object of this class
    private DriverFactoryRemote() {
    }


    public static WebDriver setupForRemoteRunMode(String browser) {
        WebDriver driver = null;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        if (browser.equalsIgnoreCase(CHROME)) {
            capabilities.setBrowserName(CHROME);
        } else if (browser.equalsIgnoreCase(FIREFOX)) {
            capabilities.setBrowserName(FIREFOX);
        } else if (browser.equalsIgnoreCase(EDGE)) {
            capabilities.setBrowserName(EDGE);
        }/*else if(browser.equalsIgnoreCase("opera")){
            driver = new OperaDriver();
        }else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }*/ else {
            capabilities.setBrowserName(CHROME);
        }
       /* try {
            driver = new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteUrl()),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/
        try {
            driver = new RemoteWebDriver(new URL(ConfigFactory.getConfig().remoteUrl()), capabilities);
        } catch (MalformedURLException malformedURLException) {
            throw new FrameworkException("RemoteWebDriver you are trying to reach got MalformedURLException: It is not reachable", malformedURLException.fillInStackTrace());
        }

        return driver;
    }

}
