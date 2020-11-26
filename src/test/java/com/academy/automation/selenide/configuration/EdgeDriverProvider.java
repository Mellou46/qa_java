package com.academy.automation.selenide.configuration;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

class EdgeDriverProvider implements WebDriverProvider {

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        System.setProperty("webdriver.edge.driver", "C:/demo/drivers/msedgedriver.exe");
        System.out.println("**************");
//        System.setProperty("webdriver.gecko.driver", "d:/distribs/selenium/geckodriver.exe");


        return new EdgeDriver();
    }
}
