package com.swaraj.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addUser_SuperAdminPage {
	WebDriver ldriver;
	private WebDriverWait wait;
	private JavascriptExecutor jsExecutor;

	//constructor
	public addUser_SuperAdminPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//identify webelements
		@FindBy(xpath = "//a[normalize-space()='All Users']")
		WebElement allUser_tab;
		
		//identify action on webelement
		public void click_adduser_btn() throws InterruptedException 
		{
			allUser_tab.click();
			Thread.sleep(2000);
		}

}
