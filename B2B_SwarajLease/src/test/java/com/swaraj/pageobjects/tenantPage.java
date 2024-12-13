package com.swaraj.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
	private JavascriptExecutor js;

	//constructor
	public tenantPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//*************identify webelements*****************
	//___________Tenant Info page_________________
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/*[name()='svg'][1]")
	WebElement close_icon;
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
	
	//__________Agreement Detail page___________
	@FindBy(xpath = "//div[@id=\"react-select-14-placeholder\"]") 
	WebElement agreementType_DD;
	@FindBy(xpath = "//span[normalize-space()='Day dd-mm-yyyy']") 
	WebElement startDate_calPop_up;
	@FindBy(xpath = "//button[contains(@class,'rdrDay rdrDayWeekend rdrDayStartOfWeek rdrDayStartOfMonth')]//span[contains(@class,'rdrDayNumber')]") 
	WebElement clickFirstdate;
	@FindBy(xpath = "//div[normalize-space()='Done']") 
	WebElement clickDone;
	@FindBy(xpath = "//input[@id='leaseDuration']") 
	WebElement leaseDuration;
	@FindBy(xpath = "//div[contains(@class,'tenant-input-grid mb-1_5')]//div[4]//div[1]//div[1]//div[2]//div[1]//*[name()='svg']")
	WebElement standby_month;
	@FindBy(xpath = "(//*[name()='svg'][contains(@class,'css-8mmkcg')])[3]")
	WebElement rentCollectionType;
	@FindBy(xpath = "(//*[name()='svg'][contains(@class,'css-8mmkcg')])[4]")
	WebElement buffer_days;
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
	@FindBy(xpath = "//button[normalize-space()='Next']") 
	WebElement nextBtn;
	
	//___________Bills Info page__________
	@FindBy(xpath = "//div[@class='tenant-input-grid mb-1_5']//div[1]//div[1]//div[1]//div[2]//div[1]//*[name()='svg']") 
	WebElement blsPg_prop;
	@FindBy(xpath = "//body//div[@id='root']//div[@class='col-12']//div[@class='col-12']//div[2]//div[1]//div[1]//div[2]//div[1]") 
	WebElement blsPg_unit;
	
	
	//identify action on webelement
	public void clickclose_icon() throws InterruptedException 
	{
		close_icon.click();
		Thread.sleep(2000);
	}
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
	
	public void click_startDt_CalPopup() throws InterruptedException 
	{
		startDate_calPop_up.click();
		clickFirstdate.click();
		Thread.sleep(5000);
		clickDone.click();
	}
	
	public void enterleaseDuration(String agreeDuration) 
	{
		leaseDuration.sendKeys(agreeDuration);
	}
	
	public void standby_month() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(standby_month).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
		Thread.sleep(4000);
	}
	
	public void rentCollectionType() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(rentCollectionType).click().build().perform();
		Thread.sleep(3000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
		Thread.sleep(3000);
	}
	
	public void buffer_days() throws InterruptedException 
	{
		Actions action = new Actions(ldriver);
		action.moveToElement(buffer_days).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(ldriver); 
		keyDown.sendKeys(Keys.chord(Keys.DOWN,Keys.ENTER)).perform();
		Thread.sleep(2000);
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
		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
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
	
	public void scrollToBottom() {
		Actions actions = new Actions(ldriver);
		// Scroll down using Page Down key
		actions.sendKeys(Keys.PAGE_DOWN).perform();
    }
	
	public void nextBtn() 
	{
		nextBtn.click();
	}
	
}
