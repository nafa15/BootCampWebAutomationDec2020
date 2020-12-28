package com.cignatest;

import com.cigna.pages.HomePage;
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
    public void validateUserIsAbleToTypeOnSearchBarAndClickSearchButton() {
        homePage.typeOnSearchBar();
    }

@Test(enabled = false)
    public void validateUserIsAbleToScrollDownToElementAndScrollBackUp() {
        homePage.scrollToElement();
    }

@Test(enabled = false)
    public void validateUserBeingAbleToHoverOverElement(){
        homePage.hoverOverElement();
    }

@Test(enabled = false)
    public void validateUserBeingAbleToGetAQuote(){
        homePage.clickOnIndividualsPlanBtn();
        homePage.clickToGetAQuote();
    }

@Test(enabled = false)
    public void validateUserBeingAbleToChooseAPlan(){
        homePage.clickOnIndividualsPlanBtn();
        homePage.clickToGetAQuote();
        homePage.continueToGetAQuote();

    }
}
