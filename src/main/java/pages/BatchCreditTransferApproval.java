package pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;



public class BatchCreditTransferApproval extends Drivers {

	static baseClass base = new baseClass();
	login loginn = new login();

	public BatchCreditTransferApproval() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//span[contains(text(),'Approve')]")
	public WebElement Approve_btn;

	@FindBy(xpath = "//span[contains(text(),'Reject')]")
	public WebElement Reject_btn;

	@FindBy(xpath = "//h1[contains(text(),'Batch Credit Transfer Approval')]")
	public WebElement BatchCreditTransferApproval_Page;

	@FindBy(xpath = "//h1[contains(text(),'Batch Credit Transfer Approval')]")
	public WebElement BatchCreditTransferApprovalSummary_Page;

	@FindBy(xpath = "(//mat-icon[.='edit '])[1]")
	public WebElement Editicon;

	@FindBy(xpath = "(//span[.='Approve'])[2]")
	public WebElement ApprovePopup_btn;

	@FindBy(xpath = "(//span[.='Reject'])[2]")
	public WebElement RejectPopup_btn;

	@FindBy(xpath = "//div[contains(text(),'Charge Amount:')]/following::input[1]")
	public WebElement RemarksPopup_approve;

	@FindBy(xpath = "//div[contains(text(),'Charge Amount:')]/following::input[1]")
	public WebElement RemarksPopup_reject;

	@FindBy(xpath = "//div[contains(text(),'History')]")
	public WebElement History_btn;

	@FindBy(xpath = "//div[contains(text(),'Charge Amount:')]/following::input[1]")
	public WebElement RemarksPopup_approve_history;

	@FindBy(xpath = "//div[contains(text(),'Charge Amount:')]/following::input[1]")
	public WebElement RemarksPopup_reject_history;

	@FindBy(xpath = "//h4[contains(text(),'Workflow Logs')]")
	public WebElement History_page;

	@FindBy(xpath = "//mat-error[contains(text(),' Remarks is mandatory for Reject')]")
	public WebElement Reject_error;

	@FindBy(xpath = "(//div[@class='headers-value'])[2]")
	public WebElement Amount;

	WebDriverWait wait;
	public void  Checker_Login() throws FileNotFoundException, IOException {

		loginn.username_field(base.loadProperties("checkerusername"));
		loginn.password_field(base.loadProperties("password"));
		loginn.signin_button();
	}




	public void View_BatchCreditTransferApproval_Page() {
		base.explicitWait(BatchCreditTransferApproval_Page);
		base.highLighterMethod( BatchCreditTransferApproval_Page);
		Assert.assertEquals(base.isDisplayed(BatchCreditTransferApproval_Page), true);
	}

	public void Click_Editicon_btn() {
		base.explicitWait(Editicon);
		base.highLighterMethod( Editicon);
		Assert.assertEquals(Editicon.isDisplayed(), true);
		base.click(Editicon);
	}

	public void View_BatchCreditTransferApprovalSummary_Page() throws EncryptedDocumentException, IOException  {



		base.explicitWait(BatchCreditTransferApprovalSummary_Page);
		base.highLighterMethod( BatchCreditTransferApprovalSummary_Page);
		Assert.assertEquals(base.isDisplayed(BatchCreditTransferApprovalSummary_Page), true);
		//The below code is to get data from excel and compare the amount displayed in checker
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("SettledAmount");
		Assert.assertEquals(Amount, options);


	}



	public void Click_ApprovePopup() {
		base.explicitWait(ApprovePopup_btn);
		base.highLighterMethod( ApprovePopup_btn);
		Assert.assertEquals(ApprovePopup_btn.isDisplayed(), true);
		base.click(ApprovePopup_btn);

	}

	public void click_Approve_btn()  {
		base.explicitWait(Approve_btn);
		base.highLighterMethod( Approve_btn);
		Assert.assertEquals(Approve_btn.isDisplayed(), true);
		base.click(Approve_btn);
	}


	public void click_reject_btn()  {
		base.explicitWait(Reject_btn);
		base.highLighterMethod( Reject_btn);
		Assert.assertEquals(Reject_btn.isDisplayed(), true);
		base.click(Reject_btn);
	}

	public void Click_RejectPopup() {
		base.explicitWait(RejectPopup_btn);
		base.highLighterMethod( RejectPopup_btn);
		Assert.assertEquals(RejectPopup_btn.isDisplayed(), true);
		base.click(RejectPopup_btn);
	}

	public void Approve_RemarksPopup() throws EncryptedDocumentException, IOException{

		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("remarks1");

//		String remarks = System.getProperty("Remarks");
		base.explicitWait(RemarksPopup_approve);
		base.highLighterMethod( RemarksPopup_approve);
		base.sendKeys(RemarksPopup_approve, options);
		Assert.assertEquals(RemarksPopup_approve.getAttribute("value"), options);

	}

	public void Reject_RemarksPopup() throws EncryptedDocumentException, IOException {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("remarks1");
		
//		String remarks = System.getProperty("Remarks");
		base.explicitWait(RemarksPopup_reject);
		base.highLighterMethod( RemarksPopup_reject);
		base.sendKeys(RemarksPopup_reject, options);
		Assert.assertEquals(RemarksPopup_reject.getAttribute("value"), options);
		
		base.explicitWait(RemarksPopup_reject);
		base.highLighterMethod( RemarksPopup_reject);
	}

	public void Click_History_btn() {
		base.explicitWait(History_btn);
		base.highLighterMethod( History_btn);
		Assert.assertEquals(History_btn.isDisplayed(), true);
		base.click(History_btn);
	}

	public void View_History_page() {
		base.explicitWait(History_page);
		base.highLighterMethod( History_page);
		Assert.assertEquals(base.isDisplayed(History_page), true);
	}


	public void Approve_History_RemarksPopup() {
		base.explicitWait(RemarksPopup_approve_history);
		base.highLighterMethod( RemarksPopup_approve_history);
		String remarks = System.getProperty("Remarks");
		base.sendKeys(RemarksPopup_approve_history, remarks);
		Assert.assertEquals(RemarksPopup_approve_history.getAttribute("value"), remarks);
		base.click(RemarksPopup_approve_history);
	}

	public void Reject_History_RemarksPopup() {
		base.explicitWait(RemarksPopup_reject_history);
		base.highLighterMethod( RemarksPopup_reject_history);
		String remarks = System.getProperty("Remarks");
		base.sendKeys(RemarksPopup_reject_history, remarks);
		Assert.assertEquals(RemarksPopup_reject_history.getAttribute("value"), remarks);
		base.click(RemarksPopup_reject_history);
	}

	public void Reject_withoutentering_remarks() {
		base.explicitWait(Reject_error);
		base.highLighterMethod( Reject_error);
		Assert.assertEquals(base.isDisplayed(Reject_error), true);


	}






}

