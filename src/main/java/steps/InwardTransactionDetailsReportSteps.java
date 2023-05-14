package steps;

import java.util.LinkedHashMap;
import java.util.List;
import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchCreditTransferApproval;
import pages.BatchCreditTransferCheckerVerificationQueue;
import pages.BatchCreditTransferPage;
import pages.InwardTransactionDetailsReport;
import pages.OutwardTransactionDetailReport;
import pages.RealtimePaymentReversalCheckerVerificationScreen;
import pages.checkerHomepage;
import pages.login;
import pages.makerHomepage;
import pages.makerReports;
import pages.utilityPage;


public class InwardTransactionDetailsReportSteps {

	static baseClass base = new baseClass();
	login loginn = new login();
	BatchCreditTransferPage Batchtransfer =new BatchCreditTransferPage();
	BatchCreditTransferApproval BatchApproval = new BatchCreditTransferApproval();
	BatchCreditTransferCheckerVerificationQueue Batchqueue = new BatchCreditTransferCheckerVerificationQueue();
	RealtimePaymentReversalCheckerVerificationScreen Reversal = new RealtimePaymentReversalCheckerVerificationScreen();
	InwardTransactionDetailsReport inwardreport = new InwardTransactionDetailsReport();
	makerHomepage makerhome = new makerHomepage();
	checkerHomepage checkerHome = new checkerHomepage();
	utilityPage util = new utilityPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	makerReports makerReport = new makerReports();


	@And("^maker clicks Inward transaction details report$")
	public void maker_clicks_inward_transaction_details_report() throws Throwable {
		outward.waitforLoader();
		makerReport.click_inward_transaction_details_btn();
	}

	@When("^maker selects valid from date and valid to date$")
	public void maker_selects_valid_from_date_and_valid_to_date() throws Throwable {
		outward.waitforLoader();
		inwardreport.Click_calendar_icon();
		inwardreport.Click_calendar_date();

	}

	@And("^maker click view report$")
	public void maker_click_view_report() throws Throwable {

		inwardreport.click_viewreport_btn();
	}


	@Then("^Error message need be displayed$")
	public void error_message_need_be_displayed() throws Throwable {

		inwardreport.view_invalidfromtoerror();
	}

	@When("^maker click clear filter$")
	public void maker_click_clear_filter() throws Throwable {
		outward.waitforLoader();
		inwardreport.click_clearfilter_btn();    	
	}

	@Then("^maker see null in from date and to date field$")
	public void maker_see_null_in_from_date_and_to_date_field() throws Throwable {

		inwardreport.view_clear_filter();    	
	}

	@And("^maker click PDF download$")
	public void maker_click_pdf_download() throws Throwable {
		inwardreport.click_viewreport_btn();
		outward.waitforLoader();
		inwardreport.click_pdfdownload_btn();
	}



	@And("^maker click EXCEL download$")
	public void maker_click_excel_download() throws Throwable {
		inwardreport.click_viewreport_btn();
		outward.waitforLoader();
		inwardreport.click_threedots_btn();
		inwardreport.click_exceldownload_btn();
	}



	@And("^maker add the new search filter$")
	public void maker_add_the_new_search_filter() throws Throwable {

		inwardreport.click_add_btn();
	}

	@Then("^maker see search field name and operatior$")
	public void maker_see_search_field_name_and_operatior() throws Throwable {

		inwardreport.view_addbtassert();
	}

	@And("^maker removes the newly added filter$")
	public void maker_removes_the_newly_added_filter() throws Throwable {

		inwardreport.click_remove_btn();

	}

	@Then("^maker see valid transaction details$")
	public void maker_see_valid_transaction_details() throws Throwable {

		inwardreport.view_result_report();    	

	}



	@And("^selects date in calendar field$")
	public void selects_date_in_calendar_field() throws Throwable {

		inwardreport.Click_calendar_icon1();
		inwardreport.Click_calendar_date1();
		inwardreport.click_viewreport_btn();	

	}

	@And("^selects \"([^\"]*)\" in Select Name field$")
	public void selects_something_in_select_name_field(String strArg1) throws Throwable {

		outward.selectFieldName(strArg1);

	}



	@And("^Selects \"([^\"]*)\" in Operator Field for transaction date$")
	public void selects_something_in_operator_field_for_transaction_date(String operator) throws Throwable {

		outward.selectOperator(operator);
		if(operator.endsWith("Null")) {
			System.out.println("No calendar for this operator");
		}else {
			outward.secondRowCalendar(operator);
		}


	}

	@Then("^Selects \"([^\"]*)\" in Operator test Field for transaction date$")
	public void selects_something_in_operator_test_field_for_transaction_date(String operator) throws Throwable {

		outward.selectViewReport();

	}




	@Then("^Enters data \"([^\"]*)\" in search field$")
	public void enters_data_something_in_search_field(String search) throws Throwable {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","InwardTransactionReport");
		String options=mapDataList.get(0).get(search);

		outward.searchField(options);

	}


	@Then("^Enters data \"([^\"]*)\" in search field for credit transfer$")
	public void enters_data_something_in_search_field_for_credit_transfer(String search) throws Throwable {

		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","InwardTransactionReport");
		String options=mapDataList.get(0).get(search);
		outward.selectStatusOption(options);
		outward.selectViewReport();

	}

}
