package com.facebooktest;

import com.facebook.pages.HomePage;
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
    public void validateUserBeingAbleToLogInWithInValidCredentials(){

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogInWithValidEmailAndInvalidPassword(){

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogInWithValidCredentials(){

    }

}
