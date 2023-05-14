package steps;

import java.util.LinkedHashMap;
import java.util.List;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchCreditTransferPage;
import pages.OutwardTransactionDetailReport;
import pages.RealTimeCreditTransferApprovalFirstScreen;
import pages.RealTimeCreditTransferApprovalSecondScreen;
import pages.RealTimeCreditTransferConfirmationPage;
import pages.RealTimeCreditTransferInitiationPage;
import pages.checkerHomepage;
import pages.login;
import pages.utilityPage;

public class RealtimeCreditTransferInitiationDetailedViewSteps {
	
	baseClass base = new baseClass();
	utilityPage utility = new utilityPage();
	RealTimeCreditTransferInitiationPage detailedView = new RealTimeCreditTransferInitiationPage();
	RealTimeCreditTransferConfirmationPage confirm = new RealTimeCreditTransferConfirmationPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	BatchCreditTransferPage batch = new BatchCreditTransferPage();
	LoginSteps login = new LoginSteps();
	checkerHomepage checkerhome = new checkerHomepage();
	RealTimeCreditTransferApprovalFirstScreen first = new RealTimeCreditTransferApprovalFirstScreen();
	RealTimeCreditTransferApprovalSecondScreen second = new RealTimeCreditTransferApprovalSecondScreen();
	
	 @When("^maker selects the department field$")
	    public void maker_selects_the_department_field() throws Throwable {
		 outward.waitforLoader();
		 detailedView.clickDepartmentField();
	    }

	    @When("^maker updates department field$")
	    public void maker_updates_department_field() throws Throwable {
	    	
	    		outward.waitforLoader();
	    	 detailedView.clickDepartmentField();
	    	 List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("Department");
	    	detailedView.selectDepartmentFieldOptions(options);
	    }


	    @Then("^the debtor Account data will be updated in the fields$")
	    public void the_debtor_account_data_will_be_updated_in_the_fields() throws Throwable {
	    	outward.waitforLoader();
	    	detailedView.verifyDebtorAccountType();
	    	detailedView.verifyDebtorName();
	    	detailedView.verifyDebtorAgentId();
	    	detailedView.verifyDebtorStreetName();
	    	detailedView.verifyDebtorPostalCode();
	    	detailedView.verifyDebtorTownName();
	    	detailedView.verifyDebtorCountry();
	    	
	    	
	    }

	    @Then("^the creditor Account data will be updated in the fields$")
	    public void the_creditor_account_data_will_be_updated_in_the_fields() throws Throwable {
	    	outward.waitforLoader();
	    	detailedView.selectAccountType();
	    	detailedView.verifyCreditorName();
	    	detailedView.verifyCreditorAgentID();
	    	detailedView.verifyCreditorAgentName();
	    	detailedView.verifyCreditorPostalCode();
	    	detailedView.verifyCreditorTownName();
	    	detailedView.verifyCreditorCountry();
	    }

	    @And("^maker clicks Realtime Credit transfer initiation Detailed View$")
	    public void maker_clicks_realtime_credit_transfer_initiation_detailed_view() throws Throwable {
	    	outward.waitforLoader();
	    	utility.click_relatime_credit_transfer_detailedView_btn();
	    }

