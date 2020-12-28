package com.cigna.pages;

import com.peoplentech.bcampdec2020.extent.ExtentTestManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoctorPage {

    @FindBy(xpath = "//span[contains(text(),'Employer or School')]")
    private WebElement employerBtn;

    @FindBy(xpath = "//typeahead-container/button/span")
    private WebElement suggestedLocationBtn;

    @FindBy(xpath = "(//span/input)[1]")
    private WebElement zipCodeField;

    @FindBy(xpath = "(//span[contains(text(),'Doctor by Type')]")
    private WebElement doctorByTypeBtn;

    @FindBy(name = "Dentist")
    private WebElement dentistBtn;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    private WebElement continueBtn;

    @FindBy(linkText = "Andrew M. Noble, DDS")
    private WebElement doctorAndrewBtn;


    public void clickOnEmployerBtn(){
        employerBtn.click();
    }

    public void typeTheZipCode(){
        zipCodeField.sendKeys("85603");
        suggestedLocationBtn.click();
        ExtentTestManager.log("Location setup");
    }

    public void clickOnDoctorByTypeBtn(){
        doctorByTypeBtn.click();
    }

    public void chooseADentist(){
        dentistBtn.click();
        ExtentTestManager.log("Dentist chosen");
    }

    public void continueAsAGuest(){
        continueBtn.click();
    }

    public void chooseADoctor(){
        doctorAndrewBtn.click();
    }

}
