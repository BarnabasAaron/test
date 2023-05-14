package steps;

import java.awt.AWTException;
import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchCreditTransferApproval;
import pages.BatchCreditTransferPage;
import pages.OutwardTransactionDetailReport;
import pages.checkerHomepage;
import pages.login;
import pages.makerHomepage;
import pages.utilityPage;


public class BatchCreditTransferSteps {

	baseClass base = new baseClass();
	login login = new login();
	BatchCreditTransferPage Batchtransfer =new BatchCreditTransferPage();
	BatchCreditTransferApproval BatchApproval = new BatchCreditTransferApproval();
	makerHomepage makerhome = new makerHomepage();
	checkerHomepage checkerHome = new checkerHomepage();
	utilityPage util = new utilityPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	LoginSteps launch = new LoginSteps();

	@Given("^The user has logged in as Maker$")
	public void the_user_has_logged_in_as_maker() throws Throwable {
		launch.user_launch_with_valid_npss_url();
		launch.user_login_with_valid_username_and_valid_password();
	}

	@And("^from home page the maker navigates to utility page$")
	public void from_home_page_the_maker_navigates_to_utility_page() throws Throwable {
		outward.waitforLoader();
		makerhome.verify_homepage_text();
		makerhome.click_utility_btn();
	}

	@And("^maker clicks Batch Credit Transfer upload$")
	public void maker_clicks_batch_credit_transfer_upload() throws Throwable {
		outward.waitforLoader();
		util.click_BatchCreditTransferFileUpload_btn();

	}

	@When("^maker selects option from Template field$")
	public void maker_selects_option_from_template_field() throws Throwable {
		outward.waitforLoader();
		Batchtransfer.click_Templatedropdown_btn();
		Batchtransfer.selectTemplateValues_dropdownOptions();
	}

	@Then("^the selected template option displayed in the field$")
	public void the_selected_template_option_displayed_in_the_field() throws Throwable {
		Batchtransfer.Verify_Template_value();
	}


	@When("^Maker enters invalid template data and click submit button$")
	public void maker_enters_invalid_template_data_and_clicks_submit_button() throws Throwable {
		outward.waitforLoader();
		Batchtransfer.Verify_invalid_template();
	}

	@Then("^Template error message should be displayed below the field$")
	public void template_error_message_should_be_displayed_below_the_field() throws Throwable {	 
		Batchtransfer.Verify_invalid_template_error_msg();
	}

	@When("^maker selects option from Department field$")
	public void maker_selects_option_from_department_field() throws Throwable {   	 
		outward.waitforLoader();
		Batchtransfer.click_Departmentdropdown_btn();
		Batchtransfer.selectDepartmentValues_dropdownOptions();
	}

	@Then("^the selected Department option displayed in the field$")
	public void the_selected_department_option_displayed_in_the_field() throws Throwable {
		Batchtransfer.Verify_Department_value();
	}

	@When("^Maker enters invalid department data and click submit button$")
	public void maker_enters_invalid_department_data_and_click_submit_button() throws Throwable { 
		outward.waitforLoader();
		Batchtransfer.Verify_invalid_department();
	}
	@Then("^department error message should be displayed below the field$")
	public void department_error_message_should_be_displayed_below_the_field() throws Throwable {    	 
		Batchtransfer.Verify_invalid_department_error_msg();
	}

	@When("^maker select Template and Department$")
	public void maker_select_template_and_department() throws Throwable {   
		//tempate
		outward.waitforLoader();
		Batchtransfer.click_Templatedropdown_btn();
		Batchtransfer.selectTemplateValues_dropdownOptions();
		//department
		Batchtransfer.click_Departmentdropdown_btn();
		Batchtransfer.selectDepartmentValues_dropdownOptions();
	}


	@And("^maker uploads the file$")
	public void maker_uploads_the_file() throws Throwable {   	 
		//	    	Batchtransfer.Click_fileupload_btn();
		outward.waitforLoader();
		Batchtransfer.valid_excel_uploads();
	}

	@And("^click Submit$")
	public void click_submit() throws Throwable {   	 
		Batchtransfer.Click_submit_button();
	}

	@Then("^the file will be submitted and the status will be displayed below$")
	public void the_file_will_be_submitted_and_the_status_will_be_displayed_below() throws Throwable {  	 
		Batchtransfer.verify_excelname();
	}

	@When("the maker upload an invalid data file and click submit button")
	public void the_maker_upload_an_invalid_data_file_and_click_submit_button() throws InterruptedException, AWTException {   	 
		Batchtransfer.excel_uploads_null();
	}

	@Then("^the status of batch should be failed$")
	public void the_status_of_batch_should_be_failed() throws Throwable {    	 
		Batchtransfer.verify_failure_status();
	}

	@Then("the file will be submitted and the status will be displayed as failed")
	public void the_file_will_be_submitted_and_the_status_will_be_displayed_as_failed() throws InterruptedException {    	 
		Batchtransfer.verify_failure_status();
	}

