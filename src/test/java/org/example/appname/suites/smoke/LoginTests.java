package org.example.appname.suites.smoke;

import org.example.appname.base.TestBase;
import org.example.appname.data.TestDataSets;
import org.example.appname.pages.Mobile.LoginPage;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
Created By: Vasudevan Sampath

 LoginTests.java has test methods for the mobile login screen
 */

public class LoginTests extends TestBase {
    private LoginPage loginPage;

    @BeforeClass(alwaysRun = true)
    public void initClass(ITestContext testContext) {
        loginPage = new LoginPage();
//        userName = testContext.getCurrentXmlTest().getParameter("loginId");
//        password = testContext.getCurrentXmlTest().getParameter("password");
    }

    @Test(priority = 0, description = "Login test", dataProvider = "LoginDataProvider", dataProviderClass = TestDataSets.class)
    public void verifyValidLoginTest(String userName, String password) throws Exception {
        // TestNG data provider data is shown here for illustration purposes only. Not used in the actual implementation
        System.out.println(userName + ' ' + password);
        loginPage.login();
        Assert.assertTrue(loginPage.isSignInSuccessful(), "Login failed");
    }
}
