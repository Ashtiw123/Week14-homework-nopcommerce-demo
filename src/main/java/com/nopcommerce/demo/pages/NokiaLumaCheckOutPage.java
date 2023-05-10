package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumaCheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomePleaseSignInText;

    public String verifyWelcomePleaseSignInText() {
        CustomListeners.test.log(Status.PASS, "verifyWelcomePleaseSignInText " + welcomePleaseSignInText);
        Reporter.log("verifyWelcomePleaseSignInText " + welcomePleaseSignInText.toString());
        return getTextFromElement(welcomePleaseSignInText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement clickRegisterTab;
    public void clickOnRegisterTabOption() {
        CustomListeners.test.log(Status.PASS, "clickOnRegisterTabOption " + clickRegisterTab);
        Reporter.log("clickOnRegisterTabOption " + clickRegisterTab.toString());
        clickOnElement(clickRegisterTab);
    }


}
