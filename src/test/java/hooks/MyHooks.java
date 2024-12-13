package hooks;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import Utils.ConfigReader;
import driver_factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {
	
	public WebDriver driver;
	
	@Before 
	public void open_application() throws Exception {
		Properties prop = ConfigReader.initializePropertiesFile();
		DriverFactory.initializeBrowser(prop.getProperty("browser"));
		driver =  DriverFactory.getDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}	
