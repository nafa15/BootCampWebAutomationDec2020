package com.amazontest;

import com.amazon.pages.HomePage;
import com.peoplentech.bcampdec2020.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

@Test(enabled = false)
    public void validateUserBeingAbleToNavigateForAProduct(){
        homePage.clickOnMenuBtn();
        homePage.scrollTheFullMenu();
        homePage.clickOnComputersBtn();
        homePage.clickOnPCsBtn();
    }

@Test(enabled = false)
    public void validateUserBeingAbleToSearchForAnItem(){
        homePage.clickOnSearchbar();
        homePage.typeOnSearchBar();
        homePage.clickOnSearchBtn();

    }

@Test(enabled = false)
    public void validateUserBeingAbleToCheckout(){
        homePage.clickOnSearchbar();
        homePage.typeOnSearchBar();
        homePage.clickOnSearchBtn();
        homePage.chooseAMacbook();
        homePage.addToCart();
        homePage.noCoverage();
        homePage.continueToCheckout();
    }
@Test(enabled = false)
    public void validateUserBeingAbleToVerifySuggestions(){
        homePage.validateAutoSuggestion();
    }

@Test(enabled = false)
    public void validateUserBeingAbleToSell(){
        homePage.clickOnSellBtn();
        homePage.continueToSignUp();
    }

@Test(enabled = false)
    public void validateUserIsAbleToHoverOverTryPrimeLogoAndClickTryPrime() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnTryPrime();
        homePage.validateURLForPrime();
    }

@Test(enabled = false)
    public void validateUserIsAbleToScrollDownToElementAndScrollBackUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.scrollToElement();
    }

}
