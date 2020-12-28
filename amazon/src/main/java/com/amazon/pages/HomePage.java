package com.amazon.pages;

import com.peoplentech.bcampdec2020.base.TestBase;
import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage {

    @FindBy(xpath = "//a[@id='nav-hamburger-menu']")
    private WebElement allProducts;

    @FindBy(xpath = "//div[@id='hmenu-content']/ul/li[21]/a/div")
    private WebElement seeAllBtn;

    @FindBy(xpath = "//div[@id='hmenu-content']/ul/ul/li[2]/a/div")
    private WebElement computersBtn;

    @FindBy(linkText = "Computers, Tablets, & PC Products")
    private WebElement pcBtn;


    public void clickOnMenuBtn() {
        allProducts.click();
        ExtentTestManager.log("Clicked menu button");
    }

    public void scrollTheFullMenu() {
        seeAllBtn.click();
        ExtentTestManager.log("Scrolled the menu");
    }

    public void clickOnComputersBtn() {
        computersBtn.click();
        ExtentTestManager.log("Clicked on computers");
    }

    public void clickOnPCsBtn() {
        pcBtn.click();
    }

//**********

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(xpath = "//input[@value='Go']")
    private WebElement searchBtn;

    @FindBy(linkText = "New Apple MacBook Pro (16-inch, 16GB RAM, 512GB Storage) - Space Gray")
    private WebElement macbookBtn;


    public void clickOnSearchbar() {
        searchBar.click();
    }

    public void typeOnSearchBar() {
        searchBar.sendKeys("macbook pro");
        ExtentTestManager.log("Typed on search bar");
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
        ExtentTestManager.log("Clicked search button");
    }

    public void chooseAMacbook() {
        macbookBtn.click();
    }

//*******

    @FindBy(id = "add-to-cart-button")
    private WebElement addToCartBtn;

    @FindBy(id = "(attachSiNoCoverage-announce")
    private WebElement noCoverageBtn;

    @FindBy(xpath = "(//input[@type='submit'])[3]")
    private WebElement continueToCheckoutBtn;


    public void addToCart() {
        addToCartBtn.click();
    }

    public void noCoverage() {
        noCoverageBtn.click();
    }

    public void continueToCheckout() {
        continueToCheckoutBtn.click();
    }

//**********

    @FindBy(id = "Hello, Sign in")
    private WebElement signInBtn;

    @FindBy(xpath = "//i[@aria-label='Amazon']")
    private WebElement signInHeading;

    public void validateSignInButton() {
        signInBtn.click();
        ExtentTestManager.log("Clicked on SignIn Button");
        Assert.assertTrue(signInHeading.isDisplayed());
        ExtentTestManager.log("Validated SignIn header is displayed");
    }

//*********

    @FindBy(xpath = "//div[@id='issDiv0']/span")
    private WebElement suggestedCorrectionBtn;

    public void validateAutoSuggestion() {
        searchBar.click();
        searchBar.sendKeys("macbok pro");
        suggestedCorrectionBtn.click();

        ExtentTestManager.log("Validated the correction is suggested");
        macbookBtn.click();
    }

//*********

    @FindBy(linkText = "Start here.")
    private WebElement newAccBtn;

    public void validateSignUpBtn() {
        newAccBtn.click();
        ExtentTestManager.log("Validated SignUp header is displayed");
    }

//************

    @FindBy(linkText = "Sell")
    private WebElement sellBtn;

    @FindBy(xpath = "//a[contains(text(),'Sign up')])[2]")
    private WebElement signUpBtn;

    public void clickOnSellBtn() {
        sellBtn.click();
    }

    public void continueToSignUp() {
        signUpBtn.click();
    }

//************

    @FindBy(xpath = "//a[@id='nav-link-prime']")
    private WebElement tryPrimeLogo;

    @FindBy(xpath = "//div[@class='prime-button-try']")
    private WebElement tryPrime;


    public void hoverOverTryPrimeLogo() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(tryPrimeLogo).build().perform();
    }

    public void clickOnTryPrime() {

        hoverOverTryPrimeLogo();
        ExtentTestManager.log("Hover over try prime logo");

        tryPrime.click();
        ExtentTestManager.log("Clicked On Try Prime");
    }

    public void validateURLForPrime() {
        String actualURL = TestBase.driver.getCurrentUrl();
        String expectedURL = "https://www.amazon.com/amazonprime";

        Assert.assertTrue(actualURL.contains(expectedURL));
        ExtentTestManager.log("URL has been validated: " + actualURL);
    }

//*********//

    @FindBy(linkText = "Sell apps on Amazon")
    private WebElement elementSellAppsOnAmazon;

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", elementSellAppsOnAmazon);
        ExtentTestManager.log("The page scrolled down to sell apps on Amazon");

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        ExtentTestManager.log("Scrolled back to the top of the page");
    }
}
