package pages;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.baseClass;
import driver.Drivers;

public class NPSSDefaultChargeConfigurationPage extends Drivers{

	static baseClass base = new baseClass();
	login loginn = new login();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

	public NPSSDefaultChargeConfigurationPage() {

		PageFactory.initElements(driver, this);
		//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@FindBy(xpath="//mat-card-title[.='NPSS Charge Configuration']")
	public WebElement NPSS_Charge_Configuration_btn;

	@FindBy(xpath="mat-select-value-1")
	public WebElement Message_Type;

	@FindBy(xpath="//mat-option[@role='option']")
	public List<WebElement> Dropdown_values;	

	@FindBy(xpath="//div[@class='mat-select-value ng-tns-c124-25']")
	public WebElement Payment_flow_Type;

	@FindBy(xpath="//mat-checkbox[@class='mat-checkbox mat-accent ng-valid ng-dirty ng-touched mat-checkbox-checked']")
	public WebElement Checkbox_checked;

	@FindBy(xpath="//input[@aria-checked='false']")
	public WebElement Checkbox_unchecked;

	@FindBy(xpath="//span[.='Submit']")
	public WebElement submit_btn;

	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[2]")
	public WebElement Reject_checkbox;

	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[1]")
	public WebElement Accept_checkbox;

	@FindBy(xpath="//div[@role='alert']")
	public WebElement toastmsg_response;

	@FindBy(xpath="//input[@formcontrolname='chargePerCard']")
	public WebElement Card_value;

	@FindBy(xpath="//input[@formcontrolname='chargePerIban']")
	public WebElement IBAN_value;



	public void click_NPSSCharge_Configuration_btn() throws InterruptedException
	{
		base.highLighterMethod(NPSS_Charge_Configuration_btn);
		base.explicitWait(NPSS_Charge_Configuration_btn);
		base.click(NPSS_Charge_Configuration_btn);
	}

	public void selectMessageType(String value) {
		base.explicitWait(Message_Type);
		base.highLighterMethod(Message_Type);
		base.click(Message_Type);
		for(int i= 0;i<Dropdown_values.size();i++) {
			if(Dropdown_values.get(i).getText().equalsIgnoreCase(value)){
				base.click(Dropdown_values.get(i));
				break;
			}
		}
	}

	public void select_PaymentFlowType(String value) {
		base.explicitWait(Payment_flow_Type);
		base.highLighterMethod(Payment_flow_Type);
		//		base.click(Payment_flow_Type);
		Actions action=new Actions(driver);
		action.moveToElement(Payment_flow_Type).click(Payment_flow_Type).build().perform();	
		for(int i= 0;i<Dropdown_values.size();i++) {
			if(Dropdown_values.get(i).getText().equalsIgnoreCase(value)){
				base.click(Dropdown_values.get(i));
				break;
			}
		}

	}

	public void checkbox(String value) throws InterruptedException {
		if(value.equalsIgnoreCase("Accept")) 
		{
			base.explicitWait(Reject_checkbox);
			base.highLighterMethod(Reject_checkbox);
			//			Reject_checkbox.click();
			Actions action=new Actions(driver);
			action.moveToElement(Reject_checkbox).click(Reject_checkbox).build().perform();			
			base.click(submit_btn);
		}
		else if(value.equalsIgnoreCase("Reject"))
		{
			base.highLighterMethod(Accept_checkbox);
			Accept_checkbox.click();
			base.click(submit_btn);
		}
		else
		{
			base.highLighterMethod(submit_btn);
			base.click(submit_btn);
		}
	}

	public void Verify_toastmsg_response() throws InterruptedException
	{
		base.highLighterMethod(toastmsg_response);
		//		base.explicitWait(toastmsg_response);			
		String response= toastmsg_response.getText();
		System.out.println(response);
	}

	public void enter_Card_value() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		String cardvalue=mapDataList.get(0).get("chargecardvalue");
		base.highLighterMethod(Card_value);
		base.explicitWait(Card_value);
		Actions action=new Actions(driver);
		action.moveToElement(Card_value).click(Card_value).build().perform();	
		base.sendKeys(Card_value, cardvalue);

	}

	public void enter_IBAN_value() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		String IBANvalue=mapDataList.get(0).get("IBANchargevalue");
		base.highLighterMethod(IBAN_value);
		base.explicitWait(IBAN_value);
		base.click(IBAN_value);
		base.sendKeys(IBAN_value, IBANvalue);

	}

	public void inward(String value) throws InterruptedException {
		if(value.equalsIgnoreCase("Accept")) 
		{
			base.highLighterMethod(Accept_checkbox);
			Accept_checkbox.click();
			base.click(submit_btn);
		}
		else if(value.equalsIgnoreCase("Reject"))
		{
			base.highLighterMethod(Reject_checkbox);
			Reject_checkbox.click();
			base.click(submit_btn);
		}
		else
		{
			Accept_checkbox.click();
			Reject_checkbox.click();
			base.highLighterMethod(submit_btn);
			base.click(submit_btn);
		}
	}

	public void Reveral_outward(String value) throws InterruptedException {
		if(value.equalsIgnoreCase("Accept")) 
		{
			base.highLighterMethod(Accept_checkbox);
			//base.click(submit_btn);
			Actions action=new Actions(driver);
			action.moveToElement(submit_btn).click(submit_btn).build().perform();
		}
		else if(value.equalsIgnoreCase("Reject"))
		{				
			Accept_checkbox.click();
			base.highLighterMethod(Reject_checkbox);
			Reject_checkbox.click();
			base.click(submit_btn);
		}
		else
		{
			Reject_checkbox.click();
			base.highLighterMethod(submit_btn);
			base.click(submit_btn);
		}
	}


}

