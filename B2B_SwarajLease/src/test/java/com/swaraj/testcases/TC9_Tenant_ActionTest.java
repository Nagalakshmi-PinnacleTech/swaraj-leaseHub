package com.swaraj.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.tenant_ActionPage;
import com.swaraj.pageobjects.welcomePage;

public class TC9_Tenant_ActionTest extends BaseClass {
	@Test
	public void ACtionTenant() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		welcomePage wpg = new welcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		loginPage loginpg = new loginPage(driver);

		loginpg.enterEmailAddress("seconduser@gmail.com");
		logger.info("Entered email address");

		loginpg.enterPassword("Aa@246810");
		logger.info("Entered password");

		loginpg.clickLogIn();
		logger.info("Clicked on login button..");
		Thread.sleep(5000);

		logger.info("***************Add Tenant starts*****************");
			
		tenant_ActionPage tenantpg = new tenant_ActionPage(driver);
		//*****************Tenant Info*****************
//		tenantpg.clickclose_icon();
		tenantpg.clickTenantTab();

	}
}
