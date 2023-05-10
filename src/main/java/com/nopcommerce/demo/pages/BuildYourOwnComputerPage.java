package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement buildYourOwnComputerText;

    public String getTextFromBuildYourOwnComputerHeading() {
        CustomListeners.test.log(Status.PASS,"Get Text From Build Your Own Computer Heading");
        Reporter.log("Get Text From Build Your Own Computer Heading " + buildYourOwnComputerText.toString());
        return getTextFromElement(buildYourOwnComputerText);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorOption;

    public void selectProcessorOption() {
        CustomListeners.test.log(Status.PASS,"Select Processor Option");
        Reporter.log("Select Processor option " + processorOption.toString());
        selectByVisibleTextFromDropDown(processorOption, "2.2 GHz Intel Pentium Dual-Core E2200");
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramOption;

    public void selectRamOption() {
        CustomListeners.test.log(Status.PASS,"Select Ram Option");
        Reporter.log("Select Ram option " + ramOption.toString());
        selectByVisibleTextFromDropDown(ramOption, "8GB [+$60.00]");
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddOption;

    public void selectHddOption() {
        CustomListeners.test.log(Status.PASS,"Select Hdd Option");
        Reporter.log("Select Hdd option " + hddOption.toString());
        clickOnElement(hddOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement osOption;

    public void selectOsOption() {
        CustomListeners.test.log(Status.PASS,"Select OS Option");
        Reporter.log("Select OS option " + osOption.toString());
        clickOnElement(osOption);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareOption;

    public void selectSoftWareOption() {
        CustomListeners.test.log(Status.PASS,"Select Software Option");
        Reporter.log("Select Software option " + softwareOption.toString());
        clickOnElement(softwareOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement priceText;

    public String getTextFromPriceHeading() {
        CustomListeners.test.log(Status.PASS,"Get Text From Price Heading");
        Reporter.log("Get Text From Price Heading " + priceText.toString());
        return getTextFromElement(priceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addTooCartOption;

    public void addToCartOption() {
        CustomListeners.test.log(Status.PASS,"Add to Cart Option");
        Reporter.log("Add to Cart Option " + addTooCartOption.toString());
        clickOnElement(addTooCartOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
    WebElement productAddedToText;

    public String getTheProductHasBeenAddedToCart() {
        CustomListeners.test.log(Status.PASS,"Get The Product Has Been Added To Cart");
        Reporter.log("Get The Product Has Been Added To Cart " + productAddedToText.toString());
        return getTextFromElement(productAddedToText);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement crossButtonOption;

    //After that close the bar clicking on the cross button.
    public void crossButtonOption() {

        CustomListeners.test.log(Status.PASS,"Cross Button Option");
        Reporter.log("Cross Button Option " + crossButtonOption.toString());
        clickOnElement(crossButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartButtonOption;

    public void mouseHoverOverShoppingCartOption() {
        CustomListeners.test.log(Status.PASS,"Mouse Hover Over Shopping Cart Option");
        Reporter.log("Mouse Hover Over Shopping Cart Option " + shoppingCartButtonOption.toString());
        mouseHoverToElement(shoppingCartButtonOption);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement goToCartOption;

    public void clickOnGoToCartShoppingCartOption() {
        CustomListeners.test.log(Status.PASS,"Click On Got TO Shopping Cart Option");
        Reporter.log("Click On Got TO Shopping Cart Option " + goToCartOption.toString());
        clickOnElement(goToCartOption);
    }
}