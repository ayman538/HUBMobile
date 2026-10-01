package com.stc.blink.automation.utils;

import org.openqa.selenium.support.ui.WebDriverWait;
import com.stc.blink.automation.config.ConfigManager;
import com.stc.blink.automation.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class WaitUtils {


        private static WebDriverWait getWait() {

            return new WebDriverWait(
                    DriverManager.getDriver(),
                    Duration.ofSeconds(
                            ConfigManager.getExplicitWait()
                    )
            );
        }

        public static WebElement waitForVisible(By locator) {

            return getWait().until(
                    ExpectedConditions.visibilityOfElementLocated(locator)
            );
        }

        public static WebElement waitForClickable(By locator) {

            return getWait().until(
                    ExpectedConditions.elementToBeClickable(locator)
            );
        }

        public static boolean waitForInvisible(By locator) {

            return getWait().until(
                    ExpectedConditions.invisibilityOfElementLocated(locator)
            );
        }

        public static WebElement waitForPresent(By locator) {

            return getWait().until(
                    ExpectedConditions.presenceOfElementLocated(locator)
            );
        }

}
