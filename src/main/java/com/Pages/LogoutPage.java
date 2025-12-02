package com.Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.Factory.DriverFactory;

public class LogoutPage {
	private WebDriver driver;
	private Alert ale;
	
	HomePage homePage = new HomePage(DriverFactory.getDriver());
	
	public void Logout() {
		homePage.clickLogout();
	}
	
	public String alertTriggered() {
		ale = driver.switchTo().alert();
		String alertText = ale.getText();
		ale.accept();
		return alertText;
	}
	
	

}
