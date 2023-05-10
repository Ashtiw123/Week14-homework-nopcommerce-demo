package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumaPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaLumaText;

    public String verifyNokiaLuma1020Text() {
        CustomListeners.test.log(Status.PASS, "verifyNokiaLuma1020Text " + nokiaLumaText);
        Reporter.log("verifyNokiaLuma1020Text " + nokiaLumaText.toString());
        return getTextFromElement(nokiaLumaText);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaLumaPriceText;

    public String verifyNokiaLuma1020PriceText() {
        CustomListeners.test.log(Status.PASS, "verifyNokiaLuma1020PriceText " + nokiaLumaPriceText);
        Reporter.log("verifyNokiaLuma1020PriceText " + nokiaLumaPriceText.toString());
        return getTextFromElement(nokiaLumaPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement quantityOption;

    public void quantitySpaceOption() {
        CustomListeners.test.log(Status.PASS, "quantitySpaceOption " + quantityOption);
        Reporter.log("quantitySpaceOption " + quantityOption.toString());
        clickOnElement(quantityOption);
        sendTextToElement(quantityOption, Keys.CONTROL + "a"); // Select all existing text
        sendTextToElement(quantityOption, "2"); // Type in the new text
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartOption;

    public void clickOnAddToCartOption() {
        CustomListeners.test.log(Status.PASS, "clickOnAddToCartOption " + addToCartOption);
        Reporter.log("clickOnAddToCartOption " + addToCartOption.toString());
        clickOnElement(addToCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='bar-notification']/div/p")
    WebElement productAddedToShoppingCartText;

    public String verifyTheProductHasBeenAddedToYourShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "verifyTheProductHasBeenAddedToYourShoppingCartText " + productAddedToShoppingCartText);
        Reporter.log("verifyTheProductHasBeenAddedToYourShoppingCartText " + productAddedToShoppingCartText.toString());
        return getTextFromElement(productAddedToShoppingCartText);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement clickOnGreenBarXButtonOption;

    public void clickOnXOnGreenBarOption() {
        CustomListeners.test.log(Status.PASS, "clickOnXOnGreenBarOption " + clickOnGreenBarXButtonOption);
        Reporter.log("clickOnXOnGreenBarOption " + clickOnGreenBarXButtonOption.toString());
        clickOnElement(clickOnGreenBarXButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement shoppingCartButtonOption;

    public void mouseHoverOverShoppingCartOption() {
        CustomListeners.test.log(Status.PASS, "mouseHoverOverShoppingCartOption " + shoppingCartButtonOption);
        Reporter.log("mouseHoverOverShoppingCartOption " + shoppingCartButtonOption.toString());
        mouseHoverToElementAndClick(shoppingCartButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement goToCartOption;

    public void clickOnGoToCartOption() {
        CustomListeners.test.log(Status.PASS, "clickOnGoToCartOption " + goToCartOption);
        Reporter.log("clickOnGoToCartOption " + goToCartOption.toString());
        clickOnElement(goToCartOption);
    }
}