/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.pages.components;

import static com.learning.utils.SeleniumUtils.*;

import org.openqa.selenium.By;

public class FooterMenuComponent {

    private static final By LABEL_FOOTER_MESSAGE = By.id("footer");

    public String getFooterLable() {
        //return  DriverManager.getDriver().findElement(labelFooterMessage).getText();
        // return getElementText(LABEL_FOOTER_MESSAGE);
        //  return SeleniumUtils.getElementText(LABEL_FOOTER_MESSAGE);
        return getElementText(LABEL_FOOTER_MESSAGE);
    }
}
