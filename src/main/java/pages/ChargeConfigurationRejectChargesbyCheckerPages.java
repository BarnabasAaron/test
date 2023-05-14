package pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;

public class ChargeConfigurationRejectChargesbyCheckerPages extends Drivers{
	static baseClass base = new baseClass();
	login loginn = new login();

	public ChargeConfigurationRejectChargesbyCheckerPages() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//mat-card-title[.='NPSS Charge Configuration Approval']")
	public WebElement NPSS_ChargeConfigurationApproval_btn;

	@FindBy(xpath="//span[.='Submit']")
	public WebElement submit_btn;

	@FindBy(xpath="((//mat-icon[.='edit '])[1])")
	public WebElement edit_icon;

	@FindBy(xpath="//span[.='Reject']")
	public WebElement Reject_btn;

	@FindBy(xpath="//input[@formcontrolname='Remarks']")
	public WebElement Remarks_btn;

	@FindBy(xpath="(//span[.='Reject'])[2]")
	public WebElement popup_Reject_btn;




	public void Click_submit_btn() throws InterruptedException
	{
		base.highLighterMethod(submit_btn);
		base.explicitWait(submit_btn);
		base.click(submit_btn);
	}

	public void Click_NPSS_ChargeConfiguration_Approval_btn() throws InterruptedException
	{
		base.highLighterMethod(NPSS_ChargeConfigurationApproval_btn);
		base.explicitWait(NPSS_ChargeConfigurationApproval_btn);
		base.click(NPSS_ChargeConfigurationApproval_btn);
	}

	public void Click_edit_btn() throws InterruptedException
	{

		base.highLighterMethod(edit_icon);
		base.explicitWait(edit_icon);
		base.click(edit_icon);
	}

	public void Click_Reject_btn() throws InterruptedException, FileNotFoundException, IOException
	{
		base.highLighterMethod(Reject_btn);
		base.explicitWait(Reject_btn);
		base.click(Reject_btn);
	}

	public void enter_remarks_and_click_reject_btn() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String remarks=mapDataList.get(0).get("remarks");
		base.explicitWait(Remarks_btn);
		base.highLighterMethod(Remarks_btn);
		base.sendKeys(Remarks_btn, remarks);

		base.highLighterMethod(popup_Reject_btn);
		base.explicitWait(popup_Reject_btn);
		base.click(popup_Reject_btn);

	}

}

