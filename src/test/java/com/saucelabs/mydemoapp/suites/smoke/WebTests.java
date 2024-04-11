package com.saucelabs.mydemoapp.suites.smoke;

import com.saucelabs.mydemoapp.base.TestBase;
import com.saucelabs.mydemoapp.pages.web.WelcomePage;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
Created By: Vasudevan Sampath

 WebTests.java has test methods for the web application
 */
public class WebTests {
    private WelcomePage welcomePage;
    @BeforeClass(alwaysRun = true)
    public void initClass(ITestContext testContext) {
        welcomePage = new WelcomePage();
    }

    @Test(priority = 1, description = "Web Sample test")
    public void isTitleMatchingTest() throws Exception {
        Assert.assertEquals(welcomePage.getTitle(), "Apple");
    }
}
