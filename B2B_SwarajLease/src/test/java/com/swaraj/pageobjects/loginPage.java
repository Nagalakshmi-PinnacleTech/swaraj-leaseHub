package com.swaraj.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage {
	//1. create object of webdriver
//		WebDriver ldriver;
	 private WebDriver driver;
	 private WebDriverWait wait;
	 
		//constructor
//		public loginPage(WebDriver rdriver)
//		{
//			ldriver = rdriver;
//			PageFactory.initElements(rdriver, this);
//		}
		
		public loginPage(WebDriver driver) {
	        this.driver = driver;
	        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        PageFactory.initElements(driver, this);
	    }


		//identify webelements

		
		//Already registered users
		@FindBy(xpath = "//input[@type='email']") 
		WebElement registeredUsersEmail;
		
		@FindBy(xpath = "//input[@id='password']") 
		WebElement registeredUsersPwd;
		
		@FindBy(xpath = "//button[@type='submit']")
		WebElement submitLogin;
		
		//identify action on webelement
		//ACTIONS METHODS FOR ALREADY REGISTERED USERS
		
		public void enterEmailAddress(String emailAdd) 
		{
			registeredUsersEmail.sendKeys(emailAdd);
		}

		public void enterPassword(String pwd) 
		{
			registeredUsersPwd.sendKeys(pwd);
		}

		public void clickLogIn()
		{
			submitLogin.click();
		}

	}


