/**
 * 
 */
package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author user
 *
 */
public class LoginPage extends BasePage {
	
	// page locators- w/o using @FindBy
	// website= hubspot.com
	
	private By emailId = By.id("username");
	private By password = By.id("password");
	private By loginButton = By.id("loginBtn");
	private By header = By.xpath("//i18n-string[@data-key='login.signupLink.text']");

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//getters= concept of encapsulation- how to access private variable with the help of public variable
	//To import getters and setters right click-source-generate getters and setters. We removed all the setters methods. not mandatory.
	//In methods we can replace By with how we want to getEmailId- it's by WebElement so change the return type to WebElement & remove By
	// WebElement returns getElement method defined in BasePage. SO add getElement in betn return & emailId and put emailId in bracket
 // Same way do it for all methods add WebElement and return getElement and in brackets relative elements.
	/**
	 * @return the emailId
	 */
	public WebElement getEmailId() {
		return getElement (emailId);
	}


	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement (password);
	}


	/**
	 * @return the loginButton
	 */
	public WebElement getLoginButton() {
		return getElement (loginButton);
	}

	/**
	 * @return the header
	 */
	public WebElement getHeader() {
		return getElement (header);
	}
	
	//Now create another methods 
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username, String pwd) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(pwd);
		getLoginButton().click();
		return getInstance(HomePage.class);
	}

	//Create a loginpage method withour entering username and pwd(method overloading	
	
	public void doLogin() {
		getEmailId().sendKeys();
		getPassword().sendKeys();
		getLoginButton().click();
	}
	
	public void doLogin(String userCred) {
	if (userCred.contains("username")) {
		getEmailId().sendKeys(userCred.split(":")[1].trim());
	}else if(userCred.contains("password")) {
		getEmailId().sendKeys(userCred.split(":")[1].trim());
	}
	getLoginButton().click();
	}
	
	
	
	

}
