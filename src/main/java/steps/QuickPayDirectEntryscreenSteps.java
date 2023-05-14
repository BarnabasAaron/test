package steps;


import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OutwardTransactionDetailReport;
import pages.QuickPayDirectEntryScreenPage;
import pages.utilityPage;


public class QuickPayDirectEntryscreenSteps  {
	baseClass base = new baseClass();
	QuickPayDirectEntryScreenPage quickpay= new QuickPayDirectEntryScreenPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	utilityPage utility = new utilityPage();

	@And("^maker clicks Realtime Credit transfer initiation Quick Pay$")
	public void maker_clicks_realtime_credit_transfer_initiation_quick_pay() throws Throwable {    
		//adding wait because got element intercept error
		outward.waitforLoader();
		utility.click_relatime_credit_transfer_quickpay_btn();

	}

	@When("^maker selects option from Department dropdown$")
	public void maker_selects_option_from_department_dropdown() throws Throwable {    
		outward.waitforLoader();
		quickpay.click_department_dropdown();
		quickpay.select_department_dropdown_value();
	}

	@Then("^the selected quickpay Department option displayed in the field$")
	public void the_selected_quickpay_department_option_displayed_in_the_field() throws Throwable {    		 
		quickpay.Verify_selected_Department_value(); 
	}

	@When("^maker clicks initiate button without entering Department value$")
	public void maker_clicks_initiate_button_without_entering_department_value() throws Throwable { 
		//Added as per Smitha Feedback
		quickpay.departmentIsDisplayed();
		quickpay.click_intiate_btn();
	}

	@Then("^Department error message should be displayed below the field$")
	public void department_error_message_should_be_displayed_below_the_field() throws Throwable {    	    	 
		quickpay.Verify_department_errormsg();
	}

	@When("^maker enters valid Debtor account number and clicks search button$")
	public void maker_enters_valid_debtor_account_number_and_clicks_search_button() throws Throwable {    	
		//adding wait because got element intercept error
		outward.waitforLoader();
		quickpay.enter_debtor_acc_number_details();
		quickpay.click_search_icon();
	}

	@Then("^Debtor name,agent id and address should be prefilled$")
	public void debtor_nameagent_id_and_address_should_be_prefilled() throws Throwable {    	    	
		quickpay.verify_name_agentid_and_address_is_prefilled();
	} 	    


	@When("^maker clicks search button without entering Debitor account number$")
	public void maker_clicks_search_button_without_entering_debitor_account_number() throws Throwable {    	  
		//adding wait because got element intercept error
		outward.waitforLoader();
		//Added as per Smitha Feedback
		quickpay.debitorACIsDisplayed();
		quickpay.click_search_icon();
	}

	@Then("^Debtor account toast message should be displayed$")
	public void debtor_account_toast_message_should_be_displayed() throws Throwable {    	    	
		quickpay.verify_debtor_acc_number_error_toastmsg();
	}


	@When("^maker clicks initiate button without entering Debtor name$")
	public void maker_clicks_search_button_without_entering_debtor_name() throws Throwable {    
		//Added as per Smitha Feedback
		quickpay.debtorNameIsDisplayed();
		quickpay.click_intiate_btn();
	}

	@Then("^Debtor name error message should be displayed$")
	public void debtor_name_error_message_should_be_displayed() throws Throwable {    	    	
		quickpay.Verify_debtor_errormsg();
	}

	@When("^maker clicks initiate button without entering Debtor agent ID$")
	public void maker_clicks_initiate_button_without_entering_debtor_agent_id() throws Throwable {    	    	
		//Added as per Smitha feedback
		quickpay.debtorAgentIdIsDisplayed();
		quickpay.click_intiate_btn();
	}

	@Then("^Debtor agent ID error message should be displayed$")
	public void debtor_agent_id_error_message_should_be_displayed() throws Throwable {    	    	
		quickpay.Verify_debtor_agentId_errormsg();
	}


	@When("^maker enters valid Creditor account number and clicks search button$")
	public void maker_enters_valid_creditor_account_number_and_clicks_search_button() throws Throwable {   	    	
		quickpay.enter_creditor_acc_number_details();
		quickpay.click_creditor_search_icon();   	    	

	}

	@Then("^Creditor name,agent id and address should be prefilled$")
	public void creditor_nameagent_id_and_address_should_be_prefilled() throws Throwable {    	    	

		quickpay.verify_Creditor_name_agentid_and_address_is_prefilled();
	}

	@When("^maker clicks search button without entering Creditor account number$")
	public void maker_clicks_search_button_without_entering_creditor_account_number() throws Throwable {   	    	
		//adding wait because got element intercept error
		outward.waitforLoader();
		//Added as per Smitha Feedback
		quickpay.creditorAccountNumberIsDisplayed();
		quickpay.click_creditor_search_icon();
	}

	@Then("^Creditor account toast message should be displayed$")
	public void creditor_account_toast_message_should_be_displayed() throws Throwable {   	    	
		quickpay.verify_creditor_acc_number_error_toastmsg();
	}

