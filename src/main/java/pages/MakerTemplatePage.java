package pages;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.remote.server.handler.FindElements;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;
import groovyjarjarantlr4.v4.runtime.tree.xpath.XPath;


public class MakerTemplatePage extends Drivers {
	
	static baseClass base = new baseClass();

	public MakerTemplatePage() {

		PageFactory.initElements(driver, this);
	}

	public static String uuid;
	
	@FindBy(xpath = "//mat-select[@placeholder='Message Type']")
	public WebElement messagetype;
	
	@FindBy(xpath= "//mat-option[@role='option']")
	public List<WebElement> selectMsgOptions;
	
	@FindBy(xpath = "//mat-select[@placeholder='Channel Source']")
	public WebElement channelsource;
	
	@FindBy(xpath= "//mat-option[@role='option']")
	public List<WebElement> selectChannelOptions;
	
	@FindBy(xpath = "//mat-select[@placeholder='Template File Type']")
	public WebElement fileformat;
	
	@FindBy(xpath= "//mat-option[@role='option']")
	public List<WebElement> selectfileOptions;
	
	@FindBy(xpath = "//span[contains(text(),'Submit')]")
	public WebElement submit_btn;
	
	@FindBy(xpath = "//span[contains(text(),'Update')]")
	public WebElement update_btn;
	
	@FindBy(xpath="//div[.='Saved Successfully']")
	public WebElement template_success;	
	
	@FindBy(xpath="//div[.='Updated Successfully']")
	public WebElement template_updated;	
	
	@FindBy(xpath="//input[@data-placeholder='Header Count']")
	public WebElement header_count;	
	
	@FindBy(xpath="//input[@data-placeholder='Footer Count']")
	public WebElement footer_count;	
	
	@FindBy(xpath="//input[@data-placeholder='Template Name']")
	public WebElement template_name;
	
	@FindBy(xpath="//input[@data-placeholder='Delimiter']")
	public WebElement delimiter;
	
	@FindBy(xpath="(//span[contains(text(),'Manual')])[1]")
	public WebElement manualchannel;
	
	@FindBy(xpath="//table[@id='TemplateMapping']")
	public WebElement table;
	
	@FindBy(xpath = "(//table[@id='TemplateMapping']/tbody/tr)")
	public List<WebElement> tablerow;

	@FindBy(xpath = "(//table[@id='TemplateMapping']/tbody/tr/td)")
	public List<WebElement> tablecolumn;
	
	@FindBy(xpath="//input[@placeholder='defaultValue']")
	public WebElement default_value;
	
	@FindBy(xpath="//td[contains(text(),'Debtor Account (IBAN)')]/following::input[1]")
	public WebElement debacciban;
	
	@FindBy(xpath = "//table[@role='table']")
	public WebElement edit_table;
	
	@FindBy(xpath = "(//mat-icon[text()='edit '])[1]")
	public WebElement edit_tablecolumn;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	public WebElement delete_btn;
	
	@FindBy(xpath = "(//span[contains(text(),'Delete')])[3]")
	public WebElement delete_popupbtn;

	public void default_value(int a) {
		base.highLighterMethod(debacciban);
		base.explicitWait(debacciban);
		base.sendKeys(debacciban, "default");
	}
	
	public void enter_templatename() {
		
		uuid = UUID.randomUUID().toString();
		uuid = uuid.substring(0, Math.min(uuid.length(), 10));
		
		base.highLighterMethod(template_name);
		base.explicitWait(template_name);
		Assert.assertEquals(template_name.isDisplayed(), true);
		base.sendKeys(template_name, uuid);
	}
	
	public void enter_headercount() throws EncryptedDocumentException, IOException {
		base.explicitWait(header_count);
		base.highLighterMethod(header_count);
		Assert.assertEquals(header_count.isDisplayed(), true);
		base.click(header_count);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Template");
		String options=mapDataList.get(0).get("header");
		
		base.sendKeys(header_count, options);
	}
	
