package com.TN.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	
	public WebDriver driver;
	
	@Given("user navigates to LandingPage")
	public void user_navigates_to_LandingPage() {
		driver = DriverFactory.getDriver();
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
	
}