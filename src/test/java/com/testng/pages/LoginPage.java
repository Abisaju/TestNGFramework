package com.testng.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.testng.base.BasePage;


public class LoginPage extends BasePage {
	
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="Login")
	WebElement login;
	
	@FindBy(id="error")
	WebElement er;
	
	@FindBy(xpath="//a[@title='Logout']")
	WebElement logout;
	@FindBy(id="userNavLabel")
	WebElement usermenu;
	
	@FindBy(xpath="//label[contains(text(), 'Remember')]")
	WebElement rememberme;
	
	@FindBy(id="forgot_password_link")
	WebElement forgetpwd;
	
	@FindBy(id="un")
	WebElement username1;
	
	@FindBy(id="continue")
	WebElement continuee;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
	public void entervalidusername(String strusername)
	{
		
		explicitWait(username);
	  username.sendKeys(strusername);
	}
	public void entervalidpassword(String strpassword)
	{
	  password.sendKeys(strpassword);
		
	}
	public void forgetpassword(String strusername)
	{
		explicitWait(forgetpwd);
		   forgetpwd.click();
		   username1.sendKeys(strusername);
		   continuee.click();
		  
		   
		  
	}
	public void WrongUserNamePassword() {
		explicitWait(username);
		username.sendKeys("123");
		password.sendKeys("22131");
		login.click();
	}
	public void rememberme()
	{
		
		   rememberme.click();
		   explicitWait(login);
		  login.click();
		  explicitWait(usermenu);
		   usermenu.click();
		   logout.click();
       
        
	}
	
	public void enterwrongpassword(String strpassword)
	{
		password.sendKeys(strpassword);
		password.clear();
		   
		   login.click();
		   
		   String str = er.getText();
		  System.out.println(str);
		  String expectedstring="Please enter your password.";
		  /* if(str.equals(expectedstring))
		   {
			   System.out.println("TC 1 PASS");
		   }
		   else
		   {
			   System.out.println("TC 1 FAIL");
		   }*/
		   Assert.assertEquals(str, expectedstring);
		  
	}
	
	public void loginclick()
	{
		login.click();
	}

	
	
	}


	
	