	public void enter_footercount() throws EncryptedDocumentException, IOException {
		base.explicitWait(footer_count);
		base.highLighterMethod(footer_count);
		Assert.assertEquals(footer_count.isDisplayed(), true);
		base.click(footer_count);
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Template");
		String options=mapDataList.get(0).get("footer");
		
		base.sendKeys(footer_count, "1");
	}
	
	public void Verify_template_success_toast_msg() throws InterruptedException
	{
	 base.highLighterMethod(template_success);
	 base.explicitWait(template_success);
	 boolean actual= template_success.isDisplayed();
	 Assert.assertEquals(actual, true);    
    }
	
	public void Verify_template_updated_toast_msg() throws InterruptedException
	{
	 base.explicitWait(template_updated);
	 base.highLighterMethod(template_updated);
	 boolean actual= template_updated.isDisplayed();
	 Assert.assertEquals(actual, true);   
    }
	
	public void clicksubmit(){
		base.highLighterMethod(submit_btn);
		base.explicitWait(submit_btn);
		Assert.assertEquals(submit_btn.isDisplayed(), true);
		base.click(submit_btn);
	}
	
	public void clickupdate(){
		base.highLighterMethod(update_btn);
		base.explicitWait(update_btn);
		Assert.assertEquals(update_btn.isDisplayed(), true);
		base.click(update_btn);
	}
	
	public void clickdelete(){
		base.highLighterMethod(delete_btn);
		base.explicitWait(delete_btn);
		Assert.assertEquals(delete_btn.isDisplayed(), true);
		base.click(delete_btn);
	}
	
	public void clickdeletepopup(){
		base.highLighterMethod(delete_popupbtn);
		base.explicitWait(delete_popupbtn);
		Assert.assertEquals(delete_popupbtn.isDisplayed(), true);
		base.click(delete_popupbtn);
	}
	
	public void selectmessagetype(String strArg1) {
		base.explicitWait(messagetype);
		base.highLighterMethod(messagetype);
		Assert.assertEquals(messagetype.isDisplayed(), true);
		base.click(messagetype);
		for(int j= 0;j<selectMsgOptions.size();j++) {
			if(selectMsgOptions.get(j).getText().equalsIgnoreCase(strArg1)){
				base.explicitWait(selectMsgOptions.get(j));
				base.highLighterMethod(selectMsgOptions.get(j));
				Assert.assertEquals(selectMsgOptions.get(j).isDisplayed(), true);
				base.click(selectMsgOptions.get(j));
				break;
			}
		}		
	}
	
	public void selectchanneltype() {
		
		base.highLighterMethod(channelsource);
		base.explicitWait(channelsource);
		Assert.assertEquals(channelsource.isDisplayed(), true);
		base.click(channelsource);
		base.highLighterMethod(manualchannel);
		base.explicitWait(manualchannel);
		Assert.assertEquals(manualchannel.isDisplayed(), true);
		base.click(manualchannel);		
		
	}
	
	public void selectfiletype(String strArg1) {
		base.explicitWait(fileformat);
		base.highLighterMethod(fileformat);
		Assert.assertEquals(fileformat.isDisplayed(), true);
		base.click(fileformat);
		for(int j= 0;j<selectfileOptions.size();j++) {
			if(selectfileOptions.get(j).getText().equalsIgnoreCase(strArg1)){
				base.explicitWait(selectfileOptions.get(j));
				base.highLighterMethod(selectfileOptions.get(j));	
				Assert.assertEquals(selectfileOptions.get(j).isDisplayed(), true);
				base.click(selectfileOptions.get(j));
				try {
					base.explicitWait(delimiter);
					base.highLighterMethod(delimiter);
					Assert.assertEquals(delimiter.isDisplayed(), true);
					base.sendKeys(delimiter, ",");
				} catch (Exception e){
					System.out.println("There is no delimeter for this operation");
				}
				break;
				}
			}
		}
	
	public void table1() throws EncryptedDocumentException, IOException {
		String option = "Debtor Account (IBAN)";
		for(int i =2;i<tablecolumn.size();i++) {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Template");
		System.out.println(mapDataList.get(0).get(option));
		String options=mapDataList.get(0).get(tablecolumn.get(i).getText());
		base.highLighterMethod(tablecolumn.get(i+1));
		WebElement abc=tablecolumn.get(i+1);
		base.sendKeys(abc, options);
		} 
	}
	
