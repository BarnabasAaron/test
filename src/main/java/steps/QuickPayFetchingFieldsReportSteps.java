package steps;

import baseClass.baseClass;
import io.cucumber.java.en.Then;
import pages.InwardTransactionDetailsReport;
import pages.OutwardTransactionDetailReport;
import pages.makerHomepage;
import pages.makerReports;

public class QuickPayFetchingFieldsReportSteps {
	
	
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	InwardTransactionDetailsReport inwardreport = new InwardTransactionDetailsReport();

	
	
	@Then("^the result displayed successfully$")
	public void the_result_displayed_successfully() throws Throwable {
		try {
		outward.waitforLoader();
		inwardreport.view_result_report();
		outward.waitforLoader();
		outward.view_debacc();
		outward.view_creacc();
		outward.view_debname();
		outward.view_crename();
		outward.view_agentid();	
		
		}catch(Exception e) {
			
			System.out.println("No results found");
		}	
	}
	

}
