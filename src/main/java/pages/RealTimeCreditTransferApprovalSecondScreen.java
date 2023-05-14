package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class RealTimeCreditTransferApprovalSecondScreen extends Drivers {
	
	public RealTimeCreditTransferApprovalSecondScreen() {
		
		PageFactory.initElements(driver, this);

	}

	baseClass base = new baseClass();
	RealTimeCreditTransferInitiationPage initiationValues = new RealTimeCreditTransferInitiationPage();

	
	@FindBy(xpath = "//input[@formcontrolname='debtorAccountNumber']")
	public WebElement debtorAccountNumberField;
	
	@FindBy(xpath ="//input[@formcontrolname='debtorAccType']")
	public WebElement debtorAccountType;
	
	@FindBy(xpath ="//input[@formcontrolname='debtorName']")
	public WebElement debtorNameField;
	
	@FindBy(xpath ="//input[@formcontrolname='debtorAgentID']")
	public WebElement debtorAgentIDField;
	
	@FindBy(xpath = "//input[@formcontrolname='debtorStreetName']")
	public WebElement debtorStreetName;
	
	@FindBy(xpath = "//input[@formcontrolname='debtorPostCode']")
	public WebElement debtorPostalCode;
	
	@FindBy(xpath = "//input[@formcontrolname='debtorTownName']")
	public WebElement debtorTownName;
	
	@FindBy(xpath = "//input[@formcontrolname='debtorCountry']")
	public WebElement debtorCountry;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorAccountNumber']")
	public WebElement creditorAccountNumberField;
	
	@FindBy(xpath ="//input[@formcontrolname='creditorAccType']")
	public WebElement creditorAccountType;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorName']")
	public WebElement creditorNameField;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorAgentID']")
	public WebElement creditorAgentIdField;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorAgentName']")
	public WebElement creditorAgentNameField;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorPostCode']")
	public WebElement creditorPostalCode;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorTownName']")
	public WebElement creditorTownName;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorCountry']")
	public WebElement creditorCountry;
	
	@FindBy(xpath = "//input[@formcontrolname='transactionAmount']")
	public WebElement settledTransactionAmountField;
	
	@FindBy(xpath = "//input[@formcontrolname='currencyCode']")
	public WebElement transactionAmountCurrency;
	
	@FindBy(xpath = "//input[@formcontrolname='instructedAmount']")
	public WebElement instructedAmountField;
	
	@FindBy(xpath = "//input[@formcontrolname='insCurrencyCode']")
	public WebElement instructedAmountCurrency;
	
	@FindBy(xpath = "//input[@formcontrolname='sendersCharge']")
	public WebElement sendersChargeField;
	
	@FindBy(xpath = "//input[@formcontrolname='transactionType']")
	public WebElement transactionTypeField;
	
	@FindBy(xpath = "//input[@formcontrolname='chargeDetails']")
	public WebElement chargeTypeField;
	
	@FindBy(xpath = "//input[@formcontrolname='chargeAmount']")
	public WebElement chargeAmountField;
	
	@FindBy(xpath = "//input[@formcontrolname='vat']")
	public WebElement vatAmountField;
	
	@FindBy(xpath = "//input[@formcontrolname='totalAmount']")
	public WebElement totalAmountField;
	
	@FindBy(xpath = "//textarea[@formcontrolname='transactionRemarks']")
	public WebElement transactionRemarksField;
	
	@FindBy(xpath = "//mat-label[@style='font-weight: bold;']")
	public WebElement amountInWords;
	
	@FindBy(xpath = "//textarea[@formcontrolname='remarks']")
	public WebElement remarksField;
	
	@FindBy(xpath = "//span[text()='Reject']")
	public WebElement rejectButton;
	
	@FindBy(xpath = "//span[text()='Approve']")
	public WebElement approveButton;
	
	@FindBy(xpath = "//mat-dialog-container[@role='dialog']")
	public WebElement ConfirmationPopup;
	
	@FindBy(xpath = "(//span[text()='Reject'])[2]")
	public WebElement rejectButtonInPopup;
	
	@FindBy(xpath = "//span[text()='Cancel']")
	public WebElement cancelButtonInPopup;
	
	@FindBy(xpath = "(//span[text()='Approve'])[2]")
	public WebElement approveButtonInPopup;
	
	@FindBy(xpath = "//input[@formcontrolname='Remarks']")
	public WebElement remarksInPopup;
	
	
public void verifyDebtorAccountNumber() {
		
	base.highLighterMethod(debtorAccountNumberField);
		Assert.assertEquals(debtorAccountNumberField.getAttribute("value"), initiationValues.DebtorAccountNumber);

	}
	
	public void verifyDebtorAccountType() {
		
		Assert.assertEquals(debtorAccountType.getAttribute("value"), initiationValues.DebtorAccountType);
	}
	
	public void verifyDebtorName() {
		
		Assert.assertEquals(debtorNameField.getAttribute("value"), initiationValues.DebtorName);

	}
	
	public void verifyDebtorAgentID() {
		
		Assert.assertEquals(debtorAgentIDField.getAttribute("value"), initiationValues.DebtorAgentId);

	}
		
	public void verifyDebtorStreetName() {
		
		Assert.assertEquals(debtorStreetName.getAttribute("value"), initiationValues.DebtorStreetName);

	}
	
	public void verifyDebtorPostalCode() {
		
		Assert.assertEquals(debtorPostalCode.getAttribute("value"), initiationValues.DebtorPostalCode);

	}
	
	public void verifyDebtorTownName() {
		
		Assert.assertEquals(debtorTownName.getAttribute("value"), initiationValues.DebtorTownName);

	}
	
	public void verifyDebtorCountry() {
		
		Assert.assertEquals(debtorCountry.getAttribute("value"), initiationValues.DebtorCountry);

	}
	
public void verifyCreditorAccountNumber() {
		
		Assert.assertEquals(creditorAccountNumberField.getAttribute("value"), initiationValues.CreditorAccountNumber);

	}
	
	public void verifyCreditorAccountType() {
		
		Assert.assertEquals(creditorAccountType.getAttribute("value"), initiationValues.CreditorAccountType);

	}
	
	public void verifyCreditorName() {
		
		Assert.assertEquals(creditorNameField.getAttribute("value"), initiationValues.CreditorName);
		
	}
	
	public void verifyCreditorAgentID() {
		
		Assert.assertEquals(creditorAgentIdField.getAttribute("value"), initiationValues.CreditorAgentID);

	}
	
	public void verifyCreditorAgentName() {
		
		Assert.assertEquals(creditorAgentNameField.getAttribute("value"), initiationValues.CreditorAgentName);

	}
	
	public void verifyCreditorPostalCode() {
		
		Assert.assertEquals(creditorPostalCode.getAttribute("value"), initiationValues.CreditorPostalCode);		
	}
	
	public void verifyCreditorTownName() {
		
		Assert.assertEquals(creditorTownName.getAttribute("value"), initiationValues.CreditorTownName);		

	}
	
	public void verifyCreditorCountry() {
		
		Assert.assertEquals(creditorCountry.getAttribute("value"), initiationValues.CreditorCountry);		

	}

	
   public void verifySettledTransactionAmount() {
		
		Assert.assertEquals(settledTransactionAmountField.getAttribute("value"), initiationValues.SettledAmount);	

	}
	
	public void verifySettledTransactionAmountCurrency() {
		
		Assert.assertEquals(transactionAmountCurrency.getAttribute("value"), initiationValues.TransactionAmountCurrency);		

	}
	
	public void verifyInstructedAmount() {
		
		Assert.assertEquals(instructedAmountField.getAttribute("value"), initiationValues.InstructedAmount);		

	}
	
	public void verifyInstructedAmountCurrency() {
		
		Assert.assertEquals(instructedAmountCurrency.getAttribute("value"), initiationValues.InstructedAmountCurrency);		

	}
	
	public void verifySendersCharge() {
		
		Assert.assertEquals(sendersChargeField.getAttribute("value"), initiationValues.SendersCharge);		

	}
	
	public void verifyTransactionType() {
		
		Assert.assertEquals(transactionTypeField.getAttribute("value"), initiationValues.TransactionType);		

	}
	
	public void verifyChargeType() {
		
		Assert.assertEquals(chargeTypeField.getAttribute("value"), initiationValues.ChargeType);		

	}
	
	public void verifyChargeAmount() {
		
		Assert.assertEquals(chargeAmountField.getAttribute("value"), initiationValues.ChargeAmount);		

	}
	
	public void verifyVATAmount() {
		
		Assert.assertEquals(vatAmountField.getAttribute("value"), initiationValues.VATAmount);		

	}
	
	public void verifyTotalAmount() {
		
		Assert.assertEquals(totalAmountField.getAttribute("value"), initiationValues.TotalAmount);		

	}
	
	public void verifyTransactionRemarks() {
		
		Assert.assertEquals(transactionRemarksField.getAttribute("value"), initiationValues.TransactionRemarks);		

	}
	
    public void verifyRemarks() {
		
		Assert.assertEquals(remarksField.getAttribute("value"), initiationValues.TransactionRemarks);		
		
	}
	
	public void verifyAmount() {
		
		Assert.assertEquals(amountInWords.getAttribute("value"), initiationValues.AmountInWords);		

	}
	
	
	public void approveButton() {
		
		base.click(approveButton);
	}
	
	public void rejectButton() {
		
		base.click(rejectButton);
		
	}
	
	public void clickApproveInPopup() {
		
		base.click(approveButtonInPopup);
	}
	
	public void clickRejectInPopup(String remarks) {
		
		base.sendKeys(remarksInPopup, remarks);
		base.click(rejectButtonInPopup);
	}
	




	


}
