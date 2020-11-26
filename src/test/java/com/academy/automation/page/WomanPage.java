package com.academy.automation.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomanPage {
    private WebDriver driver;


    @FindBy(xpath = "//ul/li/a[@title='Women']")
    private WebElement womanTitle;

    @FindBy(xpath = "//div[@class='cat_desc']/span")
    private WebElement womanBannerTitle;

    public WomanPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WomanPage goToWoman(){
        driver.get("http://automationpractice.com/index.php?id_category=3&controller=category");
        return this;
    }

    public String getWomanTitle(){
        return womanTitle.getText();
    }

    public String getWomanBannerTitle(){
        return womanBannerTitle.getText();
    }

}
