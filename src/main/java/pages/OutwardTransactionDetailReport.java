package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;


public class OutwardTransactionDetailReport extends Drivers {

	static baseClass base = new baseClass();

	public OutwardTransactionDetailReport() { 

		PageFactory.initElements(driver, this);
	}


	@FindBy(id ="mat-select-value-1")
	public  WebElement groupBy_field;

	@FindBy(xpath = "//mat-option[@role='option']")
	public  List<WebElement> groupByOptions;

	@FindBy(id = "mat-option-0")
	public  WebElement disabled_option;

	@FindBy(id = "mat-option-1")
	public  WebElement customerWiseSummary_option;

	@FindBy(id = "mat-select-value-7")
	public  WebElement initialFilterFieldName;

	@FindBy(xpath= "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-2']")
	public  WebElement fromCalendarIcon;

	@FindBy(xpath = "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-3']")
	public  WebElement toCalendarIcon;

	@FindBy(xpath= "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-4']")
	public  WebElement fromCalendarSecondRowIcon;


	// This will be used as From calendar only for Between filter for other filter will be working as To Calendar only
	@FindBy(xpath = "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-5']")
	public  WebElement toCalendarSecondRowIcon;

	@FindBy(xpath = "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-6']")
	public  WebElement toCalendarSecondRowIconBetweenFilter;


	@FindBy(xpath = "//div[.=' 1 ']")
	public  WebElement firstDate;

	@FindBy(xpath = "//div[.=' 28 ']")
	public  WebElement lastDate;

	@FindBy(xpath = "//span[text()='Clear Filter']")
	public  WebElement clearFilter;

	@FindBy(xpath = "//span[text()=' View Report ']")
	public  WebElement viewReport;

	@FindBy(xpath = "//span[text()='PDF Download']")
	public  WebElement pdfDownload;

	@FindBy(xpath = "//mat-icon[text()='more_vert']")
	public  WebElement moreOptionsToDownload;

	@FindBy(xpath = "(//button[contains(@class,'mat-focus-indicator mat-menu-item')])[2]")
	public  WebElement excelDownload;

	@FindBy(xpath = "(//button[contains(@class,'mat-focus-indicator mat-menu-item')])[3]")
	public  WebElement print;

	@FindBy(xpath = "//mat-icon[text()='add']")
	public  WebElement addButton;

	@FindBy(xpath = "//span[text()='Select Field Name']")
	public  WebElement selectField;


	@FindBy(xpath= "//mat-option[@role='option']")
	public List<WebElement> selectFieldOptions ;

	@FindBy(xpath = "//span[contains(text(),'Operator')]")
	public  WebElement operator;

	@FindBy(xpath = "//mat-option[@role='option']")
	public List<WebElement> operatorOptions;

	@FindBy(xpath = "//input[@data-placeholder='Search']")
	public  WebElement search;

	@FindBy(xpath = "//span[text()='Select']")
	public WebElement select;

	@FindBy(xpath = "//input[@placeholder='Search']")
	public WebElement modeSearchBox;

	@FindBy(xpath="//span[text()=' Realtime ']")
	public WebElement realtimeOption;

	@FindBy(xpath="//span[text()=' Batch ']")
	public WebElement batchOption;

	@FindBy(xpath = "//mat-datepicker-toggle[@data-mat-calendar='mat-datepicker-9']")
	public WebElement LessThanEqualCalendar;

	@FindBy(xpath = "//div[@class='optionScroll']")
	public List<WebElement> modeOptions;

	@FindBys({@FindBy(xpath = "//div[@id='spinner']")})
	private List<WebElement> bothcriteria;

	@FindBy(xpath = "//div[@id='spinner']")
	public WebElement loader;

	@FindBy(xpath = "//*[@role=\"option\"]/mat-pseudo-checkbox")
	public WebElement checkbox;

	@FindBy(xpath = "(//mat-icon[text()='remove_red_eye '])[1]")
	public WebElement eyeicon;
	@FindBy(xpath = "(//table[@role='table'])[2]")
	public WebElement historyTable;

	@FindBy(xpath ="(//table[@role='table'])[2]//th")
	public List<WebElement> historyTableHeader;

	@FindBy(xpath = "(//table[@role='table'])[2]/tbody/tr")
	public List<WebElement> historyTableRow;

	@FindBy(xpath = "(//table[@role='table'])[2]/tbody/tr/td")
	public List<WebElement> historyTableColumn;

	@FindBy(xpath = "//mat-icon[text()='arrow_drop_down_circle '] ")
	public WebElement downloadPacs;
	
	@FindBy(xpath = "//span[@id='debtorAccNumber']/following::td[2]")
	public WebElement view_debac;

