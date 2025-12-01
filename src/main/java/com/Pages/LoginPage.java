package com.Pages;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	private Alert alert;

	
	//1. By locators
	private By emailId = By.name("uid");
	private By password = By.name("password");
	private By loginBtn = By.name("btnLogin");
	
	//2. constructor of the page class
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//3. page actions: features(behaviour) of the page the form of methods:
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUsername(String username) {
		driver.findElement(emailId).sendKeys(username);
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(loginBtn).click();
	}
	public String alertTriggered() {
		alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		alert.accept();
		return alertMessage;

	}

}