	    @And("^selects option from dropdown of department field$")
	    public void selects_option_from_dropdown() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("Department");
	    	detailedView.selectDepartmentFieldOptions(options);

	    	
	    	
	    }

	    @And("^enters data under Debtor Account Number field$")
	    public void enters_data_under_debtor_account_number_field() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("DebtorAccount");
	    	detailedView.enterDatainDebtorACNumber(options);
	    }

	    @And("^select search button$")
	    public void select_search_button_Debitor() throws Throwable {
	    	
	    	
	    		
	    		detailedView.searchDebtorAccount();
	    		
	    	
	    }
	    
	    @And("^select search button of Creditor Account field$")
	    public void select_search_button_Creditor() throws Throwable {
	    	
	    
	    		detailedView.searchCreditorAccountNumber();
	    		
	    	
	    }

	    @And("^maker updates the debtor Account field$")
	    public void maker_updates_the_debtor_account_field() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("DebtorAccount");
	    	detailedView.enterDatainDebtorACNumber(options);
	    		detailedView.searchDebtorAccount();
	    		outward.waitforLoader();
	    		detailedView.verifyDebtorAccountType();
	    		detailedView.verifyDebtorAgentId();
	    		detailedView.verifyDebtorCountry();
	    		detailedView.verifyDebtorName();
	    		detailedView.verifyDebtorPostalCode();
	    		detailedView.verifyDebtorStreetName();
	    		detailedView.verifyDebtorTownName();

	    }

	    @And("^maker enters data under Creditor Account number field$")
	    public void maker_enters_data_under_creditor_account_number_field() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("CreditorAccount");
	    	detailedView.enterCreditorAccountNumber(options);
	    }

	    @And("^maker enters settled amount$")
	    public void maker_enters_settled_amount() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("SettledAmount");
	    	detailedView.settledAmount(options);
	    	                                	
	    }

	    @And("^maker enters instructed amount$")
	    public void maker_enters_instructed_amount() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("InstructedAmount");
	    	detailedView.instructedAmount(options);
	    }

	    @And("^maker selects the Transaction Type$")
	    public void maker_selects_the_transaction_type() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("TransactionType");
	    	detailedView.transactionType(options);
	    }

	    @And("^maker selects initiate button$")
	    public void selects_initiate_button() throws Throwable {
	    	detailedView.verifyChargeAmount();
	    	detailedView.verifyVatAmount();
	    	detailedView.initiateButton();
	    	outward.waitforLoader();
	    }
	    
	    @When("^maker selects initiate button without entering any data$")
	    public void maker_selects_initiate_button_without_entering_any_data() throws Throwable {
	        outward.waitforLoader();
	        detailedView.initiateButton();
	    }
	    
	    @And("^selects confirm button$")
	    public void selects_confirm_button() throws Throwable {
	        outward.waitforLoader();
	        confirm.verifyDebtorAccountNumber();
	        confirm.verifyCreditorAccountNumber();
	        confirm.verifyTransactionType();
	        //confirm.verifyChargeType();
	        confirm.clickConfirm();
	        outward.waitforLoader();
	        
	        
	    }
	    
	    @And("^maker selects logout$")
	    public void maker_selects_logout() throws Throwable {
	    	outward.waitforLoader();
	    	batch.click_logout_btn();
	    }

	    @And("^Checker logs in$")
	    public void checker_logs_in() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	login.user_login_with_valid_checker_username_and_password();
	    	
	    }

	    @And("^selects Realtime Credit Transfer Approval from home page$")
	    public void selects_realtime_credit_transfer_approval_from_home_page() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	checkerhome.click_RealtimeCreditTransferApproval_btn();
	    
	    
	    }
	    
	    

	    @And("^verifies the data$")
	    public void verifies_the_data() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	first.verifyDebtorACC();
	    	first.verifyCreditorACC();
	    	//first.verifyChargeType();
	    	first.verifyCreditorName();
	    	first.verifyDebtorName();
	    	first.verifyTransactionAmount();
	    	first.verifyTransactionType();
	    	
	    	
	    	
	    }
	    
	    @And("^clicks eye icon$")
	    public void clicks_eye_icon() throws Throwable {

	    first.selectEyeIcon();
    	outward.waitforLoader();

	    }

	    @And("^verify Debtor Details$")
	    public void verify_debtor_details() throws Throwable {
	    	outward.waitforLoader();
	    	
	    	second.verifyDebtorAccountNumber();
	    
	    }

	    @And("^verify Creditor Details$")
	    public void verify_creditor_details() throws Throwable {
	    	
	    	second.verifyCreditorAccountNumber();
	    
	    }

	    @And("^click Approve$")
	    public void click_approve() throws Throwable {
	    	second.approveButton();
	    	second.clickApproveInPopup();
	    	
	    
	    }
	    
	    
	    @And("^click Reject$")
	    public void click_reject() throws Throwable {
	    	second.rejectButton();
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("RejectRemark");
	    	second.clickRejectInPopup(options);
	    	
	    
	    }
	    
	    