	@FindBy(xpath = "//span[@id='creditorAccNumber']/following::td[3]")
	public WebElement view_creac;

	@FindBy(xpath = "//span[@id='creditorAgentName']/following::td[7]")
	public WebElement view_agent;

	@FindBy(xpath = "//span[@id='debtorNameAndAddress']/following::td[4]")
	public WebElement deb_name;

	@FindBy(xpath = "//span[@id='debtorNameAndAddress']/following::td[5]")
	public WebElement cre_name;
	
	@FindBy(xpath = "((//div[text()='Batch '])[1]/following::mat-icon)[1]")
	public WebElement click_detailsbatch;
	
	@FindBy(xpath = "//h3[contains(text(),'NPSS Outward Transaction History')]")
	public WebElement detailsviewassert2_batch;
	
	@FindBy(xpath = "((//div[contains(text(),'Credit Transfer Completed Successfully ')])[1]/following::mat-icon)[1]")
	public WebElement eye_icon;
	
	@FindBy(xpath = "(//mat-select[@formcontrolname='fieldOperator'])[3]")
	public  WebElement operator2;
	
	@FindBy(xpath = "(//input[@data-placeholder='Search'])[2]")
	public  WebElement search2;
	
	public void verifydatafromTable(String message) {

		base.explicitWait(historyTable);
		for(int i =0;i<historyTableRow.size();i++) {
			if(historyTableRow.get(i).getText().contains(message)){
				base.highLighterMethod(historyTableRow.get(i));
				break;
			}
		}
		}
	
	public void click_eyeicon() {
		base.highLighterMethod(eye_icon);
		base.explicitWait(eye_icon);
		base.click(eye_icon);	
	}
	
	public void searchField1() {
		try {
			base.highLighterMethod(search);
			base.sendKeys(search, RealtimePaymentReversalInitiationPage.transid);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No search for this operator");
		}
		
	}
	
	public void view_eyebatchdetails() {
			base.highLighterMethod(click_detailsbatch);
			base.explicitWait(click_detailsbatch);
			base.click(click_detailsbatch);
			base.highLighterMethod(detailsviewassert2_batch);
			base.explicitWait(detailsviewassert2_batch);
			Assert.assertEquals(detailsviewassert2_batch, detailsviewassert2_batch);
	}

	public void view_debacc() throws InterruptedException
	{
		base.explicitWait(view_debac);
		base.highLighterMethod(view_debac);
		System.out.println(view_debac.getText());
	}

	public void view_creacc() throws InterruptedException
	{
		base.explicitWait(view_creac);
		base.highLighterMethod(view_creac);
		System.out.println(view_creac.getText());
	}

	public void view_debname() throws InterruptedException
	{
		base.explicitWait(deb_name);
		base.highLighterMethod(deb_name);
		System.out.println(deb_name.getText());
	}

	public void view_crename() throws InterruptedException
	{
		base.explicitWait(cre_name);
		base.highLighterMethod(cre_name);
		System.out.println(cre_name.getText());
	}

	public void view_agentid() throws InterruptedException
	{
		base.explicitWait(view_agent);
		base.highLighterMethod(view_agent);
		System.out.println(view_agent.getText());
	}


	public void waitforLoader() {


		try {
			base.explicitWait(loader);
			if(base.isDisplayed(loader)==true) {
				base.dismissloader(bothcriteria, loader);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" ");

		}


	}

	public  void groupByField (String value) {

		groupBy_field.click();
		for(int j= 0;j<groupByOptions.size();j++) {

			if(groupByOptions.get(j).getText().equalsIgnoreCase(value)) {


				base.click(groupByOptions.get(j));
				break;
			}
		}
	}
	public  void fromCalendar() {

		base.explicitWait(fromCalendarIcon);
		fromCalendarIcon.click();
		firstDate.click();	
	}


	public  void toCalendar() {

		toCalendarIcon.click();
		lastDate.click();	
	}


	public  void selectAddFilter() {

		addButton.click();
	}

	public void selectFieldName(String value) {

		base.click(selectField);
		for(int j= 0;j<selectFieldOptions.size();j++) {
			if(selectFieldOptions.get(j).getText().equalsIgnoreCase(value)){
				base.click(selectFieldOptions.get(j));
				break;
			}
		}



	}

	public void selectFieldName(int i) {


		base.click(selectField);
		base.click(selectFieldOptions.get(i));

	}


	public  void selectOperator(String value)  {



		try {
			base.highLighterMethod(operator);
			base.explicitWait(operator);
			base.click(operator);
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			base.highLighterMethod(operator);
			base.explicitWait(operator);
			base.click(operator);
		}

		for(int j= 0;j<operatorOptions.size();j++) {

			if(operatorOptions.get(j).getText().equalsIgnoreCase(value)){

				base.click(operatorOptions.get(j));
				break;
			}



		}
	}