	@And("^maker uploads invalid data of DebitorAccountBan$")
	public void maker_uploads_invalid_data_of_debitoraccountban() throws Throwable { 	 
		Batchtransfer.Verify_invalid_Debitor_account_ban();
	}

	@Then("^Error message will be displayed and the file will not be uploaded$")
	public void error_message_will_be_displayed_and_the_file_will_not_be_uploaded() throws Throwable {   	 
		Batchtransfer.verify_actual_table_filename();
		Batchtransfer.verify_failure_status();

	}

	@And("^maker uploads invalid data of MessageReference$")
	public void maker_uploads_invalid_data_of_messagereference() throws Throwable {  	 
		Batchtransfer.Verify_invalid_MessageReference();
	}

	@And("^maker uploads invalid data of Debtor Account$")
	public void maker_uploads_invalid_data_of_debtor_account() throws Throwable {    	 
		Batchtransfer.Verify_invalid_debtor_account();
	}

	@And("^maker uploads invalid data of Debtor Account Type$")
	public void maker_uploads_invalid_data_of_debtor_account_type() throws Throwable {    	 
		Batchtransfer.Verify_invalid_debtor_account_type();
	}

	@And("^maker uploads invalid data of Debtor Agent$")
	public void maker_uploads_invalid_data_of_debtor_agent() throws Throwable {   	 
		Batchtransfer.Verify_invalid_debtor_agent();
	}

	@And("^maker uploads invalid data of Debtor Name$")
	public void maker_uploads_invalid_data_of_debtor_name() throws Throwable {   	 
		Batchtransfer.Verify_invalid_debtor_name();
	}

	@And("^maker uploads invalid data of Creditor Agent$")
	public void maker_uploads_invalid_data_of_creditor_agent() throws Throwable {    	 
		Batchtransfer.Verify_invalid_creditor_Agent();
	}

