package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumaCartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement nokiaLumaCartText;

    public String verifyNokiaLumaShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "verifyNokiaLumaShoppingCartText " + nokiaLumaCartText);
        Reporter.log("verifyNokiaLumaShoppingCartText " + nokiaLumaCartText.toString());
        return getTextFromElement(nokiaLumaCartText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement nokiaLumaCartQuantityText;

    public String verifyQuantityText() {
        CustomListeners.test.log(Status.PASS, "verifyQuantityText " + nokiaLumaCartQuantityText);
        Reporter.log("verifyQuantityText " + nokiaLumaCartQuantityText.toString());
        return getTextFromElement(nokiaLumaCartQuantityText);
    }

    @CacheLookup
    @FindBy(xpath = "//span//strong[contains(text(),'$698.00')]")
    WebElement nokiaLumaCartUpdatedPriceText;

    public String verifyTotalPriceText() {
        CustomListeners.test.log(Status.PASS, "verifyTotalPriceText " + nokiaLumaCartUpdatedPriceText);
        Reporter.log("verifyTotalPriceText " + nokiaLumaCartUpdatedPriceText.toString());
        return getTextFromElement(nokiaLumaCartUpdatedPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnBoxIAgreeTerms;

    public void clickOnBoxIAgreeToTermsOfServiceOption() {
        CustomListeners.test.log(Status.PASS, "clickOnBoxIAgreeToTermsOfServiceOption " + clickOnBoxIAgreeTerms);
        Reporter.log("clickOnBoxIAgreeToTermsOfServiceOption " + clickOnBoxIAgreeTerms.toString());
        clickOnElement(clickOnBoxIAgreeTerms);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement clickOnCheckOut;

    public void clickOnCheckOutOption() {
        CustomListeners.test.log(Status.PASS, "clickOnCheckOutOption " + clickOnCheckOut);
        Reporter.log("clickOnCheckOutOption " + clickOnCheckOut.toString());
        clickOnElement(clickOnCheckOut);
    }


}