	public  void selectOperator2(String value) {
		try {		
			base.highLighterMethod(operator2);
			base.explicitWait(operator2);
			base.click(operator2);
		} catch (StaleElementReferenceException e) {
			// TODO Auto-generated catch block
			base.highLighterMethod(operator2);
			base.explicitWait(operator2);
			base.click(operator2);
		}
		for(int j= 0;j<operatorOptions.size();j++) {
			if(operatorOptions.get(j).getText().equalsIgnoreCase(value)){
				
				WebElement abc = operatorOptions.get(j).findElement(By.tagName("span"));
				base.highLighterMethod(abc);
				base.explicitWait(abc);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", abc);
				break;
				}
				}	
		}
	
	public void selectStatusOption2(String value) throws InterruptedException {
		base.highLighterMethod(select);
		base.click(select);
		base.highLighterMethod(search2);
		Actions action = new Actions(driver);
		action.moveToElement(search2).click(search2).sendKeys(value).build().perform();
		
//		base.sendKeys(search, value);
		base.click(checkbox);
		base.mouseHover(viewReport);

	}



	public  void searchField(String value) {


		try {
			base.highLighterMethod(search);
			base.sendKeys(search, value);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("No search for this operator");
		}
	}

	public  void selectViewReport() throws InterruptedException {


		base.highLighterMethod(viewReport);
		base.explicitWait(viewReport);
		base.click(viewReport);

	}

	public  void selectPdfDownload() {
		base.explicitWait(pdfDownload);
		pdfDownload.click();
	}

	public  void selectClearFilter() {

		clearFilter.click();
	}

	public  void selectOtherOption() {

		moreOptionsToDownload.click();
	}

	public   void selectExcelDownload() {
		base.explicitWait(moreOptionsToDownload);
		base.click(moreOptionsToDownload);
		base.click(excelDownload);
	}

	public  void selectPrint() {

		print.click();
	}


	public void selectModeFieldOptions(String value) {

		base.highLighterMethod(select);
		base.click(select);
		//base.explicitWait(selectFieldOptions);
		System.out.println("The value is :"+value);
		base.sendKeys(search, value);
		base.click(checkbox);
		base.mouseHover(viewReport);

	}


	public void selectStatusOption(String value) throws InterruptedException {
		base.highLighterMethod(select);
		base.click(select);
		base.sendKeys(search, value);
		base.click(checkbox);
		base.mouseHover(viewReport);

	}

	public void verifyDownload(String value) throws InterruptedException {


		base.verifyFileDownloaded(value);


	}

	public void secondRowCalendar(String value) {

		if(value.equals("Between")) {

			try {
				base.explicitWait(toCalendarSecondRowIcon);
				base.click(toCalendarSecondRowIcon);
				base.click(firstDate);
			} catch (Exception e) {
				System.out.println("No from Calendar for this operator");
			}	

			try {
				base.click(toCalendarSecondRowIconBetweenFilter);
				base.click(lastDate);
			} catch (Exception e) {
				System.out.println("No To calendar for this operator");

			}
		}
		else
		{
			System.out.println("The operator in else is"+value);

			try {
				base.explicitWait(fromCalendarSecondRowIcon);
				base.click(fromCalendarSecondRowIcon);
				base.click(firstDate);
			} catch (Exception e) {
				System.out.println("No from Calendar for this operator");
			}	

			try {
				base.click(toCalendarSecondRowIcon);
				base.click(lastDate);
			} catch (Exception e) {
				System.out.println("No To calendar for this operator");

			}
		}

	}

	public void selectEyeIcon() {
		base.explicitWait(eyeicon);
		base.highLighterMethod(eyeicon);
		Assert.assertEquals(eyeicon.isDisplayed(), true);
		base.click(eyeicon);
		base.explicitWait(historyTable);

	}
	
	
	public void downloaddatafromTable(String message) {

		base.explicitWait(historyTable);
		for(int i =0;i<historyTableRow.size();i++) {
			if(historyTableRow.get(i).getText().contains(message)){
				base.highLighterMethod(historyTableRow.get(i));
				break;
			}
		}
		
		
		for(int j =0;j<historyTableColumn.size();j++) {
			if(historyTableColumn.get(j).getText().contains(message)) {

				base.highLighterMethod(historyTableColumn.get(j+3));
				WebElement abc=historyTableColumn.get(j+3).findElement(By.tagName("button"));
				Assert.assertEquals(abc.isDisplayed(), true);
				base.click(abc);
				
				break;
			}


		}



	}



}





