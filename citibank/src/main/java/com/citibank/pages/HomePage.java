package com.citibank.pages;

import com.peoplentech.bcampdec2020.base.TestBase;
import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//a[@id='creditcards']")
    private WebElement creditCardsBtn;

    @FindBy(xpath = "//a[@id='viewAllCards_Link']")
    private WebElement viewAllBtn;

    @FindBy(xpath = "(//button[@class='btn btn-primary'])[1]")
    private WebElement cardOneBtn;

    @FindBy(xpath = "//a[@id='citiGold_Link']")
    private WebElement openAnAccountBtn;

    @FindBy(xpath = "//input[@id='zipcode']")
    private WebElement zipcodeField;

    @FindBy(xpath = "//button[@id='e8a5ec10-da00-8288-ad64-346dc3fbc85f']")
    private WebElement submitBtn;

    @FindBy(xpath = "//a[@id='investing']")
    private WebElement investmentsBtn;

    @FindBy(xpath = "(//div[@id='personetics-citi-menu'])[1]")
    private WebElement helpBtn;

    @FindBy(xpath = "(//input[@id='citi-autocomplete-content-searchbox-livesearch']")
    private WebElement searchBar;

    @FindBy(xpath = "(//button[contains(text(),'Search')]")
    private WebElement searchBtn;

    @FindBy(xpath = "(//a[contains(text(),'Personal Lines & Loans - See all lines & loans fro')]")
    private WebElement productBtn;

    @FindBy(xpath = "(//body/main[@id='maincontent']/div[1]/div[5]/section[3]/div[1]/div[2]/p[1]/a[1]")
    private WebElement doubleCashCardBtn;

    @FindBy(xpath = "(//a[text()='Apply Now'])[2]")
    private WebElement applyNowBtn;

    @FindBy(xpath = "(//a[text()='Small Business Accounts'])[2]")
    private WebElement smallBusinessBtn;

    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "signInBtn")
    private WebElement signInBtn;

    @FindBy(xpath = "//body/footer[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[5]/ul[1]/li[1]/a[1]")
    private WebElement contactUsBtn;

    @FindBy(xpath = "//h2[contains(text(),'Connect by Mail')]")
    private WebElement contactByMailBtn;

    @FindBy(xpath = "//body/footer[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[7]/a[1]")
    private WebElement specialOffersBtn;

    @FindBy(xpath = "//tbody/tr[2]/td[1]/div[1]/div[3]/div[3]/div[1]/div[1]/div[1]/span[1]/a[1]/img[1]")
    private WebElement offer700Btn;

    @FindBy(xpath = "//a[@id='banking']")
    private WebElement bankingBtn;

    @FindBy(xpath = "//a[@id='ratesBanking_Link']")
    private WebElement ratesBtn;


    public void clickOnCreditCardBtn() {
        creditCardsBtn.click();
    }

    public void viewAllTheCreditCards() {
        viewAllBtn.click();
        ExtentTestManager.log("Cards displayed");
    }

    public void chooseACard() {
        cardOneBtn.click();
        ExtentTestManager.log("Card chosen");
    }

    public void clickOnOpenAnAccount() {
        openAnAccountBtn.click();
        ExtentTestManager.log("Open an account page is displayed");
        zipcodeField.sendKeys("85603");
        submitBtn.click();
    }

    public void hoverOverInvestments() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(investmentsBtn).build().perform();
        ExtentTestManager.log("Hover over the investments button");
    }

    public void searchForAProduct() {
        helpBtn.click();
        ExtentTestManager.log("Clicked on help button");
        searchBar.sendKeys("Student loan");
        ExtentTestManager.log("Typed on search bar");
        searchBtn.click();
        ExtentTestManager.log("Search result displayed");
        productBtn.click();
    }

    public void applyForACard() {
        doubleCashCardBtn.click();
        ExtentTestManager.log("displayed the card details");
        applyNowBtn.click();
        ExtentTestManager.log("Clicked to apply for the card");
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", smallBusinessBtn);
        ExtentTestManager.log("The page scrolled down to small business account");

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        ExtentTestManager.log("Scrolled back to the top of the page");
    }

    public void inputCredentialsToLogin() {
        usernameField.sendKeys("testUser1");
        ExtentTestManager.log("Typed the username");
        passwordField.sendKeys("abcd1234");
        ExtentTestManager.log("Typed the password");
        signInBtn.click();
        ExtentTestManager.log("Clicked on sign in button");
    }

    public void contactTheBank() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(contactUsBtn).build().perform();
        ExtentTestManager.log("Hover over the Contact Us button");
        contactUsBtn.click();
        ExtentTestManager.log("Clicked on Contact Us button");
        contactByMailBtn.click();
    }

    public void hoverOverSpecialOffersBtn() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(specialOffersBtn).build().perform();
        ExtentTestManager.log("Hover over the Contact Us button");
    }

    public void clickOnSpecialOffers() {
        specialOffersBtn.click();
        ExtentTestManager.log("Clicked on special offers");
    }

    public void chooseAnOffer() {
        offer700Btn.click();
        ExtentTestManager.log("700$ Offer chosen");
    }

    public void hoverOverBankingBtn() {
        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(bankingBtn).build().perform();
        ExtentTestManager.log("Hover over the Banking button");
    }

    public void clickOnRatesBtn() {
        ratesBtn.click();
        ExtentTestManager.log("Rates page is displayed");
    }
}
