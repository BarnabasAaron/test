package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class outwardReversalStatusReportPage extends Drivers{
	
	static baseClass base = new baseClass();
	 login loginn = new login();
	 OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

	public outwardReversalStatusReportPage() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//a[.='Realtime Credit Transfer Approval']")
	public WebElement Realtime_credit_transferappoval_btn;
	
	@FindBy(xpath = "//span[.='Confirm Reversal Initiation']")
	public WebElement ConfirmReversalInitiation_btn;
	
	public void Click_ConfirmReversalInitiation_btn() throws InterruptedException
	{
		outward.waitforLoader();
		base.explicitWait(ConfirmReversalInitiation_btn);
		base.highLighterMethod(ConfirmReversalInitiation_btn);
		Assert.assertEquals(ConfirmReversalInitiation_btn.isDisplayed(), true);
		base.click(ConfirmReversalInitiation_btn);

	}
}
