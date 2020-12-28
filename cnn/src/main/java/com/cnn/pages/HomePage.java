package com.cnn.pages;

import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(xpath = "//button[@data-test='searchButton']")
    private WebElement searchBtn;

    @FindBy(xpath = "//input[@id='header-search-bar']")
    private WebElement searchBar;

    @FindBy(xpath = "(//div[text()='Search'])[1]")
    private WebElement search;

    @FindBy(xpath = "//button[@id='menuButton']")
    private WebElement menuBtn;

    @FindBy(linkText = "Tech")
    private WebElement techBtn;

    @FindBy(xpath = "(//span[text()='Live TV'])[1]")
    private WebElement liveTVBtn;

    /* @FindBy(name = "Live TV")
    private WebElement liveTVBtn; */

    @FindBy(id = "edition-picker-toggle-desktop")
    private WebElement editionBtn;

    @FindBy(linkText = "Español")
    private WebElement espagnolBtn;

    @FindBy(xpath = "//strong[contains(text(),'The President signed the legislation after a lengt')]")
    private WebElement articleBtn;

    @FindBy(id = "//div[@id='panel_0']")
    private WebElement accountBtn;



    public void clickOnSearchBtn(){
        searchBtn.click();
    }

    public void typeOnSearchBar(){
        searchBar.sendKeys("covid 19 vaccines");
        ExtentTestManager.log("Typed on search bar");
        search.click();
    }

    public void clickOnMenuBtn(){
        menuBtn.click();
        ExtentTestManager.log("Scrolled down the menu");
    }

    public void clickOnTechBtn(){
        techBtn.click();
    }

    public void goToLiveTv(){
        liveTVBtn.click();
    }

    public void clickOnEditionBtn(){
        editionBtn.click();
    }

    public void chooseEspagnol(){
        espagnolBtn.click();
        ExtentTestManager.log("The spanish edition chosen");
    }

    public void clickOnAnArticle(){
        articleBtn.click();
        ExtentTestManager.log("Article opened");
    }

    public void validateAccountPage(){
        accountBtn.click();
        ExtentTestManager.log("sign in page is displayed");
    }
}