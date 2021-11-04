package com.theCEShop.pages;

import com.theCEShop.utilities.BrowserUtils;
import com.theCEShop.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CorporatePage {
    public CorporatePage(){ PageFactory.initElements(Driver.getDriver(),this);}
    //Elements:
    @FindBy(xpath = "//a[@class='real-estate industry']")
    protected static WebElement realEstateIndustry;
    @FindBy(xpath = "//a[@class='mortgage industry']")
    protected static WebElement mortgageIndustry;
    @FindBy(xpath = "//i[@class='fas fa-sign-in-alt']")
    protected static WebElement topLogin;
    //Navigation Strings
    protected static final  String CORPORATE_PAGE_URL = "https://ces-cms2-uat.theceshop.com/";
    //Reusable methods
    public void navigateTo (String navigationUrl){
        Driver.getDriver().get(navigationUrl);
    }
    public void clickByElement (WebElement elementToClick){
        BrowserUtils.waitForVisibility(elementToClick,5);
        elementToClick.click();
    }

}
