package tests;

import base.BaseTest;
import com.stc.blink.automation.actions.HomePageActions;
import com.stc.blink.automation.pages.HomePage;
import AssertUtils.AssertUtils;
import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void searchForEmployee() {

        HomePageActions.SearchForuser("moghanem.c@stc.com.sa");
        AssertUtils.assertVisible(
                AppiumBy.androidUIAutomator(
                        "new UiSelector().text(\"Moataz Samy Ghanem\")"
                )
        );

    }
}
