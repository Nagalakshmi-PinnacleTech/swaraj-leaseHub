package com.swaraj.pageobjects;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addUserPage {
//1. create object of webdriver
	WebDriver ldriver;
	private WebDriverWait wait;
	private JavascriptExecutor js;

	//constructor
	public addUserPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//*************identify webelements*****************
	//___________Add user_________________
	
	@FindBy(xpath = "//button[normalize-space()='Add User']")
	WebElement adduser_btn;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement userName_txt;
	@FindBy(xpath = "//input[@id='email']")
	WebElement userEmail_txt;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement userPhone_txt;
	@FindBy(xpath = "//textarea[@id='address']")
	WebElement userAddress_txt;
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/*[name()='svg'][1]/*[name()='path'][1]")
	WebElement userRole_dd;
	@FindBy(xpath = "//button[@class='btn-primary_1 btn-green' and normalize-space()='Add']")
	WebElement add_btn;
	
	//identify action on webelement
	public void adduser_btn() throws InterruptedException 
	{
		adduser_btn.click();
		Thread.sleep(2000);
	}
	
	public void enteruserName_txt(String enteruserName_txt) 
	{
		userName_txt.sendKeys(enteruserName_txt);
	}
	
	public void enteruserEmail_txt(String enteruserEmail_txt) 
	{
		userEmail_txt.sendKeys(enteruserEmail_txt);
	}
	
	public void enteruserPhone_txt(String enteruserPhone_txt) 
	{
		userPhone_txt.sendKeys(enteruserPhone_txt);
	}
	
	public void enteruserAddress_txt(String enteruserAddress_txt) 
	{
		userAddress_txt.sendKeys(enteruserAddress_txt);
	}
	
	public void userRole_dd() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(userRole_dd).click().build().perform();
		Thread.sleep(3000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(3000);
	}
	
	public void add_btn() throws InterruptedException 
	{
//		add_btn.click();
		WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(add_btn));
		try {
		    element.click();
		} catch (ElementClickInterceptedException e) {
		    JavascriptExecutor executor = (JavascriptExecutor) ldriver;
		    executor.executeScript("arguments[0].click();", element);
		}

	}
}
