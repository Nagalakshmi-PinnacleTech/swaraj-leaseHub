package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public loginPage(WebDriver rdriver)
		{
			ldriver = rdriver;


			PageFactory.initElements(rdriver, this);
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


