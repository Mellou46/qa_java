package com.academy.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(linkText = "Sign in")
    private WebElement signInLink;

    @FindBy(xpath = "//li/a[@title='Women']")
    private WebElement womanPageLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HomePage goToHome(){
        driver.get("http://automationpractice.com/index.php");
        return this;
    }

    public LoginPage clickSignIn(){
        signInLink.click();
        return new LoginPage(driver);
    }

    public WomanPage getWomanPage(){
        womanPageLink.click();
        return new WomanPage(driver);

    }
}
