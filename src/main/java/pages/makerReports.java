package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;


public class makerReports extends Drivers {

	static baseClass base = new baseClass();

	public makerReports() {

		
		PageFactory.initElements(driver, this);

	}


	@FindBys({@FindBy(xpath = "//div[@id='spinner']")})
	private List<WebElement> bothcriteria;
	
	@FindBy(xpath = "//div[@id='spinner']")
	public WebElement loader;
	
	@FindBy(linkText = "Outward Transaction Detail Report")
	WebElement outwardTransactionReport;
	
	@FindBy(linkText = "Outward Transaction Summary Report")
	WebElement outwardTransactionSummaryReport;
	
	@FindBy(xpath = "//a[contains(text(),'Inward Transaction Detail Report')]")
	public WebElement inwardTransactionDetailsReport_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Outward Reconciliation Detail Report')]")

	public WebElement OutwardReconciliationDetailsReport;


	@FindBy(xpath = "//a[contains(text(),'Inward Reconciliation Detail Report')]")

	public WebElement InwardReconciliationDetailsReport;
	
	
	@FindBy(xpath ="//a[contains(text(),'Reconciliation Summary Report')]")
	public WebElement Reconciliation_btn;
	

	@FindBy(xpath = "//a[.='Outward Transaction Summary Report']")
	public WebElement OutwardTransactionSummaryReport;

	public void Click_OutwardReconciliationdetailsreport_btn() throws InterruptedException {

	base.explicitWait(OutwardReconciliationDetailsReport);

	base.highLighterMethod(OutwardReconciliationDetailsReport);

	base.click(OutwardReconciliationDetailsReport);


	}


	public void Click_InwardReconciliationdetailsreport_btn() throws InterruptedException {

	base.explicitWait(InwardReconciliationDetailsReport);

	base.highLighterMethod(InwardReconciliationDetailsReport);

	base.click(InwardReconciliationDetailsReport);


	}
	
	
	public void selectOutwardTransactionDetailReport() throws InterruptedException {
		
		//BaseUtil.explicitWait(driver, outwardTransactionReport);
		base.highLighterMethod(outwardTransactionReport);
		Assert.assertEquals(outwardTransactionReport.isDisplayed(), true);
		base.click(outwardTransactionReport);
	}
	
	public void waitForLoader() {
		
		base.explicitWait(loader);
		if(base.isDisplayed(loader)==true) {
			base.dismissloader(bothcriteria, loader);
		}
	}
	
	
	public void selectoutwardTransactionSummaryReport() {
		
		base.highLighterMethod(outwardTransactionSummaryReport);
		Assert.assertEquals(outwardTransactionSummaryReport.isDisplayed(), true);
		base.click(outwardTransactionSummaryReport);
	}
	
	
	public void click_inward_transaction_details_btn() throws InterruptedException {
		base.explicitWait(inwardTransactionDetailsReport_btn);
		base.highLighterMethod(inwardTransactionDetailsReport_btn);
		Assert.assertEquals(inwardTransactionDetailsReport_btn.isDisplayed(), true);
		base.click(inwardTransactionDetailsReport_btn);
	}
	
	public void Click_Reconciliation_Summary_Report_btn() throws InterruptedException 
	{
		base.explicitWait(Reconciliation_btn);
		base.highLighterMethod(Reconciliation_btn);
		base.click(Reconciliation_btn);		
	}
	
	public void Click_Outward_Transaction_Summary_Report_btn() throws InterruptedException 
	{
		base.explicitWait(OutwardTransactionSummaryReport);
		base.highLighterMethod(OutwardTransactionSummaryReport);
		base.click(OutwardTransactionSummaryReport);		
	}
	
}
