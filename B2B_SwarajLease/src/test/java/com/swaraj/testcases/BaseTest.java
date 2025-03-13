package com.swaraj.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.swaraj.reports.ReportTestManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	protected WebDriver driver;
	protected String userName;
	protected String password;
	protected String appUrl;
	private String browserType;
	protected static Properties properties;
	
	@BeforeTest
	public void setupSuite() {
		userName = getConfig("UserName");
		password = getConfig("Password");
		appUrl = getConfig("Url");
		browserType = getConfig("BrowserType");
		
	}
	

	@Parameters({"BrowserName"})
//	@BeforeMethod
	@Test
	public void setup(@Optional String browserName) {
		if(browserName != null) {
			this.browserType = browserName;
		}
		if(browserType.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else {
			throw new RuntimeException("Please provide valid value of browser");
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(appUrl);
	}
	
	private String getConfig(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	public void addLog(String message) {
		if (ReportTestManager.getTest()!=null)
			ReportTestManager.getTest().log(Status.PASS, message);
	}
	
	public static String getConfig1(String key) {
		return properties.get(key).toString();
	}
	
	static {
		properties = new Properties();
		try {
			FileInputStream file= new FileInputStream(new File("config.properties"));
			properties.load(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public WebDriver getWebDriver() {
		return driver;
	}

}
