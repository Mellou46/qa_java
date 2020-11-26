package com.academy.automation.page;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;


    @FindBy(id = "email")
    private WebElement emailField;


    @FindBy(id = "passwd")
    private WebElement passwordField;


    @FindBy(id = "SubmitLogin")
    private WebElement submitButton;

    @FindBy(xpath = "//div[@id='center_column']/div/ol/li")
    private WebElement errorMessage;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Step("enter email {0}")
    public LoginPage fillEmail(String email){
        emailField.clear();
        emailField.sendKeys(email);
        return this;
    }

    @Step("enter email {0}")
    public LoginPage fillPassword(String password){
        passwordField.clear();
        passwordField.sendKeys(password);
        return this;
    }

    @Step("Сабмитим")
    public LoginPage clickSubmit(){
        submitButton.click();
        return this;
    }
    public String getErrorMessage(){
        return errorMessage.getText();
    }
}
