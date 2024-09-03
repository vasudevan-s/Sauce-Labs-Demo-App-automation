package com.saucelabs.mydemoapp.base;

import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pro.vasudevan.config.IWebDriverConfig;

/*
Created By: Vasudevan Sampath

 TestBase.java initializes Selenium/Appium driver object
 */
public class TestBase {

    @BeforeTest(alwaysRun = true)
    protected void setup(ITestContext testContext) throws InterruptedException {
        IWebDriverConfig.initDriver(testContext);
    }

    @AfterTest(alwaysRun = true)
    protected final void cleanup() {
        IWebDriverConfig.tearDown();
    }
}
