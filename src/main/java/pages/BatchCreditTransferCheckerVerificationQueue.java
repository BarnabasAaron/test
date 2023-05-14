package pages;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;


public class BatchCreditTransferCheckerVerificationQueue extends Drivers {
	
static baseClass base = new baseClass();
BatchCreditTransferPage dateTime = new BatchCreditTransferPage();
	
	public BatchCreditTransferCheckerVerificationQueue() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//h4[contains(text(),'Outward Payment Processing')]")
	public WebElement OutwardPaymentProcessing_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Batch Credit Transfer Approval')]")
	public WebElement BatchCreditTransferApproval_btn;
	
	@FindBy(id = "MessageReference")
	public WebElement messageref;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[2]")
	public WebElement firstmessageref;
	
	@FindBy(id = "CreationDateTime")
	public WebElement creationdatetime;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[3]")
	public WebElement firstcreationdatetime;
	
	@FindBy(id = "NumberofTransactions")
	public WebElement numberoftransaction;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[4]")
	public WebElement firstnumberoftransaction;
	
	@FindBy(id = "Totalamount")
	public WebElement totalamount;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[5]")
	public WebElement firsttotalamount;
	
	@FindBy(id = "SettlementDate")
	public WebElement settlementdate;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[6]")
	public WebElement firstsettlementdate;
	
	@FindBy(id = "UploadedBy")
	public WebElement createdby;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[7]")
	public WebElement firstcreatedby;
	
	@FindBy(id = "Source")
	public WebElement source;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[8]")
	public WebElement firstsource;
	
	@FindBy(xpath = "//span[@id='SavedFileName']")
	public WebElement filename;
	
	@FindBy(xpath = "//h3[contains(text(),'Batch Credit Transfer Approval Queue')]/following::td[9]")
	public WebElement firstfilename;
	
	@FindBy(id = "(//mat-icon[.='edit '])[1]")
	public WebElement editt_btn;
	
	@FindBy(id = "//h3[contains(text(),'Batch Credit Transfer Details')]")
	public WebElement detailsbatch_view;
	
	
	
	public void view_messagereference() throws InterruptedException {
		base.explicitWait(messageref);
		base.highLighterMethod(messageref);
		Assert.assertEquals(base.isDisplayed(messageref), true);
		base.explicitWait(firstmessageref);
		base.highLighterMethod(firstmessageref);
		Assert.assertEquals(base.isDisplayed(firstmessageref), true);
	}
	public void view_creationdatetime() throws InterruptedException {
		base.explicitWait(creationdatetime);
		base.highLighterMethod( creationdatetime);
		Assert.assertEquals(base.isDisplayed(creationdatetime), true);
		base.explicitWait(firstcreationdatetime);
		base.highLighterMethod( firstcreationdatetime);
		Assert.assertEquals(base.isDisplayed(firstcreationdatetime), true);
		//Adding below lines based upon feedback shared by Smitha
//		String createdDate=dateTime.verifyUploadDateAndTime();
//		Assert.assertEquals(firstcreationdatetime.getText(), createdDate);
//		
	}
	
	public void view_numberoftransaction() throws InterruptedException, IOException {
		base.explicitWait(numberoftransaction);
		base.highLighterMethod( numberoftransaction);
		Assert.assertEquals(base.isDisplayed(numberoftransaction), true);
		base.explicitWait(firstnumberoftransaction);
		base.highLighterMethod( firstnumberoftransaction);
		Assert.assertEquals(base.isDisplayed(firstnumberoftransaction), true);
		//Adding below lines based upon comment shared by Smitha
//		String path = System.getProperty("user.dir");
//		String location = path + "\\src\\main\\resources\\excels\\sample009.xlsx";
//		XSSFWorkbook wbook = new XSSFWorkbook(location);
//		XSSFSheet sheet=wbook.getSheetAt(0);
//		int rowCount=sheet.getLastRowNum();
//		Assert.assertEquals(firstnumberoftransaction.getText(), rowCount);
		
		
	}
	public void view_totalamount() throws InterruptedException, EncryptedDocumentException, IOException {
		base.explicitWait(totalamount);
		base.highLighterMethod( totalamount);
		Assert.assertEquals(base.isDisplayed(totalamount), true);
		base.explicitWait(firsttotalamount);
		base.highLighterMethod( firsttotalamount);
		Assert.assertEquals(base.isDisplayed(firsttotalamount), true);
		//Lines added as per feedback shared by smitha
//		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
//		  String options=mapDataList.get(0).get("SettledAmount");
//		  Assert.assertEquals(firsttotalamount, options);
		  
	}
	
	
	public void view_settlementdate() throws InterruptedException {
		base.explicitWait(settlementdate);
		base.highLighterMethod( settlementdate);
		Assert.assertEquals(base.isDisplayed(settlementdate), true);
		base.explicitWait(firstsettlementdate);
		base.highLighterMethod( firstsettlementdate);
		Assert.assertEquals(base.isDisplayed(firstsettlementdate), true);
	}
	public void view_createdby() throws InterruptedException {
		base.explicitWait(createdby);
		base.highLighterMethod( createdby);
		Assert.assertEquals(base.isDisplayed(createdby), true);
		base.explicitWait(firstcreatedby);
		base.highLighterMethod( firstcreatedby);
		Assert.assertEquals(base.isDisplayed(firstcreatedby), true);
	}
	
	public void view_filename() throws InterruptedException {
		base.explicitWait(filename);
		base.highLighterMethod(filename);
		Assert.assertEquals(base.isDisplayed(filename), true);
		base.explicitWait(firstfilename);
		base.highLighterMethod(firstfilename);
		Assert.assertEquals(base.isDisplayed(firstfilename), true);
	}
	
	public void view_source() throws InterruptedException {
		base.explicitWait(source);
		base.highLighterMethod( source);
		Assert.assertEquals(base.isDisplayed(source), true);
		base.explicitWait(firstsource);
		base.highLighterMethod( firstsource);
		Assert.assertEquals(base.isDisplayed(firstsource), true);
	}
	public void clickk_edit() throws InterruptedException {
		Thread.sleep(5000);
//		base.explicitWait(edit_btn);
		base.highLighterMethod( editt_btn);
		base.click(editt_btn);
	}
	public void view_batchdetails() throws InterruptedException {
		base.explicitWait(detailsbatch_view);
		base.highLighterMethod( detailsbatch_view);
		Assert.assertEquals(base.isDisplayed(detailsbatch_view), true);
	}
	
	
	
}
