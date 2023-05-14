package pages;




import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;



public class QuickPayDirectEntryScreenPage extends Drivers {


	static baseClass base = new baseClass();

	public QuickPayDirectEntryScreenPage() {

		PageFactory.initElements( driver,this);

	}



	@FindBy(xpath ="//mat-select[@placeholder='Department']")
	public WebElement Click_dropdown_btn;

	@FindBy(xpath ="//span[@class='mat-option-text']")
	public List<WebElement> department_dropdown_value;

	@FindBy(id ="mat-error-33")
	public WebElement department_error_msg;

	@FindBy(id ="mat-error-35")
	public WebElement debtorname_error_msg;

	@FindBy(id ="mat-error-36")
	public WebElement agentID_error_msg;

	@FindBy(id ="mat-error-38")
	public WebElement creditorname_error_msg;

	@FindBy(id ="mat-error-39")
	public WebElement Creditor_agentID_error_msg;

	@FindBy(xpath ="//input[@formcontrolname='debtorAccountNumber']")
	public WebElement Click_debtorAccountnum_btn;

	@FindBy(xpath ="(//mat-icon[@class='mat-icon notranslate matsearchicon material-icons mat-icon-no-color'])[1]")
	public WebElement Click_search_btn;

	@FindBy(xpath ="//div[.='Debtor Account Number cannot be empty!!']")
	public WebElement debitor_acc_number_toastmsg_;

	@FindBy(xpath ="//div[.='Creditor account number cannot be empty!!']")
	public WebElement creditor_acc_number_toastmsg_;

	@FindBy(xpath ="//input[@data-placeholder='Debitor Name']")
	public WebElement verify_debitorName_btn;

	@FindBy(xpath ="//input[@formcontrolname='debtorAgentID']")
	public WebElement verify_debtor_agentid;

	@FindBy(xpath ="//textarea[@formcontrolname='debtorAddress']")
	public WebElement verify_debtor_address;

	@FindBy(xpath ="//div[@class='ng-star-inserted']")
	public WebElement verify_amount_in_words_txt;

	@FindBy(xpath ="//textarea[@data-placeholder='Remarks']")
	public WebElement verify_Remarks_txt;

	@FindBy(xpath="//input[@formcontrolname='creditorAccountNumber']")
	public WebElement verify_Creditor_account_number;

	@FindBy(xpath="//input[@formcontrolname='creditorName']")
	public WebElement verify_Creditor_name;

	@FindBy(xpath="//input[@formcontrolname='creditorAgentID']")
	public WebElement verify_Creditor_agentid;

	@FindBy(xpath="//textarea[@formcontrolname='creditorAddress']")
	public WebElement verify_Creditor_address;

	@FindBy(xpath ="(//mat-icon[@class='mat-icon notranslate matsearchicon material-icons mat-icon-no-color'])[2]")
	public WebElement cred_search_btn;

	@FindBy(xpath="//input[@formcontrolname='transactionAmount']")
	public WebElement click_Transaction_amount;

	@FindBy(xpath="//mat-error[.=' Transaction Amount must be greater than Zero. ']")
	public WebElement Transaction_amount_error_msg;

	@FindBy(xpath="//mat-error[.=' Total Amount must be greater than Zero. ']")
	public WebElement Total_amount_error_msg;

	@FindBy(xpath="//input[@formcontrolname='chargeDetails']")
	public WebElement verify_charge_type;

	@FindBy(xpath="//input[@formcontrolname='chargeAmount']")
	public WebElement verify_charge_amount;

	@FindBy(xpath="//input[@formcontrolname='vat']")
	public WebElement verify_VAT_amount;

	@FindBy(xpath="//input[@formcontrolname='transactionRemarks']")
	public WebElement enter_transaction_details;

	@FindBy(xpath="//input[@formcontrolname='totalAmount']")
	public WebElement verify_total_amount;

	@FindBy(id ="mat-input-14")
	public WebElement enter_remarks;

	@FindBy(xpath="//span[.='Reset']")
	public WebElement Reset_btn;

	@FindBy(xpath="//span[.='Initiate']")
	public WebElement click_initiate_btn;

	@FindBy(xpath="//span[.='Confirm and Proceed']")
	public WebElement click_confirm_and_proceed_btn;	

	@FindBy(xpath="//div[.='Initiation Confirmed Successfully!!']")
	public WebElement payment_success;	

	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();



	public void click_department_dropdown() throws InterruptedException
	{
		base.highLighterMethod(Click_dropdown_btn);
		base.explicitWait(Click_dropdown_btn);
		base.click(Click_dropdown_btn);
	}

	public void select_department_dropdown_value() throws InterruptedException, FileNotFoundException, IOException
	{

		for(int i=0;i<department_dropdown_value.size();i++)
		{
			System.out.println(department_dropdown_value.get(i).getText());
			List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
			String quickpay = mapDataList.get(0).get("quickpayDepartment");

			if(department_dropdown_value.get(i).getText().equalsIgnoreCase(quickpay))
			{
				System.out.println("The string value is "+quickpay);
				base.click(department_dropdown_value.get(i));
				break;
			}
		}
	}

	public void Verify_selected_Department_value() throws InterruptedException
	{
		System.out.println(Click_dropdown_btn.getText());
		assertEquals(Click_dropdown_btn, Click_dropdown_btn);


	}

	public void Verify_department_errormsg() throws InterruptedException
	{

		base.explicitWait(department_error_msg);
		base.highLighterMethod(department_error_msg);
		boolean actual= department_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void click_intiate_btn() throws InterruptedException
	{
		//added wait because got element interception error when base.click was executed
		outward.waitforLoader();
		base.explicitWait(click_initiate_btn);
		base.highLighterMethod(click_initiate_btn);
		base.click(click_initiate_btn);
	}

	public void enter_debtor_acc_number_details() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String debtoraccnumber=mapDataList.get(0).get("debtoraccnum");
		base.highLighterMethod(Click_debtorAccountnum_btn);
		base.explicitWait(Click_debtorAccountnum_btn);
		base.click(Click_debtorAccountnum_btn);
		base.sendKeys(Click_debtorAccountnum_btn, debtoraccnumber);
	}

	public void click_search_icon() throws InterruptedException
	{

		base.explicitWait(Click_search_btn);
		base.highLighterMethod(Click_search_btn);
		base.click(Click_search_btn);
	}	 

	public void verify_debtor_acc_number_error_toastmsg() throws InterruptedException
	{
		base.explicitWait(debitor_acc_number_toastmsg_);
		base.highLighterMethod(debitor_acc_number_toastmsg_);
		boolean actual= debitor_acc_number_toastmsg_.isDisplayed();
		Assert.assertEquals(actual, true);
	}

	public void verify_name_agentid_and_address_is_prefilled() throws InterruptedException
	{
		base.explicitWait(verify_debitorName_btn);
		base.highLighterMethod(verify_debitorName_btn);
		System.out.println(verify_debitorName_btn.getText());
		boolean actual= verify_debitorName_btn.isDisplayed();
		Assert.assertEquals(actual, true);

		base.explicitWait(verify_debtor_agentid);
		base.highLighterMethod(verify_debtor_agentid);
		System.out.println(verify_debtor_agentid.getText());
		boolean actualagent= verify_debtor_agentid.isDisplayed();
		Assert.assertEquals(actualagent, true);

		base.explicitWait(verify_debtor_address);
		base.highLighterMethod(verify_debtor_address);
		System.out.println(verify_debtor_address.getText());
		boolean actualaddress= verify_debtor_address.isDisplayed();
		Assert.assertEquals(actualaddress, true);
	}

