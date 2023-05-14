package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class InwardRealtimeTransactionSummaryPage extends Drivers {

	

	 static baseClass base = new baseClass();
	 login loginn = new login();
	 OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

	public InwardRealtimeTransactionSummaryPage() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//mat-icon[@class='mat-icon notranslate mat-tooltip-trigger mat-icon-no-color']")
	public WebElement Setting_btn;
	
	@FindBy(xpath="//div[@class='drag-handle']")
	public List<WebElement> Filters_values;
	
	@FindBy(xpath="//th[@role='columnheader']")
	public List<WebElement> columns_values;
	
	@FindBy(xpath="//span[.='Save']")
	public WebElement Save_btn;
	
	@FindBy(xpath="//span[.='Close']")
	public WebElement Close_btn;
	
	@FindBy(xpath="//input[@aria-checked='false']")
	public WebElement Checkbox_false;
	
	@FindBy(xpath="//input[@aria-checked='true']")
	public WebElement Checkbox_true;
	
	@FindBy(xpath="//div[.='Saved Successfully']")
	public WebElement Success_toast_msg;
	
	@FindBy(xpath="//mat-label[.='Debtor Acc Number ']")
	public WebElement Debtor_acc_num_name;
	
	@FindBy(xpath="(//div[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin'])[1]")
	public WebElement Debtor_acc_num_Toggleoff;	
	
	@FindBy(xpath="//span[.='Debtor Acc Number']")
	public WebElement Debtor_acc_num_tablename;	
	
	@FindBy(xpath="//mat-label[.='Creditor Acc Number ']")
	public WebElement Creditor_acc_num_name;
	
	@FindBy(xpath="(//div[@class='mat-slide-toggle-bar mat-slide-toggle-bar-no-side-margin'])[2]")
	public WebElement Creditor_acc_num_Toggleoff;
	
	@FindBy(xpath="//span[.='Debtor Name And Address']")
	public WebElement Debtor_acc_num_and_address_tablename;	
	
	@FindBy(xpath="//mat-label[.='Transaction Amount ']")
	public WebElement Transaction_amt_name;
	
	@FindBy(xpath="//mat-label[.='Posting Reference Number ']")
	public WebElement PRN_name;
	
	@FindBy(xpath="//mat-label[.='State ']")
	public WebElement state_name;
	
	@FindBy(xpath="//mat-label[.='Mode ']")
	public WebElement mode_name;
	
	@FindBy(xpath="//mat-label[.='Transaction Type ']")
	public WebElement Transaction_type_name;
	
	@FindBy(xpath="(//mat-icon[.='remove_red_eye '])[1]")
	public WebElement View_btn;
	
	@FindBy(xpath="//mat-dialog-container[@id='mat-dialog-0']")
	public WebElement popup_frame;
	
	
	
	
	public void Click_setting_btn() throws InterruptedException {
		outward.waitforLoader();
		base.explicitWait(Setting_btn);
		base.highLighterMethod( Setting_btn);
		Assert.assertEquals(Setting_btn.isDisplayed(), true);
		base.click(Setting_btn);
	}
	
	public void verify_mandatory_fields()
	{
	
	 base.explicitWait(Debtor_acc_num_name);
	 base.highLighterMethod(Debtor_acc_num_name);
	 System.out.println(Debtor_acc_num_name.getText());
	 boolean actual= Debtor_acc_num_name.isDisplayed();
	 Assert.assertEquals(actual, true);
	 
	 base.explicitWait(Creditor_acc_num_name);
	 base.highLighterMethod(Creditor_acc_num_name);
	 System.out.println(Creditor_acc_num_name.getText());
	 boolean actual1= Creditor_acc_num_name.isDisplayed();
	 Assert.assertEquals(actual1, true);
	 
	 base.explicitWait(Transaction_amt_name);
	 base.highLighterMethod(Transaction_amt_name);
	 System.out.println(Transaction_amt_name.getText());
	 boolean actual2= Transaction_amt_name.isDisplayed();
	 Assert.assertEquals(actual2, true);
	 
	 base.explicitWait(PRN_name);
	 base.highLighterMethod(PRN_name);
	 System.out.println(PRN_name.getText());
	 boolean actual3= PRN_name.isDisplayed();
	 Assert.assertEquals(actual3, true);
	 
	 base.explicitWait(state_name);
	 base.highLighterMethod(state_name);
	 System.out.println(state_name.getText());
	 boolean actual4= state_name.isDisplayed();
	 Assert.assertEquals(actual4, true);
	 
	 base.explicitWait(mode_name);
	 base.highLighterMethod(mode_name);
	 System.out.println(mode_name.getText());
	 boolean actual5= mode_name.isDisplayed();
	 Assert.assertEquals(actual5, true);
	 
	 base.explicitWait(Transaction_type_name);
	 base.highLighterMethod(Transaction_type_name);
	 System.out.println(Transaction_type_name.getText());
	 boolean actual6= Transaction_type_name.isDisplayed();
	 Assert.assertEquals(actual6, true);
	 
	}
	
	public void toggle_off() throws InterruptedException
	{
		outward.waitforLoader();
		base.highLighterMethod(Debtor_acc_num_Toggleoff);
		base.explicitWait(Debtor_acc_num_Toggleoff);
		Assert.assertEquals(Debtor_acc_num_Toggleoff.isDisplayed(), true);
		base.click(Debtor_acc_num_Toggleoff);
		
		base.highLighterMethod(Creditor_acc_num_Toggleoff);
		base.explicitWait(Creditor_acc_num_Toggleoff);
		Assert.assertEquals(Creditor_acc_num_Toggleoff.isDisplayed(), true);
		base.click(Creditor_acc_num_Toggleoff);	
		
	}
	
	public void click_save_btn() throws InterruptedException
	 {
		 base.explicitWait(Save_btn);
		 base.highLighterMethod(Save_btn);
		 Assert.assertEquals(Save_btn.isDisplayed(), true);
		 base.click(Save_btn);
	 }
	
	public void verify_customize_preference_toastmsg() throws InterruptedException
	 {
		 base.explicitWait(Success_toast_msg);
		 base.highLighterMethod(Success_toast_msg);
		 boolean actual= Success_toast_msg.isDisplayed();
		 Assert.assertEquals(actual, true);
	 }
	
	public void match_cutomizedvalue_and_tablevalue() throws InterruptedException
	{
//		for(int i=0;i<columns_values.size();i++)
//		{
//			Thread.sleep(4000);
//			System.out.println(columns_values.get(i).getText());			
//			if(columns_values.get(i).getText()!=("Debtor Acc Number"))
//			break;
//			
//		}
		
		outward.waitforLoader();
		for(int i=0;i<columns_values.size();i++)
		{
			
			System.out.println(columns_values.get(i).getText());			
			if(columns_values.get(i).getText().equals("Debtor Acc Number"))
			System.out.println(" if Debtor Acc Number column is present,then it is not updated ");
			
		}
		
	}
	
	public void Click_view_btn() throws InterruptedException {
		outward.waitforLoader();
		base.explicitWait(View_btn);
		base.highLighterMethod( View_btn);
		Assert.assertEquals(View_btn.isDisplayed(), true);
		base.click(View_btn);
	}
	
	public void verify_history_popup() throws InterruptedException
	 {
		 base.explicitWait(popup_frame);
		 base.highLighterMethod(popup_frame);
		 boolean actual= popup_frame.isDisplayed();
		 Assert.assertEquals(actual, true);
	 }
	
	public void verify_close_btn() throws InterruptedException {
		base.explicitWait(Close_btn);
		base.highLighterMethod( Close_btn);
		Assert.assertEquals(Close_btn.isDisplayed(), true);
		base.click(Close_btn);
	}

}
