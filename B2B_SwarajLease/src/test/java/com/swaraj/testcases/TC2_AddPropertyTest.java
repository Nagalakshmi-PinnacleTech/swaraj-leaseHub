package com.swaraj.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.swaraj.pageobjects.loginPage;
import com.swaraj.pageobjects.propertyPage;
import com.swaraj.pageobjects.welcomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2_AddPropertyTest extends BaseClass{
	
	@Test
	public void VerifyLogin() throws IOException, InterruptedException 
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
		
		propertyPage proppg = new propertyPage(driver);
		
		proppg.clickPropTab();
		logger.info("Clicked on Property tab");
		
		proppg.clickAddproperty_btn();
		logger.info("Clicked on AddProperty button, Add property pop-up displayed");
		
		proppg.enterPropName("autoProperty");
		proppg.enterPropAdds("Udupi");
		
		proppg.selectType();
		proppg.clickstate_DD();
		proppg.clickkar_DD();
		proppg.clicklocation_DD();
		proppg.enterunitName_txt("unit1");
		proppg.enterunitDesc_txt("shopping complex");
		proppg.enterunitRentPM_txt("1000");
		proppg.enterunitIncPrct_txt("5");
		proppg.enterareaSqft_txt("1000");
		Thread.sleep(5000);
		proppg.entermarketRate_txt("10");
		Thread.sleep(2000);
		proppg.clickAddAnotherUnit_btn();
		Thread.sleep(2000);
		
		



	}

}
