package com.TN.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import driver_factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	public WebDriver driver;
	
	@Given("user navigates to LoginPage")
	public void user_navigates_to_loginpage() {
		driver = DriverFactory.getDriver();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
	}

	@And("user enters valid email {string}")
	public void user_enters_valid_email(String validEmailText) {
		driver.findElement(By.id("input-email")).sendKeys(validEmailText);
	}

	@And("user enters valid password {string}")
	public void user_enters_valid_password(String validPasswordText) {
		driver.findElement(By.id("input-password")).sendKeys(validPasswordText);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Then("user is redirected to AccountPage")
	public void user_is_redirected_to_accountpage() {
		Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	}

}
