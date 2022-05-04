package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPage extends Utility {




    public int getnumberfromelement(By by) {
        List<WebElement> actualNumberElement = driver.findElements(by);
        int actualNumber = actualNumberElement.size();
        return actualNumber;
    }




    //
//    //Verify that six products are displayed on page
//    int expectedNumber = 6;
//        Assert.assertEquals(expectedNumber,getnumberfromelement(By.className("inventory_item")));


}
