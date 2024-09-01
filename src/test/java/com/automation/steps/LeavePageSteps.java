package com.automation.steps;

import com.automation.pages.LeavePage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LeavePageSteps {

    LeavePage leavePage = new LeavePage();

    @Then("verify user is on leave page")
    public void verifyUserIsOnLeavePage() {
        Assert.assertTrue(leavePage.isLeavePageDisplayed());
    }

    @When("user clicks on apply option")
    public void userClicksOnApplyOption() {
        leavePage.clickOnApplyOption();
    }

    @Then("verify apply leave page is displayed")
    public void verifyApplyLeavePageIsDisplayed() {
        Assert.assertTrue(leavePage.isApplyLeavePageIsDisplayed());
    }

    @When("user selects leave type")
    public void userSelectsLeaveType() {
        leavePage.selectLeaveType();
    }

    @And("select from date {string} and to date {string}")
    public void selectFromDateAndToDate(String fromDate, String toDate) {
        leavePage.selectFromAndToDateOfLeave(ConfigReader.getConfigValue(fromDate), ConfigReader.getConfigValue(toDate));
    }


    @And("user selects partial days of type {string}")
    public void userSelectsPartialDaysOfType(String partialType) {
        leavePage.selectPartialDays(ConfigReader.getConfigValue(partialType));
    }

    @And("adds comment as {string}")
    public void addsCommentAs(String comment) {
        leavePage.addCommentAs(ConfigReader.getConfigValue(comment));
    }

    @And("clicks on apply button")
    public void clicksOnApplyButton() {
        leavePage.clickOnApplyBtn();
    }

    @And("selects duration type as {string}")
    public void selectsDurationTypeAs(String leaveDuration) {
        leavePage.selectDurationType(ConfigReader.getConfigValue(leaveDuration));
    }
}
