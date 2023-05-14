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

import baseClass.baseClass;
import driver.Drivers;

public class RightsManagementScreenPage extends Drivers{


	static baseClass base = new baseClass();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

	public RightsManagementScreenPage() {

		PageFactory.initElements( driver,this);

	}

	Actions action=new Actions(driver);


	@FindBy(xpath="//mat-icon[.='arrow_drop_down']")
	public WebElement NPSS_Btn;

	@FindBy(xpath="//span[.='Admin']")
	public WebElement admin_Btn;

	@FindBy(xpath="//mat-card-title[.='Role Registration']")
	public WebElement RoleRegistration_Btn;

	@FindBy(xpath="//input[@formcontrolname='roleName']")
	public WebElement  Rolename_textbox;

	@FindBy(xpath="//input[@formcontrolname='roleDescription']")
	public WebElement  RoleDescription_textbox;

	@FindBy(xpath="//div[@class='mat-ripple mat-tab-label mat-focus-indicator ng-star-inserted']")
	public WebElement  RolePermissionDetail_btn;

	@FindBy(xpath="//h4[.=' Admin']")
	public WebElement  adminclose_btn;

	@FindBy(xpath="//h4[.=' NPSS']")
	public WebElement  NPSSOpen_btn;

	@FindBy(xpath="(//span[@class='mat-checkbox-inner-container'])[36]")
	public WebElement NPSS_Reports_checkbox;

	@FindBy(xpath="//td[.=' Batch Credit Transfer File Upload ']")
	public WebElement module_name;

	@FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkbox;

	@FindBy(xpath="(//table[@role='table'])[2]/tbody/tr/td")
	public List <WebElement> checkbox_cell_value;

	@FindBy(xpath="(//table[@role='table'])[2]")
	public List <WebElement> table;

	@FindBy(xpath="(//table[@role='table'])[2]/tbody/tr")
	public List <WebElement> table_row_value;

	@FindBy(xpath="//div[@id='mat-tab-label-0-0']")
	public WebElement Role_details_btn;

	@FindBy(xpath="//div[.='Role Saved Successfully']")
	public WebElement success_role_tostmsg;

	@FindBy(xpath="//mat-card-title[.='Role Registration Approval']")
	public WebElement RoleRegistrationApproval_Btn;

	@FindBy(xpath="(//table[@role='table'])/tbody/tr/td")
	public List <WebElement> main_cell_value;

	@FindBy(xpath="//mat-label[.='Logout']")
	public WebElement Logout_btn;

	@FindBy(xpath="(//button[@class='mat-focus-indicator mat-raised-button mat-button-base Approve'])[1]")
	public WebElement approve_btn;

	@FindBy(xpath="//button[@class='mat-focus-indicator mat-tooltip-trigger mat-raised-button mat-button-base approve']//span[@class='mat-button-wrapper'][normalize-space()='Approve']")
	public WebElement Popup_approve_btn;

	@FindBy(xpath="//input[@formcontrolname='Remarks']")
	public WebElement remarks_text_btn;

	@FindBy(xpath="//input[@data-placeholder='Role Name']")
	public WebElement existing_rolename;

	@FindBy(xpath="(//mat-icon[.='edit '])[1]")
	public WebElement edit_icon;

	@FindBy(xpath="//button[@class='mat-focus-indicator mat-tooltip-trigger btn-delete mat-raised-button mat-button-base ng-star-inserted']")
	public WebElement delete_btn;

	@FindBy(xpath="(//span[.='Delete'])[2]")
	public WebElement Popup_delete_btn;

	@FindBy(xpath="//span[.='Reject']")
	public WebElement Reject_btn;

	@FindBy(xpath="(//span[.='Reject'])[2]")
	public WebElement popup_Reject_btn;

	@FindBy(xpath="//mat-icon[@role='img']")
	public List<WebElement> test;




	public String rolename,ExistingRolename;


	public void click_NPSS_admin_btn() throws InterruptedException
	{
		base.explicitWait(NPSS_Btn);
		base.highLighterMethod(NPSS_Btn);
		base.click(NPSS_Btn);
		base.explicitWait(admin_Btn);
		base.highLighterMethod(admin_Btn);
		base.click(admin_Btn);

	}

	public void click_RoleRegistration_btn() throws InterruptedException
	{
		base.highLighterMethod(RoleRegistration_Btn);
		base.explicitWait(RoleRegistration_Btn);
		base.click(RoleRegistration_Btn);
	}

	public String dummy() throws EncryptedDocumentException, IOException
	{
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Rightsmanagement");
		rolename=mapDataList.get(0).get("rolename");	
		//		System.out.println(rolename);
		return rolename;

	}

	public void Create_role_and_permissions() throws InterruptedException, FileNotFoundException, IOException
	{

		//Enteringrolename		
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Rightsmanagement");
		//rolename=mapDataList.get(0).get("rolename");
		rolename=dummy();
		Thread.sleep(2000);
		base.highLighterMethod(Rolename_textbox);
		base.explicitWait(Rolename_textbox);

		//		String uuid=UUID.randomUUID().toString();
		//		uuid=uuid.substring(0,Math.min(uuid.length(),10));

		base.sendKeys(Rolename_textbox, rolename);
		System.out.println(rolename + "this is created");

		//Enteringroledescription
		String roledescription=mapDataList.get(0).get("roledescription");
		base.explicitWait(RoleDescription_textbox);
		base.highLighterMethod(RoleDescription_textbox);
		base.sendKeys(RoleDescription_textbox, roledescription);

		//Click Permissions
		base.explicitWait(RolePermissionDetail_btn);
		base.highLighterMethod(RolePermissionDetail_btn);
		base.click(RolePermissionDetail_btn);

		//CloseadminPermissions
		base.explicitWait(adminclose_btn);
		base.highLighterMethod(adminclose_btn);
		base.click(adminclose_btn);

		//openNPSSPermission
		base.explicitWait(NPSSOpen_btn);
		base.highLighterMethod(NPSSOpen_btn);
		base.click(NPSSOpen_btn);

	}	

	public void select_firstcheckbox(String modulename) throws InterruptedException {


		for(int i =0;i<table_row_value.size();i++) 
		{
			if(table_row_value.get(i).getText().contains(modulename))
			{
				base.highLighterMethod(table_row_value.get(i));
				break;
			}
		}

		for(int j =0;j<checkbox_cell_value.size();j++) 
		{
			if(checkbox_cell_value.get(j).getText().contains(modulename)) 
			{
				base.highLighterMethod(checkbox_cell_value.get(j+2));
				List<WebElement> abc=checkbox_cell_value.get(j+2).findElements(By.tagName("label"));							
				//				System.out.println(abc.size());
				base.highLighterMethod(abc.get(0));
				base.explicitWait(abc.get(0));
				base.click(abc.get(0));
			}

		}
	}


	public void select_second_checkbox(String modulename) throws InterruptedException {

		for(int j =0;j<checkbox_cell_value.size();j++) 
		{
			if(checkbox_cell_value.get(j).getText().contains(modulename)) 
			{
				base.highLighterMethod(checkbox_cell_value.get(j+2));
				List<WebElement> abc=checkbox_cell_value.get(j+2).findElements(By.tagName("label"));							
				//				System.out.println(abc.size());
				base.highLighterMethod(abc.get(1));
				base.explicitWait(abc.get(1));
				base.click(abc.get(1));
			}

		}
	}

	public void verify_role_toastmsg()
	{
		base.highLighterMethod(success_role_tostmsg);
		base.explicitWait(success_role_tostmsg);		
		base.click(success_role_tostmsg);
	}


	public void verify_created_role() throws InterruptedException
	{		
		//back to role details screen
		base.highLighterMethod(Role_details_btn);
		base.explicitWait(Role_details_btn);
		Thread.sleep(6000);
		base.click(Role_details_btn);

		//assert created name in table
		for(int j =0;j<main_cell_value.size();j++) 
		{
			if(main_cell_value.get(j).getText().contains(rolename)) 
			{				
				//				System.out.println("updated maker assert loop");
				base.highLighterMethod(main_cell_value.get(j));
				Assert.assertEquals(main_cell_value.get(j).getText(), rolename +" ");
			}
		}
	}

	public void verify_roleregistration_approval_btn()
	{
		base.highLighterMethod(RoleRegistrationApproval_Btn);
		base.explicitWait(RoleRegistrationApproval_Btn);		
		base.click(RoleRegistrationApproval_Btn);
	}

	public void click_logout_btn()
	{		
		base.highLighterMethod(Logout_btn);
		base.click(Logout_btn);
	}

