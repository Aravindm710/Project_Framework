package com.aravind.trial.regression;

import com.aravind.trial.BaseTester;
import com.aravind.trial.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
public class TestCases1 extends BaseTester {
    @Test
    public void init() throws Exception {
        LoginPage loginpage=new LoginPage(driver);
        loginpage.setEmail("testmailnew710@gmail.com");
        loginpage.setPassword("Test@12345");
        loginpage.clickOnLoginButton();
        //Search for product
        WebElement Search= driver.findElement(By.id("search_query_top"));
        Search.sendKeys("Dress");
        //Enter
        Search.sendKeys(Keys.RETURN);
        //Click Product
        WebElement Product= driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]"));
        Product.click();
        //Add To Cart
        WebElement Cart= driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span"));
        Cart.click();
        //Logout
        //driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[2]")).click();
    }


}
