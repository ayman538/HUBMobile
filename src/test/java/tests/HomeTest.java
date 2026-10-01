package tests;

import base.BaseTest;
import com.stc.blink.automation.actions.HomePageActions;
import com.stc.blink.automation.pages.HomePage;
import AssertUtils.AssertUtils;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest {

    @Test
    public void testSearch() {

        HomePageActions.clickSearch();
        AssertUtils.assertVisible(
                HomePage.SEARCH_ICON
        );
    }
}