	@When("^maker clicks search button without entering Creditor name$")
	public void maker_clicks_search_button_without_entering_creditor_name() throws Throwable {    	    	
		//Added as per Smitha Feedback
		quickpay.creditorNameIsDisplayed();
		quickpay.click_intiate_btn();
	}

	@Then("^Creditor name error message should be displayed$")
	public void creditor_name_error_message_should_be_displayed() throws Throwable {    	    	
		quickpay.Verify_creditor_name_errormsg();
	}

	@When("^maker clicks search button without entering Creditor agent ID$")
	public void maker_clicks_search_button_without_entering_creditor_agent_id() throws Throwable {    	    	
		//Added as per Smitha Feedback
		quickpay.creditorAgentIdIsDisplayed();
		quickpay.click_intiate_btn();
	}

	@Then("^Creditor agent ID error message should be displayed$")
	public void creditor_agent_id_error_message_should_be_displayed() throws Throwable {   	    	
		quickpay.Verify_agentID_errormsg();
	}

	@When("^maker enters Transaction amount$")
	public void maker_enters_transaction_amount() throws Throwable {

		//department
		quickpay.click_department_dropdown();
		//debitor details
		quickpay.select_department_dropdown_value();
		quickpay.enter_debtor_acc_number_details();
		quickpay.click_search_icon();
		//creditor details
		quickpay.enter_creditor_acc_number_details();
		quickpay.click_creditor_search_icon();  
		//transaction details
		quickpay.enter_Transaction_amount();
	}

	@Then("^Chargetype,Charge amount,VAT amount, Total amount and Amount in words should get prefilled$")
	public void chargetypecharge_amountvat_amount_total_amount_and_amount_in_words_should_get_prefilled() throws Throwable {    	    	
		quickpay.verify_transactionamt_chargetype_amount_VAT_and_totalamount_is_prefilled();

	}

	@When("^maker clicks initiation button without entering Transaction amount$")
	public void maker_clicks_initiation_button_without_entering_transaction_amount() throws Throwable {    	    	
		//Added as per Smitha Feedback
		quickpay.transactionAmountIsDisplayed();
		quickpay.click_intiate_btn();
	}

	@Then("^Transaction amount error message should be displayed$")
	public void transaction_amount_error_message_should_be_displayed() throws Throwable {   	    	
		quickpay.Verify_transaction_amt__errormsg();
	}

	@When("^maker clicks initiation button without entering Total amount$")
	public void maker_clicks_initiation_button_without_entering_total_amount() throws Throwable { 
		//Added as per Smitha Feedback
		quickpay.totalAmountIsDisplayed();
		quickpay.click_intiate_btn();
	}

	@Then("^Total amount error message should be displayed$")
	public void total_amount_error_message_should_be_displayed() throws Throwable {    	    	
		quickpay.Verify_total_amt__errormsg();
	}

	@When("^maker entered valid Department,Debtor,creditor,Transaction and Remarks details$")
	public void maker_entered_valid_departmentdebtorcreditortransaction_and_remarks_details() throws Throwable {

		//department
		outward.waitforLoader();
		quickpay.click_department_dropdown();
		quickpay.select_department_dropdown_value();
		//debitor details           	
		quickpay.enter_debtor_acc_number_details();
		quickpay.click_search_icon();
		//Thread.sleep(3000);

		//creditor details
		quickpay.enter_creditor_acc_number_details();
		quickpay.click_creditor_search_icon();  
		//Thread.sleep(3000);

		//transaction details
		quickpay.enter_Transaction_amount();
		//remarks
		quickpay.enter_remarks();
	}

	@And("^Clicks initiation button$")
	public void clicks_initiation_button() throws Throwable {    	    	
		quickpay.click_intiate_btn();
	}

	@And("^Click Confirm and proceed button in the confirmation screen$")
	public void under_confirmation_screen_by_selecting_confirm_and_proceed_button() throws Throwable {    	    	
		quickpay.click_confirm_and_proceed_btn();
	}

	@Then("^payment will be succesfull$")
	public void payment_will_be_succesfull() throws Throwable {   	    	
		quickpay.Verify_payment_success_toast_msg();
	}

	@When("^maker entered valid Department,Debtor,creditor and Transaction details$")
	public void maker_entered_valid_departmentdebtorcreditor_and_transaction_details() throws Throwable {
		outward.waitforLoader();
		//department
		quickpay.click_department_dropdown();
		quickpay.select_department_dropdown_value();
		//debitor details           	
		quickpay.enter_debtor_acc_number_details();
		quickpay.click_search_icon();
		// Thread.sleep(3000);

		//creditor details
		quickpay.enter_creditor_acc_number_details();
		quickpay.click_creditor_search_icon();

		//transaction details
		quickpay.enter_Transaction_amount();
	}

	@And("^Click Reset button$")
	public void click_reset_button() throws Throwable {   	    	
		quickpay.click_reset_btn();
	}


	@Then("^all the fields value will get cleared$")
	public void all_the_fields_value_will_get_cleared() throws Throwable {
		quickpay.verify_field_values();

	}

}





