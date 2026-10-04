package com.stc.blink.automation.actions;

import com.stc.blink.automation.driver.DriverManager;
import com.stc.blink.automation.pages.HomePage;
import com.stc.blink.automation.utils.MobileActions;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.TimeoutException;
import static com.stc.blink.automation.utils.WaitUtils.waitForClickable;
import static com.stc.blink.automation.utils.WaitUtils.waitForVisible;

public class HomePageActions {


    public static void SearchForuser(String EmployeeName) {

        try {
            waitForVisible(HomePage.CANCEL_BUTTON).click();
        } catch (TimeoutException e) {
            // Popup is not displayed, continue normally
        }

        MobileActions.click(HomePage.SEARCH_ICON);
        MobileActions.click(HomePage.SEARCH_EMPLOYEE);
        MobileActions.type(HomePage.SEARCH_EMPLOYEE ,EmployeeName);



    }
}
