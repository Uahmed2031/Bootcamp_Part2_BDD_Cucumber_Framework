package com.TN.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		features = "src/test/resources/feature_files/Login.feature",
		glue = {"com.TN.Step_Definitions", "hooks"},
		tags = "@TutorialsNinjaLogin",
		monochrome = true,
		plugin = {"pretty", "html:target/site/cucumber/cucumber.html", "json:target/cucumber1.json"}
		)

public class Runner_TestNG extends AbstractTestNGCucumberTests{
	
}
