package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseClass.baseClass;
import driver.Drivers;

public class ChargeConfigurationLoadPendingapprovedbyMakerPages extends Drivers{
	static baseClass base = new baseClass();

	public ChargeConfigurationLoadPendingapprovedbyMakerPages() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//div[@id='mat-tab-label-0-1']")
	public WebElement Custom_charge_btn;

	@FindBy(xpath="(//div[.='Checker Approved '])[1]")
	public WebElement checker_approve_status;

	@FindBy(xpath="((//mat-icon[.='edit '])[1])")
	public WebElement edit_icon;

	@FindBy(xpath="(//div[.='Checker Action Pending '])[1]")
	public WebElement checker_pending_status;

	@FindBy(xpath="(//div[.='remove_red_eye '])[1]")
	public WebElement View_icon;	

	@FindBy(xpath="//input[@formcontrolname='accountType']")
	public WebElement Account_type_clickable;	




	public void click_Custom_charge_btn() throws InterruptedException
	{
		base.highLighterMethod(Custom_charge_btn);
		base.explicitWait(Custom_charge_btn);
		base.click(Custom_charge_btn);
	}

	public void Verify_checkerapproveStatus_and_ClickEditicon() throws InterruptedException {

		if((checker_approve_status.isDisplayed()) && (edit_icon.isDisplayed())){

			base.highLighterMethod(checker_approve_status);
			base.highLighterMethod(edit_icon);
			base.click(edit_icon);
		}
		else
		{
			System.out.println(" Checker Approved status is not Present in the table ");
		}

	}

	public void verify_fields_are_Clickable() throws InterruptedException {
		base.highLighterMethod(Account_type_clickable);
		Account_type_clickable.isEnabled();
		boolean b= Account_type_clickable.isEnabled();
		if(b==true)
		{
			System.out.println(" Fields are editable ");
		}

	}

	public void Verify_checkerReject_or_PendingStatus_and_Clickviewicon() throws InterruptedException {

		if((checker_pending_status.isDisplayed()) && (View_icon.isDisplayed())){
			base.highLighterMethod(checker_pending_status);		
			base.highLighterMethod(View_icon);		
			base.click(View_icon);

		}
		else
		{
			System.out.println(" Checker Reject/Pending status is not Present in the table ");
		}
	}

	public void verify_fields_are_uneditable() throws InterruptedException {
		base.highLighterMethod(Account_type_clickable);
		boolean b= Account_type_clickable.isEnabled();
		if(b==false)
		{
			System.out.println(" Fields are uneditable ");
		}			

	}

}
