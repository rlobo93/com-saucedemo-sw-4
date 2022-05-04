package com.saucedemo.testsuite;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.MainPage;
import com.saucedemo.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage =new MainPage();


    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //locate and Enter “standard_user” username
        loginPage.enterUsername("standard_user");

        //locate and Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");

        // Click on ‘LOGIN’ button
        loginPage.clickLoginButton();

        // Verify the text “PRODUCTS”
        String expectedMessage = "PRODUCTS";
        String actualMessage= loginPage.getProductText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }





    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        //locate and Enter “standard_user” username
        loginPage.enterUsername("standard_user");

        //locate and Enter “secret_sauce” password
        loginPage.enterPassword("secret_sauce");

       // Click on ‘LOGIN’ button
        loginPage.clickLoginButton();

        //Verify that six products are displayed on page
        int expectedNumber = 6;
        Assert.assertEquals(expectedNumber,mainPage.getnumberfromelement(By.className("inventory_item")));


    }

}
