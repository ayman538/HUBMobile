package base;

import com.stc.blink.automation.driver.DriverManager;
import config.CapabilityLoader;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.net.URL;


public class BaseTest {

    @BeforeClass
    public void setup() throws IOException {

        DesiredCapabilities capabilities = CapabilityLoader.load("capabilities.json");

        AndroidDriver driver = new AndroidDriver(
                new URL("http://127.0.0.1:4725"),
                capabilities
        );

        DriverManager.setDriver(driver);
    }

    @AfterClass
    public void tearDown() {
        DriverManager.quitDriver();
    }
}
