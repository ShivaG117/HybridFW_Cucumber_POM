package app.Hooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Factory.DriverFactory;
import com.Utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppliationHooks {
	
	private DriverFactory df;
	private WebDriver driver;
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new ConfigReader();
		prop = configReader.init_prop();	
		
	}
	@Before(order = 1)
	public void launch() {
		String browserName = prop.getProperty("browser");
		String url = prop.getProperty("url");
		df = new DriverFactory();
		driver = df.init_driver(browserName);
		DriverFactory.getDriver().get(url);
	}
	
	@After (order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After (order = 1)
	public void tearDown(Scenario scenario) {
		String screenshotName = scenario.getName().replaceAll(" ", "_");
		byte [] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "img/png", screenshotName);
	}
	

}
