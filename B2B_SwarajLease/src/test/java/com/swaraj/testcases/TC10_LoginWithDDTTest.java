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
import com.swaraj.pageobjects.welcomePage;

import io.github.bonigarcia.wdm.WebDriverManager;
 

public class TC10_LoginWithDDTTest extends BaseClass{
	
	@Test
	public void VerifyLogin() throws IOException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		welcomePage wpg = new welcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");
	}
	
//	private WebDriver driver;
    private DDTloginPage loginPage;
    
    @BeforeClass
    public void setUp() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        loginPage = new DDTloginPage(driver);
    }
    
   
    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws Exception {
        return ExcelOperationDDT.getTestData("C:\\Users\\Nagalakshmi S\\OneDrive\\Desktop\\testData.XLSX", "Sheet1");
    }
    
    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password, String expectedResult) {
        driver.get("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/login");
        
        loginPage.login(username, password);
        
        if ("logged in successfully".equals(expectedResult)) {
            // Add verification for successful login
            Assert.assertEquals(driver.getCurrentUrl(), "http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/home");
        } else {
            // Verify error message
//            String actualError = loginPage.getErrorMessage();
//            Assert.assertEquals(actualError, expectedResult);
        	Assert.assertEquals(driver.getCurrentUrl(), "http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/login");
        }
    }
    
//    @AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}