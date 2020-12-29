package com.cigna.pages;

import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "loginbutton")
    private WebElement logInBtn;

    public void enterUserName() {
        usernameField.sendKeys("tester1");
        ExtentTestManager.log("username entered");
    }

    public void enterPassword() {
        passwordField.sendKeys("abcd1234");
        ExtentTestManager.log("password entered");
    }

    public void logIn() {
        logInBtn.click();
    }


}
