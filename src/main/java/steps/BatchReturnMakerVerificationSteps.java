package steps;




import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchReturnMakerVerificationPage;
import pages.OutwardTransactionDetailReport;
	

	public class BatchReturnMakerVerificationSteps {
		
		static baseClass base = new baseClass();

		OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
		
		  
		  
		@And("^in home page the maker clicks Inward Payment Processing$")
	    public void in_home_page_the_maker_clicks_inward_payment_processing() throws Throwable {
			BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
            outward.waitforLoader();
			makerverification.Click_inward_payment_processing_btn();
	    }

	    @And("^maker clicks on Batch Return Maker Verification button$")
	    public void maker_clicks_on_batch_return_maker_verification_button() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	  makerverification.Click_Batch_Return_Maker_Verification_btn();
	    }

	    @And("^maker gets redirected to Batch Return Maker Verification screen$")
	    public void maker_gets_redirected_to_batch_return_maker_verification_screen() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
		    makerverification.verify_Batch_Return_Maker_Verification_screen();
	    }
	    
	    @When("^maker identifies record$")
	    public void maker_identifies_record() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	 makerverification.verify_record_in_table();
	    }

	    @Then("^the maker clicks on view button$")
	    public void the_maker_clicks_on_view_button() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	makerverification.Click_View_btn();
	    }
	    
	    @When("^no records are present in Batch Return Maker Verification Queue$")
	    public void no_records_are_present_in_batch_return_maker_verification_queue() throws Throwable {
	        
	    }

	    @Then("^maker should able to view the No record found text$")
	    public void maker_should_able_to_view_the_no_record_found_text() throws Throwable {
	      
	    }
	    
	    @Then("^verification screen will be displayed$")
	    public void verification_screen_will_be_displayed() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	makerverification.verify_verfication_Screen();
	    }
	    
	    @Then("^all the summary details will be displayed successfully$")
	    public void all_the_summary_details_will_be_displayed_successfully() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	makerverification.verify_summary_details();
	    }
	    
	    @Then("^verify Details table is displayed$")
	    public void verify_details_table_is_displayed() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	makerverification.verify_record_in_table();
	    }
	    
	    @Then("^maker can click history tab$")
	    public void maker_can_click_history_tab() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	makerverification.Click_history_btn();
	    }
	    

	    @Then("^maker can click history tab and should view workflow logs$")
	    public void maker_can_click_history_tab_and_should_view_workflow_logs() throws Throwable {
	    	BatchReturnMakerVerificationPage makerverification=new BatchReturnMakerVerificationPage();
	    	makerverification.Click_history_btn();
	    	makerverification.verify_workflow_logs();
	    }
	    
//The below methods are empty due to application issue
	    
	    @When("click on approve button")
	    public void click_on_approve_button() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }

	    @Then("confirmation screen should be displayed")
	    public void confirmation_screen_should_be_displayed() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }

	    @When("maker checks record is presents")
	    public void maker_checks_record_is_presents() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }

	    @When("click on reject button")
	    public void click_on_reject_button() {
	        // Write code here that turns the phrase above into concrete actions
	        throw new io.cucumber.java.PendingException();
	    }


	}



