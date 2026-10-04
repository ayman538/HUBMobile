package com.stc.blink.automation.pages;

import com.stc.blink.automation.driver.DriverManager;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomePage {

    public static final By SEARCH_ICON =
            AppiumBy.accessibilityId("search");

    public static final By CANCEL_BUTTON =
            AppiumBy.androidUIAutomator(
                    "new UiSelector().text(\"Cancel\")"
            );



    public static final By SEARCH_EMPLOYEE =
            AppiumBy.className("android.widget.EditText");

}


