package steps;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchCreditTransferApproval;
import pages.BatchCreditTransferCheckerVerificationQueue;
import pages.BatchCreditTransferPage;
import pages.OutwardTransactionDetailReport;
import pages.checkerHomepage;
import pages.login;
import pages.makerHomepage;
import pages.utilityPage;


public class BatchCreditTransferCheckerVerificationQueueStep {
	
	static baseClass base = new baseClass();
	login loginn = new login();
	BatchCreditTransferPage Batchtransfer =new BatchCreditTransferPage();
	BatchCreditTransferApproval BatchApproval = new BatchCreditTransferApproval();
	BatchCreditTransferCheckerVerificationQueue Batchqueue = new BatchCreditTransferCheckerVerificationQueue();
	makerHomepage makerhome = new makerHomepage();
	checkerHomepage checkerHome = new checkerHomepage();
	utilityPage util = new utilityPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	
		
	
	@And("^the checker click Outward Payment processing in homepage$")
    public void the_checker_click_outward_payment_processing_in_homepage() throws Throwable {
		outward.waitforLoader();
		checkerHome.clickOutwardPaymentProcessing_btn();	
    }

    @And("^the checker click Batch Credit Transfer Approval under Outward payment processing field$")
    public void the_checker_click_batch_credit_transfer_approval_under_outward_payment_processing_field() throws Throwable {
    	outward.waitforLoader();
    	checkerHome.clickBatchCreditTransferApproval_btn();
    }

    @When("^checker view message reference field in batch credit transfer approval queue$")
    public void checker_view_message_reference_field_in_batch_credit_transfer_approval_queue() throws Throwable  {
    	Batchqueue.view_messagereference();   	
    }

    @When("^checker click edit icon in batch credit transfer queue$")
    public void checker_click_edit_icon_in_batch_credit_transfer_queue() throws InterruptedException {
    	
    	BatchApproval.View_BatchCreditTransferApproval_Page();
    	BatchApproval.Click_Editicon_btn();
    }

    @Then("^checker view source field in batch credit transfer approval queue$")
    public void checker_view_source_field_field_in_batch_credit_transfer_approval_queue() throws InterruptedException {
    	Batchqueue.view_source();
    }

    @Then("^checker view details about that batch credit transfer$")
    public void checker_view_details_about_that_batch_credit_transfer() throws EncryptedDocumentException, IOException {
    	BatchApproval.View_BatchCreditTransferApprovalSummary_Page();
    }
    
    
    @And("^checker view creation date time field in batch credit transfer approval queue$")
    public void checker_view_creation_date_time_field_in_batch_credit_transfer_approval_queue() throws InterruptedException {
    	Batchqueue.view_creationdatetime();
    }
          
    @And("^checker view number of transaction field in batch credit transfer approval queue$")
    public void checker_view_number_of_transaction_field_field_in_batch_credit_transfer_approval_queue() throws InterruptedException, IOException {
    	Batchqueue.view_numberoftransaction();
    }

    @And("^checker view total amount field in batch credit transfer approval queue$")
    public void checker_view_total_amount_field_in_batch_credit_transfer_approval_queue() throws InterruptedException, EncryptedDocumentException, IOException {
    	Batchqueue.view_totalamount();
    }

    @And("^checker view settlement date field in batch credit transfer approval queue$")
    public void checker_view_settlement_date_field_in_batch_credit_transfer_approval_queue() throws InterruptedException {
    	Batchqueue.view_settlementdate();
    }
    
    @And("^checker view created by field in batch credit transfer approval queue$")
    public void checker_view_created_by_field_in_batch_credit_transfer_approval_queue() throws InterruptedException {
    	Batchqueue.view_createdby();
    }
    
    @And("^checker view file name field in batch credit transfer approval queue$")
    public void checker_view_file_name_field_in_batch_credit_transfer_approval_queue() throws InterruptedException {
    	Batchqueue.view_filename();
    }

}


