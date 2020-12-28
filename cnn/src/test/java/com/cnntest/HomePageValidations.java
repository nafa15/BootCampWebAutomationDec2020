package com.cnntest;

import com.cnn.pages.HomePage;
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
    public void validateUserBeingAbleToTypeOnSearchBar() {
        homePage.clickOnMenuBtn();
        homePage.typeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToScrollDownTheMenu() {
        homePage.clickOnMenuBtn();
        homePage.clickOnTechBtn();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToClickOnLiveTv() {
        homePage.goToLiveTv();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToGetTheSpanishEdition() {
        homePage.clickOnEditionBtn();
        homePage.chooseEspagnol();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToReadAnArticle() {
        homePage.clickOnAnArticle();
    }

}