	public void edit_table() {
		base.highLighterMethod(edit_tablecolumn);
		base.explicitWait(edit_tablecolumn);
		base.click(edit_tablecolumn);
		Assert.assertEquals(edit_tablecolumn.isDisplayed(), true);
			}
	
	public void table() throws EncryptedDocumentException, IOException, InterruptedException {
		int i=1;
		while(i<3){
//		System.out.println("Theese"+tablecolumn.get(i).getText());
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Template");
		String options=mapDataList.get(0).get(tablecolumn.get(i).getText());
//		System.out.println("chccheck"+options);
		Actions action = new Actions(driver);
		action.moveToElement(tablecolumn.get(i+1))
		.click(tablecolumn.get(i+1))
		.sendKeys(tablecolumn.get(i+1), options)
		.build()
		.perform();	
//		Thread.sleep(10000);
//		WebElement abc = tablecolumn.get(i+1);
//		System.out.println("serrrrr"+abc.getText());
//		System.out.println("serrrrr"+abc.getText());
//		System.out.println("serrrrr"+abc.getText());
////		Assert.assertEquals(action.moveToElement(tablecolumn.get(i+1).getText()), options);
		i=i+4;
		}	
	}
	
	public void table_toggle() throws EncryptedDocumentException, IOException {
		int i=1;
		while(i<4){
//		System.out.println("Theese"+tablecolumn.get(i).getText());
			List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","Template");
			String options=mapDataList.get(0).get(tablecolumn.get(i).getText());
//			System.out.println("chccheck"+options);
			Actions action = new Actions(driver);
			action.moveToElement(tablecolumn.get(i+1))
			.click(tablecolumn.get(i+1))
			.sendKeys(tablecolumn.get(i+1), options)
			.build()
			.perform();	
		action.moveToElement(tablecolumn.get(i+2))
		.click(tablecolumn.get(i+2))
		.build()
		.perform();
		i=i+4;
		}	
	}
	
//	public void table() throws InterruptedException {
////		base.explicitWait(table);
//		for(int i =0;i<tablecolumn.size();i++) {
//				Actions action = new Actions(driver);
//				action.moveToElement(tablecolumn.get(i))
//				.click(tablecolumn.get(i))
//				.sendKeys("two")
//				.build()
//				.perform();
//	}
//	}
//	
//	public void table_toggle() throws InterruptedException {
//		base.explicitWait(table);
//		for(int i =0;i<tablecolumn.size();i++) {
//				Actions action = new Actions(driver);
//				action.moveToElement(tablecolumn.get(i+1))
//				.click(tablecolumn.get(i+1))
//				.sendKeys("two")
//				.build()
//				.perform();
//				action.moveToElement(tablecolumn.get(i+2))
//				.click(tablecolumn.get(i+2))
//				.build()
//				.perform();
//	}
//	}
//	
//	public void debitoracciban() throws EncryptedDocumentException, IOException, InterruptedException {
//		String option = "Debtor Account (IBAN)";
//		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","OutwardTransactionReport");
//		System.out.println(mapDataList.get(0).get(option));
//		String options=mapDataList.get(0).get(option);
//		Actions action = new Actions(driver);
//		action.moveToElement(tablecolumn.get(2))
//		.click(tablecolumn.get(2))
//		.sendKeys(tablecolumn.get(2), options)
//		.build()
//		.perform();	
//	}
//	
//	public void debitoracc() throws EncryptedDocumentException, IOException, InterruptedException {
//		String option = "Debtor Account";
//		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","OutwardTransactionReport");
//		System.out.println(mapDataList.get(0).get(option));
//		String options=mapDataList.get(0).get(option);
//		Actions action = new Actions(driver);
//		action.moveToElement(tablecolumn.get(5))
//		.click(tablecolumn.get(5))
//		.sendKeys(tablecolumn.get(5), options)
//		.build()
//		.perform();	
//	}
	}

