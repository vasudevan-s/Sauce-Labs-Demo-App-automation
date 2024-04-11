package com.saucelabs.mydemoapp.pages.web;

import com.saucelabs.mydemoapp.objectrepository.AppObjectRepository;
import pro.vasudevan.config.IDriverConfig;
/*
Created By: Vasudevan Sampath

 WelcomePage.java has test methods for Web
 */
public class WelcomePage extends AppObjectRepository {
    public String getTitle() {
        return IDriverConfig.getDriver().getTitle();
    }
}
