package driver_factory;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class DriverFactory {
		
	public static WebDriver driver;
	public static ChromeOptions options;
		
	public static void initializeBrowser(String browserName) {
		if(browserName.equals("chrome")) {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.EAGER);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
		}
		else {
			System.out.println("The browser doesnt match");
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
}