	@And("^maker uploads invalid data of Creditor account IBAN$")
	public void maker_uploads_invalid_data_of_creditor_account_iban() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Creditor_account_IBAN();
	}

	@And("^maker uploads invalid data of Creditor Account$")
	public void maker_uploads_invalid_data_of_creditor_account() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Creditor_Account();
	}

	@And("^maker uploads invalid data of Creditor Account Type$")
	public void maker_uploads_invalid_data_of_creditor_account_type() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Creditor_Account_Type();
	}

	@And("^maker uploads invalid data of Creditor Name$")
	public void maker_uploads_invalid_data_of_creditor_name() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Creditor_Name();
	}

	@And("^maker uploads invalid data of Transaction Type$")
	public void maker_uploads_invalid_data_of_transaction_type() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Transaction_Type();
	}

	@And("^maker uploads invalid data of Settled Amount$")
	public void maker_uploads_invalid_data_of_settled_amount() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Settled_Amount();
	}

	@And("^maker uploads invalid data of Charge Bearer$")
	public void maker_uploads_invalid_data_of_charge_bearer() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Charge_Bearer();
	}

	@And("^maker uploads invalid data of Settlement Method$")
	public void maker_uploads_invalid_data_of_settlement_method() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Settlement_Method();
	}

	@And("^maker uploads invalid data of Settled Currency$")
	public void maker_uploads_invalid_data_of_settled_currency() throws Throwable {    	 
		Batchtransfer.Verify_invalid_Settled_Currency();
	}

	@When("click Reset")
	public void click_reset() throws InterruptedException 
	{

		Batchtransfer.Click_reset_button();
	}
	@Then("Template,Department and the file uploaded will be reset successfully")
	public void template_department_and_the_file_uploaded_will_be_reset_successfully() throws InterruptedException {    	 
		Batchtransfer.verify_field_isempty();
	}

	@When("^maker select Template$")
	public void maker_select_template() throws Throwable { 
		outward.waitforLoader();
		Batchtransfer.click_Templatedropdown_btn();
		Batchtransfer.selectTemplateValues_dropdownOptions();

	}

	@Then("^the Template data will be reset successfully$")
	public void the_template_data_will_be_reset_successfully() throws Throwable {    	 
		Batchtransfer.null_template();
	}

	@When("^maker select Department$")
	public void maker_select_department() throws Throwable {   	 
		Batchtransfer.click_Departmentdropdown_btn();
		Batchtransfer.selectDepartmentValues_dropdownOptions();
	}

	@Then("^the Department data will be reset successfully")
	public void the_department_data_will_be_reset_successfully() throws Throwable {    	 
		Batchtransfer.null_department();
	}

	@Then("^the file field will be reset successfully$")
	public void the_file_field_will_be_reset_successfully() throws Throwable {    	 
		Batchtransfer.null_uploadedfile();
	}

	//checker

	@When("^maker submitted the batch credit file successfully$")
	public void maker_submitted_the_batch_credit_file_successfully() throws Throwable {
		//select template
		outward.waitforLoader();
		Batchtransfer.click_Templatedropdown_btn();
		Batchtransfer.selectTemplateValues_dropdownOptions();
		//select department
		Batchtransfer.click_Departmentdropdown_btn();
		Batchtransfer.selectDepartmentValues_dropdownOptions();
		//file upload
		Batchtransfer.valid_excel_uploads();
		//click submit
		Batchtransfer.Click_submit_button();
		//assert excelname
		//Thread.sleep(2000);
		Batchtransfer.verify_excelname();
		//logout btn
		//Thread.sleep(2000);
		outward.waitforLoader();
		Batchtransfer.click_logout_btn();

	}

	@And("^Checker logs into the portal$")
	public void Checker_logs_into_the_portal() throws Throwable {   

		launch.user_login_with_valid_checker_username_and_password();

	}

	@And("^checker click Batch Credit Transfer approval under Outward Payment Processing menu in homepage$")
	public void checker_click_Batch_Credit_Transfer_approval_under_Outward_Payment_Processing_menu_in_homepage() {
		outward.waitforLoader();
		checkerHome.clickOutwardPaymentProcessing_btn();	
		checkerHome.clickBatchCreditTransferApproval_btn();
	}

	@And("^Checker click the edit icon for the batch$")
	public void Checker_click_the_edit_icon_for_the_batch() throws Throwable {
		BatchApproval.View_BatchCreditTransferApproval_Page();
		BatchApproval.Click_Editicon_btn();
		BatchApproval.View_BatchCreditTransferApprovalSummary_Page();

	}



	@Then("^Approve option will be selected successfully$")
	public void Approve_option_will_be_selected_successfully() throws Throwable {
		BatchApproval.Click_ApprovePopup();

	}

	@And("^from Checker Account the checker navigates to Batch Credit Transfer Approval Screen then click edit icon$")
	public void from_Checker_Account_the_checker_navigates_to_Batch_Credit_Transfer_Approval_Screen_then_click_edit_icon() throws Throwable {
		Thread.sleep(3000);
		launch.user_login_with_valid_checker_username_and_password();

		checkerHome.clickOutwardPaymentProcessing_btn();	
		checkerHome.clickBatchCreditTransferApproval_btn();

		BatchApproval.View_BatchCreditTransferApproval_Page();
		BatchApproval.Click_Editicon_btn();
		BatchApproval.View_BatchCreditTransferApprovalSummary_Page();

	}

	@And("^Checker click Approve$")
	public void Checker_click_Approve() throws Throwable {
		outward.waitforLoader();
		BatchApproval.click_Approve_btn();
	}

	@And("^Checker click Reject$")
	public void Checker_click_Reject() throws Throwable {
		outward.waitforLoader();
		BatchApproval.click_reject_btn();
		
	}

	@Then("^Reject option will be selected successfully$")
	public void Reject_option_will_be_selected_successfully() throws Throwable {
		BatchApproval.Click_RejectPopup();
		Batchtransfer.click_logout_btn();

	}

	@And("^in confirmation screen without entering remarks click Reject$")
	public void in_confirmation_screen_without_entering_remarks_click_Reject() throws Throwable {
		BatchApproval.Click_RejectPopup();
		//			Thread.sleep(2000);
		//	    	Batchtransfer.Reject_withoutentering_remarks();
		//	    	Batchtransfer.click_logout_btn();
	}

	@Then("^Error message should be displayed$")
	public void Error_message_should_be_displayed() throws Throwable {
		BatchApproval.Reject_withoutentering_remarks();
		Batchtransfer.click_logout_btn();
	}

	@And("^Checker click History$")
	public void Checker_click_History() throws Throwable {
		outward.waitforLoader();
		BatchApproval.Click_History_btn();
	}

	@Then("^User can be able to view the history$")
	public void User_can_be_able_to_view_the_history() throws Throwable {
		BatchApproval.View_History_page();
		Batchtransfer.click_logout_btn();
	}

	@And("^in Confirmation Popup the checker enters data under remarks to approve$")
	public void in_Confirmation_Popup_the_checker_enters_data_under_remarks_to_approve() throws Throwable {
		BatchApproval.Approve_RemarksPopup();
	}

	@And("^in Confirmation Popup the checker enters data under remarks to reject$")
	public void in_Confirmation_Popup_the_checker_enters_data_under_remarks_to_reject() throws Throwable {
		BatchApproval.Reject_RemarksPopup();
	}

	@And("^in Confirmation Popup under History Page the checker enters data under remarks to approve$")
	public void in_Confirmation_Popup_under_History_Page_the_checker_enters_data_under_remarks_to_approve() throws Throwable {
		BatchApproval.View_BatchCreditTransferApprovalSummary_Page();
		BatchApproval.Approve_History_RemarksPopup();
	}

	@And("^in Confirmation Popup under History Page the checker enters data under remarks to reject$")
	public void in_Confirmation_Popup_under_History_Page_the_checker_enters_data_under_remarks_to_reject() throws Throwable {
		BatchApproval.View_BatchCreditTransferApprovalSummary_Page();
		BatchApproval.Reject_History_RemarksPopup();
	}



}


