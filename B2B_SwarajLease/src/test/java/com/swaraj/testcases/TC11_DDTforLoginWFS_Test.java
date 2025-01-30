package com.swaraj.testcases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC11_DDTforLoginWFS_Test {
	

public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup(); //base
//		System.setProperty("<Path of the ChromeDriver>");
		WebDriver driver = new ChromeDriver(); //base

		// Navigate to a website
		driver.get("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/"); //properties

		//Maximize current window
		driver.manage().window().maximize();

		//Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		Thread.sleep(5000);
		
		// Load the Excel file
        FileInputStream file = new FileInputStream(new File("C:\\\\Users\\\\Nagalakshmi S\\\\OneDrive\\\\Desktop\\\\testData.XLSX"));
        Workbook workbook = new XSSFWorkbook(file);
        Sheet sheet = workbook.getSheetAt(0);

        // Iterate through the rows of the Excel file
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);

            // Read data from the Excel sheet
            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();       

            // Perform login action
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
               } 
            else {
                System.out.println("Login failed for: " + username);
                email.clear();
                Thread.sleep(1000);
                passwd.clear();
                Thread.sleep(1000);
            }
    }
        
//        driver.navigate().back();

        // Close the browser after testing
       driver.quit();

        // Close the workbook and the file
      workbook.close();
      file.close();

}
	}