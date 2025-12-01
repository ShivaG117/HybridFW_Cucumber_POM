package com.Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser) {
		
		System.out.println("browser value is: "+browser);
		
		if(browser.equalsIgnoreCase("chrome")) {
//			driver = new ChromeDriver();
			tlDriver.set(new ChromeDriver());		
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			tlDriver.set(new FirefoxDriver());		
		}
		else {
			System.out.println("Please enter the correct browser value: "+browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
		
	}
	

}
