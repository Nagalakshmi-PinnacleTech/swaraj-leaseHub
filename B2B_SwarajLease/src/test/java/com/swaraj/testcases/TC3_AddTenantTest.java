package com.swaraj.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.propertyPage;
import com.swaraj.pageobjects.tenantPage;
import com.swaraj.pageobjects.welcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC3_AddTenantTest extends BaseClass {
	
	@Test
	public void AddTenant() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		welcomePage wpg = new welcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		loginPage loginpg = new loginPage(driver);

		loginpg.enterEmailAddress("beta@gmail.com");
		logger.info("Entered email address");

		loginpg.enterPassword("beta@gmail.com@1");
		logger.info("Entered password");

		loginpg.clickLogIn();
		logger.info("Clicked on login button..");
		Thread.sleep(5000);

		logger.info("***************Add Tenant starts*****************");
			
		tenantPage tenantpg = new tenantPage(driver);
		//*****************Tenant Info*****************
		tenantpg.clickclose_icon();
		tenantpg.clickTenantTab();
		tenantpg.clickAddTenantBtn();
		tenantpg.enterTenantName("Tenant3");
		tenantpg.entertenatEmail("tenant3@gmail.com");
		tenantpg.enterPhoneNum("5566443322");
		tenantpg.enterIDnum_txt("123456789");
		tenantpg.enterTenantAddress("Mysore");
		tenantpg.click_Nextbtn();
		
		//*****************Agreement Details******************8
		tenantpg.selectType();
		tenantpg.click_startDt_CalPopup();
		tenantpg.standby_month();
		tenantpg.rentCollectionType();
		tenantpg.buffer_days();
		tenantpg.enterleaseDuration("6");
		tenantpg.enterfileNum("123");
		tenantpg.enterfirmName("xyz");
		tenantpg.uploadAttachment("C:\\Users\\Nagalakshmi S\\Downloads\\permsiision-Model.pdf");
		tenantpg.enterdepoAmt("40000");
//		tenantpg.rentPayDate();
		tenantpg.writeNotes("abcdefghiujklmnop");
		tenantpg.selecProp();
		tenantpg.selectUnit();
//		tenantpg.storeType();
//		tenantpg.category();
		tenantpg.clickAddProp_btn();
		tenantpg.scrollToBottom();
		tenantpg.nextBtn();
		
		//************Bills Info******************
		
	}

}
