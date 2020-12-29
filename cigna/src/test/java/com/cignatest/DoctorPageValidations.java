package com.cignatest;

import com.cigna.pages.DoctorPage;
import com.cigna.pages.HomePage;
import com.peoplentech.bcampdec2020.base.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DoctorPageValidations extends TestBase {

    private HomePage homePage;
    private DoctorPage doctorPage;

    @BeforeMethod
    public void pageFactorySetup() {

        homePage = PageFactory.initElements(driver, HomePage.class);
        doctorPage = PageFactory.initElements(driver, DoctorPage.class);
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToGoToFindADoctorPage() {
        homePage.clickOnFindADoctorBtn();
    }

    @Test(enabled = false)
    public void validateUserBeingAbleToLookForADoctor() {
        homePage.clickOnFindADoctorBtn();
        doctorPage.clickOnEmployerBtn();
        doctorPage.typeTheZipCode();
        doctorPage.clickOnDoctorByTypeBtn();
        doctorPage.chooseADentist();
        doctorPage.continueAsAGuest();
        doctorPage.chooseADoctor();
    }
}
