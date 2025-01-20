package com.swaraj.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.welcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC1_WebsiteLoginTest extends BaseClass {
	
	@Test
	public void VerifyLogin() throws IOException 
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
		
	}
}
