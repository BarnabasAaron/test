package pages;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass ;
import driver.Drivers;

public class NPSSCustomChargeConfigurationPages extends Drivers{


	static baseClass base = new baseClass();
	login loginn = new login();

	public NPSSCustomChargeConfigurationPages() {

		PageFactory.initElements(driver, this);

	}

	Actions action=new Actions(driver);
	JavascriptExecutor executor = (JavascriptExecutor)driver;

	public String CreatedCustomcharge,UpdatedCustomcharge,DeletedCustomerCharge,AccountNumber,CustomerID,AccountType,cardvalue,IBANvalue;

	@FindBy(xpath="//div[@id='mat-tab-label-0-1']//div[@class='mat-tab-label-content']")
	public WebElement Custom_charge_tab;

	@FindBy(xpath="//table[@role='table']/tbody/tr")
	public List <WebElement> Table_row;

	@FindBy(xpath="//div[@class='mat-form-field-flex ng-tns-c57-33']")
	public WebElement Message_Type;

	@FindBy(xpath="//mat-option[@role='option']")
	public List<WebElement> Dropdown_values;	

	@FindBy(xpath="//div[@class='mat-form-field-flex ng-tns-c57-35']")
	public WebElement Payment_flow_Type;

	@FindBy(xpath="//input[@formcontrolname='accountType']")
	public WebElement AccountType_textbox;

	@FindBy(xpath="//input[@formcontrolname='customerId']")
	public WebElement CustomerID_textbox;

	@FindBy(xpath="//input[@formcontrolname='accountNumber']")
	public WebElement AccountNumber_textbox;

	@FindBy(xpath="//mat-select[@formcontrolname='isChargeRequiredForSuccess']")
	public WebElement accept_reject_dropdown;

	@FindBy(xpath="//span[.='Accept']")
	public WebElement Accept_value;

	@FindBy(xpath="//span[.='Reject']") 
	public WebElement Reject_value;

	@FindBy(xpath="//span[.='Both']")
	public WebElement Both_value;

	@FindBy(xpath="//span[.='Submit']")
	public WebElement submit_btn;

	@FindBy(xpath="//span[.='Update']")
	public WebElement update_btn;

	@FindBy(xpath="//input[@formcontrolname='chargeDescription']")
	public WebElement Charge_description;

	@FindBy(xpath="(//table[@role='table'])/tbody/tr/td")
	public List<WebElement> TableCell_values;

	@FindBy(xpath="//mat-card-title[normalize-space()='NPSS Charge Configuration Approval']")
	public WebElement NPSSChargeConfigurationApproval_btn;

	@FindBy(xpath="//input[@formcontrolname='chargePerCard']")
	public WebElement Card_value;

	@FindBy(xpath="//input[@formcontrolname='chargePerIban']")
	public WebElement IBAN_value;

	@FindBy(xpath = "//mat-label[.='Settings']")
	public WebElement settingsIcon;

	@FindBy(xpath = "//span[.='Delete']")
	public WebElement Delete_btn;

	@FindBy(xpath = "//span[.='Reset']")
	public WebElement Reset_btn;

	@FindBy(xpath="//input[@formcontrolname='Remarks']")
	public WebElement remarks_text_btn;

	@FindBy(xpath="//button[@class='mat-focus-indicator mat-tooltip-trigger mat-raised-button mat-button-base approve']//span[@class='mat-button-wrapper'][normalize-space()='Approve']")
	public WebElement Popup_approve_btn;

	@FindBy(xpath="//button[@class='mat-focus-indicator mat-tooltip-trigger mat-raised-button mat-button-base delete']//span[@class='mat-button-wrapper'][normalize-space()='Delete']")
	public WebElement Popup_Delete_btn;

	@FindBy(xpath="//div[@id='mat-tab-label-0-1']//div[@class='mat-tab-label-content']")
	public WebElement History_btn;

	@FindBy(xpath="//div[@id='mat-tab-label-1-0']//div[@class='mat-tab-label-content']")
	public WebElement Click_Charge_tab_btn;

