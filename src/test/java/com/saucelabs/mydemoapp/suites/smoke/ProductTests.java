package com.saucelabs.mydemoapp.suites.smoke;

import com.saucelabs.mydemoapp.base.TestBase;
import com.saucelabs.mydemoapp.pages.mobile.ProductsPage;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
Created By: Vasudevan Sampath

 ProductTests.java has test methods for the mobile app product screen
 */
public class ProductTests {
    private ProductsPage productsPage;
    @BeforeClass(alwaysRun = true)
    public void initClass(ITestContext testContext) {
        productsPage = new ProductsPage();
    }
    @Test(priority = 2, description = "Select a random product from the product list, add 1 or more of the " +
                                        "selected product and check the count test")
    public void validateAddProductsToCartCountTest() throws Exception {
        productsPage.selectRandomProduct();
        int productCount = productsPage.addToCart(3);
        Assert.assertTrue(productsPage.isShoppingCartCountValid(productCount), "Added product count is not matching with the displayed count");
    }
}
