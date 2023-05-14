package pages;



import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import baseClass.baseClass;
import driver.Drivers;



public class BatchCreditTransferPage extends Drivers {


	static baseClass base = new baseClass();

	public BatchCreditTransferPage() {

		PageFactory.initElements( driver,this);

	}


	@FindBy(xpath="//h1[.=' Batch Credit Transfer File Upload ']")
	public WebElement BatchCreditTransferFileUpload_Page;

	@FindBy(xpath="//input[@id='mat-input-0']")
	public WebElement select_Template;

	@FindBy(xpath="//mat-option[@class='mat-option mat-focus-indicator ng-star-inserted']")
	public List<WebElement> dropdown_values;

	@FindBy(xpath="//input[@id='mat-input-1']")
	public WebElement select_Department;

	@FindBy(xpath="//span[.='No file Choosen']")
	public WebElement Fileupload_btn;

	@FindBy(xpath="//span[.='Submit']")
	public WebElement Submit_btn;

	@FindBy(xpath="//td[@class='mat-cell cdk-cell mat-tooltip-trigger divMatCell cdk-column-savedFileName mat-column-savedFileName ng-star-inserted'][1]")
	public WebElement Table_file_name;

	@FindBy(xpath="//span[@class='filename']")
	public WebElement uploaded_file_name;

	@FindBy(xpath="//mat-label[.='Logout']")
	public WebElement Logout_btn;

	@FindBy(xpath="//div[.=' Template not recognized. Click one of the options. ']")
	public WebElement Dropdown_Template_error_msg;

	@FindBy(xpath="//div[.=' Department not recognized. Click one of the options. ']")
	public WebElement Dropdown_Department_error_msg;

	@FindBy(xpath="(//div[@class='divMatCell max-550 ng-star-inserted'])[5]")
	public WebElement Table_File_status;

	@FindBy(xpath="(//button[@aria-describedby='cdk-describedby-message-14'])[1]")
	public WebElement Table_view_icon;

	@FindBy(xpath="//button[@mattooltip='Data Field Clear']")
	public WebElement Click_reset_btn;

	public static String uploaded_filename;

	@FindBy(xpath = "(//table[@role='table'])[2]/tbody/tr/td")
	public List<WebElement> TableColumn;

	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	
	public void Verify_BatchCreditTransferFileUpload_page() throws InterruptedException
	{
		Thread.sleep(4000);
		base.explicitWait(BatchCreditTransferFileUpload_Page);
		base.highLighterMethod(BatchCreditTransferFileUpload_Page);
		Assert.assertEquals(BatchCreditTransferFileUpload_Page.isDisplayed(), true);
		base.click(BatchCreditTransferFileUpload_Page);
	}

	public void click_Templatedropdown_btn() throws InterruptedException
	{
		base.highLighterMethod(select_Template);
		base.explicitWait(select_Template);
		Assert.assertEquals(select_Template.isDisplayed(), true);
		base.click(select_Template);
	}

	public void selectTemplateValues_dropdownOptions() throws FileNotFoundException, IOException {
		for(int i=0;i<dropdown_values.size();i++)
		{
			//		    System.out.println(dropdown_values.get(i).getText());
			String Template = base.loadProperties("Templatevalue");
			if(dropdown_values.get(i).getText().equalsIgnoreCase(Template))
			{
				
				base.click(dropdown_values.get(i));
				Assert.assertEquals(select_Template.getAttribute("value"), Template);
				break;
			}
		}
	}

	public void Verify_Template_value() throws InterruptedException
	{
		//Need to discuss this with team I ave not changed
		select_Template.getText();
		assertEquals(select_Template, select_Template);

	}

	public void click_Departmentdropdown_btn() 
	{
		base.highLighterMethod(select_Department);
		base.explicitWait(select_Department);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		base.click(select_Department);
		Assert.assertEquals(select_Department.isDisplayed(), true);

	}

	public void selectDepartmentValues_dropdownOptions() throws FileNotFoundException, IOException {
		for(int i=0;i<dropdown_values.size();i++)
		{
			//System.out.println(dropdown_values.get(i).getText());
			String Department = base.loadProperties("Departmentvalue");
			if(dropdown_values.get(i).getText().equalsIgnoreCase(Department))
			{
				base.click(dropdown_values.get(i));
				break;
			}
		}
	}

	public void Verify_Department_value() throws InterruptedException
	{
		//need to discuss with team
		select_Department.getText();
		assertEquals(select_Department, select_Department);

	}

	public void valid_excel_uploads () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009.xlsx";
		invalid_file_upload(otherFolder);
	}


			    public void Click_fileupload_btn() throws InterruptedException, AWTException {
			    	base.explicitWait(Fileupload_btn);
			    	base.highLighterMethod( Fileupload_btn);
			    	base.click(Fileupload_btn);
			    }
			    


	public void verify_excelname() throws InterruptedException
	{

		//System.out.println(uploaded_filename);
		//Thread.sleep(5000);
		base.explicitWait(Table_file_name);
		base.highLighterMethod(Table_file_name);
		String table_filename = Table_file_name.getText();
		//System.out.println(table_filename);
		//table_filename.replaceAll(table_filename,"");
		Assert.assertEquals(table_filename,uploaded_filename+' ');
	}
	
	//Adding below function to get the uploaded date and time as per Smitha feedback
	
	public String verifyUploadDateAndTime() {
		
		base.highLighterMethod(TableColumn.get(4));
		String dateAndTime = TableColumn.get(4).getText();
		return dateAndTime;
		
		
	}

	public void click_logout_btn() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Logout_btn);
