//Author:Barnabas

package pages;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class RealTimeCreditTransferInitiationPage extends Drivers {

	public RealTimeCreditTransferInitiationPage() {

		PageFactory.initElements(driver, this);

	}

	baseClass base = new baseClass();


	@FindBy(name = "departmentOption")
	public WebElement departmentField;

	@FindBy(xpath = "//div[@role='listbox']")
	public List<WebElement> departmentOptions;

	@FindBy(xpath = "//input[@formcontrolname='debtorAccountNumber']")
	public WebElement debtorAccountNumberField;

	@FindBy(xpath = "(//button[@mattooltip='Search by A/C Number'])[1]")
	public WebElement debtorAccountNumberSearch;

	@FindBy(xpath ="//mat-select[@formcontrolname='dAccType']")
	public WebElement debtorAccountType;

	@FindBy(xpath ="//input[@data-placeholder='Debitor Name']")
	public WebElement debtorNameField;

	@FindBy(xpath ="//input[@formcontrolname='debtorAgentID']")
	public WebElement debtorAgentIDField;

	@FindBy(xpath = "//input[@data-placeholder='Street Name']")
	public WebElement debtorStreetName;

	@FindBy(xpath = "//input[@formcontrolname='dpostCode']")
	public WebElement debtorPostalCode;

	@FindBy(xpath = "//input[@formcontrolname='dtownName']")
	public WebElement debtorTownName;

	@FindBy(xpath = "//mat-select[@formcontrolname='dcountry']")
	public WebElement debtorCountry;

	@FindBy(xpath = "//input[@formcontrolname='creditorAccountNumber']")
	public WebElement creditorAccountNumberField;

	@FindBy(xpath = "(//button[@mattooltip='Search by A/C Number'])[2]")
	public WebElement creditorAccountNumberSearch;

	@FindBy(xpath ="//mat-select[@formcontrolname='cAccType']")
	public WebElement creditorAccountType;

	@FindBy(xpath ="//mat-option[@role='option']")
	public List<WebElement> creditorAccountTypeOptions;

	@FindBy(xpath = "//input[@data-placeholder='Creditor Name']")
	public WebElement creditorNameField;

	@FindBy(xpath = "//input[@formcontrolname='creditorAgentID']")
	public WebElement creditorAgentIdField;

	@FindBy(xpath = "//input[@formcontrolname='creditorAgentName']")
	public WebElement creditorAgentNameField;

	@FindBy(xpath = "//input[@formcontrolname='cpostCode']")
	public WebElement creditorPostalCode;

	@FindBy(xpath = "//input[@formcontrolname='ctownName']")
	public WebElement creditorTownName;

	@FindBy(xpath = "//mat-select[@formcontrolname='ccountry']")
	public WebElement creditorCountry;

	@FindBy(xpath = "//div[@role='listbox']")
	public List<WebElement> creditorCountryOptions;

	@FindBy(xpath = "//input[@formcontrolname='settlementDate']")
	public WebElement settlementDate;

	@FindBy(xpath = "//button[@aria-label='Open calendar']")
	public WebElement settlementDateCalendarIcon;

	@FindBy(xpath = "//div[.=' 28 ']")
	public  WebElement lastDate;

	@FindBy(xpath = "//input[@formcontrolname='settledTransactionAmount']")
	public WebElement settledTransactionAmountField;

	@FindBy(xpath = "(//span[text()='AED'])[1]")
	public WebElement transactionAmountCurrency;
	
	@FindBy(xpath = "//mat-option[@role='option']")
	public List<WebElement> transactionAmountCurrencyOption;

	@FindBy(xpath = "//input[@formcontrolname='instructedAmount']")
	public WebElement instructedAmountField;

	@FindBy(xpath = "(//span[text()='AED'])[2]")
	public WebElement instructedAmountCurrency;
	
	@FindBy(xpath = "//mat-option[@role='option']")
	public List<WebElement> instructedAmountCurrencyOption;

	@FindBy(xpath = "//input[@formcontrolname='sendersCharge']")
	public WebElement sendersChargeField;

	@FindBy(xpath = "//mat-select[@formcontrolname='transactionType']")
	public WebElement transactionTypeField;

	//div[@role='listbox']
	@FindBy(tagName  = "mat-option")
	public List<WebElement> transactionTypeFieldOptions;

	@FindBy(xpath = "//mat-select[@formcontrolname='chargeType']")
	public WebElement chargeTypeField;

	@FindBy(xpath = "//div[@role='listbox']")
	public List<WebElement>chargeTypeFieldOptions;

	@FindBy(xpath = "//input[@formcontrolname='chargeAmount']")
	public WebElement chargeAmountField;

	@FindBy(xpath = "//input[@formcontrolname='vat']")
	public WebElement vatAmountField;

	@FindBy(xpath = "//input[@formcontrolname='totalAmount']")
	public WebElement totalAmountField;

	@FindBy(xpath = "//textarea[@formcontrolname='transactionRemarks']")
	public WebElement transactionRemarksField;

	@FindBy(className = "cust-value")
	public WebElement amountInWords;

	@FindBy(xpath = "//textarea[@formcontrolname='remarks']")
	public WebElement remarksField;

	@FindBy(xpath = "//button[@mattooltip='Data Field Clear']")
	public WebElement resetButton;
	
	//button[@mattooltip='Customer credit initiation']
	@FindBy(xpath = "//span[text()='Initiate']")
	public WebElement initiateButton;

	@FindBy(xpath = "//mat-error[text()=' Department is required ']")
	public WebElement departmentFieldError;

	@FindBy(xpath = "//mat-error[text()=' Debtor Account Number is required ']")
	public WebElement debtorAccountNumberError;

	@FindBy(xpath = "//mat-error[text()=' Creditor Account Number is required ']")
	public WebElement creditorAccountNumberError;

	@FindBy(xpath = "//mat-error[text()=' Creditor Name is required ']")
	public WebElement creditorNameError;

	@FindBy(xpath = "//mat-error[text()=' Creditor Agent ID is required ']")
	public WebElement creditorAgentIdError;

	@FindBy(xpath = "//mat-error[text()=' Creditor Agent Name is required ']")
	public WebElement creditorAgentNameError;

	@FindBy(xpath = "//mat-error[text()=' Settled Transaction Amount is required ']")
	public WebElement settledAmountError;

	@FindBy(xpath = "//mat-error[text()=' Instructed Transaction Amount is required ']")
	public WebElement instructedAmountError;

	@FindBy(xpath = "//mat-error[text()=' Transaction Type is required ']")
	public WebElement transactionTypeError;

	@FindBy(xpath = "//mat-error[text()=' Total Amount is required ']")
	public WebElement totalAmountError;


	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();


	public static String Department,DebtorAccountNumber,DebtorAccountType,DebtorName,DebtorAgentId,DebtorStreetName,DebtorTownName,DebtorCountry;
	public static String CreditorAccountNumber,CreditorAccountType,CreditorName,CreditorAgentID,CreditorAgentName,CreditorTownName,CreditorCountry;
	public String DebtorPostalCode,CreditorCountry1;


	public String CreditorPostalCode;
	public static String SettlementDate,SettlementDate1,TransactionType,ChargeType,TransactionRemarks,Remarks,TransactionAmountCurrency,InstructedAmountCurrency;
	public static String SettledAmount,SettleDAmount;



	public static String InstructedAmount,InstructeDAmount,VATAmount,TotalAmount,AmountInWords;

	JavascriptExecutor js = (JavascriptExecutor)driver;

	public static String SendersCharge;
	Actions actions = new Actions(driver);

	public static String ChargeAmount;

	public void clickDepartmentField() {

		Assert.assertEquals(departmentField.isDisplayed(), true);
		base.click(departmentField);

	}

	public String selectDepartmentFieldOptions(String options) {

		for(int j= 0;j<departmentOptions.size();j++) {

			if(departmentOptions.get(j).getText().contains(options)) {
				base.mouseHover(departmentOptions.get(j));
				base.click(departmentOptions.get(j));
				
				break;
			}
		}
		
		Department = departmentField.getText();
		System.out.println("The department value is"+Department);
		Assert.assertEquals(departmentField.getText(), options);
		return Department;
		

	}

	public String enterDatainDebtorACNumber(String accountNumber) {


		base.sendKeys(debtorAccountNumberField, accountNumber);
		DebtorAccountNumber = accountNumber;
		System.out.println("The debtor account number is" + DebtorAccountNumber);
		Assert.assertEquals(debtorAccountNumberField.getAttribute("value"), accountNumber);
		return DebtorAccountNumber;
	}

	public void searchDebtorAccount() {

		Assert.assertEquals(debtorAccountNumberSearch.isDisplayed(), true);
		base.click(debtorAccountNumberSearch);

	}

	public String verifyDebtorAccountType() {

		DebtorAccountType=debtorAccountType.getText();
		Assert.assertEquals(debtorAccountType.getText().isBlank(), false);
		System.out.println("The debtor Account type is "+DebtorAccountType);
		return DebtorAccountType;


	}

	public String verifyDebtorName() {

		DebtorName=debtorNameField.getAttribute("value");
		Assert.assertEquals(debtorNameField.getAttribute("value").isBlank(), false);
		System.out.println("The debtor name is "+DebtorName);
		return DebtorName;

	}

	public String verifyDebtorAgentId() {

		DebtorAgentId = debtorAgentIDField.getAttribute("value");
		System.out.println("The debtor Agent id is"+DebtorAgentId);
		Assert.assertEquals(debtorAgentIDField.getAttribute("value").isBlank(), false);
		return DebtorAgentId;

	}

	public String verifyDebtorStreetName() {

		DebtorStreetName = debtorStreetName.getAttribute("value");
		Assert.assertEquals(debtorStreetName.getAttribute("value").isBlank(), false);
		return DebtorStreetName;
	}

	public String verifyDebtorPostalCode() {

		DebtorPostalCode = debtorPostalCode.getAttribute("value");
		Assert.assertEquals(debtorPostalCode.getAttribute("value").isBlank(), false);
		return DebtorPostalCode;

	}

	public String verifyDebtorTownName() {

		DebtorTownName = debtorTownName.getAttribute("value");
		Assert.assertEquals(debtorTownName.getAttribute("value").isBlank(), false);
		return DebtorTownName;
	}

	public String verifyDebtorCountry() {

		DebtorCountry = debtorCountry.getText();
		Assert.assertEquals(debtorCountry.getText().isBlank(), false);	
		System.out.println("The debtor country is "+ DebtorCountry);
		return DebtorCountry;

	}

	public String enterCreditorAccountNumber(String accountNumber) {
		base.scrollToElement(creditorAccountNumberField);
		base.mouseHover(creditorAccountNumberField);
		base.highLighterMethod(creditorAccountNumberField);
		base.sendKeys(creditorAccountNumberField, accountNumber);
		CreditorAccountNumber = creditorAccountNumberField.getAttribute("value");
		System.out.println("The creditor Account number is "+CreditorAccountNumber);
		
		Assert.assertEquals(creditorAccountNumberField.getAttribute("value"), accountNumber);
		return CreditorAccountNumber;
	}


	public void searchCreditorAccountNumber() {

		Assert.assertEquals(creditorAccountNumberSearch.isDisplayed(), true);
		base.click(creditorAccountNumberSearch);
	}

	public String selectAccountType() {
		base.explicitWait(creditorAccountType);
		base.highLighterMethod(creditorAccountType);
		Assert.assertEquals(creditorAccountType.isDisplayed(), true);
		CreditorAccountType = creditorAccountType.getText();
		return CreditorAccountType;
	}

	public String selectAccountTypeOptions(String options) {

		for(int j= 0;j<creditorAccountTypeOptions.size();j++) {

			if(creditorAccountTypeOptions.get(j).getAttribute("value").equalsIgnoreCase(options)) {
				base.click(creditorAccountTypeOptions.get(j));
				CreditorAccountType = creditorAccountType.getAttribute("value");
				break;
			}
		}

		Assert.assertEquals(creditorAccountType.getAttribute("value"), options);
		return CreditorAccountType;

	}

	public String verifyCreditorName() {

		Assert.assertEquals(creditorNameField.isDisplayed(), true);
		CreditorName = creditorNameField.getAttribute("value");
		Assert.assertEquals(creditorNameField.getAttribute("value").isBlank(), false);
		return CreditorName;

	}
	
	public String changeCreditorName(String name) {
		
		base.sendKeys(creditorNameField, name);
		CreditorName = creditorNameField.getAttribute("value");
		Assert.assertEquals(creditorNameField.getAttribute("value").isBlank(), false);
		return CreditorName;
		
	}

	public String verifyCreditorAgentID() {

		Assert.assertEquals(creditorAgentIdField.isDisplayed(), true);
		CreditorAgentID = creditorAgentIdField.getAttribute("value");
		System.out.println("The creditor Agent ID is "+CreditorAgentID);
		Assert.assertEquals(creditorAgentIdField.getAttribute("value").isBlank(), false);
		return CreditorAgentID;
	}
	
	
	public String changeCreditorAgentID(String AgentID) {
		
		base.sendKeys(creditorAgentIdField, AgentID);
		CreditorAgentID = AgentID;
		System.out.println("The changed creditor id is "+ creditorAgentIdField.getAttribute("value"));
		Assert.assertEquals(creditorAgentIdField.getAttribute("value").isBlank(), false);
		return CreditorAgentID;
		
	}


	public String verifyCreditorAgentName() {

		Assert.assertEquals(creditorAgentNameField.isDisplayed(), true);
		CreditorAgentName = creditorAgentNameField.getAttribute("value");
		Assert.assertEquals(creditorAgentNameField.getAttribute("value").isBlank(), false);
		return CreditorAgentName;
	}
	
	
	public String changeCreditorAgentName(String name) {
		
		base.sendKeys(creditorAgentNameField, name);
		CreditorAgentName = creditorAgentNameField.getAttribute("value");
		Assert.assertEquals(creditorAgentNameField.getAttribute("value").isBlank(), false);
		return CreditorAgentName;
		
	}
	
	

	public String verifyCreditorPostalCode() {

		Assert.assertEquals(creditorPostalCode.isDisplayed(), true);
		CreditorPostalCode = creditorPostalCode.getAttribute("value");
		Assert.assertEquals(creditorPostalCode.getAttribute("value").isBlank(), false);
		return CreditorPostalCode;

	}

	public String verifyCreditorTownName() {

		Assert.assertEquals(creditorTownName.isDisplayed(), true);
		CreditorTownName = creditorTownName.getAttribute("value");
		Assert.assertEquals(creditorTownName.getAttribute("value").isBlank(), false);
		return CreditorTownName;
	}
	
	public String changeCreditorTownName(String townName) {
		
		base.sendKeys(creditorTownName, townName);
		CreditorTownName = creditorTownName.getAttribute("value");
		Assert.assertEquals(creditorTownName.getAttribute("value").isBlank(), false);
		return CreditorTownName;
		
	}

	public String verifyCreditorCountry() {


		CreditorCountry = creditorCountry.getText();
		Assert.assertEquals(creditorCountry.getText().isBlank(), false);
		System.out.println("The creditor country "+CreditorCountry);
		return CreditorCountry;

	}

	public String selectCreditorCountryOptions(String countryName) {
		
		base.mouseHover(creditorCountry);
		base.click(creditorCountry);
		for(int j= 0;j<creditorCountryOptions.size();j++) {

			if(creditorCountryOptions.get(j).getText().equalsIgnoreCase(countryName)) {
			
				base.mouseHover(creditorCountryOptions.get(j));
				base.click(creditorCountryOptions.get(j));
				
				break;
			}
		}
		CreditorCountry = creditorCountry.getText();
		System.out.println("The Creditor Country is "+CreditorCountry);
		Assert.assertEquals(creditorCountry.getText(), countryName);
		return CreditorCountry;

	}


	public String verifySettlementDate() {

		Assert.assertEquals(settlementDate.isDisplayed(), true);
		SettlementDate = settlementDate.getAttribute("value");
		Assert.assertEquals(settlementDate.getAttribute("value").isBlank(), false);
		return SettlementDate;

	}

	public String viewSettlementDate() {

		Assert.assertEquals(settlementDateCalendarIcon.isDisplayed(), true);
		base.mouseHover(settlementDateCalendarIcon);
		base.click(settlementDateCalendarIcon);
		base.click(lastDate);
		SettlementDate = settlementDate.getAttribute("value");
		Assert.assertEquals(settlementDate.getAttribute("value").isBlank(), false);
		System.out.println("The date is "+SettlementDate);
		return SettlementDate;


	}


	public String settledAmount(String amount) {
		//outward.waitforLoader();// Adding loader because got interception element error whih tried to click on loader
		base.scrollToElement(settledTransactionAmountField);
		Assert.assertEquals(settledTransactionAmountField.isDisplayed(), true);
		js.executeScript("arguments[0].click();", settledTransactionAmountField);
		base.sendKeys(settledTransactionAmountField, String.valueOf(amount));
		outward.waitforLoader();// Adding loader because got interception element error whih tried to click on loader
		SettledAmount = amount;
		SettleDAmount = settledTransactionAmountField.getAttribute("value");
		System.out.println("The settle amount is "+SettleDAmount);
		Assert.assertEquals(settledTransactionAmountField.getAttribute("value").isBlank(), false);
		return SettledAmount;

	}


	public String verifySettledAmountCurrency() {

		Assert.assertEquals(transactionAmountCurrency.isDisplayed(), true);
		TransactionAmountCurrency = transactionAmountCurrency.getAttribute("value");
		return TransactionAmountCurrency;

	}


	public String selectSettledAmountCurrency(String currency) {

		for(int j= 0;j<transactionAmountCurrencyOption.size();j++) {

			if(transactionAmountCurrencyOption.get(j).getAttribute("value").equalsIgnoreCase(currency)) {
				base.click(transactionAmountCurrencyOption.get(j));
				TransactionAmountCurrency = transactionAmountCurrency.getAttribute("value");
				break;
			}
		}

		Assert.assertEquals(transactionAmountCurrency.getAttribute("value"), currency);
		return TransactionAmountCurrency;
	}


	public String instructedAmount(String amount) {

		Assert.assertEquals(instructedAmountField.isDisplayed(), true);
		base.sendKeys(instructedAmountField, String.valueOf(amount));
		InstructedAmount = amount;
		InstructeDAmount = instructedAmountField.getAttribute("value");
		System.out.println("The settled amount is"+InstructedAmount);
		Assert.assertEquals(instructedAmountField.getAttribute("value").isBlank(), false);
		return InstructedAmount;
	}


	public String verifyInstructedAmountCurrency() {

		Assert.assertEquals(instructedAmountCurrency.isDisplayed(), true);
		InstructedAmountCurrency = instructedAmountCurrency.getAttribute("value");
		return InstructedAmountCurrency;

	}


	public String selectInstructedAmountCurrency(String currency) {

		for(int j= 0;j<instructedAmountCurrencyOption.size();j++) {

			if(instructedAmountCurrencyOption.get(j).getAttribute("value").equalsIgnoreCase(currency)) {
				base.click(instructedAmountCurrencyOption.get(j));
				InstructedAmountCurrency = instructedAmountCurrency.getAttribute("value");
				break;
			}
		}

		Assert.assertEquals(instructedAmountCurrency.getAttribute("value"), currency);
		return InstructedAmountCurrency;


	}

	public String sendersCharge(String amount) {

		Assert.assertEquals(sendersChargeField.isDisplayed(), true);
		base.sendKeys(sendersChargeField, String.valueOf(amount));
		SendersCharge = sendersChargeField.getAttribute("value");
		Assert.assertEquals(sendersChargeField.getAttribute("value").isBlank(), false);
		return SendersCharge;
		

	}


	public String transactionType(String value) {
		

		base.click(transactionTypeField);
		
		
		for(int j= 0;j<transactionTypeFieldOptions.size();j++) {
			if(transactionTypeFieldOptions.get(j).getText().contains(value)){
				System.out.print("The value is"+value);
				base.mouseHover(transactionTypeFieldOptions.get(j));
				base.click(transactionTypeFieldOptions.get(j));
				break;
			}
		}
			
		TransactionType = transactionTypeField.getText();
		Assert.assertEquals(transactionTypeField.getText(), value);
		transactionTypeField.sendKeys(Keys.TAB);
		return TransactionType;

	}


	public String chargeType(String type) {

		base.click(chargeTypeField);

		for(int j= 0;j<chargeTypeFieldOptions.size();j++) {

			if(chargeTypeFieldOptions.get(j).getText().equalsIgnoreCase(type)) {
				actions.moveToElement(chargeTypeFieldOptions.get(j)).doubleClick(chargeTypeFieldOptions.get(j)).build().perform();
				//base.click(chargeTypeFieldOptions.get(j));	
//				base.mouseHover(chargeTypeFieldOptions.get(j));
//				base.click(chargeTypeFieldOptions.get(j));
				break;
			}
		}
		ChargeType=chargeTypeField.getText();
		System.out.println("The charge Type is "+ChargeType);
		Assert.assertEquals(chargeTypeField.getText(), type);
		chargeTypeField.sendKeys(Keys.TAB);
		return ChargeType;

	}
	
	public String verifyChargeAmount() {
		
		Assert.assertEquals(chargeAmountField.isDisplayed(), true);
		ChargeAmount = chargeAmountField.getAttribute("value");
		System.out.println("the charge amount is "+ChargeAmount);
		return ChargeAmount;
		
	}
	
	public String verifyVatAmount() {
		
		Assert.assertEquals(vatAmountField.isDisplayed(), true);
		VATAmount = vatAmountField.getAttribute("value");
		return VATAmount;
	}

	
	public String verifyTotalAmount() {
		
		Assert.assertEquals(totalAmountField.isDisplayed(), true);
		TotalAmount = totalAmountField.getAttribute("value");
		return TotalAmount;
	}
	
	public String enterTransactionRemarks(String remarks) {
		base.highLighterMethod(transactionRemarksField);
		base.explicitWait(transactionRemarksField);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", transactionRemarksField);
		actions.moveToElement(transactionRemarksField).sendKeys(remarks).perform();
		//base.sendKeys(transactionRemarksField, remarks);
		TransactionRemarks=transactionRemarksField.getAttribute("value");
		Assert.assertEquals(instructedAmountField.getAttribute("value").isBlank(), false);
		System.out.println("The transaction remarks is"+transactionRemarksField.getAttribute("value"));
		return TransactionRemarks;
	}
	
	public String enterRemarks(String remarks) {
		
		base.highLighterMethod(remarksField);
		base.explicitWait(remarksField);
		//js.executeAsyncScript(remarks,remarksField );
		//base.sendKeys(remarksField, remarks);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", remarksField);
		actions.moveToElement(remarksField).sendKeys(remarks).perform();
		Remarks=remarksField.getAttribute("value");
		System.out.println("The remarks is "+Remarks);
		Assert.assertEquals(remarksField.getAttribute("value").isBlank(), false);
		
		return Remarks;
		
	}

	public String verifyAmountText() {
		Assert.assertEquals(amountInWords.isDisplayed(), true);
		AmountInWords = amountInWords.getAttribute("value");
		return AmountInWords;
		
	}
	
	public void initiateButton() {
		Assert.assertEquals(initiateButton.isDisplayed(), true);
		base.mouseHover(initiateButton);
		base.highLighterMethod(initiateButton);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", initiateButton);
		//base.click(initiateButton);
	}
	
	public void resetButton() {
		
		Assert.assertEquals(resetButton.isDisplayed(), true);
		base.click(resetButton);
	}
	
	public void departmentFieldError() {
		
		Assert.assertEquals(departmentFieldError.isDisplayed(), true);
	}
	
	public void debtorACNumberError() {
		
		Assert.assertEquals(debtorAccountNumberError.isDisplayed(), true);
	}
	
	public void creditorACNumberError() {
		
		Assert.assertEquals(creditorAccountNumberError.isDisplayed(), true);

	}
	
	public void creditorNameError() {
		
		Assert.assertEquals(creditorNameError.isDisplayed(), true);

	}
	
	public void creditorAgentIDError() {
		
		Assert.assertEquals(creditorAgentIdError.isDisplayed(), true);

	}
	
	public void creditorAgentNameError() {
		
		Assert.assertEquals(creditorAgentNameError.isDisplayed(), true);

	}
	
	public void settledAmountError() {
		
		Assert.assertEquals(settledAmountError.isDisplayed(), true);

	}
	
	public void instructedAmountError() {
		
		Assert.assertEquals(instructedAmountError.isDisplayed(), true);

	}
	
	public void transactionTypeError() {
		
		Assert.assertEquals(transactionTypeError.isDisplayed(), true);

	}
	
	public void totalAmountError() {
		
		Assert.assertEquals(totalAmountError.isDisplayed(), true);

	}
	
	public void verifyReset() {
		
		
		base.click(initiateButton);
		outward.waitforLoader();
		totalAmountError();
		transactionTypeError();
		instructedAmountError();
		settledAmountError();
		creditorAgentNameError();
		creditorAgentIDError();
		creditorNameError();
		creditorACNumberError();
		debtorACNumberError();
		departmentFieldError();
		
//		Department = departmentField.getText();
//		Assert.assertEquals(Department.isBlank(), true);
//		DebtorAccountNumber = debtorAccountNumberField.getAttribute("value");
//		Assert.assertEquals(DebtorAccountNumber.isBlank(), true);
//		DebtorAccountType = debtorAccountType.getText();
//		Assert.assertEquals(DebtorAccountType.isBlank(), true);
//		DebtorAgentId = debtorAgentIDField.getAttribute("value");
//		Assert.assertEquals(DebtorAgentId.isBlank(), true);
//		DebtorCountry = debtorCountry.getText();
//		Assert.assertEquals(DebtorCountry.isBlank(), true);
//		DebtorName = debtorNameField.getAttribute("value");
//		Assert.assertEquals(DebtorName.isBlank(), true);
//		DebtorPostalCode = debtorPostalCode.getAttribute("value");
//		Assert.assertEquals(DebtorPostalCode.isBlank(), true);
//		DebtorStreetName = debtorStreetName.getAttribute("value");
//		Assert.assertEquals(DebtorStreetName.isBlank(), true);
//		DebtorTownName = debtorTownName.getAttribute("value");
//		Assert.assertEquals(DebtorTownName.isBlank(), true);
//		CreditorAccountNumber = creditorAccountNumberField.getAttribute("value");
//		Assert.assertEquals(CreditorAccountNumber.isBlank(), false);
//		CreditorAccountType = creditorAccountType.getText();
//		Assert.assertEquals(CreditorAccountType.isBlank(), false);
//		CreditorName = creditorNameField.getAttribute("value");
//		Assert.assertEquals(CreditorName.isBlank(), false);
//		CreditorAgentID = creditorAgentIdField.getAttribute("value");
//		Assert.assertEquals(CreditorAgentID.isBlank(), false);
//		CreditorAgentName = creditorAgentNameField.getAttribute("value");
//		Assert.assertEquals(CreditorAgentName.isBlank(), false);
//		CreditorPostalCode = creditorPostalCode.getAttribute("value");
//		Assert.assertEquals(CreditorPostalCode.isBlank(), false);
//		CreditorTownName = creditorTownName.getAttribute("value");
//		Assert.assertEquals(CreditorTownName.isBlank(), false);
//		CreditorCountry = creditorCountry.getText();
//		Assert.assertEquals(CreditorCountry.isBlank(), false);






		

		
		
	}
	
	
	
	












}
