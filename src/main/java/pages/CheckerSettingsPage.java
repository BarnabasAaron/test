package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class CheckerSettingsPage extends Drivers {
	
	static baseClass base = new baseClass();

	public CheckerSettingsPage() {

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//mat-card-title[contains(text(),'Template Configuration Approval')]")
	public WebElement tempconfig_approval_btn;
	
	
	public void click_tempconfig_btn() throws InterruptedException

	{
		base.explicitWait(tempconfig_approval_btn);
		base.highLighterMethod(tempconfig_approval_btn);
		Assert.assertEquals(tempconfig_approval_btn.getText(), "Template Configuration Approval");
		base.click(tempconfig_approval_btn);
	}

}
