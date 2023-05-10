package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumaBillingPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameOption;

    public void firstNameOption(String firstName) {
        CustomListeners.test.log(Status.PASS, "firstNameOption " + firstNameOption);
        Reporter.log("firstNameOption " + firstNameOption.toString());
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        CustomListeners.test.log(Status.PASS, "lastNameOption " + lastNameOption);
        Reporter.log("lastNameOption " + lastNameOption.toString());
        sendTextToElement(lastNameOption, lastName);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countryByDropDownOption;

    public void selectUKFromDropdownOption(String country) {
        CustomListeners.test.log(Status.PASS, "selectUKFromDropdownOption " + countryByDropDownOption);
        Reporter.log("selectUKFromDropdownOption " + countryByDropDownOption.toString());
        selectByVisibleTextFromDropDown(countryByDropDownOption, country);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement provinceOption;

    public void inputProvince(String Province) {
        CustomListeners.test.log(Status.PASS, "inputProvince " + provinceOption);
        Reporter.log("inputProvince " + provinceOption.toString());
        sendTextToElement(provinceOption, Province);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement provinceFromDropDownOption;

    public void selectOtherProvinceFromDropdownOption(String province) {
        CustomListeners.test.log(Status.PASS, "selectOtherProvinceFromDropdownOption " + provinceFromDropDownOption);
        Reporter.log("selectOtherProvinceFromDropdownOption " + provinceFromDropDownOption.toString());
        selectByVisibleTextFromDropDown(provinceFromDropDownOption, province);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityOption;

    public void enterCity(String city) {
        CustomListeners.test.log(Status.PASS, "enterCity " + cityOption);
        Reporter.log("enterCity " + cityOption.toString());
        sendTextToElement(cityOption, city);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressFirstLineOption;

    public void enterFirstLineOfAddressCity(String address) {
        CustomListeners.test.log(Status.PASS, "enterFirstLineOfAddressCity " + addressFirstLineOption);
        Reporter.log("enterFirstLineOfAddressCity " + addressFirstLineOption.toString());
        sendTextToElement(addressFirstLineOption, address);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipPostalCodeeOption;

    public void enterZipPostalCode(String zipcode) {
        CustomListeners.test.log(Status.PASS, "enterZipPostalCode " + zipPostalCodeeOption);
        Reporter.log("enterZipPostalCode " + zipPostalCodeeOption.toString());
        sendTextToElement(zipPostalCodeeOption, zipcode);
    }

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumber;

    public void enterPhoneNumber(String phoneNumber) {
        CustomListeners.test.log(Status.PASS, "enterPhoneNumber " + zipPostalCodeeOption);
        Reporter.log("enterPhoneNumber " + zipPostalCodeeOption.toString());
        sendTextToElement(zipPostalCodeeOption, phoneNumber);
    }

    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Continue']")
    WebElement continueTab;

    public void clickOnContinueTab() {
        CustomListeners.test.log(Status.PASS, "clickOnContinueTab " + continueTab);
        Reporter.log("clickOnContinueTab " + continueTab.toString());
        clickOnElement(continueTab);
    }

    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement secondDayAirRadioButtonTab;

    public void clickOnRadioButtonSecondDayAir() {
        CustomListeners.test.log(Status.PASS, "clickOnRadioButtonSecondDayAir " + secondDayAirRadioButtonTab);
        Reporter.log("clickOnRadioButtonSecondDayAir " + secondDayAirRadioButtonTab.toString());
        clickOnElement(secondDayAirRadioButtonTab);
    }

    @CacheLookup
    @FindBy(xpath = "///div[@id='shipping-method-buttons-container']/button")
    WebElement continueButtonTab;

    public void clickOnContinueButtonTab() {
        CustomListeners.test.log(Status.PASS, "clickOnContinueButtonTab " + continueButtonTab);
        Reporter.log("clickOnContinueButtonTab " + continueButtonTab.toString());
        clickOnElement(continueButtonTab);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement creditCardRadioButton;

    public void clickOnCreditCardRadioButton() {
        CustomListeners.test.log(Status.PASS, "clickOnCreditCardRadioButton " + creditCardRadioButton);
        Reporter.log("clickOnCreditCardRadioButton " + creditCardRadioButton.toString());
        clickOnElement(creditCardRadioButton);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-step-payment-method']/div/button")
    WebElement paymentMethodRadioButton;

    public void clickOnCheckOutStepPaymentMethodRadioButton() {
        CustomListeners.test.log(Status.PASS, "clickOnCheckOutStepPaymentMethodRadioButton " + paymentMethodRadioButton);
        Reporter.log("clickOnCheckOutStepPaymentMethodRadioButton " + paymentMethodRadioButton.toString());
        clickOnElement(paymentMethodRadioButton);
    }

    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectPaymentCardOptionMasterOrVisa;

    public void selectMasterOrVisaCardForPayment(String card) {
        CustomListeners.test.log(Status.PASS, "selectMasterOrVisaCardForPayment " + selectPaymentCardOptionMasterOrVisa);
        Reporter.log("selectMasterOrVisaCardForPayment " + selectPaymentCardOptionMasterOrVisa.toString());
        selectByVisibleTextFromDropDown(selectPaymentCardOptionMasterOrVisa, card);
    }

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderName;

    public void cardHolderNameAsOnCard(String name) {
        CustomListeners.test.log(Status.PASS, "cardHolderNameAsOnCard " + cardHolderName);
        Reporter.log("cardHolderNameAsOnCard " + cardHolderName.toString());
        sendTextToElement(cardHolderName, name);
    }

    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumber;

    public void cardNumberAsOnCard(String number) {
        CustomListeners.test.log(Status.PASS, "cardNumberAsOnCard " + cardNumber);
        Reporter.log("cardNumberAsOnCard " + cardNumber.toString());
        sendTextToElement(cardNumber, number);
    }

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement monthOption;

    public void enterMonthOption(String month) {
        CustomListeners.test.log(Status.PASS, "enterMonthOption " + monthOption);
        Reporter.log("enterMonthOption " + monthOption.toString());
        selectByVisibleTextFromDropDown(monthOption, month);
    }

    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement yearOption;

    public void enterYearOption(String year) {
        CustomListeners.test.log(Status.PASS, "enterYearOption " + yearOption);
        Reporter.log("enterYearOption " + yearOption.toString());
        selectByVisibleTextFromDropDown(yearOption, year);
    }

    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeOption;

    public void enterCardCodeFromBackOfTheCard(String code) {
        CustomListeners.test.log(Status.PASS, "enterCardCodeFromBackOfTheCard " + cardCodeOption);
        Reporter.log("enterCardCodeFromBackOfTheCard " + cardCodeOption.toString());
        selectByVisibleTextFromDropDown(cardCodeOption, code);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement continueCheckOutTab;

    public void clickOnContinueCheckOutTab() {
        CustomListeners.test.log(Status.PASS, "clickOnContinueCheckOutTab " + continueCheckOutTab);
        Reporter.log("clickOnContinueCheckOutTab " + continueCheckOutTab.toString());
        clickOnElement(continueCheckOutTab);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']/span[2]")
    WebElement paymentMethodCreditCardOption;

    public String verifyPaymentMethodByCreditCardText() {
        CustomListeners.test.log(Status.PASS, "verifyPaymentMethodByCreditCardText " + paymentMethodCreditCardOption);
        Reporter.log("verifyPaymentMethodByCreditCardText " + paymentMethodCreditCardOption.toString());
        return getTextFromElement(paymentMethodCreditCardOption);
    }

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']/span[2]")
    WebElement shippingSecondDayAirMethodText;

    public String getShippingSecondDayAirMethodText() {
        CustomListeners.test.log(Status.PASS, "getShippingSecondDayAirMethodText " + shippingSecondDayAirMethodText);
        Reporter.log("getShippingSecondDayAirMethodText " + shippingSecondDayAirMethodText.toString());
        return getTextFromElement(shippingSecondDayAirMethodText);
    }

    @CacheLookup
    @FindBy(xpath = "//td[@class='subtotal']/span")
    WebElement totalPriceText;

    public String getTotalPriceText() {
        CustomListeners.test.log(Status.PASS, "getTotalPriceText " + totalPriceText);
        Reporter.log("getTotalPriceText " + totalPriceText.toString());
        return getTextFromElement(totalPriceText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[text()='Confirm']")
    WebElement confirmButton;

    public void clickOnConfirmButton() {
        CustomListeners.test.log(Status.PASS, "clickOnConfirmButton " + confirmButton);
        Reporter.log("clickOnConfirmButton " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Thank you')]")
    WebElement thankYouText;

    public String getThankYouText() {
        CustomListeners.test.log(Status.PASS, "getThankYouText " + thankYouText);
        Reporter.log("getThankYouText " + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    @CacheLookup
    @FindBy(xpath = "//strong[contains(text(),'Your order has been successfully processed!')]")
    WebElement successfulOrderText;

    public String getSuccessfulOrderText() {
        CustomListeners.test.log(Status.PASS, "getSuccessfulOrderText " + successfulOrderText);
        Reporter.log("getSuccessfulOrderText " + successfulOrderText.toString());
        return getTextFromElement(successfulOrderText);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement lastContinueButton;

    public void clickOnTheLastContinueButton() {
        CustomListeners.test.log(Status.PASS, "clickOnTheLastContinueButton " + lastContinueButton);
        Reporter.log("clickOnTheLastContinueButton " + lastContinueButton.toString());
        clickOnElement(lastContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Welcome to our store')]")
    WebElement welcomeText;

    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS, "getWelcomeText " + welcomeText);
        Reporter.log("getWelcomeText " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutButton;

    public void clickOnLogoutTabButton() {
        CustomListeners.test.log(Status.PASS, "clickOnLogoutTabButton " + logOutButton);
        Reporter.log("clickOnLogoutTabButton " + logOutButton.toString());
        clickOnElement(logOutButton);
    }

    @CacheLookup
    @FindBy(xpath = "https://demo.nopcommerce.com/")
    WebElement confirmUrlText;

    public String getCurrentUrl() {
        CustomListeners.test.log(Status.PASS, "getCurrentUrl ");
        Reporter.log("getCurrentUrl ");
        return getCurrentUrl();
    }


}
