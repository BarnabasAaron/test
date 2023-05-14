package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.InwardTransactionDetailsReport;
import pages.OutwardTransactionDetailReport;
import pages.RealTimeInwardPaymentReturnPage;
import pages.utilityPage;

public class RealtimeInwardPaymentReturnInitiationDownPac004Pac002Steps {
	
	utilityPage util = new utilityPage();
	RealTimeInwardPaymentReturnPage realinward = new RealTimeInwardPaymentReturnPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	InwardTransactionDetailsReport inwardreport = new InwardTransactionDetailsReport();

	@Then("^maker can see inward payment return list$")
    public void maker_can_see_inward_payment_return_list() throws Throwable {
		realinward.Assert_Table();
    }

    @Then("^return initiation will be successfull$")
    public void return_initiation_will_be_successfull() throws Throwable {
    	outward.waitforLoader();
    	realinward.view_toast();
    }

    @And("^maker clicks Realtime Inward Payment Return initiation$")
    public void maker_clicks_realtime_inward_payment_return_initiation() throws Throwable {
    	outward.waitforLoader();
    	util.click_RealtimeInwardPaymentReturnInitiation_btn();
    }

    @And("^maker clicks search button$")
    public void maker_clicks_search_button() throws Throwable {
    	realinward.click_search_btn();
    }

    @And("^maker selects the return reason for particular initaion list$")
    public void maker_selects_the_return_reason_for_particular_initaion_list() throws Throwable {
    	outward.waitforLoader();
    	realinward.click_edit_btn();
    	outward.waitforLoader();
    	realinward.select_reason();
    }

    @And("^maker clicks confirm return initiation button$")
    public void maker_clicks_confirm_return_initiation_button() throws Throwable {
    	realinward.click_confirm_btn();
    }

    @And("^maker clicks yes in return payment confirmation popup$")
    public void maker_clicks_yes_in_return_payment_confirmation_popup() throws Throwable {
    	realinward.click_yes_btn();
    }

    @And("^maker enters the remarks$")
    public void maker_enters_the_remarks() throws Throwable {
    	realinward.send_remarks();
    }

    @And("^maker not selects the return reason for particular initaion list$")
    public void maker_not_selects_the_return_reason_for_particular_initaion_list() throws Throwable {
    	outward.waitforLoader();
    	realinward.click_edit_btn();
    	outward.waitforLoader();
    }
    
    @Then("^return reason error will be displayed$")
    public void return_reason_error_will_be_displayed() throws Throwable {
    	realinward.view_error();
    }
    
    @And("^maker selects Report$")
    public void maker_selects_Report() throws Throwable {
    	outward.waitforLoader();
    	realinward.click_report_btn();
    }
    
    @And("^maker select valid date$")
    public void maker_select_valid_date() throws Throwable {
    	outward.waitforLoader();
    	realinward.click_calendar_iconbtn();
    	realinward.click_calendar_1stdate();
    }
    
    @And("^maker conforming the particular record in inward return initiation list$")
    public void maker_conforming_the_particular_record_in_inward_return_initiation_list() throws Throwable {
    	realinward.click_search_btn();
    	outward.waitforLoader();
    	realinward.click_edit_btn();
    	outward.waitforLoader();
    	realinward.select_reason();
    	realinward.click_confirm_btn();
    	realinward.click_yes_btn();
    }
    
    @And("^click eye icon to view the returned history report of details$")
    public void click_eye_icon_to_view_the_returned_history_report_of_details() throws Throwable {
    	inwardreport.click_returneyeicon_btn();
    }
    
    @Then("^click download button to the PAC002 status of returned report$")
    public void click_download_button_to_the_PAC002_status() throws Throwable {
    	inwardreport.click_002btnreturn();
		outward.verifyDownload("NPSS");

    }
    
    @Then("^click download button to the PAC004 status of returned report$")
    public void click_download_button_to_the_PAC004_status() throws Throwable {
    	inwardreport.click_004btn();
		outward.verifyDownload("NPSS");

    	
    }
}