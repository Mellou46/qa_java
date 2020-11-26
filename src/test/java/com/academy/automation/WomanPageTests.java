package com.academy.automation;

import com.academy.automation.core.BaseTest;
import com.academy.automation.page.HomePage;
import com.academy.automation.page.WomanPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WomanPageTests extends BaseTest {
    @Test
    public void testWomanRedirect() throws Exception{
        HomePage homePage = new HomePage(driver);
        homePage.goToHome();
        homePage.getWomanPage();
        WomanPage womanPage = new WomanPage(driver);
        String actualTitle = womanPage.getWomanTitle();
        Assert.assertEquals(actualTitle.toLowerCase().trim(), "women");
    }
    @Test
    public void testWomanBannerTitle() throws Exception{
        WomanPage womanPage = new WomanPage(driver);
        womanPage.goToWoman();
        String actualBannerTitle = womanPage.getWomanBannerTitle();
        Assert.assertEquals(actualBannerTitle.toLowerCase().trim(), "women");
    }
}
