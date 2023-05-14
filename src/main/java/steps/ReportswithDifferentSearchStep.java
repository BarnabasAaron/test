package steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.OutwardTransactionDetailReport;
import pages.makerReports;
public class ReportswithDifferentSearchStep {
	makerReports makerReport = new makerReports();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

	@When("^maker clicks outward reconcilication details report$")
	public void maker_clicks_outward_reconcilication_details_report() throws Throwable {
		outward.waitforLoader();
		makerReport.Click_OutwardReconciliationdetailsreport_btn();

	}

	@When("^maker clicks Inward Reconciliation Detail Report$")
	public void maker_clicks_inward_reconciliation_detail_report() throws Throwable {
		outward.waitforLoader();
		makerReport.Click_InwardReconciliationdetailsreport_btn();

	}

	@And("^maker clicks reconcilication summary report$")
	public void maker_clicks_reconcilication_summary_report() throws Throwable {
		outward.waitforLoader();
		makerReport.Click_Reconciliation_Summary_Report_btn();
	}

	@When("^selects Outward Transaction summary Report$")
	public void selects_outward_transaction_summary_report() throws Throwable {
		makerReport.Click_Outward_Transaction_Summary_Report_btn();
	}


}