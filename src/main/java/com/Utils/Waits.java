package com.Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
	
	private int default_timeout = 20;
	
	
	//global wait with default timeout
	public WebDriverWait wait_util(WebDriver driver) {
		 return new WebDriverWait(driver, Duration.ofSeconds(default_timeout));
	}
	
	//wait with custom timeout
	public WebDriverWait wait_util(WebDriver driver, int sec) {
		return new WebDriverWait(driver, Duration.ofSeconds(sec));	
	}
	
	//wait for element to be visible
	public WebElement waitForVisible(WebDriver driver, WebElement element) {
		return wait_util(driver).until(ExpectedConditions.visibilityOf(element)); 
	}
	//wait for element to be clickable
	public WebElement waitForClickable(WebDriver driver, By element) {
		return wait_util(driver).until(ExpectedConditions.elementToBeClickable(element));
	}

}
