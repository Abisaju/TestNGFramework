package com.testng.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    WebDriver driver;
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	 
	  

	    // Method for explicit wait
	    public void explicitWait(WebElement element) {
	        WebDriverWait wait = new WebDriverWait(driver,10);
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }


}

