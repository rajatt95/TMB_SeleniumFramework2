package com.learning.pages;

import com.learning.enums.WaitType;
import com.learning.pages.components.FooterMenuComponent;

import static com.learning.utils.SeleniumUtils.*;

import com.learning.pages.components.TopMenuComponent;
import org.openqa.selenium.By;


public class HomePage {

    //HomePage HAS-A TopMenu --> Composition
    //HomePage IS-A Page --> Inheritance
    private TopMenuComponent topMenuComponent;
    private FooterMenuComponent footerMenuComponent;

    public HomePage() {
        topMenuComponent = new TopMenuComponent();
        footerMenuComponent = new FooterMenuComponent();
    }

    private static final By WELCOME = By.id("welcome");
    private static final By LOGOUT = By.xpath("//a[normalize-space()='Logout']");

    private static final By DASHBOARD_MY_TIMESHEET = By.xpath("//span[normalize-space()='My Timesheet']");
    private static final By DASHBOARD_APPLY_LEAVE = By.xpath("//span[normalize-space()='Apply Leave']");


    public void clickOnAdmin() {
        topMenuComponent.clickAdmin();
    }

    public String getFooterText() {
        return footerMenuComponent.getFooterLable();
    }


    public String getHomePageTitle() {
        // return DriverManager.getDriver().getTitle();
        // return getPageTitle();
        // return SeleniumUtils.getPageTitle();
        return getPageTitle();
    }

    private HomePage clickOnWelcome() {
        click(WELCOME, WaitType.CLICKABLE);
        return this;
    }

    private LoginPage clickOnLogout() {
        click(LOGOUT, WaitType.CLICKABLE);
        return new LoginPage();
    }

    //Wrapper method for performing 2 operations
    public LoginPage logoutFromApplication() {
//        clickOnWelcome();
//        waitForGivenTime(2);
//        return clickOnLogout();

        //Method Chaining
        return clickOnWelcome()
                .clickOnLogout();
    }

    public HomePage clickOnMyTimeSheet() {
        click(DASHBOARD_MY_TIMESHEET, WaitType.CLICKABLE);
        return this;
    }

    public HomePage clickOnApplyLeave() {
        click(DASHBOARD_APPLY_LEAVE, WaitType.CLICKABLE);
        return this;
    }

    public String getPageURL() {
        return getWebPageURL();
    }
}
