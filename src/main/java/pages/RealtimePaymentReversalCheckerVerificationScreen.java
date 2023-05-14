package pages;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;


public class RealtimePaymentReversalCheckerVerificationScreen extends Drivers{
	
static baseClass base = new baseClass();

	
	public RealtimePaymentReversalCheckerVerificationScreen() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	@FindBy(xpath = "(//mat-icon[.='edit '])[1]")
	public WebElement Editicon;
	
	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	public WebElement Approve_btn;
	
	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	public WebElement Reject_btn;
	
	@FindBy(xpath = "//div[contains(text(),'History')]")
	public WebElement History_btn;
	
	@FindBy(xpath = "//mat-error[contains(text(),' Remarks is mandatory for Reject')]")
	public WebElement Reject_error;
	
	@FindBy(xpath = "(//span[.='Approve'])[2]")
	public WebElement ApprovePopup_btn;
	
	@FindBy(xpath = "(//span[.='Reject'])[2]")
	public WebElement RejectPopup_btn;
	
	@FindBy(xpath = "//div[contains(text(),'Settled Amount:')]/following::input[1]")
	public WebElement RemarksPopup_approve;
	
	@FindBy(xpath = "//div[contains(text(),'Settled Amount:')]/following::input[1]")
	public WebElement RemarksPopup_reject;
	
	@FindBy(xpath = "//h3[contains(text(),'Payment Reversal Checker History')]")
	public WebElement History_page;
	
	@FindBy(xpath = "//div[contains(text(),'Settled Amount:')]/following::input[1]")
	public WebElement RemarksPopup_approve_history;
	
	@FindBy(xpath = "//div[contains(text(),'Settled Amount:')]/following::input[1]")
	public WebElement RemarksPopup_reject_history;
	
	@FindBy(xpath = "//h1[contains(text(),'Payment Reversal Request Confirmation')]")
	public WebElement detailedview;
	
	@FindBy(xpath = "//input[@formcontrolname='transactionID']")
	public WebElement transactionid;
	
	@FindBy(xpath = "//input[@data-placeholder='Transaction Date']")
	public WebElement transactiondate;
	
	@FindBy(xpath = "//input[@data-placeholder='Debitor Agent ID']")
	public WebElement debitoragentid;
	
	@FindBy(xpath = "//input[@data-placeholder='Creditor Agent Id']")
	public WebElement creditorid;
	
	@FindBy(xpath = "//input[@data-placeholder='Settlement Amount']")
	public WebElement settlement_amount;
	
	@FindBy(xpath = "//input[@data-placeholder='Settlement Date']")
	public WebElement settlement_date;
	
	@FindBy(xpath = "//input[@data-placeholder='Reversal Transaction ID']")
	public WebElement reversal_transid;
	
	@FindBy(xpath = "//input[@data-placeholder='Reversal Settelement Amount']")
	public WebElement reversal_settled_amt;
	
	@FindBy(xpath = "//input[@data-placeholder='Reversal Instructed Amount']")
	public WebElement reversal_inst_amt;
	
	@FindBy(xpath = "//input[@data-placeholder='Reversal Reason']")
	public WebElement reversalreason;
	
	@FindBy(xpath = "//span[@id='createdDate']")
	public WebElement createdate;
	
	@FindBy(xpath = "//span[@id='createdUserName']")
	public WebElement user;
	
	@FindBy(xpath = "//span[@id='workflowStatusName']")
	public WebElement action;
	
	@FindBy(xpath = "//span[@id='remarks']")
	public WebElement remarks;
	

	@FindBy(xpath = "//span[@id='amount']")
	public WebElement amount;
	
	@FindBy(xpath = "//tbody/tr[1]/td[2]")
	public WebElement amount1;
	
	@FindBy(xpath = "//span[@id='transactionDate']")
	public WebElement transaction_date;
	
	@FindBy(xpath = "//tbody/tr[1]/td[3]")
	public WebElement transaction_date1;
	
