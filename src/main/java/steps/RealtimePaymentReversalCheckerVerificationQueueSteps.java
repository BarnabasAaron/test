package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OutwardTransactionDetailReport;
import pages.RealtimePaymentReversalCheckerVerificationScreen;

public class RealtimePaymentReversalCheckerVerificationQueueSteps {
	
	OutwardTransactionDetailReport outwardreport= new OutwardTransactionDetailReport();
	RealtimePaymentReversalCheckerVerificationScreen Reversal = new RealtimePaymentReversalCheckerVerificationScreen();

	
	@And("^Checker verify realtime payment reversal approval queue$")
    public void Checker_verify_realtime_payment_reversal_approval_queue() throws Throwable {
		outwardreport.waitforLoader();
		Reversal.verify_queue();
    }
	
	@And("^Checker see detaild view of realtime payment reversal request$")
    public void Checker_see_detaild_view_of_realtime_payment_reversal_request() throws Throwable {
		outwardreport.waitforLoader();
		Reversal.detailed_view();
    }
	
	@And("^Checker click history in detailed view page$")
    public void Checker_click_history_in_detailed_view_page() throws Throwable {
		Reversal.Click_History_btn();
    }
	
	@Then("^Checker verify history tab for realtime payment reversal approval queue$")
    public void Checker_verify_history_tab_for_realtime_payment_reversal_approval_queue() throws Throwable {
		outwardreport.waitforLoader();
		Reversal.verify_historytable();
    }

}
