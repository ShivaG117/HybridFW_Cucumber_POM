package com.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.Waits;

public class HomePage {
	private WebDriver driver;
	Waits wiats = new Waits();
	
	//1. By locators
	private By emailId = By.name("uid");
	private By password = By.name("password");
	private By loginBtn = By.name("btnLogin");
	private By newCustomerLink = By.xpath("//*[text()='New Customer']");
	private By editCustomerLink = By.xpath("//*[text()='Edit Customer']");
	private By deleteCustomerLink = By.xpath("//*[text()='Delete Customer']");
	private By newAccLink = By.xpath("//*[text()='New Account']");
	private By editAccLink = By.xpath("//*[text()='Edit Account']");
	private By delAccLink = By.xpath("//*[text()='Delete Account']");
	private By miniStatement = By.xpath("//*[text()='Mini Statement']");
	private By customStatement = By.xpath("//*[text()='Customised Statement']");
	private By logoutLink = By.xpath("//*[text()='Log out']");
	
	
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
	
	public void clickNewCustomer() {
		wiats.waitForClickable(driver, newCustomerLink);
		driver.findElement(newCustomerLink).click();
	}
	
	public void clickEditCustomer() {
		wiats.waitForClickable(driver, editCustomerLink);
		driver.findElement(editCustomerLink).click();
	}
	
	public void clickDeleteCustomer() {
		wiats.waitForClickable(driver, deleteCustomerLink);
		driver.findElement(deleteCustomerLink).click();
	}
	
	public void clickNewAcc() {
		wiats.waitForClickable(driver, newAccLink);
		driver.findElement(newAccLink).click();
	}
	
	public void clickEditAcc() {
		wiats.waitForClickable(driver, editAccLink);
		driver.findElement(editAccLink).click();
	}
	
	public void clickDelAcc() {
		wiats.waitForClickable(driver, delAccLink);
		driver.findElement(delAccLink).click();
	}
	
	public void clickMiniStatement() {
		wiats.waitForClickable(driver, miniStatement);
		driver.findElement(miniStatement).click();
	}
	
	public void customStatement() {
		wiats.waitForClickable(driver, customStatement);
		driver.findElement(customStatement).click();
	}
	
	public void clickLogout() {
		wiats.waitForClickable(driver, logoutLink);
		driver.findElement(logoutLink).click();
	}
	

}
