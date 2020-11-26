package com.academy.automation;

import com.academy.automation.core.BaseTest;
import com.academy.automation.page.HomePage;
import com.academy.automation.page.LoginPage;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.testng.Assert.assertEquals;


public class LoginTests extends BaseTest {


    @Test(dataProvider = "loginErrorData")
    public void testUntitledTestCase(String username, String pass, String expecktedMsg) throws Exception {

        driver.get("http://automationpractice.com/index.php");
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();
        assertEquals(driver.findElement(By.xpath("//div[@id='center_column']/div/ol/li")).getText(), expecktedMsg);
    }
//    @Test
//    public void testFillInForm() throws Exception{
//        Random random = new Random();
//        testCreateAccount();
//        driver.findElement(By.xpath("//span/input[@id='id_gender1']")).click();
//        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("khbv");
//        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("tufh");
//        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
//        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("khv");
//        driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Sumskaya strt.");
//        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Kharkov");
//        //driver.findElement(By.xpath("//select[@id='id_state']")).click();
//        driver.findElement(By.xpath("//select[@id='id_state']/option[@value='2']")).click();
//    }

    @Test(dataProvider =  "loginErrorData")
    public void testLoginErrorMsg(String username, String pass, String expecktedMsg) throws Exception{

        HomePage homePage = new HomePage(driver);
        homePage.goToHome();
        LoginPage loggInPage = homePage.clickSignIn();
        loggInPage.fillEmail(username);
        loggInPage.fillPassword(pass);
        loggInPage.clickSubmit();
        String actualMsg = loggInPage.getErrorMessage();
        assertEquals(actualMsg, expecktedMsg);
    }



    @DataProvider(name = "loginErrorData")
    public Object[][] loginErrorDataProvider() throws Exception{
        String path = "C:/Projects/QAmaven/test-data/login-test.csv";
        Scanner scanner = new Scanner(new FileInputStream(path), StandardCharsets.UTF_8);
        List<String> lines = new ArrayList<>();
        while (scanner.hasNext()){
            String nextLine = scanner.nextLine();
            System.out.println(nextLine);
            lines.add(nextLine);
        }
        scanner.close();
        Object[][] data = new Object[lines.size()][3];

        for(int i = 0; i < lines.size(); i++){
            String[] lineParts = lines.get(i).split(",");
            for(int j = 0; j<lineParts.length; j++)
                data[i][j] = lineParts[j];
            //можно сделать через цикл ДЗ
//            data[i][0] = lineParts[0];
//            data[i][1] = lineParts[1];
//            data[i][2] = lineParts[2];
        }

        return data;

//        return new Object[][]{
//                //Сколько тут наборов данных, столько и будет ранов теста
//                {"user", "123", "Invalid email address."},
//                {"", "123", "An email address required."}
//        };
    }


}
