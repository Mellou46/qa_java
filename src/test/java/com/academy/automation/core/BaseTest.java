package com.academy.automation.core;

import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BaseTest {
    protected String baseUrl;
    private StringBuffer verificationErrors = new StringBuffer();
    private static Logger LOG = LogManager.getLogger(BaseTest.class.getName());
    protected EventFiringWebDriver driver;

    @Parameters("browser")
    @BeforeClass(alwaysRun = true)

    public void setUp(@Optional("edge") String browser) throws Exception {
        String path = System.getProperty("cfg");
        System.out.println(path);

        Properties properties = new Properties();
        properties.load(new FileInputStream(path));
        String chromeDriver = properties.getProperty("driver.chrome");
        String edgeDriver = properties.getProperty("driver.edge");
        String screenDir = properties.getProperty("screen.dir");
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", chromeDriver);
            driver = new EventFiringWebDriver( new ChromeDriver());
        } else if(browser.equals("edge")){
            System.setProperty("webdriver.edge.driver", edgeDriver);
            driver = new EventFiringWebDriver(new EdgeDriver());
        } else{
            System.setProperty("webdriver.chrome.driver", chromeDriver);
            driver = new EventFiringWebDriver(new ChromeDriver());
        }
        baseUrl = "http://automationpractice.com/index.php";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.register(new WebDriverEventListenerImpl(screenDir));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    @BeforeMethod
    public void testStart(Method method, Object[] params) {
        LOG.info("test {} starts with params: {}",
                method.getName(), Arrays.toString(params));
    }

    @AfterMethod
    public void testComplete(Method method) {
        LOG.info("test {} finished.", method.getName());
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot() {
        return driver.getScreenshotAs(OutputType.BYTES);
    }
}
