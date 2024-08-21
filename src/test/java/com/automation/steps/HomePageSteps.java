package com.automation.steps;

import com.automation.pages.HomePage;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
        ReportManager.attackScreenshot();
    }
}
