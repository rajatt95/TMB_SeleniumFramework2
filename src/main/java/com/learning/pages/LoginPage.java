package com.learning.pages;

import static com.learning.utils.SeleniumUtils.*;

import com.learning.enums.WaitType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage {

//     By txtBoxUsername = By.id("txtUsername");
//     By txtBoxPassword = By.id("txtPassword");
//     By btnLogin = By.id("btnLogin");

//    private By txtBoxUsername = By.id("txtUsername");
//    private By txtBoxPassword = By.id("txtPassword");
//    private By btnLogin = By.id("btnLogin");

//    private final By txtBoxUsername = By.id("txtUsername"); //100 threads  --> 100 times
//    private final By txtBoxPassword = By.id("txtPassword");
//    private final By btnLogin = By.id("btnLogin");

    //static --> Used for Memory management efficiency
//    private static final By txtBoxUsername = By.id("txtUsername"); //100 threads  --> 1 txtBoxUsername
//    private static final By txtBoxPassword = By.id("txtPassword");
//    private static final By btnLogin = By.id("btnLogin");

    //Naming Convention for private static final fields/variables
    private static final By TXTBOX_USERNAME = By.id("txtUsername"); //100 threads  --> 1 txtBoxUsername
    private static final String TXTBOX_USERNAME_TXT = "Username";

    private static final By TXTBOX_PASSWORD = By.id("txtPassword");
    private static final String TXTBOX_PASSWORD_TXT = "Password";

    private static final By BTN_LOGIN = By.id("btnLogin");
    private static final String BTN_LOGIN_TXT = "Login Button";

    private static final By MSG_ERROR = By.id("spanMessage");
    //private static final String MSG_ERROR_TXT = "Error Message";



//    public void setUsername(String username) {
//        DriverManager.getDriver().findElement(txtBoxUsername).sendKeys(username);
//    }

    // public LoginPage setUsername(String username) {
    private LoginPage setUsername(String username) {
        //   DriverManager.getDriver().findElement(TXTBOX_USERNAME).sendKeys(username);
        // sendKeys(TXTBOX_USERNAME, username);
        // SeleniumUtils.sendKeys(TXTBOX_USERNAME, username);
        //sendKeys(TXTBOX_USERNAME, username);
        sendKeys(TXTBOX_USERNAME, username, TXTBOX_USERNAME_TXT);

        //  return new LoginPage();
        return this;
    }

    public WebElement getTxtBoxUserame(){
        return getElement(TXTBOX_USERNAME);
    }
    public WebElement getTxtBoxPassword(){
        return getElement(TXTBOX_PASSWORD);
    }
    public WebElement getBtnLogin(){
        return getElement(BTN_LOGIN);
    }

    private LoginPage setPassword(String password) {
        //DriverManager.getDriver().findElement(TXTBOX_PASSWORD).sendKeys(password);
        //sendKeys(TXTBOX_PASSWORD, password);
        //SeleniumUtils.sendKeys(TXTBOX_PASSWORD, password);
        // sendKeys(TXTBOX_PASSWORD, password);
        sendKeys(TXTBOX_PASSWORD, password, TXTBOX_PASSWORD_TXT);
        return this;
    }

    private HomePage clickLogin() {
        //DriverManager.getDriver().findElement(BTN_LOGIN).click();
        // click(BTN_LOGIN);
        //SeleniumUtils. click(BTN_LOGIN);
        // click(BTN_LOGIN);
        //click(BTN_LOGIN, WaitType.CLICKABLE);
        //click(BTN_LOGIN, WaitType.CLICKABLE);
        click(BTN_LOGIN, WaitType.CLICKABLE, BTN_LOGIN_TXT);
        return new HomePage(); //Page Chaining
    }

    //Wrapper method for performing 3 operations
    public HomePage loginToApplication(String username, String password) {
        //Method Chaining
        return setUsername(username)
                .setPassword(password)
                .clickLogin();
    }

    public String getErrorMessage(){
        return getElementText(MSG_ERROR);
    }


}
