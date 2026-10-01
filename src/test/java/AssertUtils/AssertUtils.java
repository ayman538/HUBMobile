package AssertUtils;

import com.stc.blink.automation.config.ConfigManager;
import com.stc.blink.automation.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AssertUtils {

    public static void assertVisible(By locator) {

        WebDriverWait wait = new WebDriverWait(
                DriverManager.getDriver(),
                Duration.ofSeconds(ConfigManager.getAssertWait())
        );

        try {
            wait.until(
                    ExpectedConditions.visibilityOfElementLocated(locator)
            );
        } catch (TimeoutException e) {
            Assert.fail(
                    "Expected element to be visible after "
                            + ConfigManager.getAssertWait()
                            + " seconds: "
                            + locator
            );
        }
    }
}