package com.TN.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCart {
	
public WebDriver driver;
	
	@Given("user navigates to LandingPage to add valid product")
	public void user_navigates_to_LandingPage_to_add_valid_product() {
		driver = DriverFactory.getDriver();
	}

	@When("user enters product search {string}")
	public void user_enters_product_search(String validProductText) {
		driver.findElement(By.xpath("//input[@name = 'search']")).sendKeys(validProductText);
	}
	
	@And("user clicks on the search button")
	public void user_clicks_on_the_search_button() {
		driver.findElement(By.xpath("//button[@class = 'btn btn-default btn-lg']")).click();
	}
	
	@Then("user gets valid product details display in the ProductPage")
	public void user_gets_valid_product_details_display_in_the_ProductPage() {
		Assert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}
	
	@Then("user clicks on valid product {string}")
	public void user_clicks_on_valid_product(String validProductName) {
		driver.findElement(By.linkText(validProductName)).click();
	}
	
	@And("user clicks on add to cart button")
	public void user_clicks_on_add_to_cart_button() {
		driver.findElement(By.id("button-cart")).click();
	}
	
	@Then("user gets success message in the ProductPage")
	public void user_gets_success_message_in_the_productpage() throws Exception {
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'alert-success')]")).isDisplayed());
	}
		
}
