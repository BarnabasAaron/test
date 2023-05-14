package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;

public class MakerAdminHomePage extends Drivers {

	static baseClass base = new baseClass();


	public MakerAdminHomePage() {

		PageFactory.initElements(driver, this);

	}
	Actions action=new Actions(driver);
	JavascriptExecutor executor = (JavascriptExecutor)driver;


	@FindBy(xpath = "//mat-label[.='Settings']")
	public WebElement settingsIcon;


	public void selectSettings() {		
		base.highLighterMethod(settingsIcon);
		executor.executeScript("arguments[0].click();", settingsIcon);
	}



}
