package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellphonePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement cellPhoneText;

    public String getCellPhoneText() {
        CustomListeners.test.log(Status.PASS,"Get Cell Phone Text");
        Reporter.log("Get Cell Phone Text " + cellPhoneText.toString());
        return getTextFromElement(cellPhoneText);
    }
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement listButton;
    public void clickOnTheListButton() {
        CustomListeners.test.log(Status.PASS,"Click On The List Button");
        Reporter.log("Click On The List Button " + listButton.toString());
        clickOnElement(listButton);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class='details']//a[contains(text(),'Nokia Lumia 1020')]")
    WebElement nokiaProduct;
    public void clickOnThePhoneOption() {
        CustomListeners.test.log(Status.PASS,"Click On The Phone Option");
        Reporter.log("CClick On The Phone Option " + nokiaProduct.toString());

        clickOnElement(nokiaProduct);
    }
}
