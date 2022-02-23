package com.learning.driver;

import com.learning.config.ConfigFactory;
import org.openqa.selenium.WebDriver;

//final -> We do not want any class to extend this class
public class Driver {

    //private -> We do not want anyone to create the object of this class
    private Driver() {
    }

    public static void initDriver() {//method should do only 1 thing

        String browser = ConfigFactory.getConfig().browser().trim();
        if (DriverManager.getDriver() == null) {
            WebDriver driver = DriverFactory.getDriver(browser);

            //threadLocal.set(driver);
            DriverManager.setDriver(driver);

            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            //driver.manage().timeouts().implicitlyWait(config.timeout(), TimeUnit.SECONDS);
            // driver.manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
            // threadLocal.get().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
            //DriverManager.getDriver().manage().timeouts().implicitlyWait(ConfigFactory.getConfig().timeout(), TimeUnit.SECONDS);
            DriverManager.getDriver().manage().window().maximize();

            //driver.get("https://opensource-demo.orangehrmlive.com/");
            // driver.get(config.url());
            //driver.get(ConfigFactory.getConfig().url());
            //threadLocal.get().get(ConfigFactory.getConfig().url());
            DriverManager.getDriver().get(ConfigFactory.getConfig().url());

        }
    }

    public static void quitDriver() {

        if (DriverManager.getDriver() != null) {
            //driver.quit();
            //threadLocal.get().quit();
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
