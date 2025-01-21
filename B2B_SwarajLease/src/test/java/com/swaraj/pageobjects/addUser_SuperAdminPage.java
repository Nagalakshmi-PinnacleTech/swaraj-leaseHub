package com.swaraj.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
		@FindBy(xpath = "//button[normalize-space()='Add User']")
		WebElement addUser_btn;
		@FindBy(css = "#react-select-3-placeholder")
		WebElement sel_institute;
		@FindBy(xpath = "//input[@id='name']")
		WebElement user_name;
		@FindBy(xpath = "//input[@id='email']")
		WebElement user_email;
		@FindBy(xpath = "//input[@id='phone']")
		WebElement user_phone;
		@FindBy(css = "#react-select-5-placeholder")
		WebElement sel_role;
		@FindBy(xpath = "//textarea[@id='address']")
		WebElement address;
		@FindBy(xpath = "//button[normalize-space()='Add']")
		WebElement add_btn;
		@FindBy(xpath = "//button[normalize-space()='Cancel']")
		WebElement cancel_btn;
		
		//identify action on webelement
		public void click_adduser_btn() throws InterruptedException 
		{
			allUser_tab.click();
			Thread.sleep(2000);
		}
		
		public void click_addUser_btn() throws InterruptedException 
		{
			addUser_btn.click();
			Thread.sleep(2000);
		}
		
		public void select_institute() throws InterruptedException 
		{
			Actions action = new Actions(ldriver);
			action.moveToElement(sel_institute).click().build().perform();
			Thread.sleep(2000);
			Actions keyDown = new Actions(ldriver); 
			keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
			Thread.sleep(4000);
		}
		
		public void enterUser_name(String enterUser_name) 
		{
			user_name.sendKeys(enterUser_name);
		}
		
		public void enterUser_email(String enterUser_email) 
		{
			user_email.sendKeys(enterUser_email);
		}
		
		public void enterUser_phone(String enterUser_phone) 
		{
			user_phone.sendKeys(enterUser_phone);
		}
		
		public void enterUser_address(String enterUser_address) 
		{
			address.sendKeys(enterUser_address);
		}
		
		public void sel_role() throws InterruptedException 
		{
			Actions action = new Actions(ldriver);
			action.moveToElement(sel_role).click().build().perform();
			Thread.sleep(2000);
			Actions keyDown = new Actions(ldriver); 
			keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
			Thread.sleep(2000);
		}
		
		public void click_cancel() throws InterruptedException 
		{
			cancel_btn.click();
			Thread.sleep(2000);
		}
		
		public void click_add() throws InterruptedException 
		{
			add_btn.click();
			Thread.sleep(2000);
		}
		

}
