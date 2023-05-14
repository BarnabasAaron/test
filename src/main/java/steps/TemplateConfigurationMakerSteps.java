package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BatchCreditTransferApproval;
import pages.CheckerSettingsPage;
import pages.CheckerTemplatePage;
import pages.MakerTemplatePage;
import pages.OutwardTransactionDetailReport;
import pages.checkerHomepage;
import pages.makerHomepage;
import pages.makersettings;

public class TemplateConfigurationMakerSteps {

	makerHomepage makerhome = new makerHomepage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	makersettings makerset = new makersettings();
	MakerTemplatePage makertemp = new MakerTemplatePage();
	checkerHomepage checkerhome = new checkerHomepage();
	CheckerTemplatePage checkertemplate = new CheckerTemplatePage();
	CheckerSettingsPage checkersettings = new CheckerSettingsPage();
	BatchCreditTransferApproval BatchApproval = new BatchCreditTransferApproval();

	@When("^maker enter valid template name$")
	public void maker_enter_valid_template_name() throws Throwable {
		outward.waitforLoader();
		makertemp.enter_templatename();
	}

	@Then("^template configuration saved successfully$")
	public void template_configuration_saved_successfully() throws Throwable {
		outward.waitforLoader();
		makertemp.Verify_template_success_toast_msg();
	}

	@And("^Maker clicks settings$")
	public void maker_clicks_settings() throws Throwable {
		outward.waitforLoader();
		makerhome.click_settings_btn();
	}

	@And("^Maker clicks template configuration$")
	public void maker_clicks_template_configuration() throws Throwable {
		outward.waitforLoader();
		makerset.click_tempconfig_btn();
	}

	@And("^maker selects \"([^\"]*)\" messasge type$")
	public void maker_selects_something_messasge_type(String strArg1) throws Throwable {
		outward.waitforLoader();
		makertemp.selectmessagetype(strArg1);
	}

	@And("^maker selects Manual channel source$")
	public void maker_selects_Manual_channel_source() throws Throwable {
		//    	outward.waitforLoader();
		makertemp.selectchanneltype();
	}

	@And("^maker selects \"([^\"]*)\" format$")
	public void maker_selects_something_format(String strArg1) throws Throwable {
		outward.waitforLoader();
		makertemp.selectfiletype(strArg1);
	}

	@Then("^maker clicks submit button$")
	public void maker_clicks_submit_button() throws Throwable {
		makertemp.clicksubmit();
	}

	@And("^maker enters header count$")
	public void maker_enters_header_count() throws Throwable {
		//    	outward.waitforLoader();
		makertemp.enter_headercount();
	}

	@And("^maker enters footer count$")
	public void maker_enters_footer_count() throws Throwable {
		//    	outward.waitforLoader();
		makertemp.enter_footercount();
	}

	@And("^maker enters value in their column while in active state$")
	public void maker_enters_value_in_their_column_while_in_active_state() throws Throwable {
		//    	outward.waitforLoader();
		makertemp.table();
	}

	@And("^maker enters value in their column while in inactive state$")
	public void maker_enters_value_in_their_column_while_in_inactive_state() throws Throwable {
		//    	outward.waitforLoader();
		makertemp.table_toggle();   	
	}

	@And("^Checker selects that particular template which is created by maker$")
	public void Checker_selects_that_particular_template_which_is_created_by_maker() throws Throwable {
		outward.waitforLoader();
		checkertemplate.edittable();
	}
	
	@And("^Checker clicks settings$")
    public void Checker_clicks_settings() throws Throwable {
		outward.waitforLoader();
		checkerhome.Click_Settings_btn();		
    }

    @Then("^Checker clicks template configuration approval$")
    public void Checker_clicks_template_configuration_approval() throws Throwable {
    	outward.waitforLoader();
    	checkersettings.click_tempconfig_btn();
    }
    
    @And("^in Confirmation Popup checker enters data under remarks to reject$")
	public void in_Confirmation_Popup_the_checker_enters_data_under_remarks_to_reject() throws Throwable {
    	checkertemplate.Reject_RemarksPopup();
	}
    
    @Then("^in Confirmation Popup click approve$")
    public void Approve_option_will_be_selected_successfully() throws Throwable {
    	BatchApproval.Click_ApprovePopup();
   
    }
    
    @Then("^template configuration done successfully$")
    public void template_configuration_done_successfully() throws Throwable {
    	outward.waitforLoader();
    	checkertemplate.verify_table();
    }
    
    @And("^maker selects that particular template which is approved by checker$")
    public void maker_selects_that_particular_template_which_is_approved_by_checker() throws Throwable {
    	outward.waitforLoader();
		checkertemplate.edittable();	
    }
    
    @Then("^maker clicks delete button$")
    public void maker_clicks_delete_button() throws Throwable {
    	outward.waitforLoader();
    	makertemp.clickdelete();
    	outward.waitforLoader();
    	makertemp.clickdeletepopup();
    	outward.waitforLoader();
    	checkertemplate.verify_table();	
    }
    
    @When("^maker enter click edit button$")
	public void maker_enter_click_edit_button() throws Throwable {
		outward.waitforLoader();
		makertemp.edit_table();
	}

	@And("^maker clicks update button$")
	public void maker_clicks_update_button() throws Throwable {
		outward.waitforLoader();
		makertemp.clickupdate();
	}

	@Then("^template configuration updated successfully$")
	public void template_configuration_updated_successfully() throws Throwable {
		outward.waitforLoader();
		makertemp.Verify_template_updated_toast_msg();
	}


}
