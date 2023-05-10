package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ElectronicsPage extends Utility {

    @CacheLookup
            @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
    WebElement cellPhoneOption;

    public void clickCellPhones(){
        CustomListeners.test.log(Status.PASS, "clickCellPhones " + cellPhoneOption);
        Reporter.log("clickCellPhones " + cellPhoneOption.toString());
        clickOnElement(cellPhoneOption);
    }
}
