package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
//only test methods will be in this class

    HomePage homePage;
    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
    }
    @Test (groups = {"Sanity","Smoke","Regression"})
    public void verifyPageNavigation() {
        String expectedMessage = "Computers" +
                "Electronics" +
                "Apparel" +
                "Digital downloads" +
                "Books" +
                "Jewelry" +
                "Gift Cards";
        String actualText = homePage.findAllTabsInTopMenu();
        Assert.assertEquals(actualText, expectedMessage, "Top menu is not displayed");
    }
}
