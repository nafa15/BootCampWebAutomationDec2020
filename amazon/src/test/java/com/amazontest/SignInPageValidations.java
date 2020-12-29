package com.amazontest;

import com.amazon.pages.HomePage;
import com.amazon.pages.SignInPage;
import com.peoplentech.bcampdec2020.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageValidations extends TestBase {

    private HomePage homePage;
    private SignInPage signInPage;

    @BeforeMethod
    public void pageFactorySetup() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        signInPage = PageFactory.initElements(driver, SignInPage.class);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToInputEmailAndPasswordToSignIn() {
        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.typeOnEmailFieldAndClickContinue();
        signInPage.typeOnPasswordFieldAndClickSignIn();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSignInUsingPhoneNumber() {
        homePage.validateSignInButton();
        signInPage.validateURLForSignIn();
        signInPage.typeOnPhoneNumberFieldAndClickContinue();
        signInPage.typeOnPasswordFieldAndClickSignIn();
    }


}
