package steps;


import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchCreditTransferApproval;
import pages.BatchCreditTransferCheckerVerificationQueue;
import pages.BatchCreditTransferPage;
import pages.OutwardTransactionDetailReport;
import pages.RealTimeInwardPaymentReturnPage;
import pages.RealtimePaymentReversalInitiationPage;
import pages.checkerHomepage;
import pages.login;
import pages.makerHomepage;
import pages.utilityPage;


public class RealtimePaymentReversalInitiationScreenStep {

	static baseClass base = new baseClass();
	login loginn = new login();
	BatchCreditTransferPage Batchtransfer =new BatchCreditTransferPage();
	BatchCreditTransferApproval BatchApproval = new BatchCreditTransferApproval();
	BatchCreditTransferCheckerVerificationQueue Batchqueue = new BatchCreditTransferCheckerVerificationQueue();
	RealtimePaymentReversalInitiationPage Reversal = new RealtimePaymentReversalInitiationPage();
	makerHomepage makerhome = new makerHomepage();
	checkerHomepage checkerHome = new checkerHomepage();
	utilityPage util = new utilityPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	RealTimeInwardPaymentReturnPage realinward = new RealTimeInwardPaymentReturnPage();

	@And("^maker selects the reversal reason for particular reversal initaion list$")
	public void maker_selects_the_reversal_reason_for_particular_reversal_initaion_list() throws Throwable {
		outward.waitforLoader();
		realinward.click_edit_btn();
		outward.waitforLoader();
		Reversal.select_reason();
	}

	@And("^maker verify the values which is present in queue page and details page$")
	public void maker_verify_the_values_which_is_present_in_queue_page_and_details_page() throws Throwable {
		outward.waitforLoader();
		Reversal.table_data();
	}

	@And("^maker clicks confirm reversal initiation button$")
	public void maker_clicks_confirm_reversal_initiation_button() throws Throwable {
		Reversal.click_confirm_btn();
	}

	@And("^maker clicks yes in reversal payment confirmation popup$")
	public void maker_clicks_yes_in_reversal_payment_confirmation_popup() throws Throwable {
		realinward.click_yes_btn();
		outward.waitforLoader();
		realinward.verify_page();
	}

	@Then("^reversal initiation will be successfull$")
	public void reversal_initiation_will_be_successfull() throws Throwable {
		outward.waitforLoader();
		Reversal.view_toast();
	}

	@And("^maker not selects the reversal reason for particular initaion list$")
	public void maker_not_selects_the_reversal_reason_for_particular_initaion_list() throws Throwable {
		outward.waitforLoader();	
		realinward.click_edit_btn();
	}

	@Then("^reversal reason error will be displayed$")
	public void reversal_reason_error_will_be_displayed() throws Throwable {
		Reversal.view_error();
	}

	@Given("^user logged in as a maker$")
	public void the_user_logged_in_as_a_maker() throws Throwable {
		String url=base.loadProperties("LandingPageURL");
		System.out.println("The url is "+url);
		base.openURL(url);
		loginn.username_field(base.loadProperties("Maker.username"));
		loginn.password_field(base.loadProperties("Password"));
		loginn.signin_button();
	}

	@When("^Maker click the edit icon of the requests$")
	public void Maker_click_the_edit_icon_of_the_requests() throws Throwable {
		Reversal.Click_Editicon_btn();
	}

	@Then("^Approve options selected successfully$")
	public void Approve_options_selected_successfully() throws Throwable {
		Reversal.Click_ApprovePopup();
	}

	@Then("^Reject options selected successfully$")
	public void Reject_options_selected_successfully() throws Throwable {
		Reversal.Click_RejectPopup();
	}

	@Then("^Error messages will be displayed$")
	public void Error_messages_will_be_displayed() throws Throwable {
		Reversal.Reject_withoutentering_remarks();
	}

	@Then("^User views the history$")
	public void user_views_the_history() throws Throwable {
		Reversal.View_History_page();
	}

	@And("^the maker clicks Inward Payment processing in homepage$")
	public void the_maker_clicks_inward_payment_processing_in_homepage() throws Throwable {
		outward.waitforLoader();
		makerhome.Click_InwardPaymentProcessing_btn();
	}

	@And("^the maker clicks Realtime Payment Reversal Approval under Inward payment processing field$")
	public void the_maker_clicks_realtime_payment_reversal_approval_under_inward_payment_processing_field() throws Throwable {
		makerhome.Click_RealtimePaymentReversalApproval_btn();
	}

	@And("^Maker click Approve button of the requests$")
	public void Maker_click_approve_button_of_the_requests() throws Throwable {
		Reversal.click_Approve_btn();
	}

	@And("^Maker click Reject button of the requests$")
	public void Maker_click_reject_button_of_the_requests() throws Throwable {
		Reversal.click_reject_btn();
	}

	@And("^in confirmation screen without remarks click Rejects$")
	public void in_confirmation_screen_without_remarks_click_rejects() throws Throwable {
		Reversal.Click_RejectPopup();
	}

	@And("^in confirmation screen entering remarks click Approves$")
	public void in_confirmation_screen_entering_remarks_click_approves() throws Throwable {
		Reversal.Approve_RemarksPopup();
	}

	@And("^in confirmation screen entering remarks click Rejects$")
	public void in_confirmation_screen_with_entering_remarks_click_rejects() throws Throwable {    	
		Reversal.Reject_RemarksPopup();
	}

	@And("^Maker click History button of the requests$")
	public void Maker_click_history_button_of_the_rquests() throws Throwable {
		outward.waitforLoader();
		Reversal.Click_History_btn();
	}


}
