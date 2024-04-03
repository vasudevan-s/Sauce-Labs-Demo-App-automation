package org.example.appname.objectrepository;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.example.appname.base.TestBase;
import org.example.appname.config.IDriverConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

/*
Created By: Vasudevan Sampath

 AppObjectRepository.java has object definitions
 */
public abstract class AppObjectRepository extends TestBase {
    @iOSXCUITFindBy(accessibility = "tab bar option menu")
    @CacheLookup
    protected WebElement bottomMenuItem;
    @iOSXCUITFindBy(accessibility = "menu item log in")
    @CacheLookup
    protected WebElement loginMenuItem;
    @iOSXCUITFindBy(accessibility = "bob@example.com-autofill")
    @CacheLookup
    protected WebElement loginIdAutoFill;
    @iOSXCUITFindBy(accessibility = "Login button")
    @CacheLookup
    protected WebElement signIn;
    protected AppObjectRepository() {
        if (IDriverConfig.getDriver() instanceof AppiumDriver) {
            PageFactory.initElements(new AppiumFieldDecorator(IDriverConfig.getDriver()), this);
        }
    }
}
