package com.aravind.trial.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    @FindBy(id = "email")
    WebElement emailID;
    @FindBy(id = "passwd")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
    WebElement loginbutton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setEmail(String Email) {
        emailID.sendKeys(Email);
    }

    public void setPassword(String Password) {
        password.sendKeys(Password);
    }

    public HomePage clickOnLoginButton() {
        loginbutton.click();
        return new HomePage(driver);

    }
}