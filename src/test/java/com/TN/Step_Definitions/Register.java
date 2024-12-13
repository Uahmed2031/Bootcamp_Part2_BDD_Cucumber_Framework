package com.TN.Step_Definitions;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import Utils.Util;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	
public WebDriver driver;
	
	@Before
	public void open_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
	}
	
	@Given("user navigates to RegisterPage")
	public void user_navigates_to_registerpage() {
		driver.findElement(By.linkText("Register")).click();
	}

	@And("user enters below mandatory fields")
	public void user_enters_below_mandatory_fields(DataTable datatable) {
		Map<String, String> dataMap = datatable.asMap(String.class, String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(dataMap.get("firstname"));
		driver.findElement(By.id("input-lastname")).sendKeys(dataMap.get("lastname"));
		driver.findElement(By.id("input-email")).sendKeys(Util.emailWithDateTimeStamp());
		driver.findElement(By.id("input-telephone")).sendKeys(dataMap.get("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(dataMap.get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(dataMap.get("confirmpassword"));	
	}
	
	@And("user selects Yes for subscribe newsletter radiobutton")
	public void user_selects_Yes_for_subscribe_newsletter_radiobutton() {
		driver.findElement(By.xpath("//input[@name = 'newsletter' and @value = '1']")).click();
	}
	
 	@And("user selects privacy policy checkbox")
 	public void user_selects_privacy_policy_checkbox() {
 		driver.findElement(By.name("agree")).click();
 	}
 	
 	@When("user clicks on Continue button")
 	public void user_clicks_on_continue_button() {
 		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
 	}
 	
 	@Then("user is re-directed to AccountSuccessPage")
 	public void user_is_redirected_to_accountsuccesspage() {
 		Assert.assertTrue(driver.findElement(By.xpath("//p[text() = 'Congratulations! Your new account has been successfully created!']")).isDisplayed());
  	}
 	
 	@After
 	public void tearDown() {
 		driver.quit();
 	}
 	
}