package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class add_InstitutePage {
	WebDriver ldriver;
	private WebDriverWait wait;

	//constructor
	public add_InstitutePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//identify webelements
		@FindBy(xpath = "//a[normalize-space()='All Institute']")
		WebElement allInstitute_tab; 
		@FindBy(xpath = "//button[normalize-space()='Add Institute']")
		WebElement addInstitute_btn;
		@FindBy(xpath = "//input[@id='name']")
		WebElement firstname_txt;
		@FindBy(xpath = "//input[@id='phone']")
		WebElement phone_txt;
		@FindBy(xpath = "//input[@id='email']")
		WebElement email_txt;
		@FindBy(xpath = "//textarea[@id='address']")
		WebElement address_txt;
		@FindBy(xpath = "//textarea[@id='description']")
		WebElement description_txt;
		@FindBy(xpath = "//input[@id='amount']")
		WebElement billing_txt;
		@FindBy(xpath = "//div[@class='date-time-input']//div//span[@class='mr-4'][normalize-space()='Day dd-mm-yyyy']")
		WebElement sub_start;
		@FindBy(xpath = "//button[@class='rdrDay rdrDayStartOfMonth']//span[@class='rdrDayNumber']")
		WebElement sel_first; 
		@FindBy(xpath = "//div[normalize-space()='Done']")
		WebElement click_done;
		@FindBy(xpath = "//div[@class='form_input']//div//span[@class='mr-4'][normalize-space()='Day dd-mm-yyyy']")
		WebElement sub_end;
		@FindBy(xpath = "div[class='ant-popover css-1x0dypw css-1x0dypw ant-popover-placement-bottom'] button:nth-child(2) span:nth-child(2)")
		WebElement sel_firstdate;
//		@FindBy(xpath = "//div[@class='form_input']//div//span[@class='mr-4'][normalize-space()='Day dd-mm-yyyy']")
//		WebElement sub_end;
//		
		
		//identify action on webelement
		
		public void allInstitute_tab() throws InterruptedException 
		{
			allInstitute_tab.click();
			Thread.sleep(2000);
		}
		
		public void addInstitute_btn() throws InterruptedException 
		{
			addInstitute_btn.click();
			Thread.sleep(2000);
		}
		
		public void enterfirstname_txt(String firstname) 
		{
			firstname_txt.sendKeys(firstname);
		}
		
		public void enterphone_txt(String phone)
		{
			phone_txt.sendKeys(phone);
		}
		
		public void enteremail_txt(String email)
		{
			email_txt.sendKeys(email);
		}
		public void enteraddress_txt(String address)
		{
			address_txt.sendKeys(address);
		}

		public void enterdescription_txt(String description)
		{
			description_txt.sendKeys(description);
		}

		public void enterbilling_txt(String billing)
		{
			billing_txt.sendKeys(billing);
		}

		public void click_sub_start() throws InterruptedException 
		{
			sub_start.click();
			sel_first.click();
			Thread.sleep(5000);
			click_done.click();
		}
		
		public void click_sub_end() throws InterruptedException 
		{
			sub_end.click();
			sel_firstdate.click();
			Thread.sleep(5000);
			click_done.click();
		}

}
