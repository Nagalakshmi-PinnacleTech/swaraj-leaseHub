package com.swaraj.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.smokePage;
import com.swaraj.pageobjects.carryFWPage;
import com.swaraj.pageobjects.welcomePage;
import org.testng.Assert;

public class TC6_CheckCarryFwTest extends BaseClass{
	
	@Test
	public void CarryFW() throws IOException, InterruptedException 
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
		
		carryFWPage cfwpg = new carryFWPage(driver);
		cfwpg.lease_CF_btn();
		cfwpg.rent_CF_btn();
		cfwpg.bills_CF_btn();
	}
}
