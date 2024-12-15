package com.testng.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	WebDriver driver;
	public WebDriver getDriver(String browser)
	{
		if(driver==null)
		{
			if(browser.equalsIgnoreCase("chrome"))
			{
		      WebDriverManager.chromedriver().setup();
		      driver=new ChromeDriver();
		    }
			else if(browser.equalsIgnoreCase("firefox"))
			{
				WebDriverManager.firefoxdriver().setup();
				driver=new FirefoxDriver();
			}
		}
		
		driver.get("https://login.salesforce.com/");	
		return driver;
	

}
	public void driverclose()
	{
		driver.close();
		driver=null;
	}
}

