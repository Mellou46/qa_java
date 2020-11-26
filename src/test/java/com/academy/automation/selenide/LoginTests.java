package com.academy.automation.selenide;

import com.academy.automation.core.BaseTest;
import com.academy.automation.selenide.page.HomePage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.Assert;
import org.testng.annotations.*;


public class LoginTests {
    @BeforeClass
    public void setUp() {
        Configuration.browser = "edge";
        Configuration.baseUrl = "http://automationpractice.com/index.php";
        Configuration.startMaximized = true;
        Configuration.headless = false;
        Configuration.timeout = 1000;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }

    @Test(dataProvider = "loginErrorProvider")
    public void testLoginError(String username, String password, String expectedMsg) {
//        open(Configuration.baseUrl);
//        $(By.linkText("Sign in")).click();
//        $(By.id("email")).sendKeys(username);
//        $(By.id("passwd")).sendKeys(password);
//        $(By.xpath("//button[@id='SubmitLogin']/span")).click();
//        String actualMsg = $(By.xpath("//div[@id='center_column']/div/ol/li")).getText();
        String actualMsg =
                new HomePage()
                        .goToHome()
                        .clickSignIn()
                        .fillEmail(username)
                        .fillPassword(password)
                        .submit()
                        .getErrorMessage();

        Assert.assertEquals(actualMsg, expectedMsg);
        Assert.assertEquals(actualMsg, expectedMsg);

    }

    @AfterClass
    public void tearDown() {
        //closeWindow();
    }

    @DataProvider
    public Object[][] loginErrorProvider() {
        return new Object[][] {
                {"user","123","Invalid email address."},
                {"", "123","An email address required."},
                {"Andreev@mail.ru", "Password", "Authentication failed."}
        };
    }
}
