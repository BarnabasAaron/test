package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;


public class BatchReturnMakerVerificationPage extends Drivers {

	public BatchReturnMakerVerificationPage() {

		PageFactory.initElements( driver,this);

	}
	 static baseClass base = new baseClass();


	@FindBy(xpath="//h4[.='Inward Payment Processing']")
	public WebElement inward_payment_processing_btn;

	@FindBy(xpath="//a[.='Batch Return Maker Verification']")
	public WebElement Batch_Return_Maker_Verification_btn;

	@FindBy(xpath="//h1[.=' Batch Return Maker Verification ']")
	public WebElement Batch_Return_Maker_Verification_screen;

	@FindBy(xpath="(//tr[@role='row'])[2]")
	public WebElement table_first_record;

	@FindBy(xpath="(//mat-icon[.='edit '])[1]")
	public WebElement view_btn;

	@FindBy(xpath="//h1[.=' Batch Return Maker Verification Details ']")
	public WebElement Batch_Return_Maker_Verification_Details_screen;

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[1]")
	public WebElement Message_reference_value;

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[2]")
	public WebElement Batch_Processing_Charge_value;

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[3]")
	public WebElement Settlement_Date_value;

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[4]")
	public WebElement Received_Date_value;	

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[5]")
	public WebElement Total_No_of_Records_value;	

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[6]")
	public WebElement Debtor_Institution_value;

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[7]")
	public WebElement Received_File_value;

	@FindBy(xpath="(//mat-label[@class='font-header-content'])[8]")
	public WebElement Total_Amount_value;

	@FindBy(xpath="//h3[@class='table-heading ng-star-inserted']")
	public WebElement Batch_Return_Maker_Verification_Table_Details;

	@FindBy(xpath="//span[.='Approve']")
	public WebElement Approve_btn;

	@FindBy(xpath="//span[.='Reject']")
	public WebElement Reject_btn;

	@FindBy(xpath="(//div[@class='mat-tab-label-content'])[2]")
	public WebElement History_btn;

	@FindBy(xpath="//h4[.=' Workflow Logs']")
	public WebElement History_Workflow_logs_heading;

	public void Click_inward_payment_processing_btn() throws InterruptedException
	{
//		Thread.sleep(3000);
		
		base.highLighterMethod(inward_payment_processing_btn);
		base.explicitWait(inward_payment_processing_btn);
		Assert.assertEquals(inward_payment_processing_btn.isDisplayed(), true);

		base.click(inward_payment_processing_btn);

	}

	public void Click_Batch_Return_Maker_Verification_btn() throws InterruptedException
	{
		base.explicitWait(Batch_Return_Maker_Verification_btn);
		base.highLighterMethod(Batch_Return_Maker_Verification_btn);
		Assert.assertEquals(Batch_Return_Maker_Verification_btn.isDisplayed(), true);
		base.click(Batch_Return_Maker_Verification_btn);

	}

	public void verify_Batch_Return_Maker_Verification_screen() throws InterruptedException
	{
		base.explicitWait(Batch_Return_Maker_Verification_screen);
		base.highLighterMethod( Batch_Return_Maker_Verification_screen);
		boolean actual= Batch_Return_Maker_Verification_screen.isDisplayed();
		Assert.assertEquals(actual, true);

	}

	public void verify_record_in_table() throws InterruptedException
	{
		base.explicitWait(table_first_record);
		base.highLighterMethod(table_first_record);
		boolean actual= table_first_record.isDisplayed();
		Assert.assertEquals(actual, true);
	}

	public void Click_View_btn() throws InterruptedException
	{
		base.explicitWait(view_btn);
		base.highLighterMethod(view_btn);
		Assert.assertEquals(view_btn.isDisplayed(), true);
		base.click(view_btn);

	}

	public void verify_verfication_Screen() throws InterruptedException
	{
		base.explicitWait(Batch_Return_Maker_Verification_Details_screen);
		base.highLighterMethod(Batch_Return_Maker_Verification_Details_screen);
		boolean actual= Batch_Return_Maker_Verification_Details_screen.isDisplayed();
		Assert.assertEquals(actual, true);
	}

	public void verify_summary_details() throws InterruptedException
	{
		base.explicitWait(Message_reference_value);
		base.highLighterMethod(Message_reference_value);
		boolean actual= Message_reference_value.isDisplayed();
		Assert.assertEquals(actual, true);

		base.explicitWait(Batch_Processing_Charge_value);
		base.highLighterMethod(Batch_Processing_Charge_value);
		boolean actual1= Batch_Processing_Charge_value.isDisplayed();
		Assert.assertEquals(actual1, true);

		base.explicitWait(Settlement_Date_value);
		base.highLighterMethod(Settlement_Date_value);
		boolean actual2= Settlement_Date_value.isDisplayed();
		Assert.assertEquals(actual2, true);

		base.explicitWait(Received_Date_value);
		base.highLighterMethod(Received_Date_value);
		boolean actual3= Received_Date_value.isDisplayed();
		Assert.assertEquals(actual3, true);

		base.explicitWait(Total_No_of_Records_value);
		base.highLighterMethod(Total_No_of_Records_value);
		boolean actual4= Total_No_of_Records_value.isDisplayed();
		Assert.assertEquals(actual4, true);

		base.explicitWait(Debtor_Institution_value);
		base.highLighterMethod(Debtor_Institution_value);
		boolean actual5= Debtor_Institution_value.isDisplayed();
		Assert.assertEquals(actual5, true);

		base.explicitWait(Received_File_value);
		base.highLighterMethod(Received_File_value);
		boolean actual6= Received_File_value.isDisplayed();
		Assert.assertEquals(actual6, true);

		base.explicitWait(Total_Amount_value);
		base.highLighterMethod(Total_Amount_value);
		boolean actual7= Total_Amount_value.isDisplayed();
		Assert.assertEquals(actual7, true);
	}

	public void Click_history_btn() throws InterruptedException
	{
		base.explicitWait(History_btn);
		base.highLighterMethod(History_btn);
		Assert.assertEquals(History_btn.isDisplayed(), true);
		base.click(History_btn);

	}
	public void verify_workflow_logs() throws InterruptedException
	{
		base.explicitWait(History_Workflow_logs_heading);
		base.highLighterMethod(History_Workflow_logs_heading);
		boolean actual= History_Workflow_logs_heading.isDisplayed();
		Assert.assertEquals(actual, true);
	}


}



