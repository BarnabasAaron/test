package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baseClass.baseClass;
import driver.Drivers;


public class RealtimePaymentReversalInitiationPage extends Drivers {
	
static baseClass base = new baseClass();

	
	public RealtimePaymentReversalInitiationPage() {
		
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
	
	@FindBy(xpath = "//mat-select[@role='combobox']")
	public WebElement reasonelemnt;
	
	@FindBy(xpath = "//span[contains(text(),'TM01 - Associated message was received after agree')]")
	public WebElement reason_dropdown;
	
	@FindBy(xpath = "//span[contains(text(),'Confirm Reversal Initiation')]")
	public WebElement confirm_btn;
	
	@FindBy(xpath="//div[.='Reversal Payment Initiated Successfully!']")
	public WebElement success_toast;
	
	@FindBy(xpath = "//span[@id='debtorAccNumber']")
	public WebElement deb_acc;
	
	@FindBy(xpath = "//span[@id='creditorAccNumber']")
	public WebElement cre_acc;
	
	@FindBy(xpath = "//span[@id='debtorNameAndAddress']")
	public WebElement deb_name;
	
	@FindBy(xpath = "//span[@id='creditTransferStatus']")
	public WebElement cre_status;
	
	@FindBy(xpath = "//span[@id='creditorName']")
	public WebElement cre_name;
	
	@FindBy(xpath = "//span[@id='chargeDetails']")
	public WebElement charge_Details;
	
	@FindBy(xpath = "//span[@id='creditorAgentName']")
	public WebElement cre_agent_name;
	
	@FindBy(xpath = "//span[@id='amount']")
	public WebElement tab_amount;
	
	@FindBy(xpath = "//span[@id='transactionDate']")
	public WebElement trans_date;
	
	@FindBy(xpath = "//span[@id='transactionType']")
	public WebElement trans_type;
	
	@FindBy(xpath = "//span[normalize-space(@id)='transactionIdentifier']")
	public WebElement trans_id;
	
	@FindBy(xpath = "//span[@id='debtorAgentID']")
	public WebElement deb_agentid;
	
	@FindBy(xpath = "//span[@id='creditorAgentID']")
	public WebElement cre_agentid;
	
	@FindBy(xpath = "//mat-error[contains(text(),' Reversal Reason is required ')]")
	public WebElement reason_error;
	
	@FindBy(xpath = "//table[normalize-space(@role)='table']/tbody/tr/td")
	public List<WebElement> tableData;
	
	@FindBy(xpath = "//input[normalize-space(@data-placeholder) = 'Transaction ID']")
	public WebElement trans_id1;
	
	@FindBy(xpath = "//input[normalize-space(@data-placeholder) = 'Transaction Date']")
	public WebElement trans_date1;
	
	@FindBy(xpath = "//input[normalize-space(@data-placeholder) = 'Debit A/c Number']")
	public WebElement deb_acc1;
	
	@FindBy(xpath = "//input[normalize-space(@data-placeholder) = 'Debitor Name']")
	public WebElement deb_name1;
	
	@FindBy(xpath = "//input[normalize-space(@data-placeholder) = 'Debitor Agent ID']")
	public WebElement deb_agentid1;
	
	@FindBy(xpath = "//input[normalize-space(@data-placeholder) = 'Creditor A/c Number']")
	public WebElement cre_acc1;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Creditor Name']")
	public WebElement cre_name1;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Creditor Agent Id']")
	public WebElement cre_agentid1;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Settlement Amount']")
	public WebElement settlement_amt;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Settlement Date']")
	public WebElement settlement_date;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Reversal Transaction ID']")
	public WebElement reversal_transid;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Reversal Settelement Amount']")
	public WebElement reversal_settleamt;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Reversal Instructed Amount']")
	public WebElement reversal_instamt;
	
	@FindBy(xpath = "//span[contains(text(),'TM01 - Associated message was received after agree')]")
	public WebElement reversal_reason;
	
	
	public static String debaccnumber, creaccnumber, debname, credtrastatus, credname, chargedetails; 
	public static String credagentname, amount, transdate, transtype, transid, debagentid, credagentid;
	public static String reversetransid, reversesetamt, reverseinstamt, reversalreason;
	
	public void table_data() {
		
		base.explicitWait(deb_acc);
		base.highLighterMethod(deb_acc);
		base.highLighterMethod(tableData.get(1));
		Assert.assertEquals(tableData.get(1).isDisplayed(), true);
		debaccnumber = tableData.get(1).getText();
		System.out.println(debaccnumber);
		
		base.highLighterMethod(cre_acc);
		base.highLighterMethod(tableData.get(2));
		Assert.assertEquals(tableData.get(2).isDisplayed(), true);
		creaccnumber = tableData.get(2).getText();
		System.out.println(creaccnumber);
		
		base.highLighterMethod(deb_name);
		base.highLighterMethod(tableData.get(3));
		Assert.assertEquals(tableData.get(3).isDisplayed(), true);
		debname = tableData.get(3).getText();
		System.out.println(debname);
		
		base.highLighterMethod(cre_status);
		base.highLighterMethod(tableData.get(4));
		Assert.assertEquals(tableData.get(4).isDisplayed(), true);
		credtrastatus = tableData.get(4).getText();
		System.out.println(credtrastatus);
		
		base.highLighterMethod(cre_name);
		base.highLighterMethod(tableData.get(5));
		Assert.assertEquals(tableData.get(5).isDisplayed(), true);
		credname = tableData.get(5).getText();
		System.out.println(credname);
		
		base.highLighterMethod(charge_Details);
		base.highLighterMethod(tableData.get(6));
		Assert.assertEquals(tableData.get(5).isDisplayed(), true);
		chargedetails = tableData.get(6).getText();
		System.out.println(chargedetails);
		
		base.highLighterMethod(cre_agent_name);
		base.highLighterMethod(tableData.get(7));
		Assert.assertEquals(tableData.get(7).isDisplayed(), true);
		credagentname = tableData.get(7).getText();
		System.out.println(tableData.get(7).getText());
		
		base.highLighterMethod(tab_amount);
		base.highLighterMethod(tableData.get(8));
		Assert.assertEquals(tableData.get(8).isDisplayed(), true);
		amount = tableData.get(8).getText();
		System.out.println(amount);
		
		base.highLighterMethod(trans_date);
		base.highLighterMethod(tableData.get(9));
		Assert.assertEquals(tableData.get(9).isDisplayed(), true);
		transdate = tableData.get(9).getText();
		System.out.println(transdate);
		
		base.highLighterMethod(trans_type);
		base.highLighterMethod(tableData.get(10));
		Assert.assertEquals(tableData.get(10).isDisplayed(), true);
		transtype = tableData.get(10).getText();
		System.out.println(transtype);
		
		base.highLighterMethod(trans_id);
		base.highLighterMethod(tableData.get(11));
		Assert.assertEquals(tableData.get(11).isDisplayed(), true);
		transid = tableData.get(11).getText();
		System.out.println(transid);
		
		base.highLighterMethod(deb_agentid);
		base.highLighterMethod(tableData.get(13));
		Assert.assertEquals(tableData.get(13).isDisplayed(), true);
		debagentid = tableData.get(13).getText();
		System.out.println(debagentid);
		
		base.highLighterMethod(cre_agentid);
		base.highLighterMethod(tableData.get(14));
		Assert.assertEquals(tableData.get(14).isDisplayed(), true);
		credagentid = tableData.get(14).getText();
		System.out.println(credagentid);
	}
	
	public void verifydetails() {
		base.highLighterMethod(trans_id1);
		System.out.println(trans_id1.getAttribute("value"));
		Assert.assertEquals(trans_id1.getAttribute("value")+" ", transid);
		
		base.highLighterMethod(trans_date1);
		System.out.println(trans_date1.getAttribute("value"));
		
		base.highLighterMethod(deb_acc1);
		System.out.println(deb_acc1.getAttribute("value"));
		Assert.assertEquals(deb_acc1.getAttribute("value")+" ", debaccnumber);
		
		base.highLighterMethod(deb_name1);
		System.out.println(deb_name1.getAttribute("value"));
		Assert.assertEquals(deb_name1.getAttribute("value")+" ", debname);
		
		base.highLighterMethod(deb_agentid1);
		System.out.println(deb_agentid1.getAttribute("value"));
		Assert.assertEquals(deb_agentid1.getAttribute("value")+" ", debagentid);
		
		base.highLighterMethod(cre_acc1);
		System.out.println(cre_acc1.getAttribute("value"));
		Assert.assertEquals(cre_acc1.getAttribute("value")+" ", creaccnumber);
		
		base.highLighterMethod(cre_name1);
		System.out.println(cre_name1.getAttribute("value"));
		Assert.assertEquals(cre_name1.getAttribute("value")+" ", credname);
		
		base.highLighterMethod(cre_agentid1);
		System.out.println(cre_agentid1.getAttribute("value"));
		Assert.assertEquals(cre_agentid1.getAttribute("value")+" ", credagentid);
		
		base.highLighterMethod(settlement_amt);
		System.out.println(settlement_amt.getAttribute("value"));
//		Assert.assertEquals(settlement_amt.getAttribute("value"), amount);
		
		base.highLighterMethod(settlement_date);
		System.out.println(settlement_date.getAttribute("value"));
		
		base.highLighterMethod(reversal_transid);
		reversetransid = reversal_transid.getAttribute("value");
		System.out.println(reversetransid);
		
		base.highLighterMethod(reversal_settleamt);
		reversesetamt = reversal_settleamt.getAttribute("value");
		System.out.println(reversesetamt);
		
		base.highLighterMethod(reversal_instamt);
		reverseinstamt = reversal_instamt.getAttribute("value");
		System.out.println(reverseinstamt);
		
		base.highLighterMethod(reversal_reason);
		reversalreason = reversal_reason.getAttribute("value");
		System.out.println(reversalreason);
	}
	
	public void view_error() {
		base.highLighterMethod(reason_error);
		base.explicitWait(reason_error);
		boolean actual= reason_error.isDisplayed();
		Assert.assertEquals(actual, true);
	}
	
	public void view_toast() {
		base.highLighterMethod(success_toast);
		base.explicitWait(success_toast);
		boolean actual= success_toast.isDisplayed();
		Assert.assertEquals(actual, true);
	}
	
	public void click_confirm_btn() {
		base.highLighterMethod(confirm_btn);
		base.explicitWait(confirm_btn);
		base.click(confirm_btn);
	}
	
	public void select_reason() throws InterruptedException {
		
		base.scrollToElement(reasonelemnt);
		base.highLighterMethod(reasonelemnt);
//		base.click(reasonelemnt);
		
//		base.highLighterMethod(reason_dropdown);
//		base.explicitWait(reason_dropdown);
//		base.click(reason_dropdown);
	}
	
	public void Click_Editicon_btn() throws InterruptedException {
		base.explicitWait(Editicon);

		base.highLighterMethod(Editicon);
		base.explicitWait(Editicon);
		base.click(Editicon);
	}
	
	public void click_Approve_btn() throws InterruptedException {
		base.explicitWait(Approve_btn);
		base.highLighterMethod(Approve_btn);
		base.explicitWait(Approve_btn);
		base.click(Approve_btn);
	}

	
	public void click_reject_btn() throws InterruptedException {
		base.explicitWait(Reject_btn);
		base.highLighterMethod(Reject_btn);
		base.explicitWait(Reject_btn);
		base.click(Reject_btn);
	}
	
	public void Click_ApprovePopup() throws InterruptedException {
		base.explicitWait(ApprovePopup_btn);
		base.highLighterMethod(ApprovePopup_btn);
//		base.click(ApprovePopup_btn);
		
	}
	
	public void Click_RejectPopup() throws InterruptedException {
		base.explicitWait(RejectPopup_btn);
		base.highLighterMethod(RejectPopup_btn);
//		base.click(RejectPopup_btn);
	}
	
	public void Approve_RemarksPopup() throws InterruptedException {

		base.explicitWait(RemarksPopup_approve);
		String remarks = System.getProperty("Remarks");
		base.highLighterMethod(RemarksPopup_approve);
		base.sendKeys(RemarksPopup_approve, remarks);
		base.explicitWait(RemarksPopup_approve);
//		base.click(RemarksPopup_approve);
	}
	
	public void Reject_RemarksPopup() throws InterruptedException {

		base.explicitWait(RemarksPopup_reject);
		String remarks = System.getProperty("Remarks");
		base.highLighterMethod(RemarksPopup_reject);
		base.sendKeys(RemarksPopup_reject, remarks);
		base.explicitWait(RemarksPopup_reject);
//		base.click(RemarksPopup_reject);
	}
	
	public void Click_History_btn() throws InterruptedException {
		base.explicitWait(History_btn);
		base.highLighterMethod(History_btn);
		base.click(History_btn);
		
	}
	
	public void View_History_page() throws InterruptedException {
		base.explicitWait(History_page);
		base.highLighterMethod(History_page);
		base.explicitWait(History_page);
		Assert.assertEquals(base.isDisplayed(History_page), true);
	}
	
	
	public void Approve_History_RemarksPopup() throws InterruptedException {
		base.explicitWait(RemarksPopup_approve_history);
		base.highLighterMethod(RemarksPopup_approve_history);
		String remarks = System.getProperty("Remarks");
		base.sendKeys(RemarksPopup_approve_history, remarks);
		base.explicitWait(RemarksPopup_approve_history);
		base.click(RemarksPopup_approve_history);
	}
	
	public void Reject_History_RemarksPopup() throws InterruptedException {
		base.explicitWait(RemarksPopup_reject_history);
		base.highLighterMethod(RemarksPopup_reject_history);
		String remarks = System.getProperty("Remarks");
		base.sendKeys(RemarksPopup_reject_history, remarks);
		base.explicitWait(RemarksPopup_reject_history);
		base.click(RemarksPopup_reject_history);
	}
	
	public void Reject_withoutentering_remarks() throws InterruptedException {
		base.explicitWait(Reject_error);
		base.highLighterMethod(Reject_error);
		base.explicitWait(Reject_error);
		Assert.assertEquals(base.isDisplayed(Reject_error), true);
	}
	

}
