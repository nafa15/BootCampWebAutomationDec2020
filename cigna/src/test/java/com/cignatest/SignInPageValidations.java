package com.cignatest;

import com.cigna.pages.HomePage;
import com.cigna.pages.SignInPage;
import com.peoplentech.bcampdec2020.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageValidations extends TestBase {

    private HomePage homePage;
    private SignInPage signInPage;

    @BeforeMethod
    public void pageFactorySetup(){

        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }

@Test(enabled = false)
    public void validateUserBeingAbleToGoToLogInPage(){
        homePage.clickOnLogInPageBtn();
    }

@Test(enabled = false)
    public void validateUserBeingAbleToInputHisCredentials(){
        signInPage.enterUserName();
        signInPage.enterPassword();
        signInPage.logIn();
    }
}
