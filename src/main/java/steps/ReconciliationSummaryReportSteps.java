package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ReconciliationSummaryReportPage;

public class ReconciliationSummaryReportSteps {
	
ReconciliationSummaryReportPage Reconciliation = new ReconciliationSummaryReportPage();
	
	@Then("^the Reconciliation Summary Report pdf file will be downloaded successfully$")
    public void the_reconciliation_summary_report_pdf_file_will_be_downloaded_successfully() throws Throwable {
		Reconciliation.verify_pdf_Download("NPSSReconciliationSummary");
    }

	 @Then("^the Reconciliation Summary Report excel file will be downloaded successfully$")
	    public void the_reconciliation_summary_report_excel_file_will_be_downloaded_successfully() throws Throwable {
		 Reconciliation.verify_excel_Download("NPSSReconciliationSummary");
	    }




}
