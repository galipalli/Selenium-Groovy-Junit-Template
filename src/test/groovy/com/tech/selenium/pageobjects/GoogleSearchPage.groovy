package com.tech.selenium.pageobjects

import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class GoogleSearchPage {

    WebDriver _driver

//    @FindBy(id = "lst-ib")
//    WebElement _searchBox

    @FindBy(name = "q")
    public WebElement _searchBox

    @FindBy(xpath = "//*[text() = 'Reject all']")
    public WebElement rejectAll

    @FindBy(xpath = "//*[text() = 'Accept all']")
    public WebElement acceptAll

    GoogleSearchPage(driver) {
        this._driver = driver
        PageFactory.initElements(_driver, this)
    }

    def openURL() {
        _driver.get("https://www.google.com/")
    }

    def searchFor(searchTerm) {
        _searchBox.sendKeys(searchTerm + Keys.RETURN)
    }


}
