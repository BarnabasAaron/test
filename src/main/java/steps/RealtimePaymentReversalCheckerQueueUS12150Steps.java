package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.OutwardTransactionDetailReport;
import pages.RealtimePaymentReversalCheckerVerificationScreen;

public class RealtimePaymentReversalCheckerQueueUS12150Steps {
	
	OutwardTransactionDetailReport outwardreport= new OutwardTransactionDetailReport();
	RealtimePaymentReversalCheckerVerificationScreen Reversal = new RealtimePaymentReversalCheckerVerificationScreen();

	
	@Then("^Checker verify details view of realtime payment reversal request$")
    public void Checker_verify_details_view_of_realtime_payment_reversal_request() throws Throwable {
		Reversal.detailed_data();
    }

}
