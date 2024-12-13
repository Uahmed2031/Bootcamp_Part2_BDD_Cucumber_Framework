package com.TN.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	
public WebDriver driver;
	
	@Before
	public void open_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Given("user navigates to LandingPage")
	public void user_navigates_to_LandingPage() {
		driver.get("https://tutorialsninja.com/demo");
	}

	@When("user enters valid product {string}")
	public void user_enters_valid_product(String validProductText) {
		driver.findElement(By.xpath("//input[@name = 'search']")).sendKeys(validProductText);
	}
	
	@And("user clicks on search button")
	public void user_clicks_on_search_button() {
		driver.findElement(By.xpath("//button[@class = 'btn btn-default btn-lg']")).click();
	}
	
	@Then("user gets valid product info display in the ProductPage")
	public void user_gets_valid_product_info_display_in_the_ProductPage() {
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}
	
	@After
 	public void tearDown() {
 		driver.quit();
 	}
	
}