//	    @Then("^changes the Settlement date$")
//	    public void changes_the_settlement_date() throws Throwable {
//	    	
//	    	detailedView.changeSettlementDate();
//	        
//	    }

	    @And("^maker updates the creditor Account field$")
	    public void maker_updates_the_creditor_account_field() throws Throwable {
	    	
	    	
	    	outward.waitforLoader();
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("CreditorAccount");
	    	detailedView.enterCreditorAccountNumber(options);
    		detailedView.searchCreditorAccountNumber();
	    	outward.waitforLoader();
	    	detailedView.selectAccountType();
	    	detailedView.verifyCreditorName();
	    	detailedView.verifyCreditorAgentID();
	    	detailedView.verifyCreditorAgentName();
	    	detailedView.verifyCreditorPostalCode();
	    	detailedView.verifyCreditorTownName();
	    	detailedView.verifyCreditorCountry();
	        
	    }
	    
	    @And("^verify the details in confirmation page$")
	    public void verify_the_details_in_confirmation_page() throws Throwable {
	         
	    	confirm.verifyDebtorAccountNumber();
	    	confirm.verifyCreditorAccountNumber();
	    	confirm.verifyCreditorName();
	    	confirm.verifyCreditorAgentID();
	    	confirm.verifyCreditorAgentName();
	    	confirm.verifyChargeAmount();
	    	confirm.verifyInstructedAmount();
	    	confirm.verifySettledTransactionAmount();
	    }
	    
	    @Then("^maker enters Senders Charge$")
	    public void maker_enters_senders_charge() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("SendersCharge");
	    	detailedView.sendersCharge(options);
	        
	    }

	    @Then("^maker selects data from Charge Type$")
	    public void maker_selects_data_from_charge_type() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("ChargeType");
	    	detailedView.chargeType(options);
	    }

	    @Then("^verify whether the charge amount is been displayed$")
	    public void verify_whether_the_charge_amount_is_been_displayed() throws Throwable {
	    	
	    	detailedView.verifyChargeAmount();
	        
	    }

	    @Then("^verify whether the VAT amount is been displayed$")
	    public void verify_whether_the_vat_amount_is_been_displayed() throws Throwable {
	    	
	    	detailedView.verifyVatAmount();
	       
	    }

	    @Then("^verify whether the Total Amount is been displayed$")
	    public void verify_whether_the_total_amount_is_been_displayed() throws Throwable {
	    	
	    	detailedView.verifyTotalAmount();
	        
	    }

	    @Then("^maker enters Transaction Remarks$")
	    public void maker_enters_transaction_remarks() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("TransactionRemarks");
	    	detailedView.enterTransactionRemarks(options);
	        
	    }

	    @Then("^maker enters Remarks$")
	    public void maker_enters_remarks() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("Remarks");
	    	detailedView.enterRemarks(options);
	    }
	    
	    @Then("^Error message should be displayed in the particular fields$")
	    public void error_message_should_be_displayed_in_the_particular_fields() throws Throwable {
	    	
	    	detailedView.departmentFieldError();
	    	detailedView.creditorACNumberError();
	    	detailedView.creditorAgentIDError();
	    	detailedView.creditorAgentNameError();
	    	detailedView.creditorNameError();
	    	detailedView.debtorACNumberError();
	    	detailedView.instructedAmountError();
	    	detailedView.settledAmountError();
	    	detailedView.totalAmountError();
	    	detailedView.transactionTypeError();
	        
	    }

	    @Then("^maker selects Reset button$")
	    public void maker_selects_reset_button() throws Throwable {
	    	
	    	detailedView.resetButton();
	        
	    }

	    @And("^the entered data should be reset to default$")
	    public void the_entered_data_should_be_reset_to_default() throws Throwable {
	    	
	    	
	    	detailedView.verifyReset();
	        
	    }

	    @And("^selects cancel button$")
	    public void selects_cancel_button() throws Throwable {
	    	
	    	confirm.clickCancel();
	        
	    }
	    
	    @Then("^the creditor Account data will be updated in the field$")
	    public void the_creditor_account_data_will_be_updated_in_the_field() throws Throwable {
	    	outward.waitforLoader();
	    	detailedView.verifyCreditorAgentID();
	    	detailedView.verifyCreditorAgentName();
	    	detailedView.verifyCreditorCountry();
	    	detailedView.verifyCreditorName();
	    	detailedView.verifyCreditorPostalCode();
	    	detailedView.verifyCreditorTownName();
	    	
	    }

	    @And("^maker should able to change the creditor name$")
	    public void maker_should_able_to_change_the_creditor_name() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	detailedView.verifyCreditorAgentID();
	    	detailedView.verifyCreditorAgentName();
	    	detailedView.verifyCreditorCountry();
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("CreditorName");
	    	detailedView.changeCreditorName(options);
	    	detailedView.verifyCreditorPostalCode();
	    	detailedView.verifyCreditorTownName();
	    	
	       
	    }

	    @And("^selects confirm button which has change in creditor name$")
	    public void selects_confirm_button_which_has_change_in_creditor_name() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	confirm.verifyDebtorAccountNumber();
	    	confirm.verifyCreditorAccountNumber();
	    	confirm.verifyCreditorName();
	    	confirm.verifyCreditorAgentID();
	    	confirm.verifyCreditorAgentName();
	    	confirm.verifyChargeAmount();
	    	confirm.verifyInstructedAmount();
	    	confirm.verifySettledTransactionAmount();
	    	confirm.clickConfirm();
	       
	    }

	    @And("^maker should able to change the creditor ID$")
	    public void maker_should_able_to_change_the_creditor_id() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("CreditorAgentID");
	    	detailedView.changeCreditorAgentID(options);
	    	detailedView.verifyCreditorAgentName();
	    	detailedView.verifyCreditorCountry();
	    	detailedView.verifyCreditorName();
	    	detailedView.verifyCreditorPostalCode();
	    	detailedView.verifyCreditorTownName();
	    	
	    	
	        
	    }

	    @And("^selects confirm button which has change in creditor ID$")
	    public void selects_confirm_button_which_has_change_in_creditor_id() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	confirm.verifyDebtorAccountNumber();
	    	confirm.verifyCreditorAccountNumber();
	    	confirm.verifyCreditorName();
	    	confirm.verifyCreditorAgentID();
	    	confirm.verifyCreditorAgentName();
	    	confirm.verifyChargeAmount();
	    	confirm.verifyInstructedAmount();
	    	confirm.verifySettledTransactionAmount();
	    	confirm.clickConfirm();
	        
	    }

	    @And("^maker should able to change the creditor Agent Name$")
	    public void maker_should_able_to_change_the_creditor_agent_name() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	
	    	detailedView.verifyCreditorAgentID();
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("CreditorAgentName");
	    	detailedView.changeCreditorAgentName(options);
	    	detailedView.verifyCreditorCountry();
	    	detailedView.verifyCreditorName();
	    	detailedView.verifyCreditorPostalCode();
	    	detailedView.verifyCreditorTownName();
	    	
	        
	    }

	    @And("^selects confirm button which has change in creditor Agent Name$")
	    public void selects_confirm_button_which_has_change_in_creditor_agent_name() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	confirm.verifyDebtorAccountNumber();
	    	confirm.verifyCreditorAccountNumber();
	    	confirm.verifyCreditorName();
	    	confirm.verifyCreditorAgentID();
	    	confirm.verifyCreditorAgentName();
	    	confirm.verifyChargeAmount();
	    	confirm.verifyInstructedAmount();
	    	confirm.verifySettledTransactionAmount();
	    	confirm.clickConfirm();
	        
	    }

	    @And("^maker should able to change the creditor Town Name$")
	    public void maker_should_able_to_change_the_creditor_town_name() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	detailedView.verifyCreditorAgentID();
	    	detailedView.verifyCreditorAgentName();
	    	detailedView.verifyCreditorCountry();
	    	detailedView.verifyCreditorName();
	    	detailedView.verifyCreditorPostalCode();
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("CreditorTownName");
	    	detailedView.changeCreditorTownName(options);
	        
	    }

	    @And("^selects confirm button which has change in creditor Town Name$")
	    public void selects_confirm_button_which_has_change_in_creditor_town_name() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	confirm.verifyDebtorAccountNumber();
	    	confirm.verifyCreditorAccountNumber();
	    	confirm.verifyCreditorName();
	    	confirm.verifyCreditorAgentID();
	    	confirm.verifyCreditorAgentName();
	    	confirm.verifyChargeAmount();
	    	confirm.verifyInstructedAmount();
	    	confirm.verifySettledTransactionAmount();
	    	confirm.verifyCreditorTownName();
	    	confirm.clickConfirm();
	        
	    }

	    @And("^maker should able to change the creditor Country$")
	    public void maker_should_able_to_change_the_creditor_country() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	detailedView.verifyCreditorAgentID();
	    	detailedView.verifyCreditorAgentName();
	    	detailedView.verifyCreditorName();
	    	detailedView.verifyCreditorPostalCode();
	    	detailedView.verifyCreditorTownName();
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("CreditorCountryName");
	    	detailedView.selectCreditorCountryOptions(options);
	        
	    }

	    @And("^selects confirm button which has change in creditor Country$")
	    public void selects_confirm_button_which_has_change_in_creditor_country() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	confirm.verifyDebtorAccountNumber();
	    	confirm.verifyCreditorAccountNumber();
	    	confirm.verifyCreditorName();
	    	confirm.verifyCreditorAgentID();
	    	confirm.verifyCreditorAgentName();
	    	confirm.verifyChargeAmount();
	    	confirm.verifyInstructedAmount();
	    	confirm.verifySettledTransactionAmount();
	    	confirm.verifyCreditorTownName();
	    	confirm.verifyCreditorCountry();
	    	confirm.clickConfirm();
	        
	    }

	    @And("^selects confirm button which has changes in senders charge$")
	    public void selects_confirm_button_which_has_changes_in_senders_charge() throws Throwable {
	    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","DetailedView");
			 String options=mapDataList.get(0).get("SendersCharge");
	    	detailedView.sendersCharge(options);
	     
	    }

	    @And("^selects confirm button which has change in Charge Type$")
	    public void selects_confirm_button_which_has_change_in_charge_type() throws Throwable {
	    	
	    	outward.waitforLoader();
	    	confirm.verifyDebtorAccountNumber();
	    	confirm.verifyCreditorAccountNumber();
	    	confirm.verifyCreditorName();
	    	confirm.verifyCreditorAgentID();
	    	confirm.verifyCreditorAgentName();
	    	confirm.verifyChargeAmount();
	    	confirm.verifyInstructedAmount();
	    	confirm.verifySettledTransactionAmount();
	    	confirm.verifyCreditorTownName();
	    	confirm.verifyCreditorCountry();
	    	confirm.verifyChargeType();
	    	confirm.clickConfirm();
	        
	    }
	    
	    @And("^verify senders charge$")
	    public void verify_senders_charge() throws Throwable {
	        
	    	second.verifySendersCharge();
	    	
	    }

	    @And("^verify Charge Type$")
	    public void verify_charge_type() throws Throwable {
	        
	    	second.verifyChargeType();
	    }

	    @And("^verify Transaction Remarks$")
	    public void verify_transaction_remarks() throws Throwable {
	        
	    	second.verifyTransactionRemarks();
	    }

	    @And("^verify Remarks$")
	    public void verify_remarks() throws Throwable {
	        
	    	second.verifyRemarks();
	    }









}
