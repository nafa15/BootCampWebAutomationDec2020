package com.facebook.pages;

import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class HomePage {

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@id='pass']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@name='login']")
    private WebElement signInBtn;

    /*@FindBy(xpath = "//a[@aria-label='Friends']")
    private WebElement friendsBtn;*/

    //@FindBy(xpath = "(//span[text()='Confirm'])[1]")
    @FindBy(xpath = "(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5'])[4]")
    private WebElement confirmRequestBtn;

    @FindBy(xpath = "(//div[@aria-label='Like'])[1]")
    private WebElement likeBtn;

    @FindBy(xpath = "//*[@id='mount_0_0']/div/div[1]/div[1]/div[2]/div[3]/div/div[1]/div[1]/ul/li[1]/span/div/a")
    private WebElement homeBtn;

    @FindBy(xpath = "(//label[@class='rq0escxv a8c37x1j a5nuqjux l9j0dhe7 k4urcfbm'])[1]")
    private WebElement searchBar;

    @FindBy(xpath = "//*[@id='ami real']/div/a/div/div[2]/span")
    private WebElement chooseAFriendBtn;

    @FindBy(xpath = "//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[2]/div[4]/div/div/div[3]/div/div[1]/div[2]/span/span")
    private WebElement addFriendBtn;

    @FindBy(xpath = "(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[6]")
    private WebElement watchBtn;

    @FindBy(xpath = "(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[2]")
    private WebElement friendsBtn;

    @FindBy(xpath = "(//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7'])[5]")
    private WebElement marketaPlaceBtn;

    @FindBy(xpath = "//*[@id=\"watch_feed\"]/div/div/div/div/div/div[1]/div/div/div/div/div[2]/div[3]/div/div/div[1]/div/span[1]/div/div/span/div[1]/div")
    private WebElement likeVideoBtn;



    public void inputInvalidEmailAddress() {
        emailField.sendKeys("abcd@abcd.com");
        ExtentTestManager.log("Typed invalid email");
    }

    public void inputValidEmailAddress() {
        emailField.sendKeys("personjason25@gmail.com");
        ExtentTestManager.log("Typed valid email");
    }

    public void inputInValidPassword() {
        passwordField.sendKeys("abcd123");
        ExtentTestManager.log("Typed invalid password");
    }

    public void inputValidPassword() {
        passwordField.sendKeys("@JasPer1990");
        ExtentTestManager.log("Typed valid password");
    }

    public void clickOnLoginBtn() {
        signInBtn.click();
    }


    public void clickOnFriends() {
        friendsBtn.click();
        ExtentTestManager.log("Clicked to see friends requests");

    }

    public void confirmRequest(){
        confirmRequestBtn.click();

        ExtentTestManager.log("Friend request confirmed");
    }

    public void handleThePopUp(){
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);
    }

    public void clickOnLikeBtn(){
        likeBtn.click();
        ExtentTestManager.log("Clicked on Like button");
    }

    public void clickOnHomeBtn(){
        homeBtn.click();
        ExtentTestManager.log("Clicked on Home button");
    }

    public void typeOnSearchBar(){
        searchBar.sendKeys("Ami Real");
        ExtentTestManager.log("Typed on search bar");
    }

    public void chooseAFriendFromAList(){
        chooseAFriendBtn.click();
        ExtentTestManager.log("Friend chosen");

    }

    public void clickToAddAFriend(){
        addFriendBtn.click();
        ExtentTestManager.log("friend added");
    }

    public void clickOnWatchBtn(){
        watchBtn.click();
        ExtentTestManager.log("clicked on watch button");
    }

    public void clickOnMarketplaceBtn(){
        marketaPlaceBtn.click();
        ExtentTestManager.log("clicked on watch button");
    }

    public void clickOnFriendsBtn(){
        friendsBtn.click();
        ExtentTestManager.log("clicked on watch button");
    }

    public void likeAVideo(){
        likeVideoBtn.click();
        ExtentTestManager.log("liked a video");
    }

}