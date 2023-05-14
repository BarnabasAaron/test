package steps;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import pages.BatchCreditTransferApproval;
import pages.BatchCreditTransferPage;
import pages.InwardBatchTransactionDetailsReportPage;
import pages.OutwardTransactionDetailReport;
import pages.QuickPayDirectEntryScreenPage;
import pages.RealtimePaymentReversalCheckerVerificationScreen;
import pages.RealtimePaymentReversalInitiationPage;
import pages.checkerHomepage;
import pages.makerHomepage;
import pages.outwardReversalStatusReportPage;
import pages.utilityPage;

public class outwardReversalStatusReportSteps {
	static baseClass base = new baseClass();
	QuickPayDirectEntryScreenPage quickpay= new QuickPayDirectEntryScreenPage();
	makerHomepage makerhome = new makerHomepage();
	checkerHomepage checkerhome = new checkerHomepage();
	BatchCreditTransferPage Batchtransfer =new BatchCreditTransferPage();
	InwardBatchTransactionDetailsReportPage inwardreport= new InwardBatchTransactionDetailsReportPage();
	BatchCreditTransferApproval BatchApproval = new BatchCreditTransferApproval();
	utilityPage util = new utilityPage();
	RealtimePaymentReversalInitiationPage Reversal = new RealtimePaymentReversalInitiationPage();
	outwardReversalStatusReportPage outwardreversalreport=new outwardReversalStatusReportPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	
	@And("^Maker initiate realtime credit transfer quickpay payment processing$")
    public void maker_initiate_realtime_credit_transfer_quickpay_payment_processing() throws Throwable {
		makerhome.verify_homepage_text();
		makerhome.click_utility_btn();
		util.click_relatime_credit_transfer_quickpay_btn();
		checkerHomepage checkerHome = new checkerHomepage();
    }
	
	 @And("^Maker need to be logged out$")
	    public void maker_need_to_be_logged_out() throws Throwable {
		 Batchtransfer.click_logout_btn();
	    }
	 
	 @And("^the checker clicks Realtime Credit Transfer Approval under Outward payment processing field$")
	    public void the_checker_clicks_realtime_credit_transfer_approval_under_outward_payment_processing_field() throws Throwable {
		 checkerhome.clickOutwardPaymentProcessing_btn();
	    }
	 
	 @And("^approve the quickpay payment which is initiated by maker$")
	    public void approve_the_quickpay_payment_which_is_initiated_by_maker() throws Throwable {
		 inwardreport.click_viewicon_btn();
		 BatchApproval.click_Approve_btn();
		 BatchApproval.Click_ApprovePopup();
	    }
	 
	 @And("^Checker need to be logged out$")
	    public void checker_need_to_be_logged_out() throws Throwable {
		 Batchtransfer.click_logout_btn();
	    }
	 
	 @And("^maker clicks utility and click outward realtime payment reversal button$")
	    public void maker_clicks_utility_and_click_outward_realtime_payment_reversal_button() throws Throwable {
		 outward.waitforLoader();
		 makerhome.click_utility_btn();
		 outward.waitforLoader();
		 util.click_RealtimePaymentReversalInitiation_btn();
	    }
	 @And("^approve the payment reversal initiation$")
	    public void approve_the_payment_reversal_initiation() throws Throwable {
		 Reversal.Click_Editicon_btn();
		 outwardreversalreport.Click_ConfirmReversalInitiation_btn();
	    }	 
		

	    @And("^Approve Payment Reversal Request Confirmation$")
	    public void approve_payment_reversal_request_confirmation() throws Throwable {
	    	Reversal.Click_Editicon_btn();
	    	Reversal.click_Approve_btn();
	    	Reversal.Click_ApprovePopup();
	    }
	 
	 
	
	 
}
