package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tenantPage {
	WebDriver ldriver;
	private WebDriverWait wait;

	//constructor
	public tenantPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//identify webelements
	@FindBy(xpath = "//a[normalize-space()='Tenants']") 
	WebElement tenant_tab;
	@FindBy(xpath = "//button[normalize-space()='Add Tenant']//*[name()='svg']") 
	WebElement add_tenant_btn;
	@FindBy(xpath = "//input[@id='keyword']") 
	WebElement tenantName_txt;
	@FindBy(xpath = "//textarea[@id='userAddress' and @class='label-content']") 
	WebElement tenatAddress_txt;
	@FindBy(xpath = "//div[@class='tenant-input-container']//input[@id='keyword']") 
	WebElement phoneNum_txt;
	@FindBy(xpath = "//input[@id='email']") 
	WebElement tenatEmail_txt;
	@FindBy(xpath = "//input[@id='idno']") 
	WebElement IDnum_txt;
	
	@FindBy(xpath = "//button[normalize-space()='Next']") 
	WebElement next_btn;
	
	
	
	//identify action on webelement
	public void clickTenantTab() 
	{
		tenant_tab.click();
	}
	
	public void clickAddTenantBtn() 
	{
		add_tenant_btn.click();
	}
	
	public void enterTenantName(String TenantName) throws InterruptedException 
	{
		tenantName_txt.sendKeys(TenantName);
		Thread.sleep(3000);
	}
	
	public void enterTenantAddress(String TenantAddress) 
	{
		tenatAddress_txt.sendKeys(TenantAddress);
	}
	
	public void enterPhoneNum(String PhoneNum) 
	{
		phoneNum_txt.sendKeys(PhoneNum);
	}
	
	public void entertenatEmail(String tenatEmail) 
	{
		tenatEmail_txt.sendKeys(tenatEmail);
	}
	
	public void enterIDnum_txt(String IDnum) 
	{
		IDnum_txt.sendKeys(IDnum);
	}
	
	public void click_Nextbtn() 
	{
		next_btn.click();
	}
				

}
