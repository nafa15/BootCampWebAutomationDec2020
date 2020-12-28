package com.citibanktest;

import com.citibank.pages.HomePage;
import com.peoplentech.bcampdec2020.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageValidations extends TestBase {

    private HomePage homePage;

    @BeforeMethod
    public void pageFactorySetup() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLookForACreditCard() {
        homePage.clickOnCreditCardBtn();
        homePage.viewAllTheCreditCards();
        homePage.chooseACard();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToOpenAnAccount() {
        homePage.clickOnOpenAnAccount();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToHoveOverInvestment() {
        homePage.hoverOverInvestments();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSearchForAProduct() {
        homePage.searchForAProduct();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToApplyForACreditCard() {
        homePage.applyForACard();
    }

    @Test(enabled = false)
    public void validateUserIsAbleToScrollDownToElementAndScrollBackUp() {
        homePage.scrollToElement();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogin() {
        homePage.inputCredentialsToLogin();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToContactTheBank() {
        homePage.contactTheBank();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToAccessSpecialOffers() {
        homePage.hoverOverSpecialOffersBtn();
        homePage.clickOnSpecialOffers();
        homePage.chooseAnOffer();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToConsultTheRates() {
        homePage.hoverOverBankingBtn();
        homePage.clickOnRatesBtn();
    }

}
