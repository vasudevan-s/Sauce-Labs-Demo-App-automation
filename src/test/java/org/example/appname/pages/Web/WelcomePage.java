package org.example.appname.pages.Web;

import org.example.appname.misc.Common;
import org.example.appname.config.IDriverConfig;
/*
Created By: Vasudevan Sampath

 WelcomePage.java has test methods for Web
 */

public class WelcomePage {
    public String getTitle() throws Exception {
        Common.takeScreenshot();
        return IDriverConfig.getDriver().getTitle();
    }
}
