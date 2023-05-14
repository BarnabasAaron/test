package steps;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MakerAdminHomePage;
import pages.NPSSDefaultChargeConfigurationPage;
import pages.NPSSCustomChargeConfigurationPages;
import pages.OutwardTransactionDetailReport;
import pages.RightsManagementScreenPage;

public class NPSSCustomChargeConfigurationSteps {

	NPSSDefaultChargeConfigurationPage chargeconfiguration=new NPSSDefaultChargeConfigurationPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	NPSSCustomChargeConfigurationPages NPSSChargeConfiguration=new NPSSCustomChargeConfigurationPages();
	MakerAdminHomePage adminhomepage=new MakerAdminHomePage();
	RightsManagementScreenPage rightsmanagement=new RightsManagementScreenPage();
	static baseClass base = new baseClass();
	LoginSteps launch = new LoginSteps();



	@And("^Click on Custom Charge tab$")
	public void click_on_custom_charge_tab() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_CustomCharge_tab();
	}


	@When("^select \"([^\"]*)\" in message type$")
	public void select_something_in_message_type(String strArg1) throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.select_MessageType(strArg1);

	}


	@And("^Select \"([^\"]*)\" in	 payment flow type$")
	public void select_something_in_payment_flow_type(String strArg1) throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.select_PaymentFlowType(strArg1);
	}

	@And("^Enter AccountType,CustomerId and AccountNumber$")
	public void enter_accounttypecustomerid_and_accountnumber() throws Throwable {
		NPSSChargeConfiguration.Enter_Accounttype();
		NPSSChargeConfiguration.Enter_CustomerID();
		NPSSChargeConfiguration.Enter_AccountNumber();

	}

	@And("^select \"([^\"]*)\" dropdown value then click on submit button$")
	public void select_something_dropdown_value_then_click_on_submit_button(String acceptreject) throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Select_Accept_Reject_dropdownvalue(acceptreject);
	}

	@And("^verify the created ChargeDescription name and click on submit button$")
	public void verify_the_created_chargedescription_name_and_click_on_submit_button() throws Throwable {
		NPSSChargeConfiguration.verify_created_customchargedescription_name();
		NPSSChargeConfiguration.Click_submit_btn();
	}

	@And("^verify the created Custom Charge is showing in the grid$")
	public void verify_the_created_custom_charge_is_showing_in_the_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_createcustomcharge_in_grid();
	}

	@And("^click on NPSS Charge Configuration Approval$")
	public void click_on_npss_charge_configuration_approval() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_NPSSChargeConfigurationApproval_btn();
	}


	@And("^Verify the created role and permission details in grid and click on edit button$")
	public void verify_the_created_role_and_permission_details_in_grid_and_click_on_edit_button() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_maker_created_customrule_in_checkergrid();
	}

	@And("^Approved record should not show in the grid$")
	public void approved_record_should_not_show_in_the_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_deleted_customchargeingrid();
	}

	@And("^Rejected record should not show in the grid$")
	public void Rejected_record_should_not_show_in_the_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_Rejected_customchargeingrid();
	}


	@And("^click setting button and select NPSS Charge configuration$")
	public void click_setting_button_and_select_npss_charge_configuration() throws Throwable {
		//CLick setting btn
		outward.waitforLoader();
		adminhomepage.selectSettings();
		//Click NPSS Charge Configuration btn
		outward.waitforLoader();
		chargeconfiguration.click_NPSSCharge_Configuration_btn();
	}

	@And("^switch to custom tab$")
	public void switch_to_custom_tab() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_CustomCharge_tab();
	}

	@Then("^after checker approved the charge rule Verify the status changed to approved in grid$")
	public void after_checker_approved_the_charge_rule_verify_the_status_changed_to_approved_in_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_checkerApproved_status_in_makergrid();
	}

	@When("^create a custom rule and approve the custom rule as checker$")
	public void create_a_custom_rule_and_approve_the_custom_rule_as_checker() throws Throwable {
		//SelectMessage andPaymentflowtype
		NPSSChargeConfiguration.select_Types();

		//enterAccountype,CustomerID and AccountNumber
		NPSSChargeConfiguration.Enter_Accounttype();
		NPSSChargeConfiguration.Enter_CustomerID();
		NPSSChargeConfiguration.Enter_AccountNumber();


		//select Accept/Reject
		NPSSChargeConfiguration.select_Accept_Reject();

		//enter Card and IBAN charges
		chargeconfiguration.enter_Card_value();
		chargeconfiguration.enter_IBAN_value();

		//clicksubmit
		NPSSChargeConfiguration.verify_created_customchargedescription_name();
		NPSSChargeConfiguration.Click_submit_btn();

		//verify the created customcharge
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_createcustomcharge_in_grid();

		//logout as maker and login as checker
		rightsmanagement.click_logout_btn();
		launch.user_login_with_valid_checker_username_and_password();


		//selectSettings
		outward.waitforLoader();
		adminhomepage.selectSettings();

		//selectNPSSApptovalBtn
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_NPSSChargeConfigurationApproval_btn();

		//verifymakercreatedcustomroleincheckergrid
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_maker_created_customrule_in_checkergrid();

		//approvecustomcharge
		outward.waitforLoader();
		rightsmanagement.click_approve_enter_remarks();

		//logoutaschecker
		outward.waitforLoader();
		rightsmanagement.click_logout_btn();

		//login as maker
		outward.waitforLoader();
		launch.user_login_with_valid_username_and_valid_password();

		//Click setting btn
		outward.waitforLoader();
		adminhomepage.selectSettings();
		//Click NPSS Charge Configuration btn

		//clickNPSSconfigurationBtn
		outward.waitforLoader();
		chargeconfiguration.click_NPSSCharge_Configuration_btn();

		//switchtoCustomtab
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_CustomCharge_tab();

		//verifycheckerapprovedstatus
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_checkerApproved_status_in_makergrid();
	}

	@And("^Verify the created role and permission detail in grid and click on edit button$")
	public void verify_the_created_role_and_permission_detail_in_grid_and_click_on_edit_button() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.click_editbtn_for_approvedCharge();
	}

	@And("^update the Accountype,CustomerId,AccountNumber,Acceptreject,Card and IBAN values$")
	public void update_the_accountypecustomeridaccountnumberacceptrejectcard_and_iban_values() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.update_customchargevalue();
	}

	@And("^verify the updated ChargeDescription name and click on update button$")
	public void verify_the_updated_chargedescription_name_and_click_on_update_button() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_updated_customchargedescription_name();
		NPSSChargeConfiguration.Click_update_btn();
	}

	@And("^verify the updated Custom Charge is showing in the grid$")
	public void verify_the_updated_custom_charge_is_showing_in_the_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_updatedcustomchargee_in_grid();
	}

	@And("^Verify the updated role and permission details in grid and click on edit button$")
	public void verify_the_updated_role_and_permission_details_in_grid_and_click_on_edit_button() throws Throwable {
		outward.waitforLoader();
		adminhomepage.selectSettings();
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_NPSSChargeConfigurationApproval_btn();
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_maker_updated_customrule_in_checkergrid();

	}

	@Then("^after checker approved the charge rule Verify the updated chargerule status changed to approved in grid$")
	public void after_checker_approved_the_charge_rule_verify_the_updated_chargerule_status_changed_to_approved_in_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_checkerApproved_updatedCustomcharge_status_in_makergrid();
	}

	@And("^user logged in as checker$")
	public void user_logged_in_as_checker() throws Throwable {
		outward.waitforLoader();
		launch.user_login_with_valid_checker_username_and_password();
	}

	@And("^Checker Approved record should not show in the grid$")
	public void checker_approved_record_should_not_show_in_the_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_Checkerdeleted_customchargeingrid();
	}


	@And("^The user has log in as Maker$")
	public void the_user_has_log_in_as_maker() throws Throwable {
		outward.waitforLoader();
		launch.user_login_with_valid_username_and_valid_password();
	}

	@And("^click on delete button and enter remarks and confirm Delete in popup$")
	public void click_on_delete_button_and_enter_remarks_and_confirm_delete_in_popup() throws Throwable {
		outward.waitforLoader();
		//Need to store the createdcustomrule for delete flow
		NPSSChargeConfiguration.verify_Deleted_customchargedescription_name();
		outward.waitforLoader();
		NPSSChargeConfiguration.Enter_remarks_and_clickonDeletebtn();
	}

	@And("^verify the status changed to Checker action is pending in grid$")
	public void verify_the_status_changed_to_checker_action_is_pending_in_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_checkeractionpending_status_in_makergrid();
	}

	@And("^click setting button and select NPSS Charge configuration Approval$")
	public void click_setting_button_and_select_npss_charge_configuration_approval() throws Throwable {
		//CLick setting btn
		outward.waitforLoader();
		adminhomepage.selectSettings();
		//Click NPSS Charge Configuration btn
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_NPSSChargeConfigurationApproval_btn();
	}

	@And("^Verify the deleted role and permission details in grid and click on edit button$")
	public void verify_the_deleted_role_and_permission_details_in_grid_and_click_on_edit_button() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_maker_Deleted_customrule_in_checkergrid();
	}


	@Then("^after checker approved the deleted charge rule should not show in makers grid$")
	public void after_checker_approved_the_deleted_charge_rule_should_not_show_in_makers_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_deletedrole_is_showing_in_makersgrid();
	}

	@And("^Click on Reset button$")
	public void click_on_reset_button() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_reset_btn();
	}

	@Then("^all the existing field values should get deleted$")
	public void all_the_existing_field_values_should_get_deleted() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_datas_are_removed();
	}

	@And("^Switch to History tab and verify Change details and Workflow grid is displaying$")
	public void switch_to_history_tab_and_verify_change_details_and_workflow_grid_is_displaying() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Verify_historytab_grid();
	}

	@And("^Verify the created datas are showing in Change details grid$")
	public void verify_the_created_datas_are_showing_in_change_details_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Verify_created_datas_in_historytab();
	}

	@And("^Redirect back to Charge details tab$")
	public void redirect_back_to_charge_details_tab() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.Click_Charge_tab();
	}

	@And("^Enter the remarks and click on Reject button$")
	public void enter_the_remarks_and_click_on_reject_button() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.click_Rejectbtn_enter_remarks();
	}

	@Then("^after checker Rejected the charge rule Verify the Rejected record is showing in the makers grid$")
	public void after_checker_rejected_the_charge_rule_verify_the_rejected_record_is_showing_in_the_makers_grid() throws Throwable {
		outward.waitforLoader();
		NPSSChargeConfiguration.verify_Rejectedrole_is_showing_in_makersgrid();
	}

	@And("^The user has loggedin as Maker$")
	public void the_user_has_loggedin_as_maker() throws Throwable {
		outward.waitforLoader();
		launch.user_login_with_valid_username_and_valid_password();
	}
}
