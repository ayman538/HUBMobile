package com.stc.blink.automation.actions;

import com.stc.blink.automation.driver.DriverManager;
import com.stc.blink.automation.pages.HomePage;
import com.stc.blink.automation.utils.MobileActions;

import static com.stc.blink.automation.utils.WaitUtils.waitForClickable;

public class HomePageActions {



    public static void clickSearch() {
        MobileActions.click(HomePage.SEARCH_ICON);

    }
}
