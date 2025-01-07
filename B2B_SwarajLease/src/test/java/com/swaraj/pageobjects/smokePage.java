package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class smokePage {
	WebDriver ldriver;
	private WebDriverWait wait;

	//constructor
	public smokePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//identify webelements
		@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/*[name()='svg'][1]")
		WebElement close_icon;
		@FindBy(css = "#property-admin")
		WebElement property_tab;
		@FindBy(xpath = "//div[@class=\"center-header\"]/descendant::a[@class=\"topBarHead\" and normalize-space()='Tenants']") 
		WebElement tenant_tab;
		@FindBy(xpath = "//a[@id='dashboard-admin']")
		WebElement dashboard_tab;
		@FindBy(xpath = "//a[@id='report-admin']")
		WebElement reports_tab;
		@FindBy(xpath = "//div[@data-title='Notification']//*[name()='svg']")
		WebElement notification_icon;
//		@FindBy(xpath = "//div[@data-title='Announcement']//*[name()='svg']")
		@FindBy(xpath = "(//div[@class='flex-center undefined undefined']//*[name()='svg'])[8]")
		WebElement announce_icon; 
		@FindBy(xpath = "//div[@class='backdrop backdrop-dark']")
		WebElement pop_outside;
		
		@FindBy(xpath = "(//*[name()='svg'])[11]")
		WebElement profile_dd;
		
		@FindBy(xpath = "//button[normalize-space()='Settings']")
		WebElement settings;
		@FindBy(xpath = " //a[normalize-space()='Advance Settings']")
		WebElement adv_settings;
		@FindBy(xpath = "//a[normalize-space()='Integrations']")
		WebElement set_integration;
		@FindBy(xpath = "//a[normalize-space()='Training']")
		WebElement set_training;
		@FindBy(xpath = "//a[normalize-space()='Support']")
		WebElement set_support;
		@FindBy(xpath = "//a[normalize-space()='Users']")
		WebElement set_users;
		
		@FindBy(xpath = "//button[normalize-space()='View Profile']")
		WebElement view_profile;
		@FindBy(css = "div[class='flex-center top-btns undefined'] svg")
		WebElement close_pop;
		@FindBy(xpath = "//button[normalize-space()='Dues']")
		WebElement dues;
		@FindBy(xpath = "//button[normalize-space()='Inc-Exp']")
		WebElement inc_exp;
		@FindBy(xpath = "//button[normalize-space()='Reset Password']")
		WebElement reset_pw;
		@FindBy(css = "div[class='flex-center top-btns undefined'] svg")
		WebElement close_pop2;
		@FindBy(xpath = "//button[normalize-space()='Logout']")
		WebElement logout;
		
		
		//identify action on webelement
		
		public void clickclose_icon() throws InterruptedException 
		{
			close_icon.click();
			Thread.sleep(2000);
		}
		
		public void clickdashboard_tab() throws InterruptedException 
		{
			Thread.sleep(2000);
			dashboard_tab.click();
			Thread.sleep(2000);
		}
		
		public void clickPropTab() throws InterruptedException 
		{
			Thread.sleep(2000);
			property_tab.click();
			Thread.sleep(2000);
			dashboard_tab.click();
		}
		
		public void clicktenant_tab() throws InterruptedException 
		{
			Thread.sleep(2000);
			tenant_tab.click();
			Thread.sleep(2000);
			dashboard_tab.click();
		}
		
		public void clickreports_tab() throws InterruptedException 
		{
			Thread.sleep(2000);
			reports_tab.click();
			Thread.sleep(2000);
			dashboard_tab.click();
		}
		
		public void clicknotification_icon() throws InterruptedException 
		{
			Thread.sleep(2000);
			notification_icon.click();
			Thread.sleep(2000);
			dashboard_tab.click();
		}
		
		public void clickannounce_icon() throws InterruptedException 
		{
//			Actions action = new Actions(ldriver);
//			action.moveToElement(announce_icon).click().build().perform();
			announce_icon.click();
			Thread.sleep(2000);
			pop_outside.click();
			Thread.sleep(2000);
		}
		
		public void clickprofile_dd() throws InterruptedException 
		{
			profile_dd.click();
			Thread.sleep(2000);
			settings.click();
		}
		
		public void setting_option() throws InterruptedException 
		{
			adv_settings.click();
			Thread.sleep(2000);
			set_integration.click();
			Thread.sleep(2000);
			set_training.click();
			Thread.sleep(2000);
			set_support.click();
			Thread.sleep(2000);
			set_users.click();
			Thread.sleep(3000);
		}
		
		public void Profile_dd_option() throws InterruptedException 
		{
			profile_dd.click();
			Thread.sleep(2000);
			view_profile.click();
			Thread.sleep(2000);
			close_pop.click();
			Thread.sleep(2000);
			profile_dd.click();
			Thread.sleep(2000);
			dues.click();
			Thread.sleep(2000);
			profile_dd.click();
			Thread.sleep(2000);
			inc_exp.click();
			Thread.sleep(2000);
			profile_dd.click();
			Thread.sleep(2000);
			reset_pw.click();
			Thread.sleep(2000);
			close_pop2.click();
			Thread.sleep(2000);
			profile_dd.click();
			Thread.sleep(2000);
			logout.click();
		}
		
		
}



