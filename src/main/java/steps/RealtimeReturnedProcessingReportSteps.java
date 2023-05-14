package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OutwardTransactionDetailReport;

public class RealtimeReturnedProcessingReportSteps {

	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

    @When("^maker applies the filter required to get data$")
    public void maker_applies_the_filter_required_to_get_data() throws Throwable {
    	
    	outward.selectFieldName("State");
    	outward.selectOperator("Equal To");
    	outward.searchField("returned");
    	outward.selectViewReport();
        
    }

    @Then("^the report will be displayed successfully$")
    public void the_report_will_be_displayed_successfully() throws Throwable {
    	
    	outward.selectViewReport();
        
    }

    @Then("^the History report will be displayed$")
    public void the_history_report_will_be_displayed() throws Throwable {
        
    }

    @Then("^the file will be downloaded successfully$")
    public void the_file_will_be_downloaded_successfully() throws Throwable {
        
    	outward.verifyDownload("Pacs004");
    }


    @And("^maker selects the eye icon from the table$")
    public void maker_selects_the_eye_icon_from_the_table() throws Throwable {
    	
    	
    }

    @And("^from History Report the maker selects the download icon of pacs 004$")
    public void from_history_report_the_maker_selects_the_download_icon_of_pacs_004() throws Throwable {
    	
    	
    	
    }

}
