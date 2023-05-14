package pages;




import org.junit.Assert;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseClass.baseClass;
import driver.Drivers;



public class checkerHomepage extends Drivers {

	static baseClass base = new baseClass();


	public checkerHomepage() {

		PageFactory.initElements(driver, this);

	}



	@FindBy(xpath = "//h4[contains(text(),'Outward Payment Processing')]")
	public WebElement OutwardPaymentProcessing_btn;

	@FindBy(xpath = "//a[contains(text(),'Batch Credit Transfer Approval')]")
	public WebElement BatchCreditTransferApproval_btn;

	@FindBy(xpath = "//h4[contains(text(),'Inward Payment Processing')]")
	public WebElement InwardPaymentProcessing_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Realtime Payment Reversal Approval')]")
	public WebElement RealtimePaymentReversalApproval_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Reversal Payment Request Approval')]")
	public WebElement ReversalPaymentRequestApproval_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Realtime Credit Transfer Approval')]")
	public WebElement RealtimeCreditTransferApproval_btn;
	
	@FindBy(xpath = "//button[@aria-label='Example icon-button with a menu']")
	public WebElement changeRoleButton;
	
	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminOption;
	
	@FindBy(xpath = "//mat-label[contains(text(),'Settings')]")
	public WebElement Settings_btn;
	
	public void Click_Settings_btn() throws InterruptedException {
		base.explicitWait(Settings_btn);
		base.highLighterMethod(Settings_btn);
		base.click(Settings_btn);
	
	}

	public void clickOutwardPaymentProcessing_btn()  {
		base.explicitWait(OutwardPaymentProcessing_btn);
		//			explicitWait(OutwardPaymentProcessing_btn);
		base.highLighterMethod( OutwardPaymentProcessing_btn);
		base.explicitWait(OutwardPaymentProcessing_btn);
		Assert.assertEquals(OutwardPaymentProcessing_btn.isDisplayed(), true);
		base.click(OutwardPaymentProcessing_btn);

	}

	public void clickBatchCreditTransferApproval_btn(){
		base.explicitWait(BatchCreditTransferApproval_btn);
		//			explicitWait(BatchCreditTransferApproval_btn);
		base.highLighterMethod(BatchCreditTransferApproval_btn);
		Assert.assertEquals(BatchCreditTransferApproval_btn.isDisplayed(), true);
		base.click(BatchCreditTransferApproval_btn);	
	}
	
	public void Click_InwardPaymentProcessing_btn() throws InterruptedException {
		base.explicitWait(InwardPaymentProcessing_btn);
		base.highLighterMethod(InwardPaymentProcessing_btn);
		Assert.assertEquals(InwardPaymentProcessing_btn.isDisplayed(), true);

		base.click(InwardPaymentProcessing_btn);
	
	}
	
	public void Click_RealtimePaymentReversalApproval_btn() throws InterruptedException{
		try {
			base.highLighterMethod(RealtimePaymentReversalApproval_btn);
			base.explicitWait(RealtimePaymentReversalApproval_btn);
			Assert.assertEquals(RealtimePaymentReversalApproval_btn.isDisplayed(), true);
			base.click(RealtimePaymentReversalApproval_btn);
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			base.highLighterMethod(RealtimePaymentReversalApproval_btn);
			Assert.assertEquals(RealtimePaymentReversalApproval_btn.isDisplayed(), true);
			base.click(RealtimePaymentReversalApproval_btn);
		}	
	}
	
	
	public void click_ReversalPaymentRequestApproval_btn() {
		
		base.explicitWait(ReversalPaymentRequestApproval_btn);
		base.highLighterMethod(ReversalPaymentRequestApproval_btn);
		Assert.assertEquals(ReversalPaymentRequestApproval_btn.isDisplayed(), true);
		base.click(ReversalPaymentRequestApproval_btn);
		
	}
	
public void click_RealtimeCreditTransferApproval_btn() {
		
		base.explicitWait(RealtimeCreditTransferApproval_btn);
		base.highLighterMethod(RealtimeCreditTransferApproval_btn);
		Assert.assertEquals(RealtimeCreditTransferApproval_btn.isDisplayed(), true);
		base.click(RealtimeCreditTransferApproval_btn);
		
	}

	
	public void selectOptionToChangeAccess() {
		
		base.highLighterMethod(changeRoleButton);
		base.click(changeRoleButton);
		base.highLighterMethod(adminOption);
		base.click(adminOption);
		
	}

}



