package com.saucelabs.mydemoapp.pages.mobile;

import com.saucelabs.mydemoapp.objectrepository.AppObjectRepository;
import pro.vasudevan.misc.Common;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.stream.Stream;

/*
Created By: Vasudevan Sampath

 AuthPage.java is a Selenium Page Object Model standard for auth specifics
 */
public class AuthPage extends AppObjectRepository {
    public void signIn() throws Exception {
        if (Common.waitForAnyExpectedCondition(ExpectedConditions.visibilityOf(bottomMenuItem), 120) != null) {
            bottomMenuItem.click();
            loginMenuItem.click();
            loginIdAutoFill.click();
            signIn.click();
        }
    }
    public boolean isSignInSuccessful() {
        bottomMenuItem.click();
        loginMenuItem.click();
        boolean returnValue = Common.waitForAnyExpectedCondition(ExpectedConditions.invisibilityOf(loginIdAutoFill));
        bottomCatalogItem.click();
        return returnValue;
    }

    public void signOut() {
        bottomMenuItem.click();
        logoutMenuItem.click();
        Common.waitForAnyExpectedCondition(ExpectedConditions.visibilityOf(logoutAlertDialog)).click();
        Common.waitForAnyExpectedCondition(ExpectedConditions.visibilityOf(logoutAlertConfirmation)).click();
    }
    public boolean isSignOutSuccessful() {
        return Common.waitForAnyExpectedCondition(ExpectedConditions.visibilityOf(loginIdAutoFill)).isDisplayed();
    }
}
