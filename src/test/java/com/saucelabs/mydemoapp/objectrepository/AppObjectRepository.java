package com.saucelabs.mydemoapp.objectrepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import pro.vasudevan.automation.unifiedtestframework.config.IWebDriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

import java.util.List;

/*
Created By: Vasudevan Sampath

 AppObjectRepository.java has object definitions
 */
public abstract class AppObjectRepository {
    @iOSXCUITFindBy(accessibility = "tab bar option menu")
    @CacheLookup
    protected WebElement bottomMenuItem;
    @iOSXCUITFindBy(accessibility = "menu item log in")
    @CacheLookup
    protected WebElement loginMenuItem;
    @iOSXCUITFindBy(accessibility = "bob@example.com-autofill")
    protected WebElement loginIdAutoFill;
    @iOSXCUITFindBy(accessibility = "menu item log out")
    @CacheLookup
    protected WebElement logoutMenuItem;
    @iOSXCUITFindBy(iOSNsPredicate = "name == \"Log Out\" AND label == \"Log Out\" AND type == \"XCUIElementTypeButton\"")
    @CacheLookup
    protected WebElement logoutAlertDialog;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeButton[`name == \"OK\"`]")
    @CacheLookup
    protected WebElement logoutAlertConfirmation;
    @iOSXCUITFindBy(accessibility = "Login button")
    @CacheLookup
    protected WebElement signIn;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"store item\"]")
    protected List<WebElement> productList;
    @iOSXCUITFindBy(accessibility = "Add To Cart button")
    @CacheLookup
    protected WebElement addToCart;
    @iOSXCUITFindBy(accessibility = "counter plus button")
    protected WebElement plusButton;
    @iOSXCUITFindBy(accessibility = "counter minus button")
    protected WebElement minusButton;
    @iOSXCUITFindBy(accessibility = "tab bar option cart")
    protected WebElement optionCart;
    @iOSXCUITFindBy(accessibility = "tab bar option catalog")
    @CacheLookup
    protected WebElement bottomCatalogItem;
    protected AppObjectRepository() {
        if (IWebDriverConfig.getDriver() instanceof AppiumDriver) {
            PageFactory.initElements(new AppiumFieldDecorator(IWebDriverConfig.getDriver()), this);
        }
    }
}
