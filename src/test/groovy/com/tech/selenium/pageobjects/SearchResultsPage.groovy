package com.tech.selenium.pageobjects

import org.junit.Assert
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class SearchResultsPage {

    WebDriver _driver

    @FindBy(linkText = "Selenium")
    WebElement _lnkSelenium

    @FindBy(xpath = "//*[text() = 'WebDriver - Selenium']")
    public WebElement webDriverSeleniumBeu

    SearchResultsPage(driver) {
        this._driver = driver
        PageFactory.initElements(_driver, this)
    }

    def assertSeleniumPresent(){
        Assert.assertTrue(webDriverSeleniumBeu.isDisplayed())
//        Assert.assertTrue(_lnkSelenium.isDisplayed())
    }

}
