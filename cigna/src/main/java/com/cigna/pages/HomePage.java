package com.cigna.pages;

import com.peoplentech.bcampdec2020.base.TestBase;
import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePage {

    @FindBy(xpath = "//a[@id='individuals-families-level-one-link']")
    private WebElement individualPlansBtn;

    @FindBy(xpath = "(//a[text()='Health Insurance for Individuals and Families'])[1]")
    private WebElement individualPlansContinue;

    @FindBy(linkText = "Get a Free Quote Online")
    private WebElement quoteBtn;

    @FindBy(id = "zip_code")
    private WebElement zipCodeFieldField;

    @FindBy(xpath = "(//button[@type='submit']")
    private WebElement seePlansAndPricesBtn;

    @FindBy(name = "household.applicants[0].age")
    private WebElement ageField;

    @FindBy(xpath = "//button[@type='button'])[3]")
    private WebElement maleBtn;

    @FindBy(linkText = "Log in to myCigna")
    private WebElement logInBtn;

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-primary'])[1]")
    private WebElement findADoctorBtn;

    @FindBy(id = "search-desktop")
    private WebElement searchBar;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement searchBtn;

    @FindBy(xpath = "(//a[text()='Health and Wellness'])[2]")
    private WebElement healthElement;

    public void hoverOverElement() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        Actions actions = new Actions(TestBase.driver);
        actions.moveToElement(individualPlansBtn).build().perform();
        ExtentTestManager.log("Hover mouse over individuals and family plans");
    }

    public void clickOnIndividualsPlanBtn() {
        individualPlansBtn.click();
        individualPlansContinue.click();
    }

    public void clickToGetAQuote() {
        quoteBtn.click();
    }

    public void continueToGetAQuote() {
        zipCodeFieldField.click();
        zipCodeFieldField.sendKeys("86503");
        seePlansAndPricesBtn.click();
        ageField.sendKeys("28");
        maleBtn.click();
    }

    public void clickOnLogInPageBtn() {
        logInBtn.click();
        ExtentTestManager.log("Login page is displayed");

    }

    public void clickOnFindADoctorBtn() {
        findADoctorBtn.click();
        ExtentTestManager.log("Find a doctor page is displayed");
    }

    public void typeOnSearchBar() {
        searchBar.sendKeys("dentist");
        ExtentTestManager.log("typed on search bar");
        searchBtn.click();
        ExtentTestManager.log("clicked on search button");
    }

    public void scrollToElement() {
        JavascriptExecutor js = (JavascriptExecutor) TestBase.driver;

        js.executeScript("arguments[0].scrollIntoView(true);", healthElement);
        ExtentTestManager.log("The page scrolled down to Health and Wellness");

        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        ExtentTestManager.log("Scrolled back to the top of the page");
    }
}
