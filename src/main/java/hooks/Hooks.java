package hooks;

import java.io.File;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import driver.Drivers;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Drivers {

	ExtentTest test;

	ExtentReports reports = new ExtentReports();

	
	
	@Before
	public void beforeScenario(Scenario scenario) {
//
//		spark.config().setTheme(Theme.DARK);
//		spark.config().setDocumentTitle("MyReport");
	
//		extent.attachReporter(spark);
		//ExtentTestManager.startTest("Scenario No . " + (x = x + 1) + " : " + scenario.getName());
	    //ExtentTestManager.getTest().log(Status.INFO, "Scenario No . "+ x + " Started : - " + scenario.getName());
	

		String browser = "chrome";
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:

			System.err.println("Driver is not defined");
		}


		driver.manage().window().maximize();



	}



	
	

	@After
	public void afterScenario(Scenario scenario) {
		Boolean result=scenario.isFailed();
		if(result==true) {
			
			
//			try {
//				final byte[] screenshot = ((TakesScreenshot) DriverManager.getDrivers()).getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot, "image/png", scenario.getName());
//				
//
//			} catch (WebDriverException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} 

				try {
					String screenshotName = scenario.getName().replaceAll(" ", "_");
					TakesScreenshot ts = (TakesScreenshot) driver;
					File source = ts.getScreenshotAs(OutputType.FILE);
					File dest = new File("./target/screenshots/" + scenario.getName() + scenario.getStatus() +".png");
					//FileUtils.copyFile(source, dest);
				    byte[] fileContent = FileUtils.readFileToByteArray(source);
				    
					scenario.attach(fileContent, "image/png", screenshotName);
				}

				catch (Exception e) {
					System.out.println("Exception while taking screenshot " + e.getMessage());
				}
			
			
		
				driver.close();
				reports.flush();
			}
	
		
		else 
			
		driver.close();
		reports.flush();
		
		
	}

		
//	@After(order = 1 )
//		
//	
//		public void takeScreenshotOnAFailure(Scenario scenario) {
//		Boolean result=scenario.isFailed();
//		if(result==true) {
//			TakesScreenshot ts = (TakesScreenshot)driver;
//			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
//			scenario.attach(src, "image/png", scenario.getName());
//			
//		}
//	}
	
	
}



