package com.swaraj.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class propertyPage {
	
	WebDriver ldriver;

	//constructor
	public propertyPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	//identify webelements
	@FindBy(xpath = "(//a[@class='topBarHead'])[1]") 
	WebElement property_tab;
	
	@FindBy(xpath = "//button[normalize-space()='Add Property']//*[name()='svg']") 
	WebElement addproperty_btn;
	
	@FindBy(xpath = "//input[@id='propertyName']") 
	WebElement propName_txt1;
	@FindBy(xpath = "//textarea[@id='propertyAddress']") 
	WebElement propAdds_txt;
	@FindBy(xpath = "//span[normalize-space()='Select Type']") 
	WebElement type_DD;
	@FindBy(xpath = "//div[@class=' css-78rtvi']") 
	WebElement state_DD;
	@FindBy(xpath = "//span[normalize-space()='Select Location']") 
	WebElement location_DD;
	
	@FindBy(xpath = "//input[@id='unitName']") 
	WebElement unitName_txt;
	@FindBy(xpath = "//textarea[@id='unitDesc']") 
	WebElement unitDesc_txt;
	@FindBy(id = "unitRentPerMonth")
	WebElement unitRentPM_txt;
	@FindBy(xpath = "//input[@id='unitInc']")
	WebElement unitIncPrct_txt;
	
	@FindBy(xpath = "//body/div[@id='modal-hook']/div[@class='modal-container modal-centered property-modal']/form[@class='modal-scrollable mt-4']/div[1]/div[1]/div[1]/input[1]") 
	WebElement areaSqft_txt;
	@FindBy(xpath = "(//input[@class=\"label-content\"])[5]") 
	WebElement marketRate_txt;
	
	
	//identify action on webelement
	
	public void enterPropName(String propName) 
	{
		propName_txt1.sendKeys(propName);
	}


	public void enterPropAdds(String propAdds) 
	{
		propAdds_txt.sendKeys(propAdds);
	}
	
	public void selectType(String text) 
	{
		Select obj1=new Select(type_DD);
		obj1.selectByVisibleText(text);
	}
	
	public void selectState(String text) 
	{
		Select obj2=new Select(state_DD);
		obj2.selectByVisibleText(text);
	}
	
	public void selectLocation(String text) 
	{
		Select obj3=new Select(location_DD);
		obj3.selectByVisibleText(text);
	}
	
	public void enterunitName_txt(String unitName) 
	{
		unitName_txt.sendKeys(unitName);
	}
	
	public void enterunitDesc_txt(String unitDes) 
	{
		unitDesc_txt.sendKeys(unitDes);
	}
	
	public void enterunitIncPrct_txt(String unitInt) 
	{
		unitIncPrct_txt.sendKeys(unitInt);
	}

	


}
