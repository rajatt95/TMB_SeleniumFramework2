/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium - Java with Docker, Git and Jenkins (https://www.testingminibytes.com/courses/selenium-java-with-docker-git-and-jenkins/)
 * Tutor: Amuthan Sakthivel (https://www.testingminibytes.com/)
 */

package com.learning.tests;

import com.learning.annotations.FrameworkAnnotation;
import com.learning.driver.DriverManager;
import com.learning.enums.AuthorType;
import com.learning.enums.CategoryType;
import com.learning.pages.HomePage;
import com.learning.pages.LoginPage;
import com.learning.testdata.TestData;
import com.learning.utils.DataProviderUtils;
import com.learning.utils.VerificationUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.learning.constants.FrameworkConstants.ASSERTION_FOR;

public class HomePageTest extends BaseTest {

    @FrameworkAnnotation(author = { AuthorType.GAUTAM, AuthorType.PANKAJ},
            category = { CategoryType.SANITY, CategoryType.SMOKE,CategoryType.REGRESSION })
    @Test(groups = {"SANITY","SMOKE","REGRESSION"},description = "To check whether the User can login and title is displayed correctly",
            dataProvider = "getTestData",dataProviderClass = DataProviderUtils.class)
    public void titleValidationTest(TestData testData) {

        LoginPage loginPage = new LoginPage();
        HomePage homePage = loginPage
                .loginToApplication(testData.getUsername(), testData.getPassword());

//        Assert.assertEquals(homePage.getHomePageTitle(), testData.getExpectedTitle(),
//                "Assertion for Page Title after successful Login");

        VerificationUtils.validateResponse(homePage.getHomePageTitle(), testData.getExpectedTitle(),
                ASSERTION_FOR +" -  <b> <u> Page Title after successful Login </b> </u>");

    }



    /**
     * --------------------------------------------------------------------- (2nd time)
     * */
   // @FrameworkAnnotation(author = { AuthorType.GAUTAM, AuthorType.PANKAJ},
     //       category = { CategoryType.SANITY, CategoryType.SMOKE,CategoryType.REGRESSION })
   // @Test(description = "To check whether the User can login and title is displayed correctly",
       //     dataProvider = "getValidLoginData", dataProviderClass = DataProviderUtils.class)
    public void REFERENCE_titleValidationTest(String username, String password, String expectedTitle) {

        LoginPage loginPage = new LoginPage();
//        loginPage.setUsername("Admin");
//        loginPage.setPassword("admin1234");
//        loginPage.setUsername(username);
//        loginPage.setPassword(password);
//        loginPage.clickLogin();

//          Method Chaining
//        loginPage
//                .setUsername(username)
//                .setPassword(password)
//                .clickLogin();
        HomePage homePage = loginPage
                .loginToApplication(username, password);

        //  Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM", "Assertion for Page Title after successful Login");
        Assert.assertEquals(homePage.getHomePageTitle(), expectedTitle,
                "Assertion for Page Title after successful Login");

    }


    /**
     * --------------------------------------------------------------------- (1st time)
     * */
    // @Test(description = "To check whether the User can login and title is displayed correctly")
    public void REFERENCE_errorInvalidCredentials() {
//        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
//        driver.findElement(By.id("btnLogin")).click();
        // holdScript(3);
//        Driver.driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//        Driver.driver.findElement(By.id("txtPassword")).sendKeys("admin1234");
//        Driver.driver.findElement(By.id("btnLogin")).click();

//        Driver.threadLocal.get().findElement(By.id("txtUsername")).sendKeys("Admin");
//        Driver.threadLocal.get().findElement(By.id("txtPassword")).sendKeys("admin1234");
//        Driver.threadLocal.get().findElement(By.id("btnLogin")).click();

//        DriverManager.getDriver().findElement(By.id("txtUsername")).sendKeys("Admin");
//        DriverManager.getDriver().findElement(By.id("txtPassword")).sendKeys("admin1234");
//        DriverManager.getDriver().findElement(By.id("btnLogin")).click();

//        LoginPage loginPage =new LoginPage();
//        loginPage.setUsername("Admin");
//        loginPage.setPassword("admin1234");
//        loginPage.clickLogin();

//        Assert.assertEquals( Driver.driver.getTitle(), "OrangeHRM", "Assertion for Page Title");
        // Assert.assertEquals( Driver.threadLocal.get().getTitle(), "OrangeHRM", "Assertion for Page Title");
        Assert.assertEquals(DriverManager.getDriver().getTitle(), "OrangeHRM", "Assertion for Page Title");

    }
}
