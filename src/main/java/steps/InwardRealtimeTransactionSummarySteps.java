package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InwardRealtimeTransactionSummaryPage;

public class InwardRealtimeTransactionSummarySteps {
	
InwardRealtimeTransactionSummaryPage InwardRealtimeTransactionSummary=new 	InwardRealtimeTransactionSummaryPage();
	
	
	@When("^maker clicks filter button$")
    public void maker_clicks_filter_button() throws Throwable {
		InwardRealtimeTransactionSummary.Click_setting_btn();
    }
	

    @Then("^all the mandatory column names should displayed$")
    public void all_the_mandatory_columns_names_should_displayed() throws Throwable {
    	InwardRealtimeTransactionSummary.verify_mandatory_fields();
    }
    
    @And("^Customize the reports$")
    public void customize_the_reports() throws Throwable {
    	InwardRealtimeTransactionSummary.toggle_off();
    }
    
    @And("^clicks on save button$")
    public void clicks_on_save_button() throws Throwable {
    	InwardRealtimeTransactionSummary.click_save_btn();
    }
    

    @Then("^success toast msg should displayed$")
    public void success_toast_msg_should_displayed() throws Throwable {
    	InwardRealtimeTransactionSummary.verify_customize_preference_toastmsg();
    }
    


    @Then("^the customized column should match with the Inward transaction details table$")
    public void the_customized_column_should_match_with_the_inward_transaction_details_table() throws Throwable {
    	InwardRealtimeTransactionSummary.match_cutomizedvalue_and_tablevalue();
    }
    
    
    @When("^maker click on view button$")
    public void maker_click_on_view_button() throws Throwable {
    	InwardRealtimeTransactionSummary.Click_view_btn();
    }
    
    @Then("^the Inward transaction details popup should displayed$")
    public void the_inward_transaction_details_popup_should_displayed() throws Throwable {
    	InwardRealtimeTransactionSummary.verify_history_popup();
    }
    
    
    @And("^Close the filter popup$")
    public void close_the_filter_popup() throws Throwable {
    	InwardRealtimeTransactionSummary.verify_close_btn();
    }


}