	public void verify_maker_created_rolename() throws InterruptedException
	{
		for(int i =0;i<main_cell_value.size();i++) 
		{
			//			System.out.println(rolename +"before loop");
			if(main_cell_value.get(i).getText().contains(rolename+" ")) 
			{
				//System.out.println(rolename+"inside loop");
				base.highLighterMethod(main_cell_value.get(i));
				base.explicitWait(main_cell_value.get(i));
				WebElement abcd=main_cell_value.get(i+2);
				//abcd.click();
				base.highLighterMethod(abcd);
				Thread.sleep(4000);
				Actions action=new Actions(driver);
				action.moveToElement(abcd).click(abcd).build().perform();
				break;
			}
		}
	}

	public void click_approve_enter_remarks() throws EncryptedDocumentException, IOException, InterruptedException
	{


		//click approve button
		base.highLighterMethod(approve_btn);
		base.explicitWait(approve_btn);
		action.click(approve_btn).build().perform();


		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String remarks=mapDataList.get(0).get("remarks");
		base.explicitWait(remarks_text_btn);
		base.highLighterMethod(remarks_text_btn);
		base.sendKeys(remarks_text_btn, remarks);

		//popup approve
		base.highLighterMethod(Popup_approve_btn);
		base.explicitWait(Popup_approve_btn);
		base.click(Popup_approve_btn);

	}

	public void click_editbutton_update_rolesandpermission_details() throws InterruptedException, EncryptedDocumentException, IOException
	{
		for(int i=0;i<main_cell_value.size();i++)
		{
			if(main_cell_value.get(i).getText().contains(dummy()))
			{			

				base.highLighterMethod(main_cell_value.get(i));
				Thread.sleep(6000);
				WebElement editclick=main_cell_value.get(i+3).findElement(By.tagName("mat-icon"));	
				base.highLighterMethod(editclick);
				//				base.click(editclick);
				Thread.sleep(5000);
				action.moveToElement(editclick).click(editclick).build().perform();
				break;			
			}

		}
	}

	public void update_permission_details() throws InterruptedException
	{

		//CloseadminPermissions
		base.explicitWait(adminclose_btn);
		base.highLighterMethod(adminclose_btn);
		base.click(adminclose_btn);

		//openNPSSPermission
		base.explicitWait(NPSSOpen_btn);
		base.highLighterMethod(NPSSOpen_btn);
		base.click(NPSSOpen_btn);	

	}

	public void edited_checkbox1(String updatemodulename) throws InterruptedException {

		for(int j =0;j<checkbox_cell_value.size();j++) 
		{
			if(checkbox_cell_value.get(j).getText().contains(updatemodulename)) 
			{
				base.highLighterMethod(checkbox_cell_value.get(j+2));
				List<WebElement> abc=checkbox_cell_value.get(j+2).findElements(By.tagName("label"));							
				//				System.out.println(abc.size());
				base.highLighterMethod(abc.get(0));
				Actions action=new Actions(driver);
				action.moveToElement(abc.get(0)).click(abc.get(0)).build().perform();

			}

		}

	}

	public void edited_checkbox2(String updatemodulename) throws InterruptedException {

		for(int j =0;j<checkbox_cell_value.size();j++) 
		{


			if(checkbox_cell_value.get(j).getText().contains(updatemodulename)) 
			{
				base.highLighterMethod(checkbox_cell_value.get(j+2));
				List<WebElement> abc=checkbox_cell_value.get(j+2).findElements(By.tagName("label"));							
				//				System.out.println(abc.size());
				base.highLighterMethod(abc.get(1));
				base.explicitWait(abc.get(1));
				Actions action=new Actions(driver);
				action.moveToElement(abc.get(1)).click(abc.get(1)).build().perform();
			}

		}
	}


