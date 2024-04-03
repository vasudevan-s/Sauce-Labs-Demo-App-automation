package org.example.appname.pages.Mobile;

import org.example.appname.misc.Common;
import org.example.appname.objectrepository.AppObjectRepository;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
Created By: Vasudevan Sampath

 LoginPage.java is a Selenium Page Object Model standard for login specifics
 */
public class LoginPage extends AppObjectRepository {
    public void login() throws Exception {
        if (Common.waitForAnyExpectedCondition(ExpectedConditions.visibilityOf(bottomMenuItem), 120) != null) {
            bottomMenuItem.click();
            loginMenuItem.click();
            loginIdAutoFill.click();
            Common.takeScreenshot();
            //       Stream.of(login).forEach(singleChar -> loginId.sendKeys(singleChar));
            signIn.click();
        }
    }
    public boolean isSignInSuccessful() {
        return bottomMenuItem.isDisplayed();
    }
}
