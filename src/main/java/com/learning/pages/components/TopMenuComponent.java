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
