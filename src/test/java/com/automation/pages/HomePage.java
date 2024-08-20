package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//header//span/h6")
    WebElement homePageTitle;


    public boolean isHomePageDisplayed() {
        return homePageTitle.isDisplayed();
    }
}
