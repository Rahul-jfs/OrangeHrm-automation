package com.automation.pages;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LeavePage extends BasePage{

    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']/h6")
    WebElement leavePageTitle;

    @FindBy(xpath = "//ul/li/a[text()='Apply']")
    WebElement applyOption;

    @FindBy(xpath = "//div[@class='orangehrm-card-container']/h6")
    WebElement applyLeavePageTitle;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[1]")
    WebElement leaveTypeBtn;

    @FindBy(xpath = "//div[@role='listbox']/div/span")
    WebElement leaveType;

    @FindBy(xpath = "(//div[@class='oxd-date-input'])[1]/input")
    WebElement fromDateBtn;

    @FindBy(xpath = "(//div[@class='oxd-date-input'])[2]/input")
    WebElement toDateBtn;

    @FindBy(xpath = "//div[@class='oxd-calendar-selector-month-selected']/p")
    WebElement monthButton;

    String monthYearDropDownXPATH = "//ul[@class='oxd-calendar-dropdown']/li[text()='%s']";

    @FindBy(xpath = "//div[@class='oxd-calendar-selector-year-selected']/p")
    WebElement yearButton;

    @FindBy(xpath = "//div[@class='oxd-calendar-date']")
    List<WebElement> dayList;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[2]")
    WebElement partialDaysBtn;

    String partialDaysXPATH = "//div/span[text()='%s']";

    @FindBy(xpath = "//textarea")
    WebElement textareaTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement applyBtn;

    @FindBy(xpath = "(//div[@class='oxd-select-wrapper'])[3]")
    WebElement durationTypeBtn;

    String durationXPATH = "//div[@role='listbox']/div/span[text()='%s']";

    public  void addCommentAs(String comment) {
        textareaTextBox.sendKeys(comment);
    }

    public boolean isLeavePageDisplayed() {
        return leavePageTitle.getText().equals("Leave");
    }

    public void clickOnApplyOption() {
        applyOption.click();
    }

    public boolean isApplyLeavePageIsDisplayed() {
        return applyLeavePageTitle.getText().equals("Apply Leave");
    }

    public void selectLeaveType() {
        leaveTypeBtn.click();
        leaveType.click();
    }

    public void selectFromAndToDateOfLeave(String fromDate, String toDate) {
        String fromMonth = fromDate.substring(fromDate.indexOf(" ")+1, fromDate.lastIndexOf(" "));
        String fromYear = fromDate.substring(fromDate.lastIndexOf(" ")+1);
        String fromDay = fromDate.substring(0, fromDate.indexOf(" "));

        fromDateBtn.click();

        monthButton.click();
        driver.findElement(By.xpath(String.format(monthYearDropDownXPATH, fromMonth))).click();

        yearButton.click();
        driver.findElement(By.xpath(String.format(monthYearDropDownXPATH, fromYear))).click();

        dayList.get(Integer.parseInt(fromDay)).click();

        String toMonth = toDate.substring(toDate.indexOf(" ")+1, toDate.lastIndexOf(" "));
        String toYear = toDate.substring(toDate.lastIndexOf(" ")+1);
        String toDay = toDate.substring(0, toDate.indexOf(" "));

        toDateBtn.click();
        WebElement monthBtn1 = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-month-selected']/i"));
        monthBtn1.click();
        driver.findElement(By.xpath(String.format(monthYearDropDownXPATH, toMonth))).click();

        WebElement yearBtn1 = driver.findElement(By.xpath("//div[@class='oxd-calendar-selector-year-selected']/p"));
        yearBtn1.click();
        driver.findElement(By.xpath(String.format(monthYearDropDownXPATH, toYear))).click();

        dayList.get(Integer.parseInt(toDay)).click();

    }


    public void selectPartialDays(String partialType) {
        partialDaysBtn.click();

        driver.findElement(By.xpath(String.format(partialDaysXPATH, partialType))).click();
    }



    public void clickOnApplyBtn() {
        applyBtn.click();
    }

    public void selectDurationType(String leaveDuration) {
        durationTypeBtn.click();
        driver.findElement(By.xpath(String.format(durationXPATH, leaveDuration)));
    }
}
