package com.TN.Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		dryRun = false,
		features = {"src/test/resources/feature_files"},
		glue = {"com.TN.Step_Definitions", "hooks"},
		tags = "@TutorialsNinjaLogin or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct or @TutorialsNinjaAddToCart or @TutorialsNinjaLogout",
		monochrome = true,
		//plugin = {"html:test-output\\ExtentReportBDD.html"}
		
		plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

		)

public class Runner_TestNG extends AbstractTestNGCucumberTests{
	
}
