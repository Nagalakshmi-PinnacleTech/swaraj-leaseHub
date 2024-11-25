package com.swaraj.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
	@FindBy(xpath = "//div[@class=\"center-header\"]/descendant::a[@class=\"topBarHead\" and normalize-space()='Tenants']") 
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
	@FindBy(xpath = "//button[@class=\"btn btn-CancelNext btn-green ml-3 \"]") 
	WebElement next_btn;
	
//	Agreement Detail page
	@FindBy(xpath = "//div[@id=\"react-select-14-placeholder\"]") 
	WebElement agreementType_DD;
	@FindBy(xpath = "//span[normalize-space()='Day dd-mm-yyyy']") 
	WebElement startDate_calPop_up;
	@FindBy(xpath = "//button[@class='rdrDay rdrDayStartOfMonth']//span[@class='rdrDayNumber']") 
	WebElement clickFirstdate;
	@FindBy(xpath = "//div[normalize-space()='Done']") 
	WebElement clickDone;
	@FindBy(xpath = "//input[@id='leaseDuration']") 
	WebElement leaseDuration;
	@FindBy(xpath = "//input[@id='depositAmt']") 
	WebElement depoAmt;
	@FindBy(xpath = "//input[@id='fileno']") 
	WebElement filenum;
	@FindBy(xpath = "//input[@id='firmName']") 
	WebElement firmName;
	@FindBy(xpath = "//input[@id='attachments']") 
	WebElement attachment;
	@FindBy(xpath = "//span[normalize-space()='Day dd-mm-yyyy']") 
	WebElement rentPayFromCalPopup;
	@FindBy(xpath = "//button[@class='rdrDay rdrDayWeekend rdrDayStartOfWeek']//span[contains(text(),'3')]") 
	WebElement click3date;
	@FindBy(xpath = "//div[normalize-space()='Done']") 
	WebElement clickDone2;
	@FindBy(xpath = "//textarea[@id='notes']") 
	WebElement notes;
	@FindBy(xpath = "//div[@id='react-select-15-placeholder']") 
	WebElement selectProp;
	@FindBy(xpath = "//div[@class='tenant-input-grid mb-1_5']//div//div[@class='tenant-input-container mt-2']//div[@class='reactSel__value-container css-5a92zu']") 
	WebElement selectUnit;
	@FindBy(xpath = "//div[@id='react-select-24-placeholder']") 
	WebElement storeType;
	@FindBy(xpath = "//div[@id='react-select-25-placeholder']") 
	WebElement category;
	@FindBy(xpath = "//button[normalize-space()='Add Property']") 
	WebElement addProp_btn;
	
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
	
	public void selectType() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(agreementType_DD).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
		Thread.sleep(2000);
	}
	
	public void click_startDt_CalPopup() 
	{
		startDate_calPop_up.click();
		clickFirstdate.click();
		clickDone.click();
	}
	
	public void enterleaseDuration(String agreeDuration) 
	{
		leaseDuration.sendKeys(agreeDuration);
	}
	
	public void enterdepoAmt(String enterdepoAmt) 
	{
		depoAmt.sendKeys(enterdepoAmt);
	}
	
	public void enterfileNum(String enterfileNum) 
	{
		filenum.sendKeys(enterfileNum);
	} 
	
	public void enterfirmName(String enterFirmName) 
	{
		firmName.sendKeys(enterFirmName);
	}
	
	public void uploadAttachment(String uploadAttachment) 
	{
		attachment.sendKeys(uploadAttachment);
	}
	
	public void rentPayDate() 
	{
		rentPayFromCalPopup.click();
		click3date.click();
		clickDone2.click();
	}
	
	public void writeNotes(String writeNotes) 
	{
		notes.sendKeys(writeNotes);
	}
	
	public void selecProp() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(selectProp).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
		Thread.sleep(2000);
	}
	
	public void selectUnit() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(selectUnit).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
		Thread.sleep(2000);
	}
	
	public void storeType() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(storeType).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
		Thread.sleep(2000);
	}
	
	public void category() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(category).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
		Thread.sleep(2000);
	}
	
	public void clickAddProp_btn() 
	{
		addProp_btn.click();
	}
	
}
