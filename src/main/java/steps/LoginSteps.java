package steps;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;

import baseClass.baseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OutwardTransactionDetailReport;
import pages.login;



public class LoginSteps  {



	baseClass base = new baseClass();
	login loginPage = new login();
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();

	@Given("user launch with valid NPSS URL")
	public void user_launch_with_valid_npss_url() throws FileNotFoundException, IOException {
		String url=base.loadProperties("LandingPageURL");
		System.out.println("The url is "+url);
		base.openURL(url);
	}

	
	//ReadExcelDataInListOfMap obj = new ReadExcelDataInListOfMap();
	@When("user login with valid username and valid password")
	public void user_login_with_valid_username_and_valid_password() throws FileNotFoundException, IOException {


		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","login");
		  System.out.println(mapDataList.get(0).get("checker username"));
		  String username=mapDataList.get(0).get("maker username");
		  String password=mapDataList.get(0).get("ValidPassword");
		  loginPage.username_field(username);
		  loginPage.password_field(password);
		  loginPage.signin_button();


	}

	@Then("user can view NPSS homepage")
	public void user_can_view_npss_homepage() {
		outward.waitforLoader();
		String originalurl=base.getURL();
		String homepageurl = "https://webapp.itt.npss.te.nestdigital.com/#/home/home";
		base.assertElements(originalurl, homepageurl);

	}



	@When("user login with valid username and invalid password")
	public void user_login_with_valid_username_and_invalid_password() throws FileNotFoundException, IOException {

		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","login");
		  System.out.println(mapDataList.get(0).get("checker username"));
		  String username=mapDataList.get(0).get("maker username");
		  String password=mapDataList.get(0).get("InvalidPassword");
		  loginPage.username_field(username);
		  loginPage.password_field(password);
		  loginPage.signin_button();


	}

	@Then("user gets error message")
	public void user_gets_error_message() {

			loginPage.errorMessage();

	}

	@When("user login with invalid username and valid password")
	public void user_login_with_invalid_username_and_valid_password() throws FileNotFoundException, IOException {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","login");
		  System.out.println(mapDataList.get(0).get("checker username"));
		  String username=mapDataList.get(0).get("InvalidUsername");
		  String password=mapDataList.get(0).get("ValidPassword");
		  loginPage.username_field(username);
		  loginPage.password_field(password);
		  loginPage.signin_button();


	}

	@When("user login with invalid username and invalid password")
	public void user_login_with_invalid_username_and_invalid_password() throws FileNotFoundException, IOException {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","login");
		  System.out.println(mapDataList.get(0).get("checker username"));
		  String username=mapDataList.get(0).get("InvalidUsername");
		  String password=mapDataList.get(0).get("InvalidPassword");
		  loginPage.username_field(username);
		  loginPage.password_field(password);
		  loginPage.signin_button();


	}

	@When("user login with null username and password")
	public void user_login_with_null_username_and_password() {

		loginPage.signin_button();

	}
	
	@When("^user login with valid checker username and password$")
    public void user_login_with_valid_checker_username_and_password() throws Throwable {
		
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","login");
		  String username=mapDataList.get(0).get("checker username");
		  String password=mapDataList.get(0).get("ValidPassword");
		  outward.waitforLoader();
		  loginPage.username_field(username);
		  loginPage.password_field(password);
		  loginPage.signin_button();

        
    }


}


