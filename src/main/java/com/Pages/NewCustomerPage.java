package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {
	private WebDriver driver;
	
	private By customerName = By.name("name");
	private By maleRadioBtn = By.xpath("//input[@name='rad1'][1]");
	private By femaleRadioBtn = By.xpath("//input[@name='rad1'][2]");
	private By dobField = By.id("dob");
	private By address = By.xpath("//*[@name='addr']");
	private By cityName = By.xpath("//*[@name='city']");
	private By stateName = By.xpath("//*[@name='state']");
	private By pincodeId = By.xpath("//*[@name='pinno']");
	private By telephone = By.xpath("//*[@name='telephoneno']");
	private By emailId = By.xpath("//*[@name='emailid']");
	private By submitBtn = By.xpath("//*[@name='sub']");
	private By resetBtn = By.xpath("//*[@name='res']");
	
	public NewCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void formFilling(String custName, String gen, String dob, String add, String city, 
			String state, String pincode, String mobile, String email) {
		driver.findElement(customerName).sendKeys(custName);
		if(gen.equals("M")) {
			driver.findElement(maleRadioBtn).click();
		}
		else if(gen.equals("F")) {
			driver.findElement(femaleRadioBtn).click();
		}
		driver.findElement(dobField).sendKeys(dob);
		driver.findElement(address).sendKeys(add);
		driver.findElement(cityName).sendKeys(city);
		driver.findElement(stateName).sendKeys(state);
		driver.findElement(pincodeId).sendKeys(pincode);
		driver.findElement(telephone).sendKeys(mobile);
		driver.findElement(emailId).sendKeys(email);		
		
	}
	public void clickSubmitButton() {
		driver.findElement(submitBtn).click();
	}
	public void clickResetButton() {
		driver.findElement(resetBtn).click();
	}
	
	public void getText() {

	}

}
