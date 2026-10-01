package com.stc.blink.automation.utils;

import com.stc.blink.automation.config.ConfigManager;
import com.stc.blink.automation.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MobileActions {
    public static void click(By locator) {

        WebElement element = new WebDriverWait(
                DriverManager.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWait())
        ).until(
                ExpectedConditions.elementToBeClickable(locator)
        );

        element.click();
    }

    public static void type(By locator, String text) {

        WebElement element = new WebDriverWait(
                DriverManager.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWait())
        ).until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        );

        element.clear();
        element.sendKeys(text);
    }

    public static String getText(By locator) {

        return new WebDriverWait(
                DriverManager.getDriver(),
                Duration.ofSeconds(ConfigManager.getExplicitWait())
        ).until(
                ExpectedConditions.visibilityOfElementLocated(locator)
        ).getText();
    }

}
