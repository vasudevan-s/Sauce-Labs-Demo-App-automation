package org.example.appname.suites.smoke;

import org.example.appname.base.TestBase;
import org.example.appname.pages.Web.WelcomePage;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebTests extends TestBase {
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