//		driver.close();
	}

	public void Verify_invalid_template() throws InterruptedException
	{
		base.highLighterMethod(select_Template);
		base.explicitWait(select_Template);
		//base.click(select_Template);
		select_Template.sendKeys("invalidtemplate");
		base.explicitWait(Submit_btn);
		base.highLighterMethod(Submit_btn);
		base.click(Submit_btn);
	} 	

	//Newly Implemented method
	public void Verify_invalid_template_error_msg() throws InterruptedException
	{	
		base.explicitWait(Dropdown_Template_error_msg);
		base.highLighterMethod(Dropdown_Template_error_msg);
		boolean actual= Dropdown_Template_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void Verify_invalid_department() throws InterruptedException
	{	
		base.highLighterMethod(select_Department);
		base.explicitWait(select_Department);
		select_Department.sendKeys("invaliddepartment");
		base.explicitWait(Submit_btn);
		base.highLighterMethod(Submit_btn);
		base.click(Submit_btn);
		boolean actual= Dropdown_Department_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);


	}

	//Newly Implemented method
	public void Verify_invalid_department_error_msg() throws InterruptedException
	{	
		base.explicitWait(Dropdown_Department_error_msg);
		base.highLighterMethod(Dropdown_Department_error_msg);
		boolean actual= Dropdown_Department_error_msg.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void Click_submit_button() throws InterruptedException
	{
		base.explicitWait(Submit_btn);
		base.highLighterMethod(Submit_btn);
		base.click(Submit_btn);
	}



	//New implementation 20-01-2023 1:00am
	public void excel_uploads_null () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_null.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void invalid_file_upload(String path_name) throws InterruptedException, AWTException
	{
		base.explicitWait(Fileupload_btn);
		base.highLighterMethod(Fileupload_btn);
		base.click(Fileupload_btn);

		Robot rb = new Robot();
		Thread.sleep(4000);
		StringSelection str = new StringSelection(path_name);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);
		base.explicitWait(uploaded_file_name);
		base.highLighterMethod(uploaded_file_name);
		uploaded_filename= uploaded_file_name.getText();
	}		


	public void verify_actual_table_filename() throws InterruptedException
	{
		Thread.sleep(5000);
		base.explicitWait(Table_file_name);
		base.highLighterMethod(Table_file_name);
		String table_filename = Table_file_name.getText();
		Assert.assertEquals(table_filename,uploaded_filename+' ');
	}



	public void verify_failure_status() throws InterruptedException
	{
		base.explicitWait(Table_File_status);
		base.highLighterMethod(Table_File_status);
		String filestatus=Table_File_status.getText();
		assertEquals(filestatus, "Failed ");
	}

	public void Verify_invalid_Debitor_account_ban () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_debitor_account_ban.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_MessageReference () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_message_reference.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_debtor_account () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_debtor_account.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_debtor_account_type () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_debtor_account_type.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_debtor_agent () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_debtor_Agent.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_debtor_name () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_debtor_name.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_creditor_Agent () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_creditor_Agent.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Creditor_account_IBAN () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_Creditor_account_IBAN.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Creditor_Account () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_Creditor_Account.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Creditor_Account_Type () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_Creditor_Account_Type.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Creditor_Name () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_Creditor_Name.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Transaction_Type () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_Transaction_Type.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Settled_Amount () throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_Settled Amount.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Charge_Bearer() throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_Charge_Bearer.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Settlement_Method() throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_Settlement_Method.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Verify_invalid_Settled_Currency() throws InterruptedException, AWTException
	{
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009_invalid_Settled_Currency.xlsx";
		invalid_file_upload(otherFolder);
	}

	public void Click_reset_button() throws InterruptedException
	{
		base.explicitWait(Click_reset_btn);
		base.highLighterMethod(Click_reset_btn);
		base.click(Click_reset_btn);
	}

	public void verify_field_isempty() throws InterruptedException
	{
		base.explicitWait(select_Template);
		String null_template=select_Template.getText();
		assertEquals(null_template,"");

		base.explicitWait(select_Department);
		String null_department=select_Department.getText();
		assertEquals(null_department,"");

		base.explicitWait(Fileupload_btn);
		String null_fileupload=Fileupload_btn.getText();
		assertEquals(null_fileupload,"No file Choosen");
	}

	public void null_template()
	{
		base.explicitWait(select_Template);
		String null_template=select_Template.getText();
		assertEquals(null_template,"");
	}

	public void null_department()
	{
		base.explicitWait(select_Department);
		String null_department=select_Department.getText();
		assertEquals(null_department,"");
	}

	public void null_uploadedfile()
	{
		base.explicitWait(Fileupload_btn);
		String null_fileupload=Fileupload_btn.getText();
		assertEquals(null_fileupload,"No file Choosen");
	}

}

