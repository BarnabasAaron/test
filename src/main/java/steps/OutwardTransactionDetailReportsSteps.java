package steps;



import java.util.LinkedHashMap;
import java.util.List;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InwardTransactionDetailsReport;
import pages.OutwardTransactionDetailReport;
import pages.makerHomepage;
import pages.makerReports;






public class OutwardTransactionDetailReportsSteps {

	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	makerHomepage makerHome = new makerHomepage();
	makerReports makerReport = new makerReports();
	baseClass base = new baseClass();
	InwardTransactionDetailsReport inwardreport = new InwardTransactionDetailsReport();

	public static String operatorName;
	@And("^Maker selects Report from side menu$")
	public void maker_selects_report_from_side_menu() throws Throwable {
		
		outward.waitforLoader();
		makerHome.clickReport();

	}

	@And("^selects Outward Transaction Detail Report$")
	public void selects_outward_transaction_detail_report() throws Throwable {
		outward.waitforLoader();
		makerReport.selectOutwardTransactionDetailReport();

	}
	
	@And("^Selects \"([^\"]*)\" in second Operator Field$")
	public void selects_something_in_second_operator_field(String operator) throws Throwable {
		outward.waitforLoader();
		outward.selectOperator2(operator);
		
	}
	
	@And("^selects data \"([^\"]*)\" from second status search field$")
    public void selects_data_something_from_second_status_search_field(String search) throws Throwable {    
	 List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","OutwardTransactionReport");
	 String options=mapDataList.get(0).get(search);
	 System.out.println("ttheetest"+options);
	 outward.selectStatusOption2(options);
    }

	@When("^maker selects Add filter$")
	public void maker_selects_add_filter() throws Throwable {
		
		outward.selectAddFilter();

	}

	@Then("^the result will be displayed successfully$")
	public void the_result_will_be_displayed_successfully() throws Throwable {
		try {
		outward.waitforLoader();
		inwardreport.view_result_report();
		
		}catch(Exception e) {
			
			System.out.println("No results found");
		}
	}

	 @And("^selects \"([^\"]*)\" in Select Name field of Outward Screen$")
	    public void selects_something_in_select_name_field_of_outward_screen(String strArg1) throws Throwable {

		 	outward.selectFieldName(strArg1);
	 
	 }
	

	@And("^Selects \"([^\"]*)\" in Operator Field$")
	public void selects_something_in_operator_field(String operator) throws Throwable {
		outward.waitforLoader();
		outward.selectOperator(operator);
		
	}

    @And("^Selects Date \"([^\"]*)\" Operator in Operator Field$")
	public void selects_datesomething_operator_in_operator_field(String operator) throws Throwable {
		
		outward.selectOperator(operator);
		if(operator.endsWith("Null")) {
			System.out.println("No calendar for this operator");
		}else {
		outward.secondRowCalendar(operator);
		}

	}

	@And("^Selects equal \"([^\"]*)\" operator in Operator Field$")
	public void selects_equal_something_operator_in_operator_field(String operator) throws Throwable {
		outward.waitforLoader();
		outward.selectOperator(operator);

	}

    @And("^Enters data \"([^\"]*)\" in search field of Outwards Screen$")
    public void enters_data_something_in_search_field_of_outwards_screen(String search) throws Throwable {
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","OutwardTransactionReport");
		  String options=mapDataList.get(0).get(search);
		outward.searchField(options);
    }


	@And("^selects data \"([^\"]*)\" from search field$")
	public void selects_data_something_from_search_field(String search) throws Throwable {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","OutwardTransactionReport");
		  String options=mapDataList.get(0).get(search);
		outward.selectModeFieldOptions(options);

	}
	
	 @And("^selects data \"([^\"]*)\" from status search field$")
	    public void selects_data_something_from_status_search_field(String search) throws Throwable {
	        
		 List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","OutwardTransactionReport");
		  String options=mapDataList.get(0).get(search);
		 outward.selectStatusOption(options);
		 
	    }

	
	
	 @When("^maker selects \"([^\"]*)\" from Group By$")
	    public void maker_selects_something_from_group_by(String option) throws Throwable {
	        
		 outward.waitforLoader();
			List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","OutwardTransactionReport");
			  System.out.println(mapDataList.get(0).get(option));
			  String options=mapDataList.get(0).get(option);
			outward.groupByField(options);	
		 
		 
	    }

	@Then("^the report will be displayed successfuly$")
	public void the_report_will_be_displayed_successfuly() throws Throwable {

		outward.selectViewReport();

	}

	@And("^changes the date range$")
	public void changes_the_date_range() throws Throwable {
		
		outward.fromCalendar();
	}

	@And("^selects View Report$")
	public void selects_view_report() throws Throwable {

		outward.selectViewReport();
	}

	@And("^selects Download as PDF$")
	public void selects_download_as_pdf() throws Throwable {

		outward.selectPdfDownload();


	}

	@Then("^the file will be downloaded successfuly$")
	public void the_file_will_be_downloaded_successfuly() throws Throwable {

		outward.verifyDownload("NPSSOutward");

	}

	@And("^selects Download as Excel$")
	public void selects_download_as_excel() throws Throwable {

		outward.selectExcelDownload();

	}

	 

	    @And("^maker selects the eye icon$")
	    public void maker_selects_the_eye_icon() throws Throwable {
	        outward.selectEyeIcon();
	    }

	    @And("^maker clicks download icon of \"([^\"]*)\" file$")
	    public void maker_clicks_download_icon_of_pacs002_file(String message) throws Throwable {
	    	
	    	outward.downloaddatafromTable(message);
	       
	    }








}
