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

		loginpg.enterEmailAddress("newuser@gmail.com");
		logger.info("Entered email address");

		loginpg.enterPassword("newuser@gmail.com@1");
		logger.info("Entered password");

		loginpg.clickLogIn();
		logger.info("Clicked on login button..");
		Thread.sleep(5000);

		logger.info("***************Add Tenant starts*****************");
			
		tenantPage tenantpg = new tenantPage(driver);
		//Tenant Info
		tenantpg.clickTenantTab();
		tenantpg.clickAddTenantBtn();
		tenantpg.enterTenantName("Tenant3");
		tenantpg.entertenatEmail("tenant2@gmail.com");
		tenantpg.enterPhoneNum("5566443322");
		tenantpg.enterIDnum_txt("123456789");
		tenantpg.enterTenantAddress("Mysore");
		tenantpg.click_Nextbtn();
		
		//Agreement Details
		tenantpg.selectType();
		tenantpg.click_startDt_CalPopup();
		tenantpg.enterleaseDuration("6");
		tenantpg.enterdepoAmt("40000");
		tenantpg.enterfileNum("123");
		tenantpg.enterfirmName("xyz");
		tenantpg.uploadAttachment("C:\\Users\\Nagalakshmi S\\Downloads\\c17e51b7-1a2b-4655-840a-8f30ffd1679a (1).pdf");
		tenantpg.rentPayDate();
		tenantpg.writeNotes("abcdefghiujklmnop");
		tenantpg.selecProp();
		tenantpg.selectUnit();
//		tenantpg.storeType();
//		tenantpg.category();
		tenantpg.clickAddProp_btn();
		
	}

}
