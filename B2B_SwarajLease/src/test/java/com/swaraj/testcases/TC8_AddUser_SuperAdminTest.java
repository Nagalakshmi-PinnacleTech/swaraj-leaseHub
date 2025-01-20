package com.swaraj.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.swaraj.pageobjects.addUser_SuperAdminPage;
import com.swaraj.pageobjects.add_InstitutePage;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.welcomePage;

public class TC8_AddUser_SuperAdminTest extends BaseClass{
	@Test
	public void AddUser_sprAdmin() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		welcomePage wpg = new welcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		loginPage loginpg = new loginPage(driver);

		loginpg.enterEmailAddress("super@gmail.com");
		logger.info("Entered email address");

		loginpg.enterPassword("1234567890");
		logger.info("Entered password");

		loginpg.clickLogIn();
		logger.info("Clicked on login button..");
		Thread.sleep(5000);
		
		addUser_SuperAdminPage userSA=new addUser_SuperAdminPage(driver);
		userSA.click_adduser_btn();
		
		
	}
}
