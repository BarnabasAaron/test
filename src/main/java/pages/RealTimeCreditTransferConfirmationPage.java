//Author:Barnabas
package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class RealTimeCreditTransferConfirmationPage extends Drivers {
	
	public RealTimeCreditTransferConfirmationPage() {
		
		PageFactory.initElements(driver, this);

	}

	baseClass base = new baseClass();
	RealTimeCreditTransferInitiationPage initiationValues = new RealTimeCreditTransferInitiationPage();
	
	@FindBy(xpath = "//input[@formcontrolname='department']")
	public WebElement departmentField;
	
	@FindBy(xpath = "//input[@formcontrolname='debtorAccountNumber']")
	public WebElement debtorAccountNumberField;
	
	@FindBy(xpath ="//input[@formcontrolname='debtorAccDescription']")
	public WebElement debtorAccountType;
	
	@FindBy(xpath ="//input[@formcontrolname='debtorName']")
	public WebElement debtorNameField;
	
	@FindBy(xpath ="//input[@formcontrolname='debtorAgentID']")
	public WebElement debtorAgentIDField;
	
	@FindBy(xpath = "//input[@formcontrolname='dstreetName']")
	public WebElement debtorStreetName;
	
	@FindBy(xpath = "//input[@formcontrolname='dpostCode']")
	public WebElement debtorPostalCode;
	
	@FindBy(xpath = "//input[@formcontrolname='dtownName']")
	public WebElement debtorTownName;
	
	@FindBy(xpath = "//input[@formcontrolname='dcountry']")
	public WebElement debtorCountry;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorAccountNumber']")
	public WebElement creditorAccountNumberField;
	
	@FindBy(xpath ="//input[@formcontrolname='creditorAccDescription']")
	public WebElement creditorAccountType;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorName']")
	public WebElement creditorNameField;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorAgentID']")
	public WebElement creditorAgentIdField;
	
	@FindBy(xpath = "//input[@formcontrolname='creditorAgentName']")
	public WebElement creditorAgentNameField;
	
	@FindBy(xpath = "//input[@formcontrolname='cpostCode']")
	public WebElement creditorPostalCode;
	
	@FindBy(xpath = "//input[@formcontrolname='ctownName']")
	public WebElement creditorTownName;
	
	@FindBy(xpath = "//input[@formcontrolname='ccountry']")
	public WebElement creditorCountry;
	
	@FindBy(xpath = "//input[@formcontrolname='settledTransactionAmount']")
	public WebElement settledTransactionAmountField;
	
	@FindBy(xpath = "//input[@formcontrolname='stCurrencyCode']")
	public WebElement transactionAmountCurrency;
	
	@FindBy(xpath = "//input[@formcontrolname='instructedAmount']")
	public WebElement instructedAmountField;
	
	@FindBy(xpath = "//input[@formcontrolname='insCurrencyCode']")
	public WebElement instructedAmountCurrency;
	
	@FindBy(xpath = "//input[@formcontrolname='sendersCharge']")
	public WebElement sendersChargeField;
	
	@FindBy(xpath = "//input[@formcontrolname='transactionType']")
	public WebElement transactionTypeField;
	
	@FindBy(xpath = "//input[@formcontrolname='chargeType']")
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
	
	@FindBy(xpath = "//button[@mattooltip='Data Field Clear']")
	public WebElement cancelButton;
	
	@FindBy(xpath = "//button[@mattooltip='Customer credit initiation']")
	public WebElement confirmButton;
	
	
	
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	
	public void veriyDepartmentValue() {
		
		Assert.assertEquals(departmentField.getAttribute("value"), initiationValues.Department);
	}
	
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
		
		base.highLighterMethod(creditorAccountNumberField);
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
		
		Assert.assertEquals(settledTransactionAmountField.getAttribute("value"), initiationValues.SettleDAmount);	

	}
	
	public void verifySettledTransactionAmountCurrency() {
		
		Assert.assertEquals(transactionAmountCurrency.getAttribute("value"), initiationValues.TransactionAmountCurrency);		

	}
	
	public void verifyInstructedAmount() {
		
		Assert.assertEquals(instructedAmountField.getAttribute("value"), initiationValues.InstructeDAmount);		

	}
	
	public void verifyInstructedAmountCurrency() {
		
		Assert.assertEquals(instructedAmountCurrency.getAttribute("value"), initiationValues.InstructedAmountCurrency);		

	}
	
	public void verifySendersCharge() {
		
		Assert.assertEquals(sendersChargeField.getAttribute("value"), initiationValues.SendersCharge);		

	}
	
	public void verifyTransactionType() {
		
		base.highLighterMethod(transactionTypeField);
		Assert.assertEquals(transactionTypeField.getAttribute("value"), initiationValues.TransactionType);		

	}
	
	public void verifyChargeType() {
		base.highLighterMethod(chargeTypeField);
		Assert.assertEquals(chargeTypeField.getAttribute("value"), initiationValues.ChargeType);		

	}
	
	public void verifyChargeAmount() {
		System.out.println("The attribute value is "+chargeAmountField.getAttribute("value"));
		System.out.println("The expected value is "+initiationValues.ChargeAmount );
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
	
	public void clickConfirm() {
		System.out.println("Click confirm");
		base.highLighterMethod(confirmButton);
		Actions actions = new Actions(driver);
		actions.moveToElement(confirmButton).click(confirmButton).build().perform();
		
	}
	
	public void clickCancel() {
		
		base.click(cancelButton);
		
	}
}
