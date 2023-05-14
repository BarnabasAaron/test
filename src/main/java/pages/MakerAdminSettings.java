package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;

public class MakerAdminSettings extends Drivers {
	
	public MakerAdminSettings() {
		
		PageFactory.initElements(driver, this);

	}
	
	static baseClass base = new baseClass();

	
	@FindBy(xpath = "//mat-card-title[text()='User Configuration']")
	public WebElement userConfiguration;
	
	@FindBy(xpath = "//mat-card-title[text()='Workflow Rule Configuration']")
	public WebElement workflowRuleConfiguration;
	
	public void clickUserConfiguration() {
		
		base.highLighterMethod(userConfiguration);
		base.click(userConfiguration);
		
	}
	
	public void clickWorkflowRuleConfiguration() {
		
		base.highLighterMethod(workflowRuleConfiguration);
		base.click(workflowRuleConfiguration);
		
	}

}
