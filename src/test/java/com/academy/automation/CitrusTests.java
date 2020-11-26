package com.academy.automation;

import com.academy.automation.core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.util.List;

public class CitrusTests extends BaseTest {

        @Test
        public void testTvSelect() throws Exception{
            String menuXpath = "//div/ul/li[@class='menu-aim__item']/a[@href='/televizory-photo-video/']";
            String tvXpath = "//*[@id='header']/div[3]/div/div[2]/div[2]/ul/li[3]/div/div/div[2]/ul/li[2]/a";
            String itemsXpath = "//div[@class='prices__price']/span";
        driver.get("https://citrus.ua");
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(menuXpath)))
        .build()
        .perform();
        driver.findElement(By.xpath(tvXpath)).click();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            List<WebElement> prices = driver.findElements(By.xpath(itemsXpath));
            for(int i = 0; i < prices.size(); i++) {
                System.out.println(prices.get(i).getText());

            }
        }
}
