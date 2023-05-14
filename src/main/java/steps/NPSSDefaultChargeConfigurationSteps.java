package steps;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MakerAdminHomePage;
import pages.NPSSDefaultChargeConfigurationPage;
import pages.OutwardTransactionDetailReport;

public class NPSSDefaultChargeConfigurationSteps {

	MakerAdminHomePage adminhomepage=new MakerAdminHomePage();
	NPSSDefaultChargeConfigurationPage chargeconfiguration=new NPSSDefaultChargeConfigurationPage();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	baseClass base = new baseClass();

	@And("^select Setting from side menu$")
	public void select_setting_from_side_menu() throws Throwable {
		outward.waitforLoader();
		adminhomepage.selectSettings();
	}


	@And("^click on NPSS Charge Configuration$")
	public void click_on_npss_charge_configuration() throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.click_NPSSCharge_Configuration_btn();
	}


	@When("^selects \"([^\"]*)\" in message type$")
	public void selects_something_in_message_type(String strArg1) throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.selectMessageType(strArg1);
	}

	@And("^Selects \"([^\"]*)\" in payment flow type$")
	public void selects_something_in_payment_flow_type(String strArg1) throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.select_PaymentFlowType(strArg1);

	}

	@And("^select \"([^\"]*)\" field and click on submit button$")
	public void select_something_field_and_click_on_submit_button(String checkbox) throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.checkbox(checkbox);
	}

	@Then("^Save the result displayed in the toast msg$")
	public void save_the_result_displayed_in_the_toast_msg() throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.Verify_toastmsg_response();		
	}

	@And("^Enters Card and IBAN charges$")
	public void enters_card_and_iban_charges() throws Throwable {
		chargeconfiguration.enter_Card_value();
		chargeconfiguration.enter_IBAN_value();
	}

	@And("^select \"([^\"]*)\" field then click on submit button$")
	public void select_something_field_then_click_on_submit_button(String checkbox) throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.inward(checkbox);
	}

	@And("^select \"([^\"]*)\" field and then click on submit button$")
	public void select_something_field_and_then_click_on_submit_button(String checkbox) throws Throwable {
		outward.waitforLoader();
		chargeconfiguration.Reveral_outward(checkbox);
	}
}
