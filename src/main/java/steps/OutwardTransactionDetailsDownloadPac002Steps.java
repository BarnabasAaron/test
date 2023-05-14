package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InwardTransactionDetailsReport;
import pages.OutwardTransactionDetailReport;

public class OutwardTransactionDetailsDownloadPac002Steps {
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	InwardTransactionDetailsReport inwardreport = new InwardTransactionDetailsReport();

	
//	@And("^click eye icon to view the history report of details$")
//    public void click_eye_icon_to_view_the_history_report_of_details() throws Throwable {
//		try {
//			outward.waitforLoader();
//			inwardreport.view_result_report();
//			outward.click_eyeicon();
//			
//			}catch(Exception e) {
//				
//				System.out.println("No results found");
//			}
// }
	
   
	@Then("^click download button to the PAC002 status report$")
    public void click_download_button_to_the_PAC002_status_report() throws Throwable {
		inwardreport.click_002btn();
		outward.verifyDownload("NPSS");
		
 }



}
