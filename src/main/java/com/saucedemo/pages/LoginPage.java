package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {

    By usernameField = By.id("user-name");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");
    By productText = By.xpath("//span[contains(text(),'Products')]");


    By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");


    public void enterUsername(String username){
        sendTextToElement(usernameField,username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
    }

    public void clickLoginButton(){
        clickOnElement(loginButton);
    }

    public String getProductText(){
        return getTextFromElement(productText);
    }


    public String getErrorMessage (){
        return getTextFromElement(errorMessage);
    }

    public int getnumberfromelement(By by) {
        List<WebElement> actualNumberElement = driver.findElements(by);
        int actualNumber = actualNumberElement.size();
        return actualNumber;
    }



//
//    //locate and Enter “standard_user” username
//    sendTextToElement(By.id("user-name"),"standard_user");
//
//    //locate and Enter “secret_sauce” password
//    sendTextToElement(By.id("password"),"secret_sauce");
//
//    // Click on ‘LOGIN’ button
//    clickOnElement(By.id("login-button"));
//
//    //Verify that six products are displayed on page
//    int expectedNumber = 6;
//        Assert.assertEquals(expectedNumber,getnumberfromelement(By.className("inventory_item")));



}
