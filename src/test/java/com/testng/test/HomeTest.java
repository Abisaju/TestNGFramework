package com.testng.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import com.testng.base.BaseTest;
import com.testng.pages.LoginPage;

public class HomeTest extends BaseTest{
	
	
	LoginPage loginpage;
	//Homepage homepage;
	WebDriver driver;

	@BeforeMethod
	public void beforemethod()
	{
		driver=getDriver("chrome");
		
		loginpage=new LoginPage(driver);
		//homepage=new HomePage(driver);
		
		
	}
//	@Test
	/*public void clickonHomeButton()
	{
	  loginpage.enterusername("abi@ts.com");
	  loginpage.enterpassword("PranavSaju084");
	}*/

}
