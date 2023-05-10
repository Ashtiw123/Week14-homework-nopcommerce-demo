package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutWelcomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeTitle;

    public String getTextFromWelcomeSignInTitle() {
        CustomListeners.test.log(Status.PASS, "getTextFromWelcomeSignInTitle " + welcomeTitle);
        Reporter.log("getTextFromWelcomeSignInTitle " + welcomeTitle.toString());
        return getTextFromElement(welcomeTitle);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement checkOutAsGuestButton;

    public void clickCheckoutAsGuestButton() {
        CustomListeners.test.log(Status.PASS, "clickCheckoutAsGuestButton " + checkOutAsGuestButton);
        Reporter.log("clickCheckoutAsGuestButton " + checkOutAsGuestButton.toString());
        clickOnElement(checkOutAsGuestButton);
    }
}
