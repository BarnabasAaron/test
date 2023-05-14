package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChargeConfigurationLoadPendingapprovedbyMakerPages;
import pages.NPSSDefaultChargeConfigurationPage;
import pages.OutwardTransactionDetailReport;

public class ChargeConfigurationLoadPendingapprovedbyMakerSteps {

	NPSSDefaultChargeConfigurationPage chargeconfiguration=new NPSSDefaultChargeConfigurationPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	ChargeConfigurationLoadPendingapprovedbyMakerPages CCload =new ChargeConfigurationLoadPendingapprovedbyMakerPages();


	@And("^click on Custom Charge tab$")
	public void click_on_custom_charge_tab() throws Throwable {
		outward.waitforLoader();
		CCload.click_Custom_charge_btn();
	}


	@When("^maker clicks the edit button if checker status is approved$")
	public void maker_clicks_the_edit_button_if_checker_status_is_approved() throws Throwable {
		CCload.Verify_checkerapproveStatus_and_ClickEditicon();
	}

	@Then("^maker can able to edit the custom charges$")
	public void maker_can_able_to_edit_the_custom_charges() throws Throwable {
		outward.waitforLoader();
		CCload.verify_fields_are_Clickable();
	}

	@When("^maker can view the eye icon if checker status is pending$")
	public void maker_can_view_the_eye_icon_if_checker_status_is_pending() throws Throwable {
		CCload.Verify_checkerReject_or_PendingStatus_and_Clickviewicon();
	}

	@Then("^maker cannot able to edit the custom charges$")
	public void maker_cannot_able_to_edit_the_custom_charges() throws Throwable {
		CCload.verify_fields_are_uneditable();
	}


}
