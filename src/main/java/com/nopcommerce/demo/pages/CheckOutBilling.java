package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutBilling extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")
    WebElement firstNameOption;

    public void firstNameOption(String firstName) {
        CustomListeners.test.log(Status.PASS,"First Name Option");
        Reporter.log("First Name Option " + firstNameOption.toString());
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        CustomListeners.test.log(Status.PASS,"Last name Option");
        Reporter.log("Last Name Option " + lastNameOption.toString());
        sendTextToElement(lastNameOption, lastName);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")
    WebElement emailField;

    public void enterEmailId(String email) {
        CustomListeners.test.log(Status.PASS,"Enter Email Id");
        Reporter.log("Enter Email Id " + emailField.toString());
        sendTextToElement(emailField, email);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement dropDownOption;

    public void selectUKFromDropdownOption(String country) {
        CustomListeners.test.log(Status.PASS,"Select UK From Drop Down Option");
        Reporter.log("Select UK From Drop Down Option" + dropDownOption.toString());
        selectByVisibleTextFromDropDown(dropDownOption, country);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")
    WebElement cityField;

    public void enterCity(String city) {
        CustomListeners.test.log(Status.PASS,"Enter City");
        Reporter.log("Enter City" + cityField.toString());
        sendTextToElement(cityField, city);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")
    WebElement addressField;

    public void enterAddressLine1(String address) {
        CustomListeners.test.log(Status.PASS,"Enter Address Line1");
        Reporter.log("Enter Address Line1" + addressField.toString());
        sendTextToElement(addressField, address);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")
    WebElement zipcodeField;

    public void enterZipcode(String zipcode) {
        CustomListeners.test.log(Status.PASS,"Enter ZipCode");
        Reporter.log("Enter ZipCode" + zipcodeField.toString());
        sendTextToElement(zipcodeField, zipcode);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']")
    WebElement phoneNumberField;

    public void enterPhoneNumber(String phoneNumber) {
        CustomListeners.test.log(Status.PASS,"Enter Phone Number");
        Reporter.log("Enter Phone Number" + phoneNumberField.toString());
        sendTextToElement(phoneNumberField, phoneNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]")
    WebElement continueButton;

    public void clickOnContinueButton() {
        CustomListeners.test.log(Status.PASS,"Click On Continue Button");
        Reporter.log("Click On Continue Button" + continueButton.toString());
        clickOnElement(continueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement shippingOption;

    public void clickOnTheShoppingOption() {
        CustomListeners.test.log(Status.PASS,"Click On The Shopping Option");
        Reporter.log("Click On The Shopping Option" + shippingOption.toString());
        clickOnElement(shippingOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]")
    WebElement continueButton2;

    public void clickOnSecondContinueButton() {
        CustomListeners.test.log(Status.PASS,"Click On Second Continue Button");
        Reporter.log("Click On Second Continue Button" + continueButton2.toString());
        clickOnElement(continueButton2);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement paymentOption;

    public void clickOnThePaymentOption() {
        CustomListeners.test.log(Status.PASS,"Click On Second Continue Button");
        Reporter.log("Click On Second Continue Button" + continueButton2.toString());
        clickOnElement(paymentOption);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]")
    WebElement continueButton3;

    public void clickOnThirdContinueButton() {
        CustomListeners.test.log(Status.PASS,"Click On Third Continue Button");
        Reporter.log("Click On Third Continue Button" + continueButton3.toString());
        clickOnElement(continueButton3);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement cardDropdownOption;

    public void selectMasterCardOptionFromDropdown(String cardType) {
        CustomListeners.test.log(Status.PASS,"Select master Card Option From Drop Down");
        Reporter.log("Select master Card Option From Drop Down" + cardDropdownOption.toString());
        selectByVisibleTextFromDropDown(cardDropdownOption, cardType);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")
    WebElement nameField;

    public void enterCardHolderName(String name) {
        CustomListeners.test.log(Status.PASS,"Enter Card holder Name");
        Reporter.log("Enter Card holder Name" + nameField.toString());
        sendTextToElement(nameField, name);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberField;

    public void enterCardNumber(String cardNumber) {
        CustomListeners.test.log(Status.PASS,"Enter Card Number");
        Reporter.log("Enter Card Number" + cardNumberField.toString());
        sendTextToElement(cardNumberField, cardNumber);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']")
    WebElement monthExpiryField;

    public void enterExpiryMonth(String month) {
        CustomListeners.test.log(Status.PASS,"Enter Expiry Month");
        Reporter.log("Enter Expiry Month" + monthExpiryField.toString());
        sendTextToElement(monthExpiryField, month);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement yearExpiryField;

    public void enterExpiryYear(String year) {
        CustomListeners.test.log(Status.PASS,"Enter Expiry Year");
        Reporter.log("Enter Expiry Year" + yearExpiryField.toString());
        sendTextToElement(yearExpiryField, year);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement securityCodeField;

    public void enterSecurityCode(String code) {
        CustomListeners.test.log(Status.PASS,"Enter Security Code");
        Reporter.log("Enter Security Code" + securityCodeField.toString());
        sendTextToElement(securityCodeField, code);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]")
    WebElement continueButton4;

    public void clickOnFourthContinueButton() {
        CustomListeners.test.log(Status.PASS,"Click on Fourth Continue Button");
        Reporter.log("Click on Fourth Continue Button" + continueButton4.toString());
        clickOnElement(continueButton4);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement paymentMethodText;

    public String getPaymentMethodText() {
        CustomListeners.test.log(Status.PASS,"Get Payment Method Text");
        Reporter.log("Get Payment Method Text" + paymentMethodText.toString());
        return getTextFromElement(paymentMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6] +" +
                   "/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]")
    WebElement shippingMethodText;

    public String getShippingMethodText() {
        CustomListeners.test.log(Status.PASS,"Get Shipping Method Text");
        Reporter.log("Get Shipping Method Text" + shippingMethodText.toString());
        return getTextFromElement(shippingMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "///body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6] +" +
            "/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/ +" +
            "table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]")
    WebElement totalPriceText;

    public String getTotalPriceText() {
        CustomListeners.test.log(Status.PASS,"Get Total Price Text");
        Reporter.log("Get Total Price Text" + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Confirm')]")
    WebElement confirmButton;

    public void clickOnConfirmButton() {
        CustomListeners.test.log(Status.PASS,"Click On Confirm Button");
        Reporter.log("Click On Confirm Button" + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;

    public String getThankYouText() {
        CustomListeners.test.log(Status.PASS,"Get Thank You Text");
        Reporter.log("Get thank You Text" + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulOrderText;

    public String getSuccessfulOrderText() {
        CustomListeners.test.log(Status.PASS,"Get Successful Order Text");
        Reporter.log("Get Successful Order Text" + successfulOrderText.toString());
        return getTextFromElement(successfulOrderText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement lastContinueButton;

    public void clickOnTheLastContinueButton() {
        CustomListeners.test.log(Status.PASS,"Click On the Last Continue Button");
        Reporter.log("Click On the Last Continue Button" + lastContinueButton.toString());
        clickOnElement(lastContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;

    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS,"Get Welcome Text");
        Reporter.log("Get Welcome Text" + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }
}