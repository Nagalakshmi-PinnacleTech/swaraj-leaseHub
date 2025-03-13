package com.swaraj.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class CrossBrowser_WFS_Test {
	
	WebDriver driver;

//	@BeforeMethod
//	@Parameters("browser")
//	public void LaunchBrowser(String browser)
//	{
////		WebDriverManager.chromedriver().setup();
////		driver=new ChromeDriver();
//		switch(browser.toLowerCase())
//		{
//		case "chrome":
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			break;
//
//		case "msedge":
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//			break;
//
//		case "firefox":
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//			break;
//		default:
//			driver = null;
//			break;
//		}
//	}



@Parameters("browser")
@BeforeMethod
public void setup(@Optional("chrome") String browser) {
    switch (browser.toLowerCase()) {
        case "firefox":
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            break;
        case "edge":
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            break;
        case "chrome":
        default:
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            break;
    }
    driver.manage().window().maximize();
    driver.get("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com"); //application URL
}

@Test
public void verifyLogin() throws InterruptedException {
	Thread.sleep(5000);
	driver.findElement(By.linkText("LOGIN")).click();
	Thread.sleep(5000);
	System.out.println("Running test on: " + driver.getTitle());
    //	Assert.assertEquals(expectedTitle, actualTitle);
	WebElement usernameField = driver.findElement(By.xpath("//input[@id='email']"));
	usernameField.sendKeys("superuser@gmail.com");
    WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
    passwordField.sendKeys("superuser@gmail.com@1");
    Thread.sleep(3000);
    WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
    loginButton.click();
    Thread.sleep(5000);
 // Get the actual title
   
    String expectedTitle = "Swaraj";
	String actualTitle =  driver.getTitle();
	
	// Assertion using if condition
    if (actualTitle.equals(expectedTitle)) {
        System.out.println("Title matches: Test Passed");
    } else {
        System.out.println("Title does not match: Test Failed");
    }
}

@AfterMethod
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
}

}
