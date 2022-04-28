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

import com.learning.enums.WaitType;
import org.openqa.selenium.By;

public class TopMenuComponent {

    private static final By LNK_ADMIN = By.id("menu_admin_viewAdminModule");
    private static final String LNK_ADMIN_TXT = "Link: Admin";

    public TopMenuComponent clickAdmin() {
        //    DriverManager.getDriver().findElement(lnkAdmin).click();
        // click(LNK_ADMIN);
        //SeleniumUtils.click(LNK_ADMIN);
        //click(LNK_ADMIN);
        click(LNK_ADMIN, WaitType.CLICKABLE, LNK_ADMIN_TXT);
        return this;
    }
}
