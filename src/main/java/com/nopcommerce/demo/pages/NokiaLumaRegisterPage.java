package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumaRegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement registerText;

    public String verifyRegisterText() {
        CustomListeners.test.log(Status.PASS, "Verify Register Text ");
        Reporter.log("Verify Register Text " + registerText.toString());
        return getTextFromElement(registerText);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-male']")
    WebElement clickGenderButton;

    public void clickOnAppropriateGenderButton() {
        CustomListeners.test.log(Status.PASS, "Click on Appropriate Gender Button " );
        Reporter.log("Click on Appropriate Gender Button " + clickGenderButton.toString());
        clickOnElement(clickGenderButton);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstNameOption;

    public void firstNameOption(String firstName) {
        CustomListeners.test.log(Status.PASS, "First Name Option ");
        Reporter.log("First Name Option " + firstNameOption.toString());
        sendTextToElement(firstNameOption, firstName);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastNameOption;

    public void lastNameOption(String lastName) {
        CustomListeners.test.log(Status.PASS, "Last Name Option ");
        Reporter.log("Last Name option " + lastNameOption.toString());
        sendTextToElement(lastNameOption, lastName);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement dateOption;

    public void dateOfBirth(String date) {
        CustomListeners.test.log(Status.PASS, "Date Of Birth ");
        Reporter.log("Date Of Birth " + dateOption.toString());
        selectByVisibleTextFromDropDown(dateOption, date);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement monthOption;

    public void dateOfBirthMonth(String month) {
        CustomListeners.test.log(Status.PASS, "Date Of Birth Month");
        Reporter.log("Date Of Birth Month " + monthOption.toString());
        selectByVisibleTextFromDropDown(monthOption, month);
    }

    @CacheLookup
    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement yearOption;

    public void dateOfBirthYear(String year) {
        CustomListeners.test.log(Status.PASS, "Date Of Birth Year ");
        Reporter.log("Date Of Birth Year " + yearOption.toString());
        selectByVisibleTextFromDropDown(yearOption, year);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement emailOption;

    public void enterEmailOption(String email) {
        CustomListeners.test.log(Status.PASS, "Enter Email Option " );
        Reporter.log("Enter Email Option " + emailOption.toString());
        sendTextToElement(emailOption, email);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement passwordOption;

    public void enterPasswordOption(String password) {
        CustomListeners.test.log(Status.PASS, "Enter Password Option ");
        Reporter.log("Enter Password Option " + passwordOption.toString());
        sendTextToElement(passwordOption, password);
    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement confirmPasswordOption;

    public void confirmPasswordOption(String password) {
        CustomListeners.test.log(Status.PASS, "Confirm Password Option ");
        Reporter.log("Confirm Password Option " + confirmPasswordOption.toString());
        sendTextToElement(confirmPasswordOption, password);
    }

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickRegisterButton;

    public void clickOnRegisterTabButton() {
        CustomListeners.test.log(Status.PASS, "Click Register Tab Button " );
        Reporter.log("Click On register Tab Button " + clickRegisterButton.toString());
        clickOnElement(clickRegisterButton);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompletedText;

    public String verifyYourRegistrationCompletedText() {
        CustomListeners.test.log(Status.PASS, "Verify Your Registration Completed Text " );
        Reporter.log("Verify Your Registration Completed Text  " + registrationCompletedText.toString());
        return getTextFromElement(registrationCompletedText);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickOnContinueButton;

    public void clickOnContinueButton() {
        CustomListeners.test.log(Status.PASS, "Click On Continue Button ");
        Reporter.log("Click On Continue Button " + clickOnContinueButton.toString());
        clickOnElement(clickOnContinueButton);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    public String verifyShoppingCartText() {
        CustomListeners.test.log(Status.PASS, "Verify Shopping Cart Text" );
        Reporter.log("Verify Shopping Cart Text " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    @CacheLookup
    @FindBy(id = "termsofservice")
    WebElement clickOnTermsAndServiceBox;

    public void clickOnTermsAndServiceBox() {
        CustomListeners.test.log(Status.PASS, "Terms Of Service " );
        Reporter.log("Terms Of Service " + clickOnTermsAndServiceBox.toString());
        clickOnElement(clickOnTermsAndServiceBox);
    }

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement clickOnCheckOutTab;

    public void clickOnCheckOutTab() {
        CustomListeners.test.log(Status.PASS, "Click On Check Out Tab ");
        Reporter.log("Click On Check Out Tab " + clickOnCheckOutTab.toString());
        clickOnElement(clickOnCheckOutTab);
    }


}
