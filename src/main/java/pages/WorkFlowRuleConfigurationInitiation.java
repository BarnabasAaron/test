package pages;

import java.util.List;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class WorkFlowRuleConfigurationInitiation extends Drivers {


	public WorkFlowRuleConfigurationInitiation() {

		PageFactory.initElements(driver, this);

	}

	baseClass base = new baseClass();

	@FindBy(xpath = "//mat-select[@placeholder='Application']")
	public WebElement applicationDropdown;


	@FindBy(xpath = "//mat-select[@placeholder='Message Type']")
	public WebElement messageTypeDropdown;

	@FindBy(xpath = "//mat-option[@role='option']")
	public WebElement messageTypeOption;

	@FindBy(xpath = "//mat-select[@placeholder='Event Type']")
	public WebElement eventTypeDropdown;

	@FindBy(xpath = "//input[@data-placeholder='Rule Name']")
	public WebElement ruleNameField;

	@FindBy(xpath = "//mat-option[@role='option']")
	public List<WebElement> selectOptions;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldSourceID'])[1]")
	public WebElement fieldFirstRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldSourceID'])[2]")
	public WebElement fieldSecondRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldSourceID'])[3]")
	public WebElement fieldThirdRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldSourceID'])[4]")
	public WebElement fieldFourthRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldOperator'])[1]")
	public WebElement operatorFirstRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldOperator'])[2]")
	public WebElement operatorSecondRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldOperator'])[3]")
	public WebElement operatorThirdRow;

	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldOperator'])[4]")
	public WebElement operatorFourthRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueData'])[1]")
	public WebElement valueFieldFirstRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueData'])[2]")
	public WebElement valueFieldSecondRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueData'])[3]")
	public WebElement valueFieldThirdRow;

	@FindBy(xpath = "(//input[@formcontrolname='valueData'])[4]")
	public WebElement valueFieldFourthRow;

	@FindBy(xpath = "//button[@mattooltip='Add New Clause']")
	public WebElement addClausebutton;

	@FindBy(xpath = "(//button[@mattooltip='Delete'])[1]")
	public WebElement deleteClauseButtonFirstRow;

	@FindBy(xpath = "(//button[@mattooltip='Delete'])[2]")
	public WebElement deleteClauseButtonSecondRow;

	@FindBy(xpath = "(//button[@mattooltip='Delete'])[3]")
	public WebElement deleteClauseButtonThirdRow;

	@FindBy(xpath = "(//button[@mattooltip='Delete'])[4]")
	public WebElement deleteClauseButtonFourthRow;

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

	@FindBy(xpath = "//mat-select[@formcontrolname='workflowSelectionDefinitionId']")
	public WebElement workFlowNameDropdown;
	
	@FindBy(xpath = "(//mat-select[@formcontrolname='stpStatusName'])")
	public WebElement stpStatusDropDown;

	@FindBy(xpath = "//input[@formcontrolname='sortOrder']")
	public WebElement sortOrderField;

	@FindBy(xpath = "//button[@type='reset']")
	public WebElement resetButton;

	@FindBy(xpath = "//button[@mattooltip='Data Save']")
	public WebElement submitButton;

	@FindBy(tagName = "table")
	public WebElement table;

	@FindBy(xpath = "//table//tr")
	public List<WebElement> tableRow;

	@FindBy(xpath = "//table//tr//td")
	public List<WebElement> tableData;
	
	@FindBy(xpath = "//button[@aria-label='Next page']")
	public WebElement nextPageButton;

	public static String Application,MessageType,EventType,RuleName,FieldOptionFirstRow,FieldOptionSecondRow,FieldOptionThirdRow,FieldOptionFourthRow,OperatorOptionFirstRow,OperatorOptionSecondRow,OperatorOptionThirdRow,OperatorOptionFourthRow;
	public static String ValueOptionFirstRow,ValueOptionSecondRow,ValueOptionThirdRow,ValueOptionFourthRow,AndOrFirst,AndOrSecond,AndOrThird;
	public static String WorkFlowName,StpStatus;
	public static String SortOrder;
	public static Boolean pageOneStatus=false,pageTwoStatus=false,pageThreeStatus=false,pageFourStatus=false;

	Actions actions = new Actions(driver);

	public String selectApplicationOption(String option) {

		Assert.assertEquals(applicationDropdown.isDisplayed(), true);
		base.click(applicationDropdown);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		Application = option;
		Assert.assertEquals(applicationDropdown.getText(), option);
		return Application;
	}

	public String selectMessageType(String option) {

		Assert.assertEquals(messageTypeDropdown.isDisplayed(), true);
		base.click(messageTypeDropdown);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		MessageType = option;
		Assert.assertEquals(messageTypeDropdown.getText(), option);
		return MessageType;
	}

	public String selectEventType(String option) {

		Assert.assertEquals(eventTypeDropdown.isDisplayed(), true);
		base.click(eventTypeDropdown);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		EventType = option;
		Assert.assertEquals(eventTypeDropdown.getText(), option);
		return EventType;

	}

	public String enterRuleName(String name) {

		base.highLighterMethod(ruleNameField);
		base.sendKeys(ruleNameField, name);
		Assert.assertEquals(ruleNameField.getAttribute("value"), name);
		RuleName = name;
		return RuleName;

	}

	public String selectFieldOptionsFirstRow(String option) {

		Assert.assertEquals(fieldFirstRow.isDisplayed(), true);
		base.click(fieldFirstRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		FieldOptionFirstRow = option;
		Assert.assertEquals(fieldFirstRow.getText(), option);
		return FieldOptionFirstRow;

	}

	public String selectFieldOptionsSecondRow(String option) {

		Assert.assertEquals(fieldSecondRow.isDisplayed(), true);
		base.click(fieldSecondRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		FieldOptionSecondRow = option;
		Assert.assertEquals(fieldSecondRow.getText(), option);
		return FieldOptionSecondRow;


	}

	public String selectFieldOptionsThirdRow(String option) {

		Assert.assertEquals(fieldThirdRow.isDisplayed(), true);
		base.click(fieldThirdRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		FieldOptionThirdRow = option;
		Assert.assertEquals(fieldThirdRow.getText(), option);
		return FieldOptionThirdRow;


	}

	public String selectFieldOptionsFourthRow(String option) {

		Assert.assertEquals(fieldFourthRow.isDisplayed(), true);
		base.click(fieldFourthRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		FieldOptionFourthRow = option;
		Assert.assertEquals(fieldFourthRow.getText(), option);
		return FieldOptionFourthRow;


	}


	public String selectOperatorOptionsFirstRow(String option) {

		Assert.assertEquals(operatorFirstRow.isDisplayed(), true);
		base.highLighterMethod(operatorFirstRow);
		base.click(operatorFirstRow);
			
			for(int i =0;i<selectOptions.size();i++) {
				
				try {
				if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {
					base.mouseHover(selectOptions.get(i));
					base.click(selectOptions.get(i));
					break;
				}
		} catch (StaleElementReferenceException e) {
			
			base.mouseHover(selectOptions.get(i));
			base.click(selectOptions.get(i));
			break;
			
		}
				
			}
		OperatorOptionFirstRow = option;
		Assert.assertEquals(operatorFirstRow.getText(), option);
		return OperatorOptionFirstRow;
			

	}


	public String selectOperatorOptionsSecondRow(String option) {

		Assert.assertEquals(operatorSecondRow.isDisplayed(), true);
		base.click(operatorSecondRow);
		for(int i =0;i<selectOptions.size();i++) {
			
			try {
				if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {
					base.mouseHover(selectOptions.get(i));
					base.click(selectOptions.get(i));
					break;
				}
			} catch (StaleElementReferenceException e) {
				// TODO Auto-generated catch block
				base.mouseHover(selectOptions.get(i));
				base.click(selectOptions.get(i));
				break;
			}
		}
		OperatorOptionSecondRow = option;
		Assert.assertEquals(operatorSecondRow.getText(), option);
		return OperatorOptionSecondRow;


	}


	public String selectOperatorOptionsThirdRow(String option) {

		Assert.assertEquals(operatorThirdRow.isDisplayed(), true);
		base.click(operatorThirdRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		OperatorOptionThirdRow = option;
		Assert.assertEquals(operatorThirdRow.getText(), option);
		return OperatorOptionThirdRow;


	}


	public String selectOperatorOptionsFourthRow(String option) {

		Assert.assertEquals(operatorFourthRow.isDisplayed(), true);
		base.click(operatorFourthRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		OperatorOptionFourthRow = option;
		Assert.assertEquals(operatorFourthRow.getText(), option);
		return OperatorOptionFourthRow;

	}

	public String selectValueOptionsFirstRow(String option) {

		Assert.assertEquals(valueFieldFirstRow.isDisplayed(), true);
		base.click(valueFieldFirstRow);
		if(selectOptions.isEmpty()==false) {
			
			for(int i =0;i<selectOptions.size();i++) {

				if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

					base.click(selectOptions.get(i));
					break;
				}
			}
		}
			else {
		
			// TODO Auto-generated catch block
			System.out.println("The value passed is "+option);
			base.sendKeys(valueFieldFirstRow, option);
			}

		ValueOptionFirstRow = option;
		Assert.assertEquals(valueFieldFirstRow.getAttribute("value"), option);
		return ValueOptionFirstRow;



	}

	public String selectValueOptionsSecondRow(String option) {

		Assert.assertEquals(valueFieldSecondRow.isDisplayed(), true);
		base.click(valueFieldSecondRow);
		if(selectOptions.isEmpty()==false) {
		
			for(int i =0;i<selectOptions.size();i++) {

				if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

					base.click(selectOptions.get(i));
					break;
				}
			}
		}
			else {
		
			// TODO Auto-generated catch block
			System.out.println("The value passed is "+option);
			base.sendKeys(valueFieldSecondRow, option);
			}
		ValueOptionSecondRow = option;
		Assert.assertEquals(valueFieldSecondRow.getAttribute("value"), option);
		return ValueOptionSecondRow;



	}

	public String selectValueOptionsThirdRow(String option) {

		Assert.assertEquals(valueFieldThirdRow.isDisplayed(), true);
		base.click(valueFieldThirdRow);
		if(selectOptions.isEmpty()==false) {
			
			for(int i =0;i<selectOptions.size();i++) {

				if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

					base.click(selectOptions.get(i));
					break;
				}
			}
		}
			else {
		
			// TODO Auto-generated catch block
			System.out.println("The value passed is "+option);
			base.sendKeys(valueFieldThirdRow, option);
			}

		ValueOptionThirdRow = option;
		Assert.assertEquals(valueFieldThirdRow.getText(), option);
		return ValueOptionThirdRow;



	}

	public String selectValueOptionsFourthRow(String option) {

		Assert.assertEquals(valueFieldFourthRow.isDisplayed(), true);
		base.click(valueFieldFourthRow);
		if(selectOptions.isEmpty()==false) {
			
			for(int i =0;i<selectOptions.size();i++) {

				if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

					base.click(selectOptions.get(i));
					break;
				}
			}
		}
			else {
		
			// TODO Auto-generated catch block
			System.out.println("The value passed is "+option);
			base.sendKeys(valueFieldFourthRow, option);
			}

		ValueOptionFourthRow = option;
		Assert.assertEquals(valueFieldFourthRow.getText(), option);
		return ValueOptionFourthRow;



	}

	public String selectAndORFieldFirst(String option) {

		Assert.assertEquals(AndOROperatorFirstRow.isDisplayed(), true);
		base.click(AndOROperatorFirstRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		AndOrFirst = option;
		Assert.assertEquals(AndOROperatorFirstRow.getText(), option);
		return AndOrFirst;

	}

	public String selectAndORFieldSecond(String option) {

		Assert.assertEquals(AndOROperatorSecondRow.isDisplayed(), true);
		base.click(AndOROperatorSecondRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		AndOrSecond = option;
		Assert.assertEquals(AndOROperatorSecondRow.getText(), option);
		return AndOrSecond;

	}

	public String selectAndORFieldThird(String option) {

		Assert.assertEquals(AndOROperatorThirdRow.isDisplayed(), true);
		base.click(AndOROperatorThirdRow);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		AndOrThird = option;
		Assert.assertEquals(AndOROperatorThirdRow.getText(), option);
		return AndOrThird;

	}

	public void clickAddNewClause() {

		Assert.assertEquals(addClausebutton.isDisplayed(), true);
		base.click(addClausebutton);

	}


	public void clickIsSTPCheckbox() {

		Assert.assertEquals(isSTPCheckbox.isDisplayed(), true);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", isSTPCheckbox);

	}

	public String selectWorkflowName(String option) {

		Assert.assertEquals(workFlowNameDropdown.isDisplayed(), true);
		base.click(workFlowNameDropdown);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {

				base.click(selectOptions.get(i));
				break;
			}
		}
		WorkFlowName = option;
		Assert.assertEquals(workFlowNameDropdown.getText(), option);
		return WorkFlowName;


	}
	
	public String selectStpStatus(String option) {
		
		Assert.assertEquals(stpStatusDropDown.isDisplayed(), true);
		base.highLighterMethod(stpStatusDropDown);
		base.click(stpStatusDropDown);
		for(int i =0;i<selectOptions.size();i++) {

			if(selectOptions.get(i).getText().equalsIgnoreCase(option)) {
				base.mouseHover(selectOptions.get(i));
				base.highLighterMethod(selectOptions.get(i));
				base.click(selectOptions.get(i));
				break;
			}
		}
		StpStatus = option;
		Assert.assertEquals(stpStatusDropDown.getText(), option);
		return StpStatus;
		
	}

	public String enterSortOrder(String order) {

		Assert.assertEquals(sortOrderField.isDisplayed(), true);
		base.sendKeys(sortOrderField, order);
		SortOrder = order;
		return SortOrder;

	}

	public void selectResetButton() {

		Assert.assertEquals(resetButton.isDisplayed(), true);
		base.click(resetButton);

	}

	public void selectSubmitButton() {

		Assert.assertEquals(submitButton.isDisplayed(), true);
		base.click(submitButton);

	}
	
	
	public void verifyDataInTable(String data) {
		
		base.explicitWait(table);
		for(int i =0;i<tableRow.size();i++) {
			if(tableRow.get(i).getText().contains(data)){
				base.mouseHover(tableRow.get(i));
				base.highLighterMethod(tableRow.get(i));
				break;
			}
		}
		
		
		for(int j =0;j<tableData.size();j++) {
			if(tableData.get(j).getText().contains(data)) {
				
				base.highLighterMethod(tableData.get(j));
				Assert.assertEquals(tableData.get(j).getText(),data+" ");
				pageOneStatus=true;
				break;
			}


		}
		
		if(pageOneStatus==false&&pageTwoStatus==false&&pageThreeStatus==false&&pageThreeStatus==false&&pageFourStatus==false&&nextPageButton.isEnabled()==true) {
			
			base.click(nextPageButton);
			base.explicitWait(table);
			for(int i =0;i<tableRow.size();i++) {
				if(tableRow.get(i).getText().contains(data)){
					base.highLighterMethod(tableRow.get(i));
					break;
				}
			}
			
			
			for(int j =0;j<tableData.size();j++) {
				if(tableData.get(j).getText().contains(data)) {
					
					base.highLighterMethod(tableData.get(j));
					Assert.assertEquals(tableData.get(j).getText(),data+" ");
					pageTwoStatus=true;
					break;
				}


			}
			
			
			
		}
		
		
if(pageOneStatus==false&&pageTwoStatus==false&&pageThreeStatus==false&&pageThreeStatus==false&&pageFourStatus==false&&nextPageButton.isEnabled()==true) {
			
			base.click(nextPageButton);
			base.explicitWait(table);
			for(int i =0;i<tableRow.size();i++) {
				if(tableRow.get(i).getText().contains(data)){
					base.highLighterMethod(tableRow.get(i));
					break;
				}
			}
			
			
			for(int j =0;j<tableData.size();j++) {
				if(tableData.get(j).getText().contains(data)) {
					
					base.highLighterMethod(tableData.get(j));
					Assert.assertEquals(tableData.get(j).getText(),data+" ");
					pageTwoStatus=true;
					break;
				}


			}
			
		}

if(pageOneStatus==false&&pageTwoStatus==false&&pageThreeStatus==false&&pageThreeStatus==false&&pageFourStatus==false&&nextPageButton.isEnabled()==true) {
	
	base.click(nextPageButton);
	base.explicitWait(table);
	for(int i =0;i<tableRow.size();i++) {
		if(tableRow.get(i).getText().contains(data)){
			base.highLighterMethod(tableRow.get(i));
			break;
		}
	}
	
	
	for(int j =0;j<tableData.size();j++) {
		if(tableData.get(j).getText().contains(data)) {
			
			base.highLighterMethod(tableData.get(j));
			Assert.assertEquals(tableData.get(j).getText(),data+" ");
			pageThreeStatus=true;
			break;
		}


	}
	
	
	
}

if(pageOneStatus==false&&pageTwoStatus==false&&pageThreeStatus==false&&pageThreeStatus==false&&pageFourStatus==false&&nextPageButton.isEnabled()==true) {
	
	base.click(nextPageButton);
	base.explicitWait(table);
	for(int i =0;i<tableRow.size();i++) {
		if(tableRow.get(i).getText().contains(data)){
			base.highLighterMethod(tableRow.get(i));
			break;
		}
	}
	
	
	for(int j =0;j<tableData.size();j++) {
		if(tableData.get(j).getText().contains(data)) {
			
			base.highLighterMethod(tableData.get(j));
			Assert.assertEquals(tableData.get(j).getText(),data+" ");
			pageFourStatus=true;
			break;
		}


	}
	
	
	
}




		
	}

}



















