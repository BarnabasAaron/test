package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(


		features = "src/test/resources/featureFiles/",

		glue = { "steps","hooks"},

		dryRun = !true,
		
		monochrome = true,
		
		
		plugin = {

				"pretty",

				"html:target/cucumber-reports/cucumber-pretty",

				"json:target/cucumber-reports/CucumberTestReport.json",
				
				"html:target/cucumber-reports/cucumber-html-report",

				"rerun:target/cucumber-reports/rerun.txt",
				
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})


public class CucumberRunnerTest extends AbstractTestNGCucumberTests  {
	
	//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html"
	
	

}


