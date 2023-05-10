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
import java.util.List;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//ul[@class = 'top-menu notmobile']")
    WebElement topMenu;

    public String findAllTabsInTopMenu() {
        List<WebElement> searchResults = driver.findElements((By.xpath("//ul[@class = 'top-menu notmobile']")));
        ArrayList<String> searchResult = new ArrayList<>();
        for (WebElement e : searchResults) {//e object of webElement
            searchResult.add(e.getText());
        }
        for (String result : searchResult) {
            System.out.println(result);
            return result;
        }
        return null;
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerTab;
    public void clickComputerTab() {
        CustomListeners.test.log(Status.PASS, "clickComputerTab " + computerTab);
        Reporter.log("clickComputerTab " + computerTab.toString());
        clickOnElement(computerTab);
    }

    @CacheLookup
    @FindBy(linkText ="Register" )
    WebElement registerLink;
    public void clickOnRegisterLink() {
        CustomListeners.test.log(Status.PASS, "clickOnRegisterLink " + registerLink);
        Reporter.log("clickOnRegisterLink " + registerLink.toString());
        clickOnElement(registerLink);
    }

    @CacheLookup
    @FindBy(xpath = "//body[1]/div[6]/div[2]/ul[1]/li[2]")
    WebElement electronicsTab;
    public void clickElectronicsTab() {
        CustomListeners.test.log(Status.PASS, "clickElectronicsTab " + electronicsTab);
        Reporter.log("clickElectronicsTab " + electronicsTab.toString());
        clickOnElement(electronicsTab);
    }
}
