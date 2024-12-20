package com.nttdata.screens;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtils {
    WebDriver driver;

    public ScrollUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollAndClickTexto(String visibleText) {
        driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                ".scrollIntoView(new UiSelector().textContains(\"" + visibleText + "\").instance(0))"))
                .click();
    }

    public WebElement scrollToElementByXPath(String xpath) {
        String uiScrollableCommand = "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                ".scrollIntoView(new UiSelector().resourceIdMatches(\".*\"))";
        driver.findElement(AppiumBy.androidUIAutomator(uiScrollableCommand));
        return driver.findElement(AppiumBy.xpath(xpath));
    }

    public void scrollAndClickByXPath(String xpath) {
        WebElement element = scrollToElementByXPath(xpath);
        element.click();
    }

    public void scrollAndClickById(String elementId) {
        driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                ".scrollIntoView(new UiSelector().resourceId(\"" + elementId + "\"))"))
                .click();
    }

    public void scrollAndClickByAccessibilityId(String accessibilityId) {
        driver.findElement(AppiumBy.androidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                                ".scrollIntoView(new UiSelector().description(\"" + accessibilityId + "\"))"))
                .click();
    }
}
