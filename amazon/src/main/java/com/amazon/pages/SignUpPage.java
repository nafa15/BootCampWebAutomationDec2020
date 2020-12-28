package com.amazon.pages;

import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpPage {

    @FindBy(id = "ap_customer_name")
    private WebElement customerNameField;

    @FindBy(id = "ap_email")
    private WebElement emailField;

    @FindBy(id = "ap_password")
    private WebElement passwordField;

    @FindBy(id = "ap_password_check")
    private WebElement passwordCheckField;

    @FindBy(id = "continue")
    private WebElement continueBtn;

    public void addName(){
        customerNameField.sendKeys("Tester");
        ExtentTestManager.log("Name entered");
    }

    public void addEmail(){
        emailField.sendKeys("Tester@yahoo.com");
        ExtentTestManager.log("Email entered");
    }

    public void addPassword(){
        passwordField.sendKeys("Tester1234");
    }

    public void checkPassword(){
        passwordCheckField.sendKeys("Tester1234");
        ExtentTestManager.log("Password checked");
    }

    public void clickOnContinueBtn(){
        continueBtn.click();
    }

}
