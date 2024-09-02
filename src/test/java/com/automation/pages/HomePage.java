package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//header//span/h6")
    WebElement homePageTitle;

    @FindBy(xpath = "//a/span[text()='Leave']")
    WebElement leaveOption;

    @FindBy(xpath = "//img[@alt='profile picture']")
    WebElement profilePicture;

    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a[text()='Logout']")
    WebElement logoutBtn;

    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']/li/a[text()='About']")
    WebElement aboutBtn;

    public boolean isHomePageDisplayed() {
        return homePageTitle.isDisplayed();
    }

    public void clickOnLeaveOption() {
        leaveOption.click();
    }

    public void clickOnProfilePicture() {
        profilePicture.click();
    }

    public boolean isProfileRelatedOptionsDisplayed() {
        return logoutBtn.isDisplayed() && aboutBtn.isDisplayed();
    }

    public void clickOnLogoutBtn() {
        logoutBtn.click();
    }
}
