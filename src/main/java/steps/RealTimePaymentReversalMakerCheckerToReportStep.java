package steps;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BatchCreditTransferApproval;
import pages.BatchCreditTransferCheckerVerificationQueue;
import pages.BatchCreditTransferPage;
import pages.OutwardTransactionDetailReport;
import pages.RealTimeInwardPaymentReturnPage;
import pages.RealtimePaymentReversalInitiationPage;
import pages.ReversalPaymentRequestApprovalPage;
import pages.checkerHomepage;
import pages.login;
import pages.makerHomepage;
import pages.utilityPage;

public class RealTimePaymentReversalMakerCheckerToReportStep {

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
	ReversalPaymentRequestApprovalPage reversalapproval = new ReversalPaymentRequestApprovalPage();

	@And("^maker click edit button to verify details page with queue datas$")
	public void maker_click_edit_button_to_verify_details_page_with_queue_datas() throws Throwable {
		realinward.click_edit_btn();
		outward.waitforLoader();
		Reversal.select_reason();
		Reversal.verifydetails();

	}

	@And("maker verify the realtime paymenet reversal queue")
	public void maker_verify_the_realtime_paymenet_reversal_queue() {
		outward.waitforLoader();
		Reversal.table_data();
	}

	@And("click reversal payment request approval in outward payment processing")
	public void click_reversal_payment_request_approval_in_outward_payment_processing() {
		outward.waitforLoader();
		checkerHome.click_ReversalPaymentRequestApproval_btn();
	}

	@Then("verify reversal checker queue datas with maker initiated payment data")
	public void verify_reversal_checker_queue_datas_with_maker_initiated_payment_data() {
		outward.waitforLoader();
		reversalapproval.findtable();
	}

	@Then("verify reversal checker detail datas with maker initiated payment data")
	public void verify_reversal_checker_detail_datas_with_maker_initiated_payment_data() {
//		outward.waitforLoader();
		reversalapproval.clickedit();
		outward.waitforLoader();
		reversalapproval.verifydetails();

	}

	@Then("reversal payment reject done successfully")
	public void reversal_payment_reject_done_successfully() {
		outward.waitforLoader();
		reversalapproval.verify_page();
	}

	@Then("reversal payment approve done successfully")
	public void reversal_payment_approve_done_successfully() {
		outward.waitforLoader();
		reversalapproval.verify_page();
	}

	@And("send the valid payment reference number")
	public void send_the_valid_payment_reference_number() {
		outward.searchField1();
	}

}
