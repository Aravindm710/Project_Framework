package com.aravind.trial.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {
    WebDriver driver;
    @FindBy(xpath = "//a[@title=\"Women\"]")
    WebElement Women;
    @FindBy(xpath = "//a[@title=\"Dresses\"]")
    WebElement Dresses;
    @FindBy(xpath = "//a[@title=\"T-shirts\"]")
    WebElement T_shirts;
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a/span")
    WebElement OrderHistory;
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a/span")
    WebElement CreditSlips;
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a/span")
    WebElement MyAddress;
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a/span")
    WebElement PersonalInfo;
    @FindBy(xpath="//*[@id=\"center_column\"]/div/div[2]/ul/li/a/span")
    WebElement Wishlist;
    @FindBy(xpath="//*[@id=\"center_column\"]/ul/li/a/span")
    WebElement Home;
    public HomePage (WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    }
}