package steps;

import io.cucumber.java.en_old.Tha;
import pages.InwardTransactionDetailsReport;
import pages.OutwardTransactionDetailReport;

public class MISOutwardTransactionDetailsByBatchStep {

	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	InwardTransactionDetailsReport inwardreport = new InwardTransactionDetailsReport();



	@Tha("^particular batch detailed result will be displayed successfully$")
	public void particular_batch_detailed_result_will_be_displayed_successfully() throws Throwable {
		try {
			outward.waitforLoader();
			inwardreport.view_result_report();
			outward.view_eyebatchdetails();
			
			}catch(Exception e) {
				
				System.out.println("No results found");
			}
		
	}
	
}