	@FindBy(xpath="//h4[.='Change Details']")
	public WebElement ChargeDetails_grid_btn;

	@FindBy(xpath="//h4[.='Workflow Logs']")
	public WebElement Workflow_logs_grid_btn;

	@FindBy(xpath="//button[@class='mat-focus-indicator mat-tooltip-trigger mat-raised-button mat-button-base reject']//span[@class='mat-button-wrapper'][normalize-space()='Reject']")
	public WebElement Reject_popup_btn;

	@FindBy(xpath="//span[.='Sl No']")
	public WebElement Slno_text;


	public void Click_CustomCharge_tab()
	{
		base.highLighterMethod(Custom_charge_tab);
		base.explicitWait(Custom_charge_tab);
		action.moveToElement(Custom_charge_tab).click(Custom_charge_tab).build().perform();
	}

	public void select_MessageType(String value) {		
		base.highLighterMethod(Message_Type);
		action.moveToElement(Message_Type).click(Message_Type).build().perform();
		for(int i= 0;i<Dropdown_values.size();i++) {
			if(Dropdown_values.get(i).getText().equalsIgnoreCase(value)){	
				executor.executeScript("arguments[0].click();", Dropdown_values.get(i));				
				break;
			}
		}
	}

	public void select_PaymentFlowType(String value) {		
		base.highLighterMethod(Payment_flow_Type);
		action.moveToElement(Payment_flow_Type).click(Payment_flow_Type).build().perform();	
		for(int i= 0;i<Dropdown_values.size();i++) {
			if(Dropdown_values.get(i).getText().equalsIgnoreCase(value)){
				executor.executeScript("arguments[0].click();", Dropdown_values.get(i));	
				break;
			}
		}

	}

