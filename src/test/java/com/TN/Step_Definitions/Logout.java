package com.TN.Step_Definitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driver_factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
		
		public WebDriver driver;
		
		@Given("user navigates to the LoginPage")
		public void user_navigates_to_the_loginpage() {
			driver = DriverFactory.getDriver();
			driver.findElement(By.linkText("My Account")).click();
			driver.findElement(By.linkText("Login")).click();
		}

		@And("user enter the valid email {string}")
		public void user_enter_the_valid_email(String validEmailText) {
			driver.findElement(By.id("input-email")).sendKeys(validEmailText);
		}

		@And("user enter the valid password {string}")
		public void user_enter_the_valid_password(String validPasswordText) {
			driver.findElement(By.id("input-password")).sendKeys(validPasswordText);
		}

		@When("user clicks on the login button")
		public void user_clicks_on_the_login_button() {
			driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		}

		@Then("user is redirected to the AccountPage")
		public void user_is_redirected_to_the_accountpage() {
			Assert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		}
		
		@Then("user clicks on Logout button")
		public void user_clicks_on_logout_button() {
			driver.findElement(By.linkText("Logout")).click();
		}
		
		@And("user gets the message of Account Logout")
		public void user_gets_the_message_of_account_logout() {
			Assert.assertTrue(driver.findElement(By.xpath("//h1[text() = 'Account Logout']")).isDisplayed());
		}
		
	}
