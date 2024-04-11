package com.saucelabs.mydemoapp.suites.smoke;

import com.saucelabs.mydemoapp.base.TestBase;
import com.saucelabs.mydemoapp.pages.mobile.AuthPage;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
Created By: Vasudevan Sampath

 LoginTests.java has test methods for the mobile app login screen
 */
public class AuthTests extends TestBase {
    private AuthPage authPage;

    @BeforeClass(alwaysRun = true)
    public void initClass(ITestContext testContext) {
        authPage = new AuthPage();
//        userName = testContext.getCurrentXmlTest().getParameter("loginId");
//        password = testContext.getCurrentXmlTest().getParameter("password");
    }

    @Test(priority = 0, description = "SignIn test")
    public void verifyValidSignTest() throws Exception {
        // TestNG data provider data is shown here for illustration purposes only. Not used in the actual implementation
        authPage.signIn();
        Assert.assertTrue(authPage.isSignInSuccessful(), "Login failed");
    }

    @Test(priority = 100, description = "SignOut test", enabled = false)
    public void verifySignOutTest() {
        // TestNG data provider data is shown here for illustration purposes only. Not used in the actual implementation
        authPage.signOut();
        Assert.assertTrue(authPage.isSignOutSuccessful(), "Logout failed");
    }

/*    @Test(priority = 0, description = "SignIn test", dataProvider = "LoginDataProvider", dataProviderClass = TestDataSets.class)
    public void verifyValidSignTest(String userName, String password) throws Exception {
        // TestNG data provider data is shown here for illustration purposes only. Not used in the actual implementation
        System.out.println(userName + ' ' + password);
        authPage.login();
        Assert.assertTrue(authPage.isSignInSuccessful(), "Login failed");
    }*/
}
