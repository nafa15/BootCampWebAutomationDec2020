package com.cnntest;

import com.cnn.pages.HomePage;
import com.cnn.pages.SignInPage;
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
    public void validateUserBeingAbleToLogInWithInValidCredentials() {
        homePage.validateAccountPage();
        signInPage.typeInvalidEmailAddress();
        signInPage.typeInvalidPassword();

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogInWithValidEmailAndInvalidPassword() {
        homePage.validateAccountPage();
        signInPage.typeValidEmailAddress();
        signInPage.typeInvalidPassword();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogInWithValidCredentials() {
        homePage.validateAccountPage();
        signInPage.typeValidEmailAddress();
        signInPage.typeValidPassword();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogOut() {
        homePage.validateAccountPage();
        signInPage.typeValidEmailAddress();
        signInPage.typeValidPassword();
        signInPage.logOut();

    }
}
