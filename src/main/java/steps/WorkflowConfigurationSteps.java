package steps;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import org.openqa.selenium.ElementClickInterceptedException;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.CheckerAdminHomePage;
import pages.CheckerAdminSettingsPage;
import pages.MakerAdminSettings;
import pages.OutwardTransactionDetailReport;
import pages.WorkFlowRuleConfigurationApproval;
import pages.WorkFlowRuleConfigurationInitiation;
import pages.checkerHomepage;

public class WorkflowConfigurationSteps {
	
	baseClass base = new baseClass();
	MakerAdminSettings makerSettings = new MakerAdminSettings();
	WorkFlowRuleConfigurationInitiation config = new WorkFlowRuleConfigurationInitiation();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	checkerHomepage checkerHome = new checkerHomepage();
	CheckerAdminHomePage checkerAdminHome = new CheckerAdminHomePage();
	CheckerAdminSettingsPage checkerAdminSettings = new CheckerAdminSettingsPage();
	WorkFlowRuleConfigurationApproval approve = new WorkFlowRuleConfigurationApproval();
	public static String uuid;
	
	@And("^selects Workflow Rule Configuration in Settings$")
    public void selects_workflow_rule_configuration_in_settings() throws Throwable {
		outward.waitforLoader();
		makerSettings.clickWorkflowRuleConfiguration();
    }
	
	
	@When("^Maker selects Application$")
    public void maker_selects_application() throws Throwable {
		outward.waitforLoader();
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("ApplicationOption");
		config.selectApplicationOption(options);
    }

    @And("^Maker selects Message Type$")
    public void maker_selects_message_type() throws Throwable {
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("MessageType");
    	config.selectMessageType(options);
    }

    @And("^Maker selects Event Type$")
    public void maker_selects_event_type() throws Throwable {
    	outward.waitforLoader();
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("EventType");
    	config.selectEventType(options);
    }
    
    

    @And("^Maker Enters Rule Name$")
    public void maker_enters_rule_name() throws Throwable {
    	outward.waitforLoader();
    	uuid = UUID.randomUUID().toString();
		uuid = uuid.substring(0, Math.min(uuid.length(), 10));
    	config.enterRuleName(uuid);
    	
    }

    @And("^maker selects Field$")
    public void maker_selects_field() throws Throwable {
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("FieldOptionFirstRow");
    	config.selectFieldOptionsFirstRow(options);
    }

    @And("^Maker selects Operator$")
    public void maker_selects_operator() throws Throwable {
    	outward.waitforLoader();
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("OperatorFirstRow");
    	config.selectOperatorOptionsFirstRow(options);
    }

    @And("^Maker selects Value$")
    public void maker_selects_value() throws Throwable {
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("ValueFirstRow");
    	config.selectValueOptionsFirstRow(options);
    }
    
    @And("^selects add button to add new clause$")
    public void selects_add_button_to_add_new_clause() throws Throwable {
    	
    	config.clickAddNewClause();
    
    }

    @And("^selects and operator$")
    public void selects_and_operator() throws Throwable {
    	outward.waitforLoader();
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("AndOrFirst");
    	config.selectAndORFieldFirst(options);
        
    }

    @And("^maker selects Amount in new clause$")
    public void maker_selects_amount_in_new_clause() throws Throwable {
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("FieldOptionSecondRow");
    	config.selectFieldOptionsSecondRow(options);
        
    }

    @And("^maker selects Operator in new clause$")
    public void maker_selects_operator_in_new_clause() throws Throwable {
    	outward.waitforLoader();
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("OperatorSecondRow");
    	config.selectOperatorOptionsSecondRow(options);
        
    }

    @And("^maker selects value in new clause$")
    public void maker_selects_value_in_new_clause() throws Throwable {
    	
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("ValueSecondRow");
    	config.selectValueOptionsSecondRow(options);
    	outward.waitforLoader();
        
    }
    
    @And("^selects is STP$")
    public void selects_is_stp() throws Throwable {
        
    	config.clickIsSTPCheckbox();
    }

    @And("^selects Stp status$")
    public void selects_stp_status() throws Throwable {
    
    	
        try {
        	
			config.selectStpStatus("STP");	
		} catch (Exception e) {
			// Getting sometimes intercepted with loader so added to wait for loader
			outward.waitforLoader();
			config.selectStpStatus("STP");
			
		}
    }

    @And("^enters Sort Order$")
    public void enters_sort_order() throws Throwable {
    	List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","WorkflowConfiguration");
		 String options=mapDataList.get(0).get("SortOrder");
        config.enterSortOrder(options);
    }

    @And("^selects submit$")
    public void selects_submit() throws Throwable {
        config.selectSubmitButton();
    }

    @And("^verifies data in table$")
    public void verifies_data_in_table() throws Throwable {
    	outward.waitforLoader();
        config.verifyDataInTable(uuid);
    }

    @And("^Checker selects the option to change Admin$")
    public void checker_selects_the_option_to_change_admin() throws Throwable {
        outward.waitforLoader();
    	checkerHome.selectOptionToChangeAccess();
    	
    }

//    @And("^selects settings from side menu$")
//    public void selects_settings_from_side_menu() throws Throwable {
//    	outward.waitforLoader();
//    	checkerAdminHome.selectSettings();
//    }

    @And("^selects Workflow Rule Configuration Approval in Seetings$")
    public void selects_workflow_rule_configuration_approval_in_seetings() throws Throwable {
        outward.waitforLoader();
        checkerAdminSettings.clickWorkflowRuleApproval();
    }

    @And("^selects edit icon for the particular transaction$")
    public void selects_edit_icon_for_the_particular_transaction() throws Throwable {
        outward.waitforLoader();
        approve.selectEditIconofTable();
    }

    @And("^verifies the data of configuration$")
    public void verifies_the_data() throws Throwable {
        outward.waitforLoader();
        approve.verifyApplication();
        approve.verifyEventType();
        approve.verifyRuleName();
    }

    @And("^selects Approve$")
    public void selects_approve() throws Throwable {
        approve.clickApprove();
    }

    @And("^selects Reject$")
    public void selects_reject() throws Throwable {
    	
        approve.clickReject("Test tests");
    }


}
