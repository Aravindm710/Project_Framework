package com.aravind.trial.regression;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Assertions {

    public static WebDriver driver;
    @BeforeTest
    public static void initialize() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void assertEquals() {
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Login - My Store";
        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
    @Test
    public void assertTrue() {
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        String actualURL = driver.getCurrentUrl();
        String expectedURL="http://automationpractice.com/index.php?controller=authentication";
        Assert.assertTrue("Invalid URL",expectedURL.equals(actualURL));
        System.out.println("Test Passed");

    }
    @Test
    public void assertFalse() {
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        String actualURL = driver.getCurrentUrl();
        String expectedURL="http://automationpractice.com";
        Assert.assertFalse("URL does match",expectedURL.equals(actualURL));
        System.out.println("Test Passed");
    }
    @AfterTest
    public void quitDriver() {
        driver.quit();
    }
}