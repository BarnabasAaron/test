package pages;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class ParamConfigurationPage extends Drivers {
	
	static baseClass base = new baseClass();
	 login loginn = new login();

	public ParamConfigurationPage() {
		
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//mat-icon[@mattooltip='Filter']")
	public WebElement filter_btn;
	
	@FindBy(xpath = "//mat-icon[@svgicon='settings']")
	public WebElement settings_btn;
	
	@FindBy(xpath = "//input[@id='System']")
	public WebElement system_btn;
	
	@FindBy(xpath = "//input[@id='ParamName']")
	public WebElement paramname_btn;
	
	@FindBy(xpath = "//input[@id='ParamValue']")
	public WebElement paramvalue_btn;
	
	@FindBy(xpath = "//input[@id='Description']")
	public WebElement description_btn;
	
	@FindBy(xpath = "//input[@id='Status']")
	public WebElement status_btn;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	public WebElement search_btn;
	
	@FindBy(xpath = "(//table[@role='table']/tbody/tr/td)[2]")
	public WebElement system_1row;
	
	@FindBy(xpath = "(//table[@role='table']/tbody/tr/td)[3]")
	public WebElement paramname_1row;
	
	@FindBy(xpath = "(//table[@role='table']/tbody/tr/td)[4]")
	public WebElement paramvalue_1row;
	
	@FindBy(xpath = "(//table[@role='table']/tbody/tr/td)[5]")
	public WebElement description_1row;
	
	@FindBy(xpath = "(//table[@role='table']/tbody/tr/td)[6]")
	public WebElement status_1row;
	
	@FindBy(xpath = "//mat-slide-toggle[@id='mat-slide-toggle-1']")
	public WebElement system_toggle;
	
	@FindBy(xpath = "//mat-slide-toggle[@id='mat-slide-toggle-2']")
	public WebElement paramname_toggle;
	
	@FindBy(xpath = "//mat-slide-toggle[@id='mat-slide-toggle-3']")
	public WebElement paramvalue_toggle;
	
	@FindBy(xpath = "//mat-slide-toggle[@id='mat-slide-toggle-4']")
	public WebElement description_toggle;
	
	@FindBy(xpath = "//mat-slide-toggle[@id='mat-slide-toggle-5']")
	public WebElement status_toggle;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	public WebElement save_btn;
	
	@FindBy(xpath = "(//table[@role='table']/thead/tr/th)")
	public List<WebElement> table_header;
	
	public void click_filter_btn() throws InterruptedException
	{
		base.explicitWait(filter_btn);
		base.highLighterMethod(filter_btn);
		Assert.assertEquals(filter_btn.isDisplayed(), true);
		base.click(filter_btn);
	}
	
	public void click_setting_btn() throws InterruptedException
	{
		base.explicitWait(settings_btn);
		base.highLighterMethod(settings_btn);
		Assert.assertEquals(settings_btn.isDisplayed(), true);
		base.click(settings_btn);
	}
	
	public void click_search_btn() throws InterruptedException
	{
		base.explicitWait(search_btn);
		base.highLighterMethod(search_btn);
		Assert.assertEquals(search_btn.isDisplayed(), true);
		base.click(search_btn);
	}
	
	public void click_save_btn() throws InterruptedException
	{
		base.explicitWait(save_btn);
		base.highLighterMethod(save_btn);
		Assert.assertEquals(save_btn.isDisplayed(), true);
		base.click(save_btn);
	}
	
	public void send_systemtext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		base.explicitWait(system_btn);
		base.highLighterMethod(system_btn);
		Assert.assertEquals(system_btn.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("System");
		base.sendKeys(system_btn, options);
	}
	
	public void verify_systemtext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		try {
		base.explicitWait(system_1row);
		base.highLighterMethod(system_1row);
		Assert.assertEquals(system_1row.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("System");
		Assert.assertEquals(system_1row.getText(), options+" ");
		} catch(Exception e) {
			System.out.println("No Results Found");
		}
	}	
	
	public void send_paramnametext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		base.explicitWait(paramname_btn);
		base.highLighterMethod(paramname_btn);
		Assert.assertEquals(paramname_btn.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Paramname");
		base.sendKeys(paramname_btn, options);
	}
	
	public void verify_paramnametext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		try {
		base.explicitWait(paramname_1row);
		base.highLighterMethod(paramname_1row);
		Assert.assertEquals(paramname_1row.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Paramname");
		Assert.assertEquals(paramname_1row.getText(), options+" ");
		} catch(Exception e) {
			System.out.println("No Results Found");
		}
	}	
	
	public void send_paramvaluetext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		base.explicitWait(paramvalue_btn);
		base.highLighterMethod(paramvalue_btn);
		Assert.assertEquals(paramvalue_btn.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Paramvalue");
		base.sendKeys(paramvalue_btn, options);
	}
	
	public void verify_paramvaluetext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		try {
		base.explicitWait(paramvalue_1row);
		base.highLighterMethod(paramvalue_1row);
		Assert.assertEquals(paramvalue_1row.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Paramvalue");
		Assert.assertEquals(paramvalue_1row.getText(), options+" ");
		} catch(Exception e) {
			System.out.println("No Results Found");
		}
	}	
	
	public void send_descriptiontext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		base.explicitWait(description_btn);
		base.highLighterMethod(description_btn);
		Assert.assertEquals(description_btn.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Description");
		base.sendKeys(description_btn, options);
	}
	
	public void verify_descriptiontext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		try {
		base.explicitWait(description_1row);
		base.highLighterMethod(description_1row);
		Assert.assertEquals(description_1row.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Description");
		Assert.assertEquals(description_1row.getText(), options+" ");
		} catch(Exception e) {
			System.out.println("No Results Found");
		}
	}	
	
	public void send_statustext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		base.explicitWait(status_btn);
		base.highLighterMethod(status_btn);
		Assert.assertEquals(status_btn.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Status");
		base.sendKeys(status_btn, options);
	}
	
	public void verify_statustext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		try {
		base.explicitWait(status_1row);
		base.highLighterMethod(status_1row);
		Assert.assertEquals(status_1row.isDisplayed(), true);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Parameter");
		String options=mapDataList.get(0).get("Status");
		Assert.assertEquals(status_1row.getText(), options+" ");
		} catch(Exception e) {
			System.out.println("No Results Found");
		}
	}	
	
	public void click_system_toggle() throws InterruptedException {
		base.explicitWait(system_toggle);
		base.highLighterMethod(system_toggle);
		base.click(system_toggle);
		}
	
	public void verify_system_opt() {
		for(int i= 0; i<table_header.size(); i++) {
			base.explicitWait(table_header.get(i));
			base.highLighterMethod(table_header.get(i));
			Assert.assertNotEquals(table_header.get(i).getText(), "System");
		}
	}
	
	public void click_paramname_toggle() throws InterruptedException {
		base.explicitWait(paramname_toggle);
		base.highLighterMethod(paramname_toggle);
		base.click(paramname_toggle);
		}
	
	public void verify_paramname_opt() {
		for(int i= 0; i<table_header.size(); i++) {
			base.explicitWait(table_header.get(i));
			base.highLighterMethod(table_header.get(i));
			Assert.assertNotEquals(table_header.get(i).getText(), "Param Name");
		}
	}
	
	public void click_paramvalue_toggle() throws InterruptedException {
		base.explicitWait(paramvalue_toggle);
		base.highLighterMethod(paramvalue_toggle);
		base.click(paramvalue_toggle);
		}

	public void verify_paramvalue_opt() {
		for(int i= 0; i<table_header.size(); i++) {
			base.explicitWait(table_header.get(i));
			base.highLighterMethod(table_header.get(i));
			Assert.assertNotEquals(table_header.get(i).getText(), "Param Value");
		}
	}
	
	public void click_description_toggle() throws InterruptedException {
		base.explicitWait(description_toggle);
		base.highLighterMethod(description_toggle);
		base.click(description_toggle);
		}
	
	public void verify_description_opt() {
		for(int i= 0; i<table_header.size(); i++) {
			base.explicitWait(table_header.get(i));
			base.highLighterMethod(table_header.get(i));
			Assert.assertNotEquals(table_header.get(i).getText(), "Description");
		}
	}
	
	public void click_status_toggle() throws InterruptedException {
		base.explicitWait(status_toggle);
		base.highLighterMethod(status_toggle);
		base.click(status_toggle);
		}
	
	public void verify_status_opt() {
		for(int i= 0; i<table_header.size(); i++) {
			base.explicitWait(table_header.get(i));
			base.highLighterMethod(table_header.get(i));
			Assert.assertNotEquals(table_header.get(i).getText(), "Status");
		}
	}

}
