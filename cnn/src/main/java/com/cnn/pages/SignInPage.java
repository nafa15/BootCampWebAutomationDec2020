package com.cnn.pages;

import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(xpath = "//input[@aria-label='Email address']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@aria-label='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//div[@id='account-header-button-desktop']")
    private WebElement accountBtn;

    @FindBy(id = "userLogout-link")
    private WebElement logOutBtn;

    public void typeInvalidEmailAddress(){
        emailField.sendKeys("abcd1234@abcd.com");
        ExtentTestManager.log("Typed invalid email address");
    }

    public void typeInvalidPassword(){
        passwordField.sendKeys("abcd1234");
        ExtentTestManager.log("Typed invalid password");
    }

    public void typeValidEmailAddress(){
        emailField.sendKeys("automationtester1590@gmail.com");
        ExtentTestManager.log("Typed valid email address");
    }
    public void typeValidPassword(){
        passwordField.sendKeys("@Tester1234");
        ExtentTestManager.log("Typed valid password");
    }

    public void logOut(){
        accountBtn.click();
    }
}
