package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class carryFWPage {
	WebDriver ldriver;
	private WebDriverWait wait;

	//constructor
	public carryFWPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//identify webelements
		@FindBy(css = "div[id='root'] div[class='sidebar-top-grid-3 mb-5'] div:nth-child(1)")
		WebElement lease_CF;
		@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
		WebElement rent_CF;
		@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/span[1]")
		WebElement bills_CF;
		
		//identify action on webelement
		
		public void lease_CF_btn() throws InterruptedException 
		{
			lease_CF.click();
			Thread.sleep(2000);
		}
		public void rent_CF_btn() throws InterruptedException 
		{
			rent_CF.click();
			Thread.sleep(2000);
		}
		public void bills_CF_btn() throws InterruptedException 
		{
			bills_CF.click();
			Thread.sleep(2000);
		}

}
