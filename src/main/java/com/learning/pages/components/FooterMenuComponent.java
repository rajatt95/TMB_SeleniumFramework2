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
