package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	//1. create object of webdriver
	WebDriver ldriver;

	//constructor
	public homePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//*************identify webelements*****************
	//___________Profile section_________________
	@FindBy(xpath = "//div[@class='profile-letter flex-center']")
	WebElement profile_dd; 
	@FindBy(xpath = "//button[normalize-space()='Settings']")
	WebElement settings;
	@FindBy(xpath = "//a[normalize-space()='Users']")
	WebElement user_tab;
	
	//identify action on webelement
	public void clickProfile_dd() throws InterruptedException 
	{
		profile_dd.click();
		Thread.sleep(2000);
	}
	
	public void clickSettings() 
	{
		settings.click();
	}
	
	public void clickUser_tab() 
	{
		user_tab.click();
	}

			
			
			


}
