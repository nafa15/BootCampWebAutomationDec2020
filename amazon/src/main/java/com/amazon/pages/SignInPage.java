package com.amazon.pages;

import com.peoplentech.bcampdec2020.base.TestBase;
import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SignInPage {

    @FindBy(id = "Hello, Sign in")
    private WebElement signInBtn;

    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@id='signInSubmit']")
    private WebElement signInSubmitButton;

    @FindBy(linkText = "Create your Amazon account")
    private WebElement createAccountButton;

    public void validateURLForSignIn() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/ap/signin";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated " + actualURL);
    }

    public void typeOnEmailFieldAndClickContinue() {
        emailField.sendKeys("abcd123@email.com");
        continueButton.click();
        ExtentTestManager.log("Typed an Email And Clicked on continue");
    }

    public void typeOnPasswordFieldAndClickSignIn() {
        passwordField.sendKeys("password");
        signInSubmitButton.click();
        ExtentTestManager.log("Typed on the password field and clicked on Sign In");
    }

    public void typeOnPhoneNumberFieldAndClickContinue() {
        emailField.sendKeys("9099999999");
        continueButton.click();
        ExtentTestManager.log("Typed a phone number And Clicked on continue");
    }


}
