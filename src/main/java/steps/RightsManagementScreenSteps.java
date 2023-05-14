package steps;

import java.util.LinkedHashMap;
import java.util.List;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InwardRealtimeTransactionSummaryPage;
import pages.MakerAdminHomePage;
import pages.NPSSDefaultChargeConfigurationPage;
import pages.OutwardTransactionDetailReport;
import pages.RightsManagementScreenPage;

public class RightsManagementScreenSteps {

	RightsManagementScreenPage rightsmanagement=new RightsManagementScreenPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	MakerAdminHomePage adminhomepage=new MakerAdminHomePage();
	InwardRealtimeTransactionSummaryPage inwardrealtimesummary=new InwardRealtimeTransactionSummaryPage();
	baseClass base = new baseClass();
	NPSSDefaultChargeConfigurationPage chargeconfiguration=new NPSSDefaultChargeConfigurationPage();
	LoginSteps login=new LoginSteps();

	@And("^Switch to admin account and click on settings button$")
	public void switch_to_admin_account_and_click_on_settings_button() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.click_NPSS_admin_btn();
		outward.waitforLoader();
		adminhomepage.selectSettings();
	}

	@And("^Click on Role registration button$")
	public void click_on_role_registration_button() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.click_RoleRegistration_btn();
	}

	@And("^Create Role and select Permission details$")
	public void create_role_and_select_permission_details() throws Throwable {
		rightsmanagement.Create_role_and_permissions();
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Rightsmanagement");
		String modulename=mapDataList.get(0).get("Rolename");
		rightsmanagement.select_firstcheckbox(modulename);
		rightsmanagement.select_second_checkbox(modulename);

	}

	@And("^Click on Save button$")
	public void click_on_save_button() throws Throwable {
		outward.waitforLoader();
		inwardrealtimesummary.click_save_btn();
	}

	@Then("^verify created role is showing in grid$")
	public void verify_created_role_is_showing_in_grid() throws Throwable {
		rightsmanagement.verify_created_role();
	}

	@And("^Click on Role Registration Approval button$")
	public void click_on_role_registration_approval_button() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.verify_roleregistration_approval_btn();
	}

	@And("^By clicking on edit button Verify the created role and permission details$")
	public void by_clicking_on_edit_button_verify_the_created_role_and_permission_details() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.verify_maker_created_rolename();
	}

	@Then("^Enter the remarks and click on Approve button$")
	public void enter_the_remarks_and_click_on_approve_button() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.click_approve_enter_remarks();
	}

	@And("^Logout from maker$")
	public void logout_from_maker() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.click_logout_btn();
	}

	@And("^Update Role and Permission details which is approved by Checker$")	
	public void update_role_and_permission_details_which_is_approved_by_checker() throws Throwable {		
		//click edit_button for existing checker approved data
		outward.waitforLoader();
		rightsmanagement.click_editbutton_update_rolesandpermission_details();

		//click role permission details tab
		outward.waitforLoader();
		rightsmanagement.click_rolepermissiondetail_tab();

		//close admin and click npss
		rightsmanagement.update_permission_details();


		//select_permission_details
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Rightsmanagement");
		String updatemodulename=mapDataList.get(0).get("selectRolename");
		outward.waitforLoader();
		rightsmanagement.edited_checkbox1(updatemodulename);
		rightsmanagement.edited_checkbox2(updatemodulename);
	}


	@And("^delete any Role and Permission details$")
	public void delete_any_role_and_permission_details() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.click_checkerapproved_editbtn();
		//		rightsmanagement.storing_existingrole();
		outward.waitforLoader();
		rightsmanagement.delete_btn();
	}

	@And("^Enter the remarks and click on delete button$")
	public void enter_the_remarks_and_click_on_delete_button() throws Throwable {
		rightsmanagement.click_deletebtn_and_enter_remarks();
	}

	@And("^Logout as maker$")
	public void logout_as_maker() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.click_logout_btn();
	}

	@And("^verify the deleted rolename and click on edit button$")
	public void verify_the_deleted_rolename_and_click_on_edit_button() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.verify_deleted_rolename_and_click_editbtn();
	}

	@And("^Logout as checker$")
	public void logout_as_checker() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.click_logout_btn();
	}

	@Then("^Verify deleted role is not displaying in grid$")
	public void verify_deleted_role_is_not_displaying_in_grid() throws Throwable {
		//switch to admin
		outward.waitforLoader();
		rightsmanagement.click_NPSS_admin_btn();
		//click setting btn
		outward.waitforLoader();
		adminhomepage.selectSettings();
		//click roleregistration_btn
		outward.waitforLoader();
		rightsmanagement.click_RoleRegistration_btn();
		outward.waitforLoader();
		//verify deleted role data
		outward.waitforLoader();
		rightsmanagement.verify_deleted_rolenameingrid();
	}

	@And("^enter remarks and click on reject button$")
	public void enter_remarks_and_click_on_reject_button() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.reject_btn();
		rightsmanagement.Enter_remarks_and_popup_reject_btn();
	}

	@And("^maker create a new role and permission details$")
	public void maker_create_a_new_role_and_permission_details() throws Throwable {

		//switch to admin
		outward.waitforLoader();
		rightsmanagement.click_NPSS_admin_btn();

		//click on settings
		outward.waitforLoader();
		adminhomepage.selectSettings();

		//click roleregistration btn
		outward.waitforLoader();
		rightsmanagement.click_RoleRegistration_btn();

		//Create rolename and permission
		rightsmanagement.Create_role_and_permissions();

		//fecthvaluesfromexcel
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Rightsmanagement");
		String modulename=mapDataList.get(0).get("Rolename");
		rightsmanagement.select_firstcheckbox(modulename);
		rightsmanagement.select_second_checkbox(modulename);

		//Click save_btn
		outward.waitforLoader();
		inwardrealtimesummary.click_save_btn();

		//logout as maker
		outward.waitforLoader();
		rightsmanagement.click_logout_btn();
	}


	@And("^By clicking on edit button Verify the updated role and permission details is displaying$")
	public void by_clicking_on_edit_button_verify_the_updated_role_and_permission_details_is_displaying() throws Throwable {
		outward.waitforLoader();
		rightsmanagement.verify_maker_edited_rolename();
	}

	@Then("^Login as maker and verify the reject role is showing in the grid$")
	public void login_as_maker_and_verify_the_reject_role_is_showing_in_the_grid() throws Throwable {

		//login as maker
		outward.waitforLoader();
		login.user_login_with_valid_username_and_valid_password();

		//switch to admin
		outward.waitforLoader();
		rightsmanagement.click_NPSS_admin_btn();

		//click on settings
		outward.waitforLoader();
		adminhomepage.selectSettings();

		//click roleregistration btn
		outward.waitforLoader();
		rightsmanagement.click_RoleRegistration_btn();


		//Verify rejected record in maker grid
		outward.waitforLoader();
		rightsmanagement.verify_rejected_rolenameingrid();
	}



}
