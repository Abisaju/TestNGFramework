package com.testng.test;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.testng.base.BaseTest;
import com.testng.pages.LoginPage;

public class LoginTest extends BaseTest{
	
LoginPage loginpage;
WebDriver driver;


@BeforeMethod
public void beforemethod()
{
	driver=getDriver("chrome");
	driver.get("https://login.salesforce.com/");
	loginpage=new LoginPage(driver);
	//loginpage.explicitwait(null);
	
	PageFactory.initElements(driver,driver);
	
}

@Test(priority=2)

public void validlogin()
{
 	
  loginpage.entervalidusername("abi@ts.com");
  loginpage.entervalidpassword("PranavSaju084");
  loginpage.loginclick();
 
  //loginpage.explicitwait(null);

	
}
@Test(priority=1)
public void loginwithinvalidpassword()
{
loginpage.entervalidusername("abi@ts.com");
loginpage.enterwrongpassword("PranavSaju0841");
loginpage.loginclick();

}
@Test(priority=4)
public void forgotpassword()
{
	loginpage.forgetpassword("abi@ts.com");
	
}
@Test(priority=5)
public void passworderrormessage()
{
	loginpage.WrongUserNamePassword();
	//Thread.sleep(null);
	//loginpage.explicitwait();
	
}

@Test(priority=3)
public void RememberUsernameCheck()
{
	loginpage.entervalidusername("abi@ts.com");
	loginpage.entervalidpassword("PranavSaju084");
	//explicitWait(loginpage);
	loginpage.rememberme();
	
	//loginpage.loginclick();
	
	
}




@AfterMethod
public void close()

{
	//loginpage.explicitwait(null);
	driverclose();
}


}