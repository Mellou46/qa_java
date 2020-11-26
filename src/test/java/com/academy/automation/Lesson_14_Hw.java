package com.academy.automation;
import com.academy.automation.core.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;


public class Lesson_14_Hw extends BaseTest {
    @Test
    public void tesAauthSuccessfull() throws Exception {
        //kreds: e-mail: abb@abb.com; pass: Password;
        String kredMail = "abb@abb.com";
        String kredPass = "Password";
        String signInButtonXpath = "//div[@class='header_user_info']/a['Sign in']";
        String mailFieldXpath = "//input[@id='email']";
        String passFieldXpath = "//input[@id='passwd']";
        String submitButtonXpath = "//button[@id='SubmitLogin']";
        String userBlockXpath = "//div[@class='header_user_info']/a/span";
        String userName = "Andrey Andreev";
        String targetUrl = "http://automationpractice.com/index.php?controller=my-account";
        String finalLink = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

        driver.get(baseUrl);
        driver.findElement(By.xpath(signInButtonXpath)).click();
        driver.findElement(By.xpath(mailFieldXpath)).sendKeys(kredMail);
        driver.findElement(By.xpath(passFieldXpath)).sendKeys(kredPass);
        driver.findElement(By.xpath(submitButtonXpath)).click();
        String actualUserData = driver.findElement(By.xpath(userBlockXpath)).getText();
        String actualUrl = driver.getCurrentUrl();
        if(userName.equals(actualUserData) && targetUrl.equals(actualUrl)) {
            System.out.println("Sign in test PASS");
        }
            else System.out.println("Sign in test FAIL");
        driver.findElement(By.linkText("Sign out")).click();
        if(finalLink.equals(driver.getCurrentUrl())){
            System.out.println("Sign out test PASS");
        }
        else System.out.println("Sign in test FAIL");
    }

    @Test
    public void testIncorrectKreds() throws Exception{
        String signInButtonXpath = "//div[@class='header_user_info']/a['Sign in']";
        String mailFieldXpath = "//input[@id='email']";
        String submitButtonXpath = "//button[@id='SubmitLogin']";
        String errorMessage = "//div[@class='alert alert-danger']/ol/li";
        String controlResult = "Invalid e-mail address.";


        driver.get(baseUrl);
        driver.findElement(By.xpath(signInButtonXpath)).click();
        driver.findElement(By.xpath(mailFieldXpath)).clear();
        driver.findElement(By.xpath(mailFieldXpath)).sendKeys("aas@@dd.com");
        driver.findElement(By.xpath(submitButtonXpath)).click();
        assertEquals(driver.findElement(By.xpath(errorMessage)).getText(), controlResult);
        if(controlResult.equals(driver.findElement(By.xpath(errorMessage)).getText())) {
            System.out.println("Incorrect kreds test PASS");
        }
        else System.out.println("Incorrect kreds test FAIL");
    }

    @Test
    public void scenarioThree(){
        String womanPageXpath = "//li/a[@title='Women']";
        String womanCategorieXpath = "//ul/li/a[@title='Women']";
        String bannerTitleXpath = "//div[@class='cat_desc']/span";
        String bannerTextXpath = "//div[@class='rte']/p/strong";
        String productsCountXpath = "//h1/span[@class='heading-counter']";
        String titleCheck = "Women";
        String bannerTextCheck = "You will find here all woman fashion collections.";
//        String n = null;
//        String productsCountInfo = "There are "+ n +" products";

        driver.get(baseUrl);
        driver.findElement(By.xpath(womanPageXpath)).click();

        if(driver.getTitle().contains(titleCheck)){
            System.out.println("Scenario three title check - PASS");
        }
        else System.out.println("Scenario three title check - FAIL " + driver.getTitle());

        if(titleCheck.toLowerCase().equals(driver.findElement(By.xpath(womanCategorieXpath)).getText().toLowerCase())){
            System.out.println("Scenario three category name check - PASS");
        }
        else System.out.println("Scenario three category name check - FAIL " + driver.findElement(By.xpath(womanCategorieXpath)).getText());

        if(titleCheck.toLowerCase().equals(driver.findElement(By.xpath(bannerTitleXpath)).getText().toLowerCase())){
            System.out.println("Scenario three banner title check - PASS");
        }
        else System.out.println("Scenario three banner title check - FAIL " + driver.findElement(By.xpath(bannerTitleXpath)).getText());

        if(bannerTextCheck.toLowerCase().equals(driver.findElement(By.xpath(bannerTextXpath)).getText().toLowerCase())){
            System.out.println("Scenario three banner text check - PASS");
        }
        else System.out.println("Scenario three banner text check - FAIL " + driver.findElement(By.xpath(bannerTextXpath)).getText());

//        String a = driver.findElement(By.xpath(productsCountXpath)).getText();
//        //a.split("\\D+");
//        n = a.replaceAll("\\D", "");
//
//
//        if(driver.findElement(By.xpath(productsCountXpath)).getText().equals(productsCountInfo)) {
//            System.out.println("Scenario three products count check - PASS");
//        }
//        else System.out.println("Scenario three products count check - FAIL " +" "+ productsCountInfo+ driver.findElement(By.xpath(productsCountXpath)).getText());
    }

}
