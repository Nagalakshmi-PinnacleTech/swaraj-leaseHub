package com.swaraj.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.smokePage;
import com.swaraj.pageobjects.welcomePage;
import org.testng.Assert;

public class TC5_SmokeTest extends BaseClass{
	@Test
	public void Smoke() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		welcomePage wpg = new welcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		loginPage loginpg = new loginPage(driver);

		loginpg.enterEmailAddress("firstuser@gmail.com");
		logger.info("Entered email address");

		loginpg.enterPassword("firstuser@gmail.com@1");
		logger.info("Entered password");

		loginpg.clickLogIn();
		logger.info("Clicked on login button..");
		Thread.sleep(5000);
		
		smokePage smokepg = new smokePage(driver);
		
		smokepg.clickclose_icon();
		smokepg.clickPropTab();
		logger.info("Clicked on Property tab");
		
		smokepg.clicktenant_tab();
		logger.info("Clicked on tenant tab");
		
		smokepg.clickreports_tab();
		logger.info("Clicked on reports tab");
		
		smokepg.clicknotification_icon();
		logger.info("Clicked on notification icon");
		
		smokepg.clickannounce_icon();
		logger.info("Clicked on announcement icon");
		
		smokepg.clickprofile_dd();

	}
}
