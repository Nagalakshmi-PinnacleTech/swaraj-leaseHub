package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class welcomePage {

	
		//1. create object of webdriver
		WebDriver ldriver;

		//constructor
		public welcomePage(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}


		//identify webelements
		@FindBy(linkText = "LOGIN") 
		WebElement login_btn;
		
		
		//identify action on webelement
		public void clickOnLogin()
		{
			login_btn.click();
		}
		
		public String getPageTitle()
		{
			return(ldriver.getTitle());
		}
		
		
}
