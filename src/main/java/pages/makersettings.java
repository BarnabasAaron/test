package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class makersettings extends Drivers {
	
	static baseClass base = new baseClass();

	public makersettings() {

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//mat-card-title[contains(text(),'Template Configuration')]")
	public WebElement tempconfig_btn;
	
	@FindBy(xpath = "//mat-card-title[contains(text(),'Parameter Configuration')]")
	public WebElement paramconfig_btn;
	
	
	
	public void click_tempconfig_btn() throws InterruptedException

	{
		base.explicitWait(tempconfig_btn);
		base.highLighterMethod(tempconfig_btn);
		Assert.assertEquals(tempconfig_btn.getText(), "Template Configuration");
		base.click(tempconfig_btn);
	}
	
	public void click_paramconfig_btn() throws InterruptedException

	{
		base.explicitWait(paramconfig_btn);
		base.highLighterMethod(paramconfig_btn);
		Assert.assertEquals(paramconfig_btn.getText(), "Parameter Configuration");
		base.click(paramconfig_btn);
	}
}
