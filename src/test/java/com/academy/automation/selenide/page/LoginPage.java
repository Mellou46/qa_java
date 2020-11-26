package com.academy.automation.selenide.page;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.page;

public class LoginPage {
    @FindBy(id="email1")
    private SelenideElement emailField;

    @FindBy(id="passwd")
    private SelenideElement passwordField;

    @FindBy(id="SubmitLogin")
    private SelenideElement submitButton;

    @FindBy(xpath = "//div[@id='center_column']/div/ol/li")
    private SelenideElement errorMessage;

    @Step("enter email {0}")
    public LoginPage fillEmail(String email) {
        emailField.sendKeys(email);
        return page(LoginPage.class);
    }

    @Step("enter email {0}")
    public LoginPage fillPassword(String password) {
        passwordField.sendKeys(password);
        return page(LoginPage.class);
    }

    @Step("Сабмитим")
    public LoginPage submit() {
        submitButton.click();
        return page(LoginPage.class);
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
