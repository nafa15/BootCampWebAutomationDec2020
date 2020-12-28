package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.SignUpPage;
import com.peoplentech.bcampdec2020.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpPageValidations extends TestBase {

    private HomePage homePage;
    private SignUpPage signUpPage;

    @BeforeMethod
    public void pageFactorySetup(){
        homePage = PageFactory.initElements(driver, HomePage.class);
        signUpPage = PageFactory.initElements(driver, SignUpPage.class);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSignUp(){
        homePage.validateSignUpBtn();
        signUpPage.addName();
        signUpPage.addEmail();
        signUpPage.addPassword();
        signUpPage.checkPassword();
        signUpPage.clickOnContinueBtn();
    }

}
