package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class WorkFlowRuleConfigurationApproval extends Drivers {


	public WorkFlowRuleConfigurationApproval() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(tagName = "table")
	public WebElement table;

	@FindBy(xpath = "//table//tr")
	public List<WebElement> tableRow;

	@FindBy(xpath = "//table//tr//td")
	public List<WebElement> tableData;

	@FindBy(xpath = "//input[@placeholder='Application']")
	public WebElement applicationDropdown;


	@FindBy(xpath = "//input[@placeholder='Message Type']")
	public WebElement messageTypeDropdown;


	@FindBy(xpath = "//input[@placeholder='Event Type']")
	public WebElement eventTypeDropdown;

	@FindBy(xpath = "//input[@placeholder='Rule Name']")
	public WebElement ruleNameField;


	@FindBy(xpath = "(//input[@formcontrolname='fieldSourceID'])[1]")
	public WebElement fieldFirstRow;

	@FindBy(xpath = "(//input[@formcontrolname='fieldSourceID'])[2]")
	public WebElement fieldSecondRow;

	@FindBy(xpath = "(//input[@formcontrolname='fieldSourceID'])[3]")
	public WebElement fieldThirdRow;

	@FindBy(xpath = "(//input[@formcontrolname='fieldSourceID'])[4]")
	public WebElement fieldFourthRow;

	@FindBy(xpath = "(//input[@formcontrolname='fieldOperator'])[1]")
	public WebElement operatorFirstRow;

	@FindBy(xpath = "(//input[@formcontrolname='fieldOperator'])[2]")
	public WebElement operatorSecondRow;

	@FindBy(xpath = "(//input[@formcontrolname='fieldOperator'])[3]")
	public WebElement operatorThirdRow;

	@FindBy(xpath = "(//input[@formcontrolname='fieldOperator'])[4]")
	public WebElement operatorFourthRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueDescription'])[1]")
	public WebElement valueFieldFirstRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueDescription'])[2]")
	public WebElement valueFieldSecondRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueDescription'])[3]")
	public WebElement valueFieldThirdRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueDescription'])[4]")
	public WebElement valueFieldFourthRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='operator'])[1]")
	public WebElement AndOROperatorFirstRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='operator'])[2]")
	public WebElement AndOROperatorSecondRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='operator'])[3]")
	public WebElement AndOROperatorThirdRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='operator'])[4]")
	public WebElement AndOROperatorFourthRow;

	@FindBy(xpath = "//input[@type='checkbox']")
	public WebElement isSTPCheckbox;

	@FindBy(xpath = "//input[@formcontrolname='workFlowName']")
	public WebElement workFlowNameDropdown;

	@FindBy(xpath = "//input[@formcontrolname='stpStatus']")
	public WebElement stpStatusDropDown;

	@FindBy(xpath = "//input[@formcontrolname='sortOrder']")
	public WebElement sortOrderField;
	
	@FindBy(xpath = "//span[text()='Approve']")
	public WebElement approveButton;
	
	@FindBy(xpath = "(//span[text()='Approve'])[2]")
	public WebElement approveButtonInPopup;
	
	@FindBy(xpath = "//span[text()='Reject']")
	public WebElement rejectButton;
	
	@FindBy(xpath = "(//span[text()='Reject'])[2]")
	public WebElement rejectButtonInPopup;
	
	@FindBy(xpath = "//input[@formcontrolname='Remarks']")
	public WebElement remarksFieldInPopup;
	
	@FindBy(xpath = "//div[@role='alert']")
	public WebElement alertPopup;

	//WorkFlowRuleConfigurationInitiation config = new WorkFlowRuleConfigurationInitiation();
	baseClass base = new baseClass();
	Actions actions = new Actions(driver);
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	public void selectEditIconofTable() {
		String ruleName=WorkFlowRuleConfigurationInitiation.RuleName;
		base.explicitWait(table);
//		for(int i =0;i<tableRow.size();i++) {
//			if(tableRow.get(i).getText().contains(ruleName)){
//				base.highLighterMethod(tableRow.get(i));
//				break;
//			}
//		}


		for(int j =0;j<tableData.size();j++) {
			if(tableData.get(j).getText().contains(ruleName)) {

				base.highLighterMethod(tableData.get(j+8));
				WebElement edit = tableData.get(j+8).findElement(By.tagName("button"));
				base.highLighterMethod(edit);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", edit);
				break;
			}


		}

	}

	public void verifyApplication() {

		base.highLighterMethod(applicationDropdown);
		Assert.assertEquals(applicationDropdown.getAttribute("value"), WorkFlowRuleConfigurationInitiation.Application);
	}

	public void verifyMessageType() {

		base.highLighterMethod(messageTypeDropdown);
		Assert.assertEquals(messageTypeDropdown.getAttribute("value"), WorkFlowRuleConfigurationInitiation.MessageType);

	}

	public void verifyEventType() {

		base.highLighterMethod(eventTypeDropdown);
		Assert.assertEquals(eventTypeDropdown.getAttribute("value"), WorkFlowRuleConfigurationInitiation.EventType);
	}

	public void verifyRuleName() {

		base.highLighterMethod(ruleNameField);
		Assert.assertEquals(ruleNameField.getAttribute("value"), WorkFlowRuleConfigurationInitiation.RuleName);

	}

	public void verifyfirstFieldValue() {

		base.highLighterMethod(fieldFirstRow);
		Assert.assertEquals(fieldFirstRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.FieldOptionFirstRow);

	}

	public void verifySecondFieldValue() {

		base.highLighterMethod(fieldSecondRow);
		Assert.assertEquals(fieldSecondRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.FieldOptionSecondRow);

	}

	public void verifyThirdFieldValue() {

		base.highLighterMethod(fieldThirdRow);
		Assert.assertEquals(fieldThirdRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.FieldOptionThirdRow);

	}

	public void verifyFourthFieldValue() {

		base.highLighterMethod(fieldFourthRow);
		Assert.assertEquals(fieldFourthRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.FieldOptionFourthRow);

	}

	public void verifyFirstOperatorFieldValue() {

		base.highLighterMethod(operatorFirstRow);
		Assert.assertEquals(operatorFirstRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.OperatorOptionFirstRow);

	}

	public void verifySecondOperatorFieldValue() {

		base.highLighterMethod(operatorSecondRow);
		Assert.assertEquals(operatorSecondRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.OperatorOptionSecondRow);

	}


	public void verifyThirdOperatorFieldValue() {

		base.highLighterMethod(operatorThirdRow);
		Assert.assertEquals(operatorThirdRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.OperatorOptionThirdRow);

	}


	public void verifyFourthOperatorFieldValue() {

		base.highLighterMethod(operatorFourthRow);
		Assert.assertEquals(operatorFourthRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.OperatorOptionFourthRow);

	}

	public void verifyFirstValueField() {

		base.highLighterMethod(valueFieldFirstRow);
		Assert.assertEquals(valueFieldFirstRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.ValueOptionFirstRow);

	}

	public void verifySecondValueField() {

		base.highLighterMethod(valueFieldSecondRow);
		Assert.assertEquals(valueFieldSecondRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.ValueOptionSecondRow);

	}

	public void verifyThirdValueField() {

		base.highLighterMethod(valueFieldThirdRow);
		Assert.assertEquals(valueFieldThirdRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.ValueOptionThirdRow);

	}

	public void verifyFourthValueField() {

		base.highLighterMethod(valueFieldFourthRow);
		Assert.assertEquals(valueFieldFourthRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.ValueOptionFourthRow);

	}
	
	public void verifyFirstAndOrField() {
		
		base.highLighterMethod(AndOROperatorFirstRow);
		Assert.assertEquals(AndOROperatorFirstRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.AndOrFirst);

	}
	
	public void verifySecondtAndOrField() {
		
		base.highLighterMethod(AndOROperatorSecondRow);
		Assert.assertEquals(AndOROperatorSecondRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.AndOrSecond);

	}
	
	public void verifyThirdAndOrField() {
		
		base.highLighterMethod(AndOROperatorThirdRow);
		Assert.assertEquals(AndOROperatorThirdRow.getAttribute("value"), WorkFlowRuleConfigurationInitiation.AndOrThird);

	}

	
	public void verifyIsSTPEnabled() {
		
		base.highLighterMethod(isSTPCheckbox);
		Assert.assertEquals(isSTPCheckbox.isSelected(), true);
		
	}
	
	public void verifyStpStatus() {
		
		base.highLighterMethod(stpStatusDropDown);
		Assert.assertEquals(stpStatusDropDown.getAttribute("value"), WorkFlowRuleConfigurationInitiation.StpStatus);

	}
	
	public void verifySortOrder() {
		
		base.highLighterMethod(sortOrderField);
		Assert.assertEquals(sortOrderField.getAttribute("value"), WorkFlowRuleConfigurationInitiation.SortOrder);
		
	}
	
	public void clickApprove() {
		
		base.highLighterMethod(approveButton);
		base.click(approveButton);
		base.explicitWait(approveButtonInPopup);
		base.highLighterMethod(approveButtonInPopup);
		base.click(approveButtonInPopup);
		
		
		
	}
	
	public void clickReject(String remarks) {
		
		base.highLighterMethod(rejectButton);
		base.click(rejectButton);
		base.sendKeys(remarksFieldInPopup, remarks);
		base.highLighterMethod(rejectButtonInPopup);
		base.click(rejectButtonInPopup);
		
		
	}
	
	public void approveWithRemarks(String remarks) {
		
		
		base.highLighterMethod(approveButton);
		base.click(approveButton);
		base.sendKeys(remarksFieldInPopup, remarks);
		base.highLighterMethod(approveButtonInPopup);
		base.click(approveButtonInPopup);
		
		
	}


}
