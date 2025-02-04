package com.swaraj.testcases;

import org.openqa.selenium.WebDriver;
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

	@BeforeMethod
	@Parameters("browser")
	public void LaunchBrowser(String browser)
	{
//		WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}
	}

	@Test
	public void verifyTitle() throws InterruptedException
	{
		//open url
		driver.get("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com");
		Thread.sleep(4000);
		String expectedTitle = "Google";

		String actualTitle =  driver.getTitle();

		Assert.assertEquals(expectedTitle, actualTitle);
	}

	@AfterMethod
	public void Quit()
	{
		driver.quit();
	}


}
