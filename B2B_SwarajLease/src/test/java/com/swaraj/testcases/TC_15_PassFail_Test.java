package com.swaraj.testcases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.swaraj.utilities.ExcelUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.*;
import java.time.Duration;

public class TC_15_PassFail_Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		  // Set up WebDriver
		WebDriverManager.chromedriver().setup(); //base
		WebDriver driver = new ChromeDriver(); //base
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/");
      //Maximize current window
    	driver.manage().window().maximize();

    	//Delay execution for 5 seconds to view the maximize operation
    	Thread.sleep(5000);
    	
    	driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();

        // Load Excel data
        ExcelUtils.loadExcel("Sheet1");

        int rowCount = 10; // Assume 6 rows of test data
        for (int i = 1; i <= rowCount; i++) { // Start from row 1 (skip header)
            String username = ExcelUtils.getCellData(i, 0);
            String password = ExcelUtils.getCellData(i, 1);

            // Perform login
            WebElement email =driver.findElement(By.xpath("//input[@type='email']"));
            email.sendKeys(username);
            WebElement passwd =driver.findElement(By.xpath("//input[@id='password']"));
            passwd.sendKeys(password);
            driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
            Thread.sleep(2000);

         // Verify login success or failure
            String currentURL = driver.getCurrentUrl();
            if (currentURL.equals("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/home")) {
                System.out.println("Login successful for: " + username);
                driver.findElement(By.xpath("(//*[name()='svg'])[11]")).click();
                driver.findElement(By.xpath("//button[normalize-space()='Logout']")).click();
                Thread.sleep(2000);
                ExcelUtils.writeCellData(i, 2, "Pass");
                Thread.sleep(2000);
               } 
            else {
                System.out.println("Login failed for: " + username);
                Actions actions = new Actions(driver);
                actions.moveToElement(email).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
                actions.moveToElement(passwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
                Thread.sleep(2000);
                ExcelUtils.writeCellData(i, 2, "Fail");
                Thread.sleep(2000);
        }
    }

       // Close resources
        ExcelUtils.closeExcel();
        driver.quit();
    }
	}


