package com.facebooktest;

import com.facebook.pages.HomePage;
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
    public void validateUserBeingAbleToLogInWithInValidCredentials() {
        homePage.inputInvalidEmailAddress();
        homePage.inputInValidPassword();

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogInWithValidEmailAndInvalidPassword() {
        homePage.inputValidEmailAddress();
        homePage.inputInValidPassword();

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLogInWithValidCredentials() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();

        sleepFor(5);

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToConfirmARequest() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();
        sleepFor(5);
        homePage.confirmRequest();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSearchForAName() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();
        sleepFor(5);
        homePage.typeOnSearchBar();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToSendAFriendRequest() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();
        sleepFor(5);
        homePage.typeOnSearchBar();
        sleepFor(5);
        homePage.chooseAFriendFromAList();
        sleepFor(5);
        homePage.clickToAddAFriend();
        sleepFor(5);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLikeAPost() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();
        sleepFor(5);
        homePage.clickOnHomeBtn();
        homePage.clickOnLikeBtn();

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToWatchAVideoAndLikeIt() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();
        sleepFor(5);
        homePage.clickOnWatchBtn();
        sleepFor(10);
        homePage.likeAVideo();
        sleepFor(5);


    }

    @Test(enabled = false)
    public void validateUserBeingAbleToBuyInMarketPlace() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();
        sleepFor(5);
        homePage.clickOnHomeBtn();
        sleepFor(5);
        homePage.clickOnMarketplaceBtn();
        sleepFor(5);

    }

    @Test(enabled = false)
    public void validateUserBeingAbleToViewFriendsRequests() {
        homePage.inputValidEmailAddress();
        homePage.inputValidPassword();
        homePage.clickOnLoginBtn();
        sleepFor(5);
        homePage.clickOnFriendsBtn();
        sleepFor(5);
    }
}
