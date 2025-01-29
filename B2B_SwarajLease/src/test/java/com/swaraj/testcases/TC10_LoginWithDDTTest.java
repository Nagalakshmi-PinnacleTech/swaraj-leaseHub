package com.swaraj.testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.swaraj.pageobjects.DDTloginPage;
import com.swaraj.pageobjects.welcomePage;
import com.swaraj.utilities.Constants;
import com.swaraj.utilities.ExcelOperationDDT;
import org.testng.Assert;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;
 

public class TC10_LoginWithDDTTest extends BaseClass{
	
	private WebDriver driver;
    private DDTloginPage loginPage;
    
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new DDTloginPage(driver);
    }
    
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws Exception {
        return ExcelOperationDDT.getTestData("src/test/resources/testData/LoginData.xlsx", "LoginTests");
    }
    
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedResult) {
        driver.get("https://your-application-url.com/login");
        
        loginPage.login(username, password);
        
        if ("SUCCESS".equals(expectedResult)) {
            // Add verification for successful login
            Assert.assertEquals(driver.getCurrentUrl(), "https://your-application-url.com/dashboard");
        } else {
            // Verify error message
            String actualError = loginPage.getErrorMessage();
            Assert.assertEquals(actualError, expectedResult);
        }
    }
    
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}