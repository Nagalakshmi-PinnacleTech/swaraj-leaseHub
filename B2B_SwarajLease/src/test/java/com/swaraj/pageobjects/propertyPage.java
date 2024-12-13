package com.swaraj.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class propertyPage {
	
	WebDriver ldriver;
	private WebDriverWait wait;

	//constructor
	public propertyPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//identify webelements
//		@FindBy(xpath = "//div[@class=\"center-header\"]/descendant::a[@class=\"topBarHead\" and normalize-space()='Property']") 
		@FindBy(css = "#property-admin")
		WebElement property_tab;
		
		@FindBy(xpath = "//button[normalize-space()='Add Property']//*[name()='svg']") 
		WebElement addproperty_btn;
		
		@FindBy(xpath = "//input[@id='propertyName']") 
		WebElement propName_txt1;
		@FindBy(xpath = "//textarea[@id='propertyAddress']") 
		WebElement propAdds_txt;
		
		@FindBy(xpath = "//span[normalize-space()='Select Type']") 
		WebElement type_DD;
//		@FindBy(xpath = "//div[@class=' css-14s42b7-singleValue']") 
//		WebElement commercial_DD;
		
		@FindBy(xpath = "//div[@class='reactSel__input-container css-78rtvi']") 
		WebElement state_DD;
		@FindBy(xpath = "//*[text()='Karnataka']") 
		WebElement karnataka_DD;
		
		@FindBy(className = "reactSel__control css-1uwol08-control") 
		WebElement location_DD;		
		@FindBy(xpath = "//div[contains(@class,'css-14s42b7-singleValue')][normalize-space()='Loc1']") 
		WebElement Loc1_DD;
		
		@FindBy(xpath = "//input[@id='unitName']") 
		WebElement unitName_txt;
		@FindBy(xpath = "//textarea[@id='unitDesc']") 
		WebElement unitDesc_txt;
		@FindBy(id = "unitRentPerMonth")
		WebElement unitRentPM_txt;
		@FindBy(xpath = "//input[@id='unitInc']")
		WebElement unitIncPrct_txt;
		@FindBy(xpath = "//div[@class=' ']//input[@id='unitName']") 
		WebElement areaSqft_txt;
		@FindBy(xpath = "(//input[@class=\"label-content\"])[5]") 
		WebElement marketRate_txt;
		
		@FindBy(xpath = "//button[normalize-space()='Add Another Unit']") 
		WebElement AddAnotherUnit_btn;
		
		
		//identify action on webelement
		public void clickPropTab() throws InterruptedException 
		{
			Thread.sleep(2000);
			property_tab.click();
			Thread.sleep(2000);
//			Actions action = new Actions(ldriver);
//			action.moveToElement(property_tab).click().build().perform();
//			
		}
		
		public void clickAddproperty_btn() 
		{
			addproperty_btn.click();
		}
		
//		pop-up
		public void enterPropName(String propName) 
		{
			propName_txt1.sendKeys(propName);
		}

		public void enterPropAdds(String propAdds) 
		{
			propAdds_txt.sendKeys(propAdds);
		}
		
		//select property type
		public void selectType() throws InterruptedException 
		{
			Actions action = new Actions(ldriver);
			action.moveToElement(type_DD).click().build().perform();
			Thread.sleep(2000);
			Actions keyDown = new Actions(ldriver); 
			keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
			Thread.sleep(2000);
		}
		
		//select state
		public void clickstate_DD() throws InterruptedException 
		{
			Actions action = new Actions(ldriver);
			action.moveToElement(state_DD).click().build().perform();
			Thread.sleep(2000);
		}
			
		public void clickkar_DD() throws InterruptedException
		{
			Actions action1 = new Actions(ldriver);
			action1.moveToElement(karnataka_DD).click().build().perform();
		}
		
		//select location
		public void clicklocation_DD() throws InterruptedException 
		{
			Actions action = new Actions(ldriver);
			action.moveToElement(location_DD).click().build().perform();
			Thread.sleep(2000);
			Actions keyDown = new Actions(ldriver); 
			keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.DOWN, Keys.ENTER)).perform();
			Thread.sleep(2000);
		}
		//unit detail
		public void enterunitName_txt(String unitName) 
		{
			unitName_txt.sendKeys(unitName);
		}
		
		public void enterunitDesc_txt(String unitDes) 
		{
			unitDesc_txt.sendKeys(unitDes);
		}
		public void enterunitRentPM_txt(String unitRentPM) 
		{
			unitRentPM_txt.sendKeys(unitRentPM);
		}
		
		public void enterunitIncPrct_txt(String unitInt) 
		{
			unitIncPrct_txt.sendKeys(unitInt);
		}
		
		public void enterareaSqft_txt(String areaSqft) 
		{
			areaSqft_txt.sendKeys(areaSqft);
		}
		public void entermarketRate_txt(String marketRate) throws InterruptedException 
		{
			unitIncPrct_txt.sendKeys(marketRate);
			Thread.sleep(4000);
		}
		
		public void clickAddAnotherUnit_btn() 
		{
			AddAnotherUnit_btn.click();
		}

	


}
