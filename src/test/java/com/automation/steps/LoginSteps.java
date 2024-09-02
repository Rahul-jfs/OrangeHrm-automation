package com.automation.steps;

import com.automation.pages.LoginPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("user opens website")
    public void user_opens_website() {
        loginPage.openWebsite();
    }

    @When("user enters login credentials {string} and {string}")
    public void user_enters_login_credentials_and(String username, String password) {
        loginPage.enterValidCredentials(ConfigReader.getConfigValue(username), ConfigReader.getConfigValue(password));
    }

    @When("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.clickOnLoginBtn();
    }

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());
    }

}
