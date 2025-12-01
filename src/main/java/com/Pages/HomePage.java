package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	private WebDriver driver;
	
	//1. By locators
	private By emailId = By.name("uid");
	private By password = By.name("password");
	private By loginBtn = By.name("btnLogin");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isHomePageLoaded() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(emailId)).isDisplayed()
		&& wait.until(ExpectedConditions.visibilityOfElementLocated(password)).isDisplayed()
		&& wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn)).isDisplayed();
		}
		catch (Exception e) {
			return false;
		}
	}
/*	
	public boolean emailIdDisplayed() {
		return driver.findElement(emailId).isDisplayed();
	}
	
	public boolean pwdIdDisplayed() {
		return driver.findElement(password).isDisplayed();
	}
	
	public boolean loginBtnDisplayed() {
		return driver.findElement(loginBtn).isDisplayed();
	}
*/
	public String getHomePageTitle() {
		return driver.getTitle();
	}

}