	public void	click_checkerapproved_editbtn() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		for(int i=0;i<main_cell_value.size();i++)
			//		{
			//
			//			if(main_cell_value.get(i).getText().contains("Checker Approved "))
			//			{				
			//				base.highLighterMethod(edit_icon);
			//				base.explicitWait(edit_icon);
			//				Thread.sleep(4000);
			//				base.click(edit_icon);
			//				Thread.sleep(4000);
			//				break;
			//			}
			if(main_cell_value.get(i).getText().contains(dummy()))
			{		

				base.highLighterMethod(main_cell_value.get(i));
				base.explicitWait(main_cell_value.get(i));
				WebElement abcd=main_cell_value.get(i+3);
				//abcd.click();
				base.highLighterMethod(abcd);
				Thread.sleep(4000);
				//				base.click(abcd);
				Actions action=new Actions(driver);
				action.moveToElement(abcd).click(abcd).build().perform();
				break;			
				//			base.highLighterMethod(edit_icon);
				//			base.explicitWait(edit_icon);
				//			Thread.sleep(4000);
				//			base.click(edit_icon);
				//			Thread.sleep(4000);
				//			break;
			}

	}


	public void storing_existingrole() throws InterruptedException
	{

		base.highLighterMethod(existing_rolename);
		ExistingRolename= existing_rolename.getAttribute("value");
		System.out.println(ExistingRolename +" this is existing Rolename");
	}

	public void delete_btn()
	{
		base.highLighterMethod(delete_btn);
		base.explicitWait(delete_btn);
		base.click(delete_btn);
	}


	public void click_deletebtn_and_enter_remarks() throws EncryptedDocumentException, IOException, InterruptedException
	{

		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String remarks=mapDataList.get(0).get("remarks");
		base.explicitWait(remarks_text_btn);
		base.highLighterMethod(remarks_text_btn);
		base.sendKeys(remarks_text_btn, remarks);

		//popup approve
		base.highLighterMethod(Popup_delete_btn);
		base.explicitWait(Popup_delete_btn);
		base.click(Popup_delete_btn);

	}

	public void verify_deleted_rolename_and_click_editbtn() throws InterruptedException
	{
		for(int i=0;i<main_cell_value.size();i++)
		{
			//System.out.println(ExistingRolename +"before if condition looop");	
			if(main_cell_value.get(i).getText().contains(ExistingRolename))
			{
				Thread.sleep(5000);				
				//System.out.println(ExistingRolename +"inside if condition");			
				base.highLighterMethod(main_cell_value.get(i+2));
				WebElement t=main_cell_value.get(i+2);
				base.click(t);
				Thread.sleep(5000);
				break;
			}
		}
	}

	public void verify_deleted_rolenameingrid()


	{
		for(int i=0;i<main_cell_value.size();i++)
		{
			if(main_cell_value.get(i).getText().equals(ExistingRolename))
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

	public void reject_btn()
	{

		base.explicitWait(Reject_btn);
		base.highLighterMethod(Reject_btn);
		base.click(Reject_btn);
	}

	public void Enter_remarks_and_popup_reject_btn() throws EncryptedDocumentException, IOException
	{

		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","QuickPay");
		String remarks=mapDataList.get(0).get("remarks");
		base.explicitWait(remarks_text_btn);
		base.highLighterMethod(remarks_text_btn);
		base.sendKeys(remarks_text_btn, remarks);

		base.explicitWait(popup_Reject_btn);
		base.highLighterMethod(popup_Reject_btn);
		base.click(popup_Reject_btn);
	}

	public void click_rolepermissiondetail_tab() throws InterruptedException
	{
		//get existingrolename
		base.highLighterMethod(existing_rolename);
		ExistingRolename=existing_rolename.getAttribute("value");
		Thread.sleep(2000);
		System.out.println(ExistingRolename +" this is existing Rolename");

		base.explicitWait(RolePermissionDetail_btn);
		base.highLighterMethod(RolePermissionDetail_btn);
		base.click(RolePermissionDetail_btn);
	}


	public void verify_maker_edited_rolename() throws InterruptedException, EncryptedDocumentException, IOException
	{
		for(int i =0;i<main_cell_value.size();i++) 
		{
			//			System.out.println(rolename +"before loop");
			if(main_cell_value.get(i).getText().contains(dummy())) 
			{
				//System.out.println(rolename+"inside loop");
				base.highLighterMethod(main_cell_value.get(i));
				base.explicitWait(main_cell_value.get(i));
				WebElement abcd=main_cell_value.get(i+2);
				//abcd.click();
				base.highLighterMethod(abcd);
				Thread.sleep(4000);
				Actions action=new Actions(driver);
				action.moveToElement(abcd).click(abcd).build().perform();
				break;
			}
		}
	}

	public void verify_rejected_rolenameingrid() throws EncryptedDocumentException, IOException


	{
		for(int i=0;i<main_cell_value.size();i++)
		{
			if(main_cell_value.get(i).getText().equals(dummy()))
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


