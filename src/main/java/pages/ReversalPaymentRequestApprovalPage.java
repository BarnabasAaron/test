package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class ReversalPaymentRequestApprovalPage extends Drivers{
	
static baseClass base = new baseClass();

	
	public ReversalPaymentRequestApprovalPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	Actions action = new Actions(driver);
	
	@FindBy(xpath = "(//table[@role='table']/tbody/tr)")
	public List<WebElement> tablerow;

	@FindBy(xpath = "(//table[@role='table']/tbody/tr/td)")
	public List<WebElement> tablecolumn;
	
	@FindBy(xpath = "//span[@id='debtorAccNumber']")
	public WebElement debaccheader;
	
	@FindBy(xpath = "//span[@id='debtorNameAndAddress']")
	public WebElement debnameheader;
	
	@FindBy(xpath = "//span[@id='creditorAccNumber']")
	public WebElement creaccheader;
	
	@FindBy(xpath = "//span[@id='creditorName']")
	public WebElement crenameheader;
	
	@FindBy(xpath = "//span[@id='creditorAgentName']")
	public WebElement creagentheader;
	
	@FindBy(xpath = "//span[@id='amount']")
	public WebElement amtheader;
	
	@FindBy(xpath = "//span[@id='transactionDate']")
	public WebElement transdateheader;
	
	@FindBy(xpath = "//span[@id='chargeDetails']")
	public WebElement chargedetailsheader;
	
	@FindBy(xpath = "//span[@id='transactionType']")
	public WebElement transtypeheader;
	
	@FindBy(xpath = "//span[@id='createdDate']")
	public WebElement crtdateheader;
	
	@FindBy(xpath = "//span[@id='transactionIdentifier']")
	public WebElement transidheader;
	
	@FindBy(xpath = "//span[@id='creditTransferStatus']")
	public WebElement cretransstatusheader;
	
	@FindBy(xpath = "//span[@id='reversalReason']")
	public WebElement revreasonheader;
	
	@FindBy(xpath = "//span[@id='debtorAgentID']")
	public WebElement debagentidheader;
	
	@FindBy(xpath = "//span[@id='creditorAgentID']")
	public WebElement creagentidheader;
	
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
	
	@FindBy(xpath = "//input[@data-placeholder = 'Reversal Reason']")
	public WebElement reversal_reason;
	
	@FindBy(xpath = "//h3[contains(text(),'Reversal Payment Request Approval Queue')]")
	public WebElement verify_page;
	
	
	public static String debaccnumber, creaccnumber, debname, credtrastatus, credname, chargedetails; 
	public static String credagentname, amount, transdate, transtype, transid, debagentid, credagentid;
	public static String reversetransid, reversesetamt, reverseinstamt, createddate, reversereason, reversalreason;
	
	public void findtable() {
		for(int i=0; i<tablecolumn.size();i++) {
			if(tablecolumn.get(i).getText().contains(RealtimePaymentReversalInitiationPage.reversetransid+" ")) {
				base.highLighterMethod(tablecolumn.get(i));
				
				base.highLighterMethod(debaccheader);
				System.out.println(debaccheader);
				base.highLighterMethod(tablecolumn.get(i-10));
				debaccnumber = tablecolumn.get(i-10).getText();
				System.out.println(debaccnumber);
				Assert.assertEquals(debaccnumber, RealtimePaymentReversalInitiationPage.debaccnumber);
				
				base.highLighterMethod(debnameheader);
				System.out.println(debnameheader);
				base.highLighterMethod(tablecolumn.get(i-9));
				debname = tablecolumn.get(i-9).getText();
				System.out.println(debname);
//				Assert.assertEquals(debname, RealtimePaymentReversalInitiationPage.debname);

				base.highLighterMethod(creaccheader);
				System.out.println(creaccheader);
				base.highLighterMethod(tablecolumn.get(i-8));
				creaccnumber = tablecolumn.get(i-8).getText();
				System.out.println(creaccnumber);
				Assert.assertEquals(creaccnumber, RealtimePaymentReversalInitiationPage.creaccnumber);
				
				base.highLighterMethod(crenameheader);
				System.out.println(crenameheader);
				base.highLighterMethod(tablecolumn.get(i-7));
				credname = tablecolumn.get(i-7).getText();
				System.out.println(credname);
//				Assert.assertEquals(credname, RealtimePaymentReversalInitiationPage.credname);
				
				base.highLighterMethod(creagentheader);
				System.out.println(creagentheader);
				base.highLighterMethod(tablecolumn.get(i-6));
				credagentname = tablecolumn.get(i-6).getText();
				System.out.println(credagentname);
				Assert.assertEquals(credname, RealtimePaymentReversalInitiationPage.credname);
				
				base.highLighterMethod(amtheader);
				System.out.println(amtheader);
				base.highLighterMethod(tablecolumn.get(i-5));
				amount = tablecolumn.get(i-5).getText();
				System.out.println(amount);
				Assert.assertEquals(amount, RealtimePaymentReversalInitiationPage.amount);
				
				base.highLighterMethod(transdateheader);
				System.out.println(transdateheader);
				base.highLighterMethod(tablecolumn.get(i-4));
				transdate = tablecolumn.get(i-4).getText();
				System.out.println(transdate);
				
				base.highLighterMethod(chargedetailsheader);
				System.out.println(chargedetailsheader);
				base.highLighterMethod(tablecolumn.get(i-3));
				chargedetails = tablecolumn.get(i-3).getText();
				System.out.println(chargedetails);
				Assert.assertEquals(chargedetails, RealtimePaymentReversalInitiationPage.chargedetails);
				
				base.highLighterMethod(transtypeheader);
				System.out.println(transtypeheader);
				base.highLighterMethod(tablecolumn.get(i-2));
				transtype = tablecolumn.get(i-2).getText();
				System.out.println(transtype);
				Assert.assertEquals(transtype, RealtimePaymentReversalInitiationPage.transtype);
				
				base.highLighterMethod(crtdateheader);
				System.out.println(crtdateheader);
				base.highLighterMethod(tablecolumn.get(i-1));
				createddate = tablecolumn.get(i-1).getText();
				System.out.println(createddate);
				
				base.highLighterMethod(transidheader);
				System.out.println(transidheader);
				base.highLighterMethod(tablecolumn.get(i));
				transid = tablecolumn.get(i).getText();
				System.out.println(transid);
				Assert.assertEquals(transid, RealtimePaymentReversalInitiationPage.reversetransid+" ");
				
				base.highLighterMethod(cretransstatusheader);
				System.out.println(cretransstatusheader);
				base.highLighterMethod(tablecolumn.get(i+1));
				credtrastatus = tablecolumn.get(i+1).getText();
				System.out.println(credtrastatus);
//				Assert.assertEquals(credtrastatus, RealtimePaymentReversalInitiationPage.credtrastatus);
				
				base.highLighterMethod(revreasonheader);
				System.out.println(revreasonheader);
				base.highLighterMethod(tablecolumn.get(i+3));
				reversereason = tablecolumn.get(i+3).getText();
				System.out.println(reversereason);
//				Assert.assertEquals(reversereason, RealtimePaymentReversalInitiationPage.reversalreason);
				
				base.highLighterMethod(debagentidheader);
				System.out.println(debagentidheader);
				base.highLighterMethod(tablecolumn.get(i+4));
				debagentid = tablecolumn.get(i+4).getText();
				System.out.println(debagentid);
				Assert.assertEquals(debagentid, RealtimePaymentReversalInitiationPage.debagentid);
				
				base.highLighterMethod(creagentidheader);
				System.out.println(creagentidheader);
				base.highLighterMethod(tablecolumn.get(i+5));
				credagentid = tablecolumn.get(i+5).getText();
				System.out.println(credagentid);
				Assert.assertEquals(credagentid, RealtimePaymentReversalInitiationPage.credagentid);
				
		
			}
		}
	}
	
	public void clickedit() {
		for(int i=0; i<tablecolumn.size();i++) {
			if(tablecolumn.get(i).getText().contains(RealtimePaymentReversalInitiationPage.reversetransid)) {
				base.highLighterMethod(tablecolumn.get(i));
				action.moveToElement(tablecolumn.get(i)).build().perform();
				base.highLighterMethod(tablecolumn.get(i+2));
				action.moveToElement(tablecolumn.get(i+2)).build().perform();
				WebElement abc = tablecolumn.get(i+2).findElement(By.tagName("mat-icon"));
				base.click(abc);
				break;
			}
		}
	}
	
	public void verifydetails() {
		base.highLighterMethod(trans_id1);
		System.out.println(trans_id1.getAttribute("value"));
		Assert.assertEquals(trans_id1.getAttribute("value")+" ", RealtimePaymentReversalInitiationPage.transid);
		
		base.highLighterMethod(trans_date1);
		System.out.println(trans_date1.getAttribute("value"));
		
		base.highLighterMethod(deb_acc1);
		System.out.println(deb_acc1.getAttribute("value"));
		Assert.assertEquals(deb_acc1.getAttribute("value")+" ", RealtimePaymentReversalInitiationPage.debaccnumber);
		
		base.highLighterMethod(deb_name1);
		System.out.println(deb_name1.getAttribute("value"));
//		Assert.assertEquals(deb_name1.getAttribute("value")+" ", RealtimePaymentReversalInitiationPage.debname);
		
		base.highLighterMethod(deb_agentid1);
		System.out.println(deb_agentid1.getAttribute("value"));
		Assert.assertEquals(deb_agentid1.getAttribute("value")+" ", RealtimePaymentReversalInitiationPage.debagentid);
		
		base.highLighterMethod(cre_acc1);
		System.out.println(cre_acc1.getAttribute("value"));
		Assert.assertEquals(cre_acc1.getAttribute("value")+" ", RealtimePaymentReversalInitiationPage.creaccnumber);
		
		base.highLighterMethod(cre_name1);
		System.out.println(cre_name1.getAttribute("value"));
//		Assert.assertEquals(cre_name1.getAttribute("value")+" ", RealtimePaymentReversalInitiationPage.credname);
		
		base.highLighterMethod(cre_agentid1);
		System.out.println(cre_agentid1.getAttribute("value"));
		Assert.assertEquals(cre_agentid1.getAttribute("value")+" ", RealtimePaymentReversalInitiationPage.credagentid);
		
		base.highLighterMethod(settlement_amt);
		System.out.println(settlement_amt.getAttribute("value"));
//		Assert.assertEquals(settlement_amt.getAttribute("value"), RealtimePaymentReversalInitiationPage.amount);
		
		base.highLighterMethod(settlement_date);
		System.out.println(settlement_date.getAttribute("value"));
		
		base.highLighterMethod(reversal_transid);
		reversetransid = reversal_transid.getAttribute("value");
		System.out.println(reversetransid);
		Assert.assertEquals(reversetransid, RealtimePaymentReversalInitiationPage.reversetransid);
		
		base.highLighterMethod(reversal_settleamt);
		reversesetamt = reversal_settleamt.getAttribute("value");
		System.out.println(reversesetamt);
//		Assert.assertEquals(reversesetamt+" ", RealtimePaymentReversalInitiationPage.reversesetamt);
		
		base.highLighterMethod(reversal_instamt);
		reverseinstamt = reversal_instamt.getAttribute("value");
		System.out.println(reverseinstamt);
		Assert.assertEquals(reversesetamt, RealtimePaymentReversalInitiationPage.reversesetamt);
		
		base.highLighterMethod(reversal_reason);
		reversalreason = reversal_reason.getAttribute("value");
		System.out.println(reversalreason);
//		Assert.assertEquals(reversalreason, RealtimePaymentReversalInitiationPage.reversalreason);
		
	}
	
	public void verify_page() {
		base.explicitWait(verify_page);
		base.highLighterMethod(verify_page);
	}
	
}
