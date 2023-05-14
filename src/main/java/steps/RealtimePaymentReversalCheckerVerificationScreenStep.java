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
import pages.RealtimePaymentReversalCheckerVerificationScreen;
import pages.checkerHomepage;
import pages.login;
import pages.makerHomepage;
import pages.utilityPage;


public class RealtimePaymentReversalCheckerVerificationScreenStep {

	static baseClass base = new baseClass();
	login loginn = new login();
	BatchCreditTransferPage Batchtransfer =new BatchCreditTransferPage();
	BatchCreditTransferApproval BatchApproval = new BatchCreditTransferApproval();
	BatchCreditTransferCheckerVerificationQueue Batchqueue = new BatchCreditTransferCheckerVerificationQueue();
	RealtimePaymentReversalCheckerVerificationScreen Reversal = new RealtimePaymentReversalCheckerVerificationScreen();
	makerHomepage makerhome = new makerHomepage();
	checkerHomepage checkerHome = new checkerHomepage();
	utilityPage util = new utilityPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	LoginSteps launch = new LoginSteps();


	@Given("^user logged in as a checker$")
	public void the_user_logged_in_as_a_checker() throws Throwable {
		String url=base.loadProperties("LandingPageURL");
		System.out.println("The url is "+url);
		base.openURL(url);
		launch.user_login_with_valid_checker_username_and_password();

	}

	@When("^Checker click the edit icon of the request$")
	public void checker_click_the_edit_icon_in_the_request() throws Throwable {
		outward.waitforLoader();
		Reversal.Click_Editicon_btn();
	}

	@Then("^Approve option selected successfully$")
	public void approve_option_will_be_selected_successfully() throws Throwable {
		Reversal.Click_ApprovePopup();
		outward.waitforLoader();
		Reversal.verifypage();
	}

	@Then("^Reject option selected successfully$")
	public void reject_option_will_be_selected_successfully() throws Throwable {
		Reversal.Click_RejectPopup();
		outward.waitforLoader();
		Reversal.verifypage();
	}

	@Then("^Error message will be displayed$")
	public void error_message_should_be_displayed() throws Throwable {
		Reversal.Reject_withoutentering_remarks();
	}

	@Then("^User view the history$")
	public void user_view_the_history() throws Throwable {
		Reversal.View_History_page();
	}

//	@And("^the checker click Inward Payment processing in homepage$")
//	public void the_checker_click_inward_payment_processing_in_homepage() throws Throwable {
//		outward.waitforLoader();
//		checkerHome.Click_InwardPaymentProcessing_btn();
//	}

	@And("^the checker click Realtime Payment Reversal Approval under Inward payment processing field$")
	public void the_checker_click_realtime_payment_reversal_approval_under_inward_payment_processing_field() throws Throwable {
		outward.waitforLoader();
		checkerHome.Click_RealtimePaymentReversalApproval_btn();
	}

	@And("^Checker click Approve button of the request$")
	public void checker_click_approve_button_of_the_request() throws Throwable {
		Reversal.click_Approve_btn();
	}

	@And("^Checker click Reject button of the request$")
	public void checker_click_reject_button_of_the_request() throws Throwable {
		Reversal.click_reject_btn();
	}

	@And("^Click reject without remarks in confirmation screen$")
	public void in_confirmation_screen_without_remarks_click_reject() throws Throwable {
		Reversal.Click_RejectPopup();
	}

	@And("^Click Approve by entering remarks in the confirmation screen$")
	public void in_confirmation_screen_entering_remarks_click_approve() throws Throwable {
		Reversal.Approve_RemarksPopup();
	}

	@And("^in confirmation screen entering remarks click Reject$")
	public void in_confirmation_screen_with_entering_remarks_click_reject() throws Throwable {    	
		Reversal.Reject_RemarksPopup();
	}

	@And("^Checker click History button of the request$")
	public void checker_click_history_button_of_the_rquest() throws Throwable {
		outward.waitforLoader();
		Reversal.Click_History_btn();
	}


}
