package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCart extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCarText;

    public String getTextFromShoppingCartHeading() {
        CustomListeners.test.log(Status.PASS, "getTextFromShoppingCartHeading " + shoppingCarText);
        Reporter.log("getTextFromShoppingCartHeading " + shoppingCarText.toString());
        return getTextFromElement(shoppingCarText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityOption;

    public void quantitySpaceOption() {
        CustomListeners.test.log(Status.PASS, "quantitySpaceOption " + quantityOption);
        Reporter.log("quantitySpaceOption " + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement shoppingCartOption;

    public void updateShoppingCart() {
        CustomListeners.test.log(Status.PASS, "updateShoppingCart " + shoppingCartOption);
        Reporter.log("updateShoppingCart " + shoppingCartOption.toString());
        clickOnElement(shoppingCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//tbody/tr[1]/td[6]/span[1]")
    WebElement priceFinalOption;

    public String getTextFromFinalPrice() {
        CustomListeners.test.log(Status.PASS, "getTextFromFinalPrice " + priceFinalOption);
        Reporter.log("getTextFromFinalPrice " + priceFinalOption.toString());
        return getTextFromElement(priceFinalOption);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement updateCartOption;

    public void clickOnUpdateCartOption() {
        CustomListeners.test.log(Status.PASS, "clickOnUpdateCartOption " + updateCartOption);
        Reporter.log("clickOnUpdateCartOption " + updateCartOption.toString());
        clickOnElement(updateCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsOption;

    public void clickOnTermsOfServiceOption() {
        CustomListeners.test.log(Status.PASS, "clickOnTermsOfServiceOption " + termsOption);
        Reporter.log("clickOnTermsOfServiceOption " + termsOption.toString());
        clickOnElement(termsOption);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkOutOption;

    public void clickCheckOutOption() {
        CustomListeners.test.log(Status.PASS, "clickCheckOutOption " + checkOutOption);
        Reporter.log("clickCheckOutOption " + checkOutOption.toString());
        clickOnElement(checkOutOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCarWelcomeText;

    public String getTextWelcomePleaseSignInOption() {
        CustomListeners.test.log(Status.PASS, "getTextWelcomePleaseSignInOption " + shoppingCarWelcomeText);
        Reporter.log("getTextWelcomePleaseSignInOption " + shoppingCarWelcomeText.toString());
        return getTextFromElement(shoppingCarWelcomeText);
    }
}