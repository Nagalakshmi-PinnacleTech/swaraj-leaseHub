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


			
			
			


}