	@FindBy(xpath = "//span[@id='createdDate']")
	public WebElement created_date;
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]")
	public WebElement created_date1;
	
	@FindBy(xpath = "//span[@id='transactionIdentifier']")
	public WebElement transaction_identifier;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]")
	public WebElement transaction_identifier1;
	
	@FindBy(xpath = "//span[@id='creditTransferStatus']")
	public WebElement credittransafer_status;
	
	@FindBy(xpath = "//tbody/tr[1]/td[6]")
	public WebElement credittransafer_status1;
	
	@FindBy(xpath = "//span[@id='debtorAgentID']")
	public WebElement debtoragentid;
	
	@FindBy(xpath = "//tbody/tr[1]/td[8]")
	public WebElement debtoragentid1;
	
	@FindBy(xpath = "//span[@id='reversalReason']")
	public WebElement reversal_reason;
	
	@FindBy(xpath = "//tbody/tr[1]/td[9]")
	public WebElement reversal_reason1;
	
	@FindBy(xpath = "//span[@id='creditorAgentID']")
	public WebElement creditoragentid;
	
	@FindBy(xpath = "//tbody/tr[1]/td[10]")
	public WebElement creditoragentid1;
	
	@FindBy(xpath = "//h3[contains(text(),'Reversal Payment Request Approval Queue')]")
	public WebElement verifypage;
	
	
	WebDriverWait wait;
	
	public void detailed_data() {
		try {
		base.highLighterMethod(transactionid);
		base.explicitWait(transactionid);
		Assert.assertEquals(transactionid.isDisplayed(), true);
		base.highLighterMethod(transactiondate);
		Assert.assertEquals(transactiondate.isDisplayed(), true);
		base.highLighterMethod(debitoragentid);
		Assert.assertEquals(debitoragentid.isDisplayed(), true);
		base.highLighterMethod(creditorid);
		Assert.assertEquals(creditorid.isDisplayed(), true);
		base.highLighterMethod(settlement_amount);
		Assert.assertEquals(settlement_amount.isDisplayed(), true);
		base.highLighterMethod(settlement_date);
		Assert.assertEquals(settlement_date.isDisplayed(), true);
		base.highLighterMethod(reversal_transid);
		Assert.assertEquals(reversal_transid.isDisplayed(), true);
		base.highLighterMethod(reversal_settled_amt);
		Assert.assertEquals(reversal_settled_amt.isDisplayed(), true);
		base.highLighterMethod(reversal_inst_amt);
		Assert.assertEquals(reversal_inst_amt.isDisplayed(), true);
		base.highLighterMethod(reversalreason);
		Assert.assertEquals(reversalreason.isDisplayed(), true);
		}catch (Exception e) {
			System.out.println("NO RECORDS FOUND");
		}
	}
	
	
	public void detailed_view() {
		try {
		base.highLighterMethod(detailedview);
		base.explicitWait(detailedview);
		Assert.assertEquals(detailedview.isDisplayed(), true);
		} catch(Exception e) {
			System.out.println("NO RECORDS FOUND");
		}
	}
	
	public void verify_queue() {
		try {
			base.highLighterMethod(amount);
			base.explicitWait(amount);
			Assert.assertEquals(amount.isDisplayed(), true);
			System.out.println(amount.getText());
			base.highLighterMethod(amount1);
			Assert.assertEquals(amount1.isDisplayed(), true);
			System.out.println(amount1.getText());
			base.highLighterMethod(transaction_date);
			Assert.assertEquals(transaction_date.isDisplayed(), true);
			System.out.println(transaction_date.getText());
			base.highLighterMethod(transaction_date1);
			Assert.assertEquals(transaction_date1.isDisplayed(), true);
			System.out.println(transaction_date1.getText());
			base.highLighterMethod(created_date);
			Assert.assertEquals(created_date.isDisplayed(), true);
			System.out.println(created_date.getText());
			base.highLighterMethod(created_date1);
			Assert.assertEquals(created_date1.isDisplayed(), true);
			System.out.println(created_date1.getText());
			base.highLighterMethod(transaction_identifier);
			Assert.assertEquals(transaction_identifier.isDisplayed(), true);
			System.out.println(transaction_identifier.getText());
			base.highLighterMethod(transaction_identifier1);
			Assert.assertEquals(transaction_identifier1.isDisplayed(), true);
			System.out.println(transaction_identifier1.getText());
			base.highLighterMethod(credittransafer_status);
			Assert.assertEquals(credittransafer_status.isDisplayed(), true);
			System.out.println(credittransafer_status.getText());
			base.highLighterMethod(credittransafer_status1);
			Assert.assertEquals(credittransafer_status1.isDisplayed(), true);
			System.out.println(credittransafer_status1.getText());
			base.highLighterMethod(debtoragentid);
			Assert.assertEquals(debtoragentid.isDisplayed(), true);
			System.out.println(debtoragentid.getText());
			base.highLighterMethod(debtoragentid1);
			Assert.assertEquals(debtoragentid1.isDisplayed(), true);
			System.out.println(debtoragentid1.getText());
			base.highLighterMethod(reversal_reason);
			Assert.assertEquals(reversal_reason.isDisplayed(), true);
			System.out.println(reversal_reason.getText());
			base.highLighterMethod(reversal_reason1);
			Assert.assertEquals(reversal_reason1.isDisplayed(), true);
			System.out.println(reversal_reason1.getText());
			base.highLighterMethod(creditoragentid);
			Assert.assertEquals(creditoragentid.isDisplayed(), true);
			System.out.println(creditoragentid.getText());
			base.highLighterMethod(creditoragentid1);
			Assert.assertEquals(creditoragentid1.isDisplayed(), true);
			System.out.println(creditoragentid1.getText());	
		} catch (Exception e) {
			System.out.println("NO RESULTS FOUND");
		}
	}
	
	public void Click_Editicon_btn() throws InterruptedException {
		try {
			base.explicitWait(Editicon);
			base.highLighterMethod(Editicon);
			base.click(Editicon);
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			base.highLighterMethod(Editicon);
			base.click(Editicon);
		}
	}
	
	public void click_Approve_btn() throws InterruptedException {
		base.explicitWait(Approve_btn);
		base.highLighterMethod(Approve_btn);

		base.click(Approve_btn);
	}

	
	public void click_reject_btn() throws InterruptedException {
		base.explicitWait(Reject_btn);
		base.highLighterMethod(Reject_btn);
		

		base.click(Reject_btn);
	}
	
	public void Click_ApprovePopup() throws InterruptedException {
		base.explicitWait(ApprovePopup_btn);
		base.highLighterMethod(ApprovePopup_btn);
		base.click(ApprovePopup_btn);
		
	}
	
	public void verifypage() {
		base.explicitWait(verifypage);
		base.highLighterMethod(verifypage);
	}
	
	public void Click_RejectPopup() throws InterruptedException {
		base.explicitWait(RejectPopup_btn);
		base.highLighterMethod(RejectPopup_btn);
		base.click(RejectPopup_btn);

	}
	
	public void Approve_RemarksPopup() throws InterruptedException, EncryptedDocumentException, IOException {
		
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("remarks1");
		base.explicitWait(RemarksPopup_approve);
		
//		String remarks1 = System.getProperty("remarks");
		base.highLighterMethod(RemarksPopup_approve);
		base.sendKeys(RemarksPopup_approve, options);
		base.click(RemarksPopup_approve);
	}
	
	public void Reject_RemarksPopup() throws InterruptedException, EncryptedDocumentException, IOException {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("remarks1");
		base.explicitWait(RemarksPopup_reject);
		
//		String remarks1 = System.getProperty("remarks");
		base.highLighterMethod(RemarksPopup_reject);
		base.sendKeys(RemarksPopup_reject, options);
		base.click(RemarksPopup_reject);
	}
	
	public void Click_History_btn() throws InterruptedException {
		base.explicitWait(History_btn);
		base.highLighterMethod(History_btn);
		
		base.click(History_btn);

	}
	
	public void View_History_page() throws InterruptedException {
		base.explicitWait(History_page);
		base.highLighterMethod(History_page);
		

		Assert.assertEquals(base.isDisplayed(History_page), true);
	}
	
	
	public void Approve_History_RemarksPopup() throws InterruptedException, EncryptedDocumentException, IOException {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("remarks1");
		base.explicitWait(RemarksPopup_approve_history);
		
		base.highLighterMethod(RemarksPopup_approve_history);
//		String remarks1 = System.getProperty("remarks");
		base.sendKeys(RemarksPopup_approve_history, options);
		base.click(RemarksPopup_approve_history);

}
	
	public void Reject_History_RemarksPopup() throws InterruptedException, EncryptedDocumentException, IOException {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("remarks1");
		base.explicitWait(RemarksPopup_reject_history);
		
		base.highLighterMethod(RemarksPopup_reject_history);
//		String remarks1 = System.getProperty("remarks");
		base.sendKeys(RemarksPopup_reject_history, options);
		base.click(RemarksPopup_reject_history);

}
	
	public void Reject_withoutentering_remarks() throws InterruptedException {
		base.explicitWait(Reject_error);
		base.highLighterMethod(Reject_error);
	

		Assert.assertEquals(base.isDisplayed(Reject_error), true);


	}
	
	public void verify_historytable() {
		try {
			base.highLighterMethod(createdate);
			base.explicitWait(createdate);
			Assert.assertEquals(createdate.isDisplayed(), true);
			System.out.println(createdate.getText());
			base.highLighterMethod(user);
			Assert.assertEquals(user.isDisplayed(), true);
			System.out.println(user.getText());
			base.highLighterMethod(action);
			Assert.assertEquals(action.isDisplayed(), true);
			System.out.println(action.getText());
			base.highLighterMethod(remarks);
			Assert.assertEquals(remarks.isDisplayed(), true);
			System.out.println(remarks.getText());
		}catch(Exception e) {
			System.out.println("NO RESULTS FOUND");
		}
		
	}
	
	
	
	
	
	

}
