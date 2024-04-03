package org.example.appname.base;

import org.example.appname.config.DriverConfigurator;
import org.example.appname.config.IDriverConfig;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/*
Created By: Vasudevan Sampath

 TestBase.java initializes Selenium/Appium driver object
 */
public class TestBase extends DriverConfigurator {

    @BeforeTest(alwaysRun = true)
    protected void setup(ITestContext testContext) {
        initDriver(testContext);
    }

    @AfterTest(alwaysRun = true)
    protected final void cleanup() {
        IDriverConfig.tearDown();
    }
}
