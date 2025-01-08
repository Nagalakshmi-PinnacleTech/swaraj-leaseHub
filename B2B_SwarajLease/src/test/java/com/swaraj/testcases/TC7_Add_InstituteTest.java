package com.swaraj.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.welcomePage;
import com.swaraj.pageobjects.add_InstitutePage;

public class TC7_Add_InstituteTest extends BaseClass{
	@Test
	public void Smoke() throws IOException, InterruptedException 
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
		
		add_InstitutePage insti=new add_InstitutePage(driver);
		insti.allInstitute_tab();
		insti.enterfirstname_txt("InstitutionAuto");
		insti.enterphone_txt("9988776655");
		insti.enteremail_txt("InstitutionAuto@gmail.com");
		insti.enteraddress_txt("Karnataka");
		insti.enterdescription_txt("äbcdefghijklmnopqrstuvwxyz");
		insti.enterbilling_txt("50000");
		insti.click_sub_start();
		insti.click_sub_end();
		
		
		
		
		
		
		}
}
