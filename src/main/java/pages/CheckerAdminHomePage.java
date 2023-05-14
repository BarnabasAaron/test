package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;

public class CheckerAdminHomePage extends Drivers {
	
	public CheckerAdminHomePage() {
		
		PageFactory.initElements(driver, this);

	}

	baseClass base = new baseClass();
	
	@FindBy(xpath = "//mat-label[text()='Settings']")
	public WebElement settingsIcon;
	
	public void selectSettings() {
		
		base.highLighterMethod(settingsIcon);
		base.click(settingsIcon);
	}
	
	
}
