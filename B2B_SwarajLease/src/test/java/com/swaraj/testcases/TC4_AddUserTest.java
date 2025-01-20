package com.swaraj.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.tenantPage;
import com.swaraj.pageobjects.welcomePage;
import com.swaraj.pageobjects.homePage;
import com.swaraj.pageobjects.addUserPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC4_AddUserTest  extends BaseClass {
	
	@Test
	public void AddUser() throws IOException, InterruptedException 
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

		logger.info("***************Add User starts*****************");
		
//		tenantPage tpg = new tenantPage(driver);
//		tpg.clickclose_icon();
		
		homePage hpg = new homePage(driver);
		
		hpg.clickProfile_dd();
		hpg.clickSettings();
		hpg.clickUser_tab();
		
		addUserPage userpg = new addUserPage(driver);
		
		userpg.adduser_btn();
		userpg.enteruserName_txt("User_auto");
		userpg.enteruserEmail_txt("user1@gmail.com");
		userpg.enteruserPhone_txt("9988776655");
		userpg.enteruserAddress_txt("vvvvvvvvvvvvvvvvvvmmmmmmmmmmmmmmmmmmmmmmmmmcccccccccccc");
		userpg.userRole_dd();
		userpg.add_btn();
	}
}
