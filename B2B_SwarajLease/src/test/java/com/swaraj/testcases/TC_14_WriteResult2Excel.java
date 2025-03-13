package com.swaraj.testcases;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import com.swaraj.utilities.ExcelUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.io.*;

public class TC_14_WriteResult2Excel {
	public static void main(String[] args) throws InterruptedException, IOException {
		
	// Load the Excel file
    FileInputStream file = new FileInputStream(new File("C:\\Users\\Nagalakshmi S\\OneDrive\\Desktop\\test_data .XLSX"));
    Workbook workbook = new XSSFWorkbook(file);
    Sheet sheet = workbook.getSheetAt(0);
	//  Sheet sheet = workbook.getSheet("Sheet1");

	WebDriverManager.chromedriver().setup(); //base
	WebDriver driver = new ChromeDriver(); //base
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	// Navigate to a website
	driver.get("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/"); //properties

	//Maximize current window
	driver.manage().window().maximize();

	//Delay execution for 5 seconds to view the maximize operation
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
	
	// Read data from Excel and perform login tests
    for (int i = 1; i <= sheet.getLastRowNum(); i++) {
    Row row = sheet.getRow(i);
    Cell usernameCell = row.getCell(0);
    Cell passwordCell = row.getCell(1);
    Cell resultCell = row.createCell(2, CellType.STRING);  // Column for PASS/FAIL

    String username = usernameCell.getStringCellValue();
    String password = passwordCell.getStringCellValue();

    // Perform Login
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
        resultCell.setCellValue("PASS");
//        style.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex())
        Thread.sleep(2000);
       } 
    else {
        System.out.println("Login failed for: " + username);
        Actions actions = new Actions(driver);
        actions.moveToElement(email).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
        actions.moveToElement(passwd).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
        resultCell.setCellValue("FAIL");
        Thread.sleep(2000);
//        setCellColor(workbook1, resultCell, IndexedColors.RED);
        
//        driver.navigate().refresh();  // Reset for next login
}
 // Close the workbook and the file
    workbook.close();
    file.close();
    }

// Close the browser after testing
 driver.quit();



}
    }





