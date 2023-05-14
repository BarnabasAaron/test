package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;

public class CheckerAdminSettingsPage extends Drivers{
	
	public CheckerAdminSettingsPage() {
		
		PageFactory.initElements(driver, this);

	}

	baseClass base = new baseClass();
	@FindBy(xpath = "//mat-card-title[text()='Workflow Rule Configuration Approval']")
	public WebElement workflowRuleApprovalMenu;
	
	public void clickWorkflowRuleApproval() {
		
		base.highLighterMethod(workflowRuleApprovalMenu);
		base.click(workflowRuleApprovalMenu);
		
	}
	
	
}
