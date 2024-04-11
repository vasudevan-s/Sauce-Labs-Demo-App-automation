package com.saucelabs.mydemoapp.pages.mobile;

import com.saucelabs.mydemoapp.objectrepository.AppObjectRepository;

import java.util.Random;
import java.util.function.Supplier;

/*
Created By: Vasudevan Sampath

 ProductsPage.java is a Selenium Page Object Model standard for Product screen specifics
 */
public class ProductsPage extends AppObjectRepository {

    // get product list count
    final Supplier<Integer> productListCount = () -> productList.size();

    public void selectRandomProduct() {productList.get(new Random().nextInt(productListCount.get())).click();}
    public int addToCart(int numberOfItems) {
        int count = 0;
        minusButton.click();
        for (int i = 1; i <= numberOfItems; i++) {
            plusButton.click();
            count++;
        }
        addToCart.click();
        return count;
    }
    public boolean isShoppingCartCountValid(int num) throws InterruptedException {
        Thread.sleep(2000);
        return Integer.parseInt(optionCart.getAttribute("label")) == num;
    }
}