	public void Enter_Accounttype() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		AccountType=mapDataList.get(0).get("Accounttype");
		base.highLighterMethod(AccountType_textbox);
		base.explicitWait(AccountType_textbox);
		base.click(AccountType_textbox);
		base.sendKeys(AccountType_textbox, AccountType);

	}

	public void Enter_CustomerID() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		CustomerID=mapDataList.get(0).get("CustomerID");
		base.highLighterMethod(CustomerID_textbox);
		base.explicitWait(CustomerID_textbox);
		base.click(CustomerID_textbox);
		base.sendKeys(CustomerID_textbox, CustomerID);

	}

	public void Enter_AccountNumber() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		AccountNumber=mapDataList.get(0).get("Accountnumber");
		base.highLighterMethod(AccountNumber_textbox);
		base.explicitWait(AccountNumber_textbox);
		base.click(AccountNumber_textbox);
		base.sendKeys(AccountNumber_textbox, AccountNumber);

	}

	public void Select_Accept_Reject_dropdownvalue(String value) throws InterruptedException {

		base.highLighterMethod(accept_reject_dropdown);
		base.explicitWait(accept_reject_dropdown);
		base.click(accept_reject_dropdown);

		if(value.equalsIgnoreCase("Accept")) 
		{
			base.highLighterMethod(Accept_value);
			action.moveToElement(Accept_value).click(Accept_value).build().perform();			
		}
		else if(value.equalsIgnoreCase("Reject"))
		{
			base.highLighterMethod(Reject_value);
			action.moveToElement(Reject_value).click(Reject_value).build().perform();	
		}
		else
		{
			base.highLighterMethod(Both_value);
			action.moveToElement(Both_value).click(Both_value).build().perform();
		}
	}


	public String verify_created_customchargedescription_name() throws InterruptedException
	{
		base.highLighterMethod(Charge_description);
		CreatedCustomcharge= Charge_description.getAttribute("value");
		return CreatedCustomcharge;
	}


	public void Click_submit_btn() throws InterruptedException
	{
		base.highLighterMethod(submit_btn);
		action.moveToElement(submit_btn).click(submit_btn).build().perform();
	}

	public void verify_createcustomcharge_in_grid() throws InterruptedException
	{
		for(int i =0;i<TableCell_values.size();i++) 
		{

			if(TableCell_values.get(i).getText().contains(CreatedCustomcharge))
			{
				boolean b=true;
				base.highLighterMethod(TableCell_values.get(i));
				action.moveToElement(TableCell_values.get(i)).perform();
				Assert.assertEquals(b, true);	
				break;

			}

		}
	}

	public void Click_NPSSChargeConfigurationApproval_btn() throws InterruptedException
	{
		base.highLighterMethod(NPSSChargeConfigurationApproval_btn);
		base.explicitWait(NPSSChargeConfigurationApproval_btn);
		base.click(NPSSChargeConfigurationApproval_btn);
	}


	public void verify_maker_created_customrule_in_checkergrid() throws InterruptedException
	{
		for(int i =0;i<Table_row.size();i++) 
		{		 
			if(Table_row.get(i).getText().contains(CreatedCustomcharge)) 
			{
				base.highLighterMethod(Table_row.get(i));
				base.explicitWait(Table_row.get(i));
				WebElement abcd=Table_row.get(i).findElement(By.tagName("mat-icon"));
				base.highLighterMethod(abcd);
				action.moveToElement(abcd).click(abcd).build().perform();
				break;			

			}
		}
	}




	public void verify_deleted_customchargeingrid()

	{
		base.explicitWait(Slno_text);	
		action.moveToElement(Slno_text).perform();	

		for(int i=0;i<TableCell_values.size();i++)
		{
			if(TableCell_values.get(i).getText().equals(CreatedCustomcharge))
			{
				System.out.println("Record not removed from the table");
			}
			else
			{
				System.out.println("Record Deleted successfully");
				break;
			}

		}
	}

	public void verify_Rejected_customchargeingrid()


	{
		for(int i=0;i<TableCell_values.size();i++)
		{
			if(TableCell_values.get(i).getText().equals(CreatedCustomcharge))
			{
				System.out.println("Record not removed from the table");
			}
			else
			{
				System.out.println("Record Deleted successfully");
				break;
			}

		}
	}

	public void verify_checkerApproved_status_in_makergrid() throws InterruptedException, EncryptedDocumentException, IOException
	{
		for(int i =0;i<TableCell_values.size();i++) 
		{
			if(TableCell_values.get(i).getText().contains(CreatedCustomcharge)) 
			{
				base.highLighterMethod(TableCell_values.get(i));
				action.moveToElement(TableCell_values.get(i)).perform();
				WebElement abcd=TableCell_values.get(i+3).findElement(By.tagName("div"));
				base.highLighterMethod(abcd);				
				//expected text from excel
				List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
				String expectedstatus=mapDataList.get(0).get("status");
				//aasert
				Assert.assertEquals(abcd.getText(), expectedstatus);

			}
		}
	}

	//--------------------------------------EditFlow-----------------------------------------------------------------------------------------

	public void select_Types() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Select Messagetype
		base.highLighterMethod(Message_Type);
		base.explicitWait(Message_Type);
		action.moveToElement(Message_Type).click(Message_Type).build().perform();

		for(int i=0;i<Dropdown_values.size();i++)
		{
			List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
			String messagetype = mapDataList.get(0).get("MessageType");
			if(Dropdown_values.get(i).getText().equalsIgnoreCase(messagetype))
			{
				executor.executeScript("arguments[0].click();", Dropdown_values.get(i));
				break;
			}
		}

		//Select Paymentflowtype
		base.highLighterMethod(Payment_flow_Type);
		base.explicitWait(Payment_flow_Type);
		action.moveToElement(Payment_flow_Type).click(Payment_flow_Type).build().perform();

		for(int i=0;i<Dropdown_values.size();i++)
		{
			List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
			String paymentflowtype = mapDataList.get(0).get("Paymentflowtype");
			if(Dropdown_values.get(i).getText().equalsIgnoreCase(paymentflowtype))
			{				
				executor.executeScript("arguments[0].click();", Dropdown_values.get(i));
				break;
			}
		}
	}

	public void select_Accept_Reject()
	{
		base.highLighterMethod(accept_reject_dropdown);
		base.click(accept_reject_dropdown);
		base.highLighterMethod(Accept_value);
		base.click(Accept_value);
	}


	public void click_editbtn_for_approvedCharge() throws InterruptedException
	{
		for(int i =0;i<Table_row.size();i++) 
		{
			if(Table_row.get(i).getText().contains(CreatedCustomcharge)) 
			{
				base.highLighterMethod(Table_row.get(i));
				WebElement abcd=Table_row.get(i).findElement(By.tagName("mat-icon"));
				base.highLighterMethod(abcd);
				action.moveToElement(abcd).perform();
				executor.executeScript("arguments[0].click();", abcd);
				break;
			}
		}
	}

	public void update_customchargevalue() throws EncryptedDocumentException, IOException
	{
		//UpdateAccountType
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		String UpdateAccountType=mapDataList.get(0).get("updateAccounttype");
		base.highLighterMethod(AccountType_textbox);
		base.explicitWait(AccountType_textbox);
		base.click(AccountType_textbox);
		base.sendKeys(AccountType_textbox, UpdateAccountType);

		//UpdateCustomerID
		List<LinkedHashMap<String, String>> mapDataList1 = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		String UpdateCustomerID=mapDataList1.get(0).get("updateCustomerID");
		base.highLighterMethod(CustomerID_textbox);
		base.explicitWait(CustomerID_textbox);
		base.click(CustomerID_textbox);
		base.sendKeys(CustomerID_textbox, UpdateCustomerID);

		//UpdateAccountNumber
		List<LinkedHashMap<String, String>> mapDataList2 = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		String UpdateAccountNumber=mapDataList2.get(0).get("updateAccountnumber");
		base.highLighterMethod(AccountNumber_textbox);
		base.explicitWait(AccountNumber_textbox);
		base.click(AccountNumber_textbox);
		base.sendKeys(AccountNumber_textbox, UpdateAccountNumber);

		//EnterCardValue
		List<LinkedHashMap<String, String>> mapDataList3 = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		String Updatecardvalue=mapDataList3.get(0).get("updatechargecardvalue");
		base.highLighterMethod(Card_value);

		base.explicitWait(Card_value);
		action.moveToElement(Card_value).click(Card_value).build().perform();	
		base.sendKeys(Card_value, Updatecardvalue);

		//EnterIBANValue
		List<LinkedHashMap<String, String>> mapDataList4 = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
		String UpdateIBANvalue=mapDataList4.get(0).get("updateIBANchargevalue");
		base.highLighterMethod(IBAN_value);
		base.explicitWait(IBAN_value);
		base.click(IBAN_value);
		base.sendKeys(IBAN_value, UpdateIBANvalue);

	}

	public String verify_updated_customchargedescription_name() throws InterruptedException
	{
		base.highLighterMethod(Charge_description);
		UpdatedCustomcharge= Charge_description.getAttribute("value");
		return UpdatedCustomcharge;
	}


	public void Click_update_btn() throws InterruptedException
	{
		base.highLighterMethod(update_btn);
		base.explicitWait(update_btn);
		base.click(update_btn);
	}

	public void verify_updatedcustomchargee_in_grid() throws InterruptedException
	{
		for(int i =0;i<TableCell_values.size();i++) 
		{

			if(TableCell_values.get(i).getText().contains(UpdatedCustomcharge))
			{
				boolean b=true;
				base.highLighterMethod(TableCell_values.get(i));
				action.moveToElement(TableCell_values.get(i)).perform();
				Assert.assertEquals(b, true);	
				break;

			}

		}
	}

	public void verify_maker_updated_customrule_in_checkergrid() throws InterruptedException
	{

		for(int i =0;i<Table_row.size();i++) 
		{
			if(Table_row.get(i).getText().contains(UpdatedCustomcharge)) 
			{
				base.highLighterMethod(Table_row.get(i));
				base.explicitWait(Table_row.get(i));
				WebElement abcd=Table_row.get(i).findElement(By.tagName("mat-icon"));
				base.highLighterMethod(abcd);
				action.moveToElement(abcd).click(abcd).build().perform();
				break;
			}
		}
	}

	public void verify_Checkerdeleted_customchargeingrid()

	{
		base.explicitWait(Slno_text);	
		action.moveToElement(Slno_text).perform();

		for(int i=0;i<TableCell_values.size();i++)
		{
			if(TableCell_values.get(i).getText().equals(UpdatedCustomcharge))
			{
				System.out.println("Record not removed from the table");
			}
			else
			{
				System.out.println("Record Deleted successfully");
				break;
			}

		}
	}

	public void verify_checkerApproved_updatedCustomcharge_status_in_makergrid() throws InterruptedException, EncryptedDocumentException, IOException
	{
		for(int i =0;i<TableCell_values.size();i++) 
		{
			if(TableCell_values.get(i).getText().contains(UpdatedCustomcharge)) 
			{
				base.highLighterMethod(TableCell_values.get(i));
				action.moveToElement(TableCell_values.get(i)).perform();
				WebElement abcd=TableCell_values.get(i+3).findElement(By.tagName("div"));
				base.highLighterMethod(abcd);				
				//expected text from excel
				List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
				String expectedstatus=mapDataList.get(0).get("status");
				//aasert
				Assert.assertEquals(abcd.getText(), expectedstatus);

			}
		}
	}

	//--------------------------------------DeleteFlow-----------------------------------------------------------------------------------------


	public String verify_Deleted_customchargedescription_name() throws InterruptedException
	{
		//Need to fetch the created customrule for delete flow and store in this method

		base.highLighterMethod(Charge_description);
		DeletedCustomerCharge= Charge_description.getAttribute("value");
		return DeletedCustomerCharge;
	}


	public void Enter_remarks_and_clickonDeletebtn() throws InterruptedException, EncryptedDocumentException, IOException
	{
		base.highLighterMethod(Delete_btn);
		base.explicitWait(Delete_btn);
		action.click(Delete_btn).build().perform();

		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String remarks=mapDataList.get(0).get("remarks");
		base.explicitWait(remarks_text_btn);
		base.highLighterMethod(remarks_text_btn);
		base.sendKeys(remarks_text_btn, remarks);

		//popup Delete
		base.highLighterMethod(Popup_Delete_btn);
		base.explicitWait(Popup_Delete_btn);
		base.click(Popup_Delete_btn);
	}

	public void verify_checkeractionpending_status_in_makergrid() throws InterruptedException, EncryptedDocumentException, IOException
	{

		for(int i =0;i<TableCell_values.size();i++) 
		{
			if(TableCell_values.get(i).getText().contains(DeletedCustomerCharge)) 
			{
				base.highLighterMethod(TableCell_values.get(i));
				action.moveToElement(TableCell_values.get(i)).perform();
				WebElement abcd=TableCell_values.get(i+3).findElement(By.tagName("div"));
				base.highLighterMethod(abcd);				
				//expected text from excel
				List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","NPSSChargeConfiguration");
				String expectedstatus=mapDataList.get(0).get("Pendingstatus");
				//aasert
				Assert.assertEquals(abcd.getText(), expectedstatus);

			}
		}
	}

	public void verify_maker_Deleted_customrule_in_checkergrid() throws InterruptedException
	{

		for(int i =0;i<Table_row.size();i++) 
		{
			if(Table_row.get(i).getText().contains(DeletedCustomerCharge)) 
			{
				base.highLighterMethod(Table_row.get(i));
				base.explicitWait(Table_row.get(i));
				WebElement abcd=Table_row.get(i).findElement(By.tagName("mat-icon"));
				base.highLighterMethod(abcd);
				action.moveToElement(abcd).click(abcd).build().perform();
				break;
			}
		}
	}

	public void verify_deletedrole_is_showing_in_makersgrid()
	{
		{
			for(int i=0;i<TableCell_values.size();i++)
			{
				if(TableCell_values.get(i).getText().equals(DeletedCustomerCharge))
				{
					System.out.println("Record not removed from the table");
				}
				else
				{
					System.out.println("Record Deleted successfully");
					break;
				}

			}
		}
	}

	//--------------------------------------ResetFlow-----------------------------------------------------------------------------------------


	public void Click_reset_btn()
	{
		base.highLighterMethod(Reset_btn);
		base.explicitWait(Reset_btn);
		base.click(Reset_btn);	
	}

	public void verify_datas_are_removed()

	{
		Assert.assertEquals(Message_Type.getAttribute("value"), null);
		Assert.assertEquals(Payment_flow_Type.getAttribute("value"), null);
		Assert.assertEquals(AccountType_textbox.getText().isBlank(), true);
		Assert.assertEquals(CustomerID_textbox.getAttribute("value").isBlank(), true);
		Assert.assertEquals(AccountNumber_textbox.getAttribute("value").isBlank(), true);
		Assert.assertEquals(accept_reject_dropdown.getAttribute("value"), null);
		Assert.assertEquals(Card_value.getAttribute("value").isBlank(), true);
		Assert.assertEquals(IBAN_value.getAttribute("value").isBlank(), true);

	}

	public void Verify_historytab_grid()
	{
		base.highLighterMethod(History_btn);
		base.explicitWait(History_btn);
		base.click(History_btn);

		base.highLighterMethod(ChargeDetails_grid_btn);
		base.isDisplayed(ChargeDetails_grid_btn);

		base.highLighterMethod(Workflow_logs_grid_btn);
		base.isDisplayed(Workflow_logs_grid_btn);

	}

	public void Verify_created_datas_in_historytab() throws InterruptedException
	{
		for(int i =0;i<TableCell_values.size();i++) 
		{

			if(TableCell_values.get(i).getText().contains(CreatedCustomcharge))
			{
				boolean b=true;
				base.highLighterMethod(TableCell_values.get(i));
				Assert.assertEquals(b, true);	


			}
			if(TableCell_values.get(i).getText().contains(AccountNumber))
			{
				boolean b=true;
				base.highLighterMethod(TableCell_values.get(i));
				Assert.assertEquals(b, true);	


			}
			if(TableCell_values.get(i).getText().contains(CustomerID))
			{
				boolean b=true;
				base.highLighterMethod(TableCell_values.get(i));
				Assert.assertEquals(b, true);	


			}
			if(TableCell_values.get(i).getText().contains(AccountType))
			{
				boolean b=true;
				base.highLighterMethod(TableCell_values.get(i));
				Assert.assertEquals(b, true);	

			}
		}
	}

	public void Click_Charge_tab()
	{
		base.highLighterMethod(Click_Charge_tab_btn);
		base.explicitWait(Click_Charge_tab_btn);
		base.click(Click_Charge_tab_btn);
	}


	public void click_Rejectbtn_enter_remarks() throws EncryptedDocumentException, IOException, InterruptedException
	{


		//click Reject button
		base.highLighterMethod(Reject_value);
		base.explicitWait(Reject_value);
		base.click(Reject_value);

		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String remarks=mapDataList.get(0).get("remarks");
		base.explicitWait(remarks_text_btn);
		base.highLighterMethod(remarks_text_btn);
		base.sendKeys(remarks_text_btn, remarks);

		//popup Reject
		base.highLighterMethod(Reject_popup_btn);
		base.explicitWait(Reject_popup_btn);
		base.click(Reject_popup_btn);

	}

	public void verify_Rejectedrole_is_showing_in_makersgrid()
	{
		{
			for(int i=0;i<TableCell_values.size();i++)
			{
				if(TableCell_values.get(i).getText().equals(CreatedCustomcharge))
				{
					System.out.println("Record not removed from the table");
				}
				else
				{
					System.out.println("Record Deleted successfully");
					break;
				}

			}
		}
	}
}


