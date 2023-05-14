package steps;

import io.cucumber.java.en.And;
import pages.makerReports;

public class UserStory11404Steps {

	makerReports mkrReports = new makerReports();
	
	
	@And("^selects Outward Transaction Summary Report$")
    public void selects_outward_transaction_summary_report() throws Throwable {
		mkrReports.waitForLoader();
		mkrReports.selectoutwardTransactionSummaryReport();
        
    }
	
	
	
	makerReports makerReport = new makerReports();


	@And("^selects Inward Reconciliation Detail Report$")

	public void selects_Inward_Reconciliation_Detail_Report() throws Throwable {

	makerReport.waitForLoader();

	makerReport.Click_InwardReconciliationdetailsreport_btn();

	}


}
