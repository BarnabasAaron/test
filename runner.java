package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(


		features = "src/main/resources/featureFiles/QuickPayDirectEntryScreen.feature",

		glue = { "steps","hooks"},

		dryRun = !true,
		
		monochrome = true,
		
		tags = "@testrunnnnnnnnn",
		plugin = {

				"pretty",

				"html:target/cucumber-reports/cucumber-pretty",

				"json:target/cucumber-reports/CucumberTestReport.json",
				
				"html:target/cucumber-reports/cucumber-html-report",

				"rerun:target/cucumber-reports/rerun.txt",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})


public class runner extends AbstractTestNGCucumberTests  {
	
	//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html"

}


