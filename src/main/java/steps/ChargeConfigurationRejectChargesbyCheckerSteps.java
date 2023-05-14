package steps;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.BatchCreditTransferPage;
import pages.ChargeConfigurationRejectChargesbyCheckerPages;
import pages.MakerAdminHomePage;
import pages.NPSSDefaultChargeConfigurationPage;
import pages.OutwardTransactionDetailReport;

public class ChargeConfigurationRejectChargesbyCheckerSteps {

	MakerAdminHomePage adminhomepage=new MakerAdminHomePage();
	NPSSDefaultChargeConfigurationPage chargeconfiguration=new NPSSDefaultChargeConfigurationPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	baseClass base = new baseClass();
	ChargeConfigurationRejectChargesbyCheckerPages ChargeconfigurationChecker=new ChargeConfigurationRejectChargesbyCheckerPages();
	BatchCreditTransferPage Batchtransfer =new BatchCreditTransferPage();

	@And("^select Setting from side menu and click on NPSS Charge Configuration button$")
	public void select_setting_from_side_menu_and_click_on_npss_charge_configuration_button() throws Throwable {
		outward.waitforLoader();
		adminhomepage.selectSettings();
		outward.waitforLoader();
		chargeconfiguration.click_NPSSCharge_Configuration_btn();				
	}

	@And("^click on submit button$")
	public void click_on_submit_button() throws Throwable {
		outward.waitforLoader();
		ChargeconfigurationChecker.Click_submit_btn();
	}

	@And("^Save the result displayed in the toast msg and logout as maker$")
	public void save_the_result_displayed_in_the_toast_msg_and_logout_as_maker() throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.Verify_toastmsg_response();	
		Batchtransfer.click_logout_btn();
	}

	@And("^click on NPSS Charge Configuration Approval button$")
	public void click_on_npss_charge_configuration_approval_button() throws Throwable {
		outward.waitforLoader();
		ChargeconfigurationChecker.Click_NPSS_ChargeConfiguration_Approval_btn();
	}

	@And("^checker clicks on edit button$")
	public void checker_clicks_on_edit_button() throws Throwable {
		outward.waitforLoader();
		ChargeconfigurationChecker.Click_edit_btn();
	}

	@And("^click reject button$")
	public void click_reject_button() throws Throwable {
		outward.waitforLoader();
		ChargeconfigurationChecker.Click_Reject_btn();
	}

	@And("^enter remarks in confirmation popup and click on Reject button$")
	public void enter_remarks_in_confirmation_popup_and_click_on_reject_button() throws Throwable {
		outward.waitforLoader();
		ChargeconfigurationChecker.enter_remarks_and_click_reject_btn();

	}

	@Then("^verify the reject toast msg$")
	public void verify_the_reject_toast_msg() throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.Verify_toastmsg_response();
	}

}
