package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InwardBatchTransactionDetailsReportPage;
import pages.OutwardTransactionDetailReport;
import pages.ReconciliationSummaryReportPage;

public class InwardBatchTransactionDetailsReportSteps {
	
	InwardBatchTransactionDetailsReportPage inwardreport= new InwardBatchTransactionDetailsReportPage();
	OutwardTransactionDetailReport outwardreport= new OutwardTransactionDetailReport();
	ReconciliationSummaryReportPage Reconciliation = new ReconciliationSummaryReportPage();
	

    
    
    @And("^verify the Inward Transaction Detail column names$")
    public void verify_the_inward_transaction_detail_column_names() throws Throwable {
    	inwardreport.Verify_column_names();
    }
    
    
    @And("^click eye icon to view the history report of details$")
    public void click_eye_icon_to_view_the_history_report_of_details() throws Throwable {
    	inwardreport.click_viewicon_btn();
    }
    
    @Then("^download the pacs status msg$")
    public void download_the_pacs_status_msg() throws Throwable {
    	inwardreport.click_download_btn();
    	Reconciliation.verify_pdf_Download("NPSSInwardTransaction");
    }
   

}
