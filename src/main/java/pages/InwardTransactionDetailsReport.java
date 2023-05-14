package pages;


import static org.testng.Assert.assertEquals;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import baseClass.baseClass;
import driver.Drivers;



public class InwardTransactionDetailsReport extends Drivers {

static baseClass base = new baseClass();

	
	public InwardTransactionDetailsReport() {
		
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Clear Filter')]")
	public WebElement clearFilter_btn;
	
	@FindBy(xpath = "//span[text()=' View Report ']")
	public WebElement viewReport_btn;
	
	@FindBy(xpath = "//span[contains(text(),'PDF Download')]")
	public WebElement pdfdownload_btn;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'more_vert')]")
	public WebElement threedots_btn;
	
	@FindBy(xpath = "//button[contains(text(),'EXCEL Download')]")
	public WebElement exceldownload_btn;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'add')]")
	public WebElement add_bt;
	                  
	@FindBy(xpath = "(//mat-icon[text(),'remove'])[2]")
	public WebElement remove_bt;
	
	@FindBy(xpath = "//mat-option[@role='option']")
	public List<WebElement> selectField_btn;
	
	@FindBy(xpath = "//mat-option[@role='option']")
	public List<WebElement> selectOperator_btn;
	
	@FindBy(xpath = "//input[@data-placeholder='Search']")
	public WebElement search_field;
	
	@FindBy(xpath = "(//mat-error[contains(text(),' Select valid From/To Date')])[1]")
	public WebElement invalidfromtodate_error;
	
	@FindBy(xpath = "//span[@id='mode']")
	public WebElement assertresult;
	
	@FindBy(xpath = "//span[contains(text(),'No record found!.')]")
	public WebElement assertempty;
	
	@FindBy(xpath = "//mat-label[contains(text(),'From')]")
	public WebElement assertclear;
	
	@FindBy(xpath = "//span[contains(text(),'Select Field Name')]")
	public WebElement field_bt;
	
	@FindBy(xpath = "//span[contains(text(),'Operator')]")
	public WebElement operator_bt;
	
	@FindBy(xpath = "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-2']")
	public WebElement calendar_icon;
	
	@FindBy(xpath = "//div[.=' 10 ']")
	public WebElement calendar_date;
	
	@FindBy(xpath = "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-4']")
	public WebElement calendar_icon1;
	
	@FindBy(xpath = "//div[.=' 1 ']")
	public WebElement calendar_date1;
	
	@FindBy(xpath = "//span[text()='Select']")
	public WebElement select;
	
	@FindBy(xpath="//span[contains(text(),'Pacs008 Customer Credit Transfer Request Received')]")
	public WebElement firstoption;
	
	@FindBy(xpath="//span[contains(text(),'Payment Reversal Failed With Error')]")
	public WebElement secondoption;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[17]")
	public WebElement calendar_transdate;
	
	@FindBy(xpath = "(//span[@class='mat-button-wrapper'])[18]")
	public WebElement calendar_transdate1;
	
	@FindBy(xpath = "(//mat-icon[text()='arrow_drop_down_circle '])[4]")
	public WebElement download_btn002_return;
	
	@FindBy(xpath = "((//div[text()='PACS002 Accept Message Received From CB '])/following::mat-icon)[1]")
	public WebElement download_btn002;
	
	@FindBy(xpath = "((//div[contains(text(),'Credit Transfer UnBlockPosting Success ')])[1]/following::mat-icon)[1]")
	public WebElement returned_eyeicon;
	
	@FindBy(xpath = "(//mat-icon[text()='arrow_drop_down_circle '])[3]")
	public WebElement download_btn004;
	
	public  void click_004btn() {
		base.explicitWait(download_btn004);
		base.highLighterMethod(download_btn004);
		Assert.assertEquals(download_btn004.isDisplayed(), true);
		base.click(download_btn004);
	}
	
	public void click_returneyeicon_btn() throws InterruptedException
	{
		base.explicitWait(returned_eyeicon);
		base.highLighterMethod(returned_eyeicon);
		Assert.assertEquals(returned_eyeicon.isDisplayed(), true);
		base.click(returned_eyeicon);
	}
	
	public  void click_002btnreturn() {
		base.highLighterMethod(download_btn002_return);
		base.explicitWait(download_btn002_return);
		Assert.assertEquals(download_btn002_return.isDisplayed(), true);
		base.click(download_btn002_return);
	}
	
	public  void click_002btn() {
		base.highLighterMethod(download_btn002);
		base.explicitWait(download_btn002);
		Assert.assertEquals(download_btn002.isDisplayed(), true);
		base.click(download_btn002);
	}

	public void click_trans_cal() throws InterruptedException
	{
		base.explicitWait(calendar_transdate);
		base.highLighterMethod(calendar_transdate);
		Assert.assertEquals(calendar_transdate.isDisplayed(), true);
		base.click(calendar_transdate);
		base.explicitWait(calendar_date1);
		base.highLighterMethod(calendar_date1);
		Assert.assertEquals(calendar_date1.isDisplayed(), true);
		base.click(calendar_date1);
		base.explicitWait(viewReport_btn);
		base.highLighterMethod(viewReport_btn);
		Assert.assertEquals(viewReport_btn.isDisplayed(), true);
		base.click(viewReport_btn);
	}
	
	public void click_trans_cal1() throws InterruptedException
	{
		
		base.explicitWait(calendar_transdate);
		base.highLighterMethod(calendar_transdate);
		Assert.assertEquals(calendar_transdate.isDisplayed(), true);
		base.click(calendar_transdate);
		base.explicitWait(calendar_date1);
		base.highLighterMethod(calendar_date1);
		Assert.assertEquals(calendar_date1.isDisplayed(), true);
		base.click(calendar_date1);
		base.explicitWait(calendar_transdate1);
		base.highLighterMethod(calendar_transdate1);
		Assert.assertEquals(calendar_transdate1.isDisplayed(), true);
		base.click(calendar_transdate1);
		base.explicitWait(calendar_date1);
		base.highLighterMethod(calendar_date1);
		Assert.assertEquals(calendar_date1.isDisplayed(), true);
		base.click(calendar_date1);
		base.explicitWait(viewReport_btn);
		base.highLighterMethod(viewReport_btn);
		Assert.assertEquals(viewReport_btn.isDisplayed(), true);
		base.click(viewReport_btn);
		
	}
	
	
	public void click_viewreport_btn() throws InterruptedException
	{	
		// Changed highlighter to first line for ReconciliationSummaryReport.feature if any changes done please run the mentioned feature once
		base.highLighterMethod(viewReport_btn);
		base.explicitWait(viewReport_btn);
		Assert.assertEquals(viewReport_btn.isDisplayed(), true);
		base.click(viewReport_btn);
	}
	
	
	public void click_clearfilter_btn() throws InterruptedException
	{
		base.highLighterMethod(clearFilter_btn);
		base.explicitWait(clearFilter_btn);	
		Assert.assertEquals(clearFilter_btn.isDisplayed(), true);
		base.click(clearFilter_btn);
	}
	
	public void click_pdfdownload_btn() throws InterruptedException
	{	
		base.explicitWait(pdfdownload_btn);
		base.highLighterMethod(pdfdownload_btn);
		Assert.assertEquals(pdfdownload_btn.isDisplayed(), true);
		base.click(pdfdownload_btn);
	}
	
	public void click_threedots_btn() throws InterruptedException
	{
		base.explicitWait(threedots_btn);
		base.highLighterMethod(threedots_btn);
		Assert.assertEquals(threedots_btn.isDisplayed(), true);
		base.click(threedots_btn);
	}
	
	public void click_exceldownload_btn() throws InterruptedException
	{
		base.explicitWait(exceldownload_btn);
		base.highLighterMethod(exceldownload_btn);
		Assert.assertEquals(exceldownload_btn.isDisplayed(), true);
		base.click(exceldownload_btn);
	}
	
	public void click_add_btn() throws InterruptedException
	{
		base.explicitWait(add_bt);
		base.highLighterMethod(add_bt);
		Assert.assertEquals(add_bt.isDisplayed(), true);
		base.click(add_bt);
	}
	
	public void click_remove_btn() throws InterruptedException
	{	
		base.explicitWait(remove_bt);
		base.mouseHover(remove_bt);
		base.highLighterMethod(remove_bt);
		Assert.assertEquals(remove_bt.isDisplayed(), true);
		base.click(remove_bt);
	}
	
	public void view_invalidfromtoerror() throws InterruptedException
	{
		base.explicitWait(invalidfromtodate_error);
		base.highLighterMethod(invalidfromtodate_error);
		Thread.sleep(2000);
		invalidfromtodate_error.getText();
		assertEquals(invalidfromtodate_error, invalidfromtodate_error);
	}
	
	public void view_result_report() throws InterruptedException
	{
		base.highLighterMethod(assertresult);
		base.explicitWait(assertresult);
		assertresult.getText();
		assertEquals(assertresult, assertresult);
	}
	
	public void view_empty_report() throws InterruptedException
	{
		base.explicitWait(assertempty);
		base.highLighterMethod(assertempty);
		Thread.sleep(2000);
		assertempty.getText();
		assertEquals(assertempty, assertempty);
	}
	
	public void view_clear_filter() throws InterruptedException
	{
		base.explicitWait(assertclear);
		base.highLighterMethod(assertclear);
		Thread.sleep(2000);
		assertclear.getText();
		assertEquals(assertclear, assertclear);
	}
	
	public void view_addbtassert() throws InterruptedException
	{
		base.explicitWait(field_bt);
		base.highLighterMethod(field_bt);
		Thread.sleep(2000);
		field_bt.getText();
		assertEquals(field_bt, field_bt);
	}
	
	
	public void Click_calendar_icon() throws InterruptedException
	{
		
		base.highLighterMethod(calendar_icon);
		base.explicitWait(calendar_icon);
		Assert.assertEquals(calendar_icon.isDisplayed(), true);
		base.click(calendar_icon);
	}
	
	public void Click_calendar_date() throws InterruptedException
	{
		base.explicitWait(calendar_date);
		base.highLighterMethod(calendar_date);
		Assert.assertEquals(calendar_date.isDisplayed(), true);
		base.click(calendar_date);
	}
	
	public void Click_calendar_icon1() throws InterruptedException
	{
		base.explicitWait(calendar_icon1);
		base.highLighterMethod(calendar_icon1);
		Assert.assertEquals(calendar_icon1.isDisplayed(), true);
		base.click(calendar_icon1);
	}
	
	public void Click_calendar_date1() throws InterruptedException
	{
		base.explicitWait(calendar_date1);
		base.highLighterMethod(calendar_date1);
		Assert.assertEquals(calendar_date1.isDisplayed(), true);
		base.click(calendar_date1);
	}
	

	
}
	
	
	
	

