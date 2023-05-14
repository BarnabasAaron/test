package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;

public class ReconciliationSummaryReportPage extends Drivers {
	
public ReconciliationSummaryReportPage() {
		
		PageFactory.initElements(driver,this);
	}
	
	static baseClass base = new baseClass();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	
	@FindBy(xpath ="//a[contains(text(),'Reconciliation Summary Report')]")
	public WebElement Reconciliation_btn;
	
	@FindBy(xpath ="//button[.='PRINT']")
	public WebElement Print_btn;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'more_vert')]")
	public WebElement threedots_btn;
	
	
	
	
	public void Click_Reconciliation_Summary_Report_btn() throws InterruptedException 
	{
		outward.waitforLoader();
		base.highLighterMethod(Reconciliation_btn);
		base.click(Reconciliation_btn);		
	}
	
	public void verify_pdf_Download(String value) throws InterruptedException
	{
		base.verifyFileDownloaded(value);			
	}
	
	public void verify_excel_Download(String value) throws InterruptedException
	{
		base.verifyFileDownloaded(value);			
	}
	
//	public void Click_Print_btn() throws InterruptedException 
//	{		
//		base.explicitWait(threedots_btn);
//		base.highLighterMethod(threedots_btn);
//		base.click(threedots_btn);
//		
//		base.explicitWait(Print_btn);
//		base.highLighterMethod(Print_btn);
//		base.click(Print_btn);
//	}


}
