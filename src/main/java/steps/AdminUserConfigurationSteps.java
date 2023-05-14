package steps;

import io.cucumber.java.en.And;

import pages.MakerAdminHomePage;
import pages.MakerAdminSettings;
import pages.MakerAdminUserConfiguration;
import pages.OutwardTransactionDetailReport;
import pages.makerHomepage;

public class AdminUserConfigurationSteps {
	
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	makerHomepage maker = new makerHomepage();
	MakerAdminHomePage adminHome = new MakerAdminHomePage();
	MakerAdminSettings adminSettings = new MakerAdminSettings();
	MakerAdminUserConfiguration adminConfig = new MakerAdminUserConfiguration();
	
	@And("^selects the option to change Admin$")
    public void selects_the_option_to_change_admin() throws Throwable {
	outward.waitforLoader();
	maker.clickOptionToChangeAdmin();
	}

    @And("^selects settings from side menu$")
    public void selects_settings_from_side_menu() throws Throwable {
    outward.waitforLoader();
    adminHome.selectSettings();
    }

    @And("^selects User Configuration in Settings$")
    public void selects_user_configuration_in_settings() throws Throwable {
    	
    	outward.waitforLoader();
    	adminSettings.clickUserConfiguration();
    
    }

    @And("^selects Roles menu$")
    public void selects_roles_menu() throws Throwable {
    	outward.waitforLoader();
    	adminConfig.clickRolesMenu();
    }

    @And("^change toggle of \"([^\"]*)\"$")
    public void change_toggle_of_something(String strArg1) throws Throwable {

    	adminConfig.selectToggleForRoles(strArg1);
    
    }
    
    @And("^selects Departments menu$")
    public void selects_departments_menu() throws Throwable {
    	outward.waitforLoader();
    	adminConfig.clickDepartmentMenu();
    	
    }

    @And("^change toggle of \"([^\"]*)\" in department$")
    public void change_toggle_of_something_in_department(String strArg1) throws Throwable {
        adminConfig.selectToggleForDepartments(strArg1);
        
    }


}
