package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    public String getWelcomeText() {
        CustomListeners.test.log(Status.PASS, "getWelcomeText " + welcomeText);
        Reporter.log("getWelcomeText " + welcomeText.toString());
        return getTextFromElement(welcomeText);

    }
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    public void enterEmailId(String email) {
        CustomListeners.test.log(Status.PASS, "enterEmailId " + emailField);
        Reporter.log("enterEmailId " + emailField.toString());
        sendTextToElement(emailField, email);
    }
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;
    public void enterPassword(String password) {
        CustomListeners.test.log(Status.PASS, "enterPassword " + passwordField);
        Reporter.log("enterPassword " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginButton;
    public void clickOnLoginButton() {
        CustomListeners.test.log(Status.PASS, "clickOnLoginButton " + loginButton);
        Reporter.log("clickOnLoginButton " + loginButton.toString());
        clickOnElement(loginButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;
    public String getErrorMessage() {
        CustomListeners.test.log(Status.PASS, "getErrorMessage " + errorMessage);
        Reporter.log("getErrorMessage " + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
}
