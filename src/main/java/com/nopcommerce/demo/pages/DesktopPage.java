package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name: Z to A')]")
    WebElement dropDownOptionZtoA;

    public void selectDropdownOptionZtoA() {
        CustomListeners.test.log(Status.PASS, "selectDropdownOptionZtoA " + dropDownOptionZtoA);
        Reporter.log("selectDropdownOptionZtoA " + dropDownOptionZtoA.toString());
        clickOnElement(dropDownOptionZtoA);
    }

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Name: A to Z')]")
    WebElement dropDownOptionAtoZ;

    public void selectDropdownOptionAtoZ() {
        CustomListeners.test.log(Status.PASS, "selectDropdownOptionAtoZ " + dropDownOptionAtoZ);
        Reporter.log("selectDropdownOptionAtoZ " + dropDownOptionAtoZ.toString());
        clickOnElement(dropDownOptionAtoZ);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-name']/a")
    WebElement listOfProducts;

    public void verifyProductsAreInTheRightOrder() {
        List<WebElement> productNames = driver.findElements(By.xpath("//h2[@class='product-name']/a"));
        List<String> productNameStrings = new ArrayList<String>();
        for (WebElement productName : productNames) {
            productNameStrings.add(productName.getText());
        }
        List<String> sortedProductNames = new ArrayList<String>(productNameStrings);
        Collections.sort(sortedProductNames, Collections.reverseOrder());
    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2] +" +
            "/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")
    WebElement addToCartButton;

    public void clickAddToCartButton() {
        CustomListeners.test.log(Status.PASS, "clickAddToCartButton " + addToCartButton);
        Reporter.log("clickAddToCartButton " + addToCartButton.toString());
        clickOnElement(addToCartButton);
    }
}
