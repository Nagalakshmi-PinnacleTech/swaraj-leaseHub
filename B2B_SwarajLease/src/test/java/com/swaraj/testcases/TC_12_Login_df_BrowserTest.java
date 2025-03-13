package com.swaraj.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.swaraj.testcases.BaseTest;
import com.swaraj.pageobjects.login_df_browserPage;
import com.swaraj.reports.TestListener;

public class TC_12_Login_df_BrowserTest extends BaseTest{
	@Test
	public void testLogin() {
		
		login_df_browserPage loginPage = PageFactory.initElements(driver, login_df_browserPage.class);
		loginPage.login(userName, password);
		
	}

}
