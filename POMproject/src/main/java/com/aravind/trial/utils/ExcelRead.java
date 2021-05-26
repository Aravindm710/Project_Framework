package com.aravind.trial.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExcelRead {
    WebDriver driver;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;

    @BeforeTest
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        driver.manage().window().maximize();
    }

    @Test
    public void Login() throws IOException {
        File src = new File("C:\\Users\\aravi\\Desktop\\Book.xlsx");
        FileInputStream fis = new FileInputStream(src);
        workbook = new XSSFWorkbook(fis);
        sheet = workbook.getSheetAt(0);
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            cell = sheet.getRow(i).getCell(0);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.id("email")).sendKeys(cell.getStringCellValue());
            cell = sheet.getRow(i).getCell(1);
            cell.setCellType(Cell.CELL_TYPE_STRING);
            driver.findElement(By.id("passwd")).sendKeys(cell.getStringCellValue());
            driver.findElement(By.id("SubmitLogin")).click();
        }
    }
}