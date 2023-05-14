package pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;




public class utilityPage extends Drivers {
	static baseClass base = new baseClass();


	public utilityPage() {

		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath="//a[.='Batch Credit Transfer File Upload']")
	public WebElement BatchCreditTransferFileUpload_btn;

	@FindBy(xpath ="//a[.='Realtime Credit Transfer Initiation (QuickPay)']")
	public WebElement Click_quickpay_btn;

	@FindBy(xpath="//a[contains(text(),'Realtime Inward Payment Return Initiation')]")
	public WebElement RealtimeInwardPaymentReturnInitiation_btn;


	@FindBy(xpath="//a[.='Realtime Payment Reversal Initiation']")
	public WebElement RealtimePaymentReversalInitiation_btn;
	
	@FindBy(xpath = "//a[.='Realtime Credit Transfer Initiation (DetailedView)']")
	public WebElement click_detailedView_btn;


	public void click_RealtimeInwardPaymentReturnInitiation_btn() throws InterruptedException
	{
		base.highLighterMethod(RealtimeInwardPaymentReturnInitiation_btn);
		base.explicitWait(RealtimeInwardPaymentReturnInitiation_btn);
		base.click(RealtimeInwardPaymentReturnInitiation_btn);
	}



	public void click_BatchCreditTransferFileUpload_btn() throws InterruptedException
	{

		base.highLighterMethod(BatchCreditTransferFileUpload_btn);
		base.explicitWait(BatchCreditTransferFileUpload_btn);
		base.click(BatchCreditTransferFileUpload_btn);
	}


	public void click_relatime_credit_transfer_quickpay_btn() throws InterruptedException
	{
		base.explicitWait(Click_quickpay_btn);
		base.highLighterMethod(Click_quickpay_btn);
		base.click(Click_quickpay_btn);
	}

	
	public void click_relatime_credit_transfer_detailedView_btn() {
		
		base.explicitWait(click_detailedView_btn);
		base.highLighterMethod(click_detailedView_btn);
		base.click(click_detailedView_btn);
	}

	public void click_RealtimePaymentReversalInitiation_btn() throws InterruptedException {
		base.highLighterMethod(RealtimePaymentReversalInitiation_btn);
		base.explicitWait(RealtimePaymentReversalInitiation_btn);
		base.click(RealtimePaymentReversalInitiation_btn);
	}






}



