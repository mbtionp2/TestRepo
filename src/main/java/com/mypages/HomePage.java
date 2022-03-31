package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	private By header = By.className("private=page__title");

	public HomePage(WebDriver driver) { // this is a constructor we have to create 
		super(driver);
	}
	
	public WebElement getHeader() {
		return getElement(header);
	}
	
	// page actions
	
	public String getHomePageTitle() {
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		return getPageHeader(header);
	}
	

}