	public void Verify_debtor_errormsg() throws InterruptedException
	{
		base.explicitWait(debtorname_error_msg);
		base.highLighterMethod(debtorname_error_msg);
		boolean actual= debtorname_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void Verify_debtor_agentId_errormsg() throws InterruptedException
	{
		base.explicitWait(agentID_error_msg);
		base.highLighterMethod(agentID_error_msg);
		boolean actual= agentID_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void enter_creditor_acc_number_details() throws InterruptedException, FileNotFoundException, IOException
	{
		//adding wait because got element intercept error
		outward.waitforLoader();
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String creditoraccnumber=mapDataList.get(0).get("creditoraccnum");


		base.highLighterMethod(verify_Creditor_account_number);
		base.explicitWait(verify_Creditor_account_number);
		base.click(verify_Creditor_account_number);
		base.explicitWait(verify_Creditor_account_number);
		base.sendKeys(verify_Creditor_account_number, creditoraccnumber);
	}	 

	public void verify_Creditor_name_agentid_and_address_is_prefilled() throws InterruptedException
	{
		base.explicitWait(verify_Creditor_name);
		base.highLighterMethod(verify_Creditor_name);
		System.out.println(verify_Creditor_name.getText());
		boolean actual= verify_Creditor_name.isDisplayed();
		Assert.assertEquals(actual, true);

		base.explicitWait(verify_Creditor_agentid);
		base.highLighterMethod(verify_Creditor_agentid);
		System.out.println(verify_Creditor_agentid.getText());
		boolean actualagent= verify_Creditor_agentid.isDisplayed();
		Assert.assertEquals(actualagent, true);

		base.explicitWait(verify_Creditor_address);
		base.highLighterMethod(verify_Creditor_address);
		System.out.println(verify_Creditor_address.getText());
		boolean actualaddress= verify_Creditor_address.isDisplayed();
		Assert.assertEquals(actualaddress, true);
	}

	public void click_creditor_search_icon() throws InterruptedException
	{
		base.explicitWait(cred_search_btn);
		base.highLighterMethod(cred_search_btn);
		base.click(cred_search_btn);
	}	 

	public void verify_creditor_acc_number_error_toastmsg() throws InterruptedException
	{
		base.explicitWait(creditor_acc_number_toastmsg_);
		base.highLighterMethod(creditor_acc_number_toastmsg_);
		boolean actual= creditor_acc_number_toastmsg_.isDisplayed();
		Assert.assertEquals(actual, true);
	}

	public void Verify_creditor_name_errormsg() throws InterruptedException
	{
		base.explicitWait(creditorname_error_msg);
		base.highLighterMethod(creditorname_error_msg);
		boolean actual= creditorname_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void Verify_agentID_errormsg() throws InterruptedException
	{
		base.explicitWait(Creditor_agentID_error_msg);
		base.highLighterMethod(Creditor_agentID_error_msg);
		boolean actual= Creditor_agentID_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void enter_Transaction_amount() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String transactionamount=mapDataList.get(0).get("transactionamount");
		base.explicitWait(click_Transaction_amount);
		base.highLighterMethod(click_Transaction_amount);
		base.sendKeys(click_Transaction_amount, transactionamount);
	}

	public void verify_transactionamt_chargetype_amount_VAT_and_totalamount_is_prefilled() throws InterruptedException
	{
		base.explicitWait(verify_charge_type);
		base.highLighterMethod(verify_charge_type);
		boolean chargetype= verify_charge_type.isDisplayed();
		Assert.assertEquals(chargetype, true);

		base.explicitWait(verify_charge_amount);
		base.highLighterMethod(verify_charge_amount);
		boolean chargeamount= verify_charge_amount.isDisplayed();
		Assert.assertEquals(chargeamount, true);

		base.explicitWait(verify_VAT_amount);
		base.highLighterMethod(verify_VAT_amount);
		boolean VATamount= verify_VAT_amount.isDisplayed();
		Assert.assertEquals(VATamount, true);

		base.explicitWait(verify_total_amount);
		base.highLighterMethod(verify_total_amount);
		boolean totalamount= verify_total_amount.isDisplayed();
		Assert.assertEquals(totalamount, true);


	}

	public void Verify_transaction_amt__errormsg() throws InterruptedException
	{
		base.explicitWait(Transaction_amount_error_msg);
		base.highLighterMethod(Transaction_amount_error_msg);
		boolean actual= Transaction_amount_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void Verify_total_amt__errormsg() throws InterruptedException
	{
		base.explicitWait(Total_amount_error_msg);
		base.highLighterMethod(Total_amount_error_msg);
		boolean actual= Total_amount_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void enter_remarks() throws InterruptedException, FileNotFoundException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String remarks=mapDataList.get(0).get("remarks");
		base.explicitWait(enter_remarks);
		base.highLighterMethod(enter_remarks);
		base.sendKeys(enter_remarks, remarks);
	}

	public void click_confirm_and_proceed_btn() throws InterruptedException
	{

		base.explicitWait(click_confirm_and_proceed_btn);
		base.highLighterMethod(click_confirm_and_proceed_btn);
		outward.waitforLoader();
		base.click(click_confirm_and_proceed_btn);
	}

	public void Verify_payment_success_toast_msg() throws InterruptedException
	{
		base.explicitWait(payment_success);
		base.highLighterMethod(payment_success);
		boolean actual= payment_success.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void click_reset_btn() throws InterruptedException
	{
		base.explicitWait(Reset_btn);
		base.highLighterMethod(Reset_btn);
		base.click(Reset_btn);
	}

	public void verify_field_values() throws InterruptedException
	{

		//				base.explicitWait(Click_dropdown_btn);
		//				base.highLighterMethod(Click_dropdown_btn);
		//if(Click_dropdown_btn.getText()!= null && !Click_dropdown_btn.getText().isEmpty());
		//Adding below lines as per Smitha feedback
		base.scrollToElement(Click_dropdown_btn);
		base.highLighterMethod(Click_dropdown_btn);
		Boolean departmentField=Click_dropdown_btn.getText().isBlank();
		Boolean debtorACNumber=Click_debtorAccountnum_btn.getText().isEmpty();
		Boolean creditorACNumber=verify_Creditor_account_number.getText().isEmpty();
		Boolean transactionAmount=click_Transaction_amount.getText().isEmpty();
		Boolean remarks = enter_remarks.getText().isEmpty();
		System.out.println(departmentField + " "+debtorACNumber +" "+ creditorACNumber + transactionAmount + remarks);
		Assert.assertEquals(departmentField&&debtorACNumber&&creditorACNumber&&transactionAmount&&remarks, true);


	}

	//Adding below functions as per the feedback shared by Smitha\

	public void departmentIsDisplayed() {
		Assert.assertEquals(Click_dropdown_btn.isSelected(),false);
	}

	public void debitorACIsDisplayed() {

		Assert.assertEquals(Click_debtorAccountnum_btn.isDisplayed(),false);

	}

	public void debtorNameIsDisplayed() {

		Assert.assertEquals(verify_debitorName_btn.isDisplayed(),false);


	}

	public void debtorAgentIdIsDisplayed() {

		Assert.assertEquals(verify_debtor_agentid.isDisplayed(),false);


	}

	public void creditorAccountNumberIsDisplayed() {

		Assert.assertEquals(verify_Creditor_account_number.isDisplayed(),false);

	}

	public void creditorNameIsDisplayed() {

		Assert.assertEquals(verify_Creditor_name.isDisplayed(),false);

	}

	public void creditorAgentIdIsDisplayed() {

		Assert.assertEquals(verify_Creditor_agentid.isDisplayed(),false);

	}

	public void transactionAmountIsDisplayed() {

		Assert.assertEquals(click_Transaction_amount.isDisplayed(),false);


	}

	public void totalAmountIsDisplayed() {

		Assert.assertEquals(verify_total_amount.isDisplayed(),false);

	}


}


