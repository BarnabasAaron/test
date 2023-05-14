package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MakerTemplatePage;
import pages.OutwardTransactionDetailReport;
import pages.ParamConfigurationPage;
import pages.makerHomepage;
import pages.makersettings;

public class ParamConfigurationSteps {
	
	makerHomepage makerhome = new makerHomepage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	makersettings makerset = new makersettings();
	MakerTemplatePage makertemp = new MakerTemplatePage();
	ParamConfigurationPage paramconfig = new ParamConfigurationPage();
	
	@When("^maker clicks filter option$")
    public void maker_clicks_filter_option() throws Throwable {
		outward.waitforLoader();
		paramconfig.click_filter_btn();
    }

    @Then("^maker can see parameter configuration based on system name$")
    public void maker_can_see_parameter_configuration_based_on_system_name() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_systemtext();
    }

    @Then("^maker can see parameter configuration based on param name$")
    public void maker_can_see_parameter_configuration_based_on_param_name() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_paramnametext();
    }

    @Then("^maker can see parameter configuration based on param value$")
    public void maker_can_see_parameter_configuration_based_on_param_value() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_paramvaluetext();
    }

    @Then("^maker can see parameter configuration based on description$")
    public void maker_can_see_parameter_configuration_based_on_description() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_descriptiontext();
    }

    @Then("^maker can see parameter configuration based on status$")
    public void maker_can_see_parameter_configuration_based_on_status() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_statustext();
    }

    @And("^Maker switch NPSS to admin$")
    public void maker_switch_npss_to_admin() throws Throwable {
    	outward.waitforLoader();
    	makerhome.click_arrow_btn();
    	makerhome.click_admin_btn();
    }

    @And("^Maker clicks parameter configuration$")
    public void maker_clicks_parameter_configuration() throws Throwable {
    	outward.waitforLoader();
    	makerset.click_paramconfig_btn();
    }

    @And("^maker enter valid system name$")
    public void maker_enter_valid_system_name() throws Throwable {
    	paramconfig.send_systemtext();
    }

    @And("^maker click search button$")
    public void maker_click_search_button() throws Throwable {
    	paramconfig.click_search_btn();
    }

    @And("^maker enter valid param name$")
    public void maker_enter_valid_param_name() throws Throwable {
    	paramconfig.send_paramnametext();
    }

    @And("^maker enter valid param value$")
    public void maker_enter_valid_param_value() throws Throwable {
    	paramconfig.send_paramvaluetext();
    }

    @And("^maker enter valid description$")
    public void maker_enter_valid_description() throws Throwable {
    	paramconfig.send_descriptiontext();
    }

    @And("^maker enter valid status$")
    public void maker_enter_valid_status() throws Throwable {
    	paramconfig.send_statustext();
    }
    
    @When("^maker clicks settings option$")
    public void maker_clicks_settings_option() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.click_setting_btn();
    }

    @Then("^maker cannot see system row in param configration table$")
    public void maker_cannot_see_system_row_in_param_configration_table() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_system_opt();
    }

    @Then("^maker cannot see param name row in param configration table$")
    public void maker_cannot_see_param_name_row_in_param_configration_table() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_paramname_opt();
    }

    @Then("^maker cannot see param value row in param configration table$")
    public void maker_cannot_see_param_value_row_in_param_configration_table() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_paramvalue_opt();
    }

    @Then("^maker cannot see description row in param configration table$")
    public void maker_cannot_see_description_row_in_param_configration_table() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_description_opt();
    }

    @Then("^maker cannot see status row in param configration table$")
    public void maker_cannot_see_status_row_in_param_configration_table() throws Throwable {
    	outward.waitforLoader();
    	paramconfig.verify_status_opt();
    }

    @And("^maker uncheck system toggle$")
    public void maker_uncheck_system_toggle() throws Throwable {
    	paramconfig.click_system_toggle();
    }

    @And("^maker click save button$")
    public void maker_click_save_button() throws Throwable {
    	paramconfig.click_save_btn();
    }

    @And("^maker uncheck param name toggle$")
    public void maker_uncheck_param_name_toggle() throws Throwable {
    	paramconfig.click_paramname_toggle();
    }

    @And("^maker uncheck param value toggle$")
    public void maker_uncheck_param_value_toggle() throws Throwable {
    	paramconfig.click_paramvalue_toggle();
    }

    @And("^maker uncheck description toggle$")
    public void maker_uncheck_description_toggle() throws Throwable {
    	paramconfig.click_description_toggle();
    }

    @And("^maker uncheck status toggle$")
    public void maker_uncheck_status_toggle() throws Throwable {
    	paramconfig.click_paramname_toggle();
    	paramconfig.click_status_toggle();
    }

}
