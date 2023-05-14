package pages;

import java.util.List;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class RealTimeInwardPaymentReturnPage extends Drivers {
	
	static baseClass base = new baseClass();
	 login loginn = new login();

	public RealTimeInwardPaymentReturnPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//mat-icon[contains(text(),'visibility')]")
	public WebElement search_btn;
	
	@FindBy(xpath = "(//mat-icon[.='edit '])[1]")
	public WebElement Editicon;
	
	@FindBy(xpath = "//mat-select[@role='combobox']")
	public WebElement reasonelemnt;
	
	@FindBy(xpath = "//mat-option[@role='option']")
	public List<WebElement> reason_dropdown;
	
	@FindBy(xpath = "//div[contains(text(),'Return Transaction Details')]/following::textarea")
	public WebElement remarks;
	
	@FindBy(xpath = "//span[contains(text(),'Confirm Return Initiation')]")
	public WebElement confirm_btn;
	
	@FindBy(xpath = "//span[contains(text(),'Yes')]")
	public WebElement yes_btn;
	
	@FindBy(xpath = "//span[@id='debtorAccNumber']")
	public WebElement assert_table;
	
	@FindBy(xpath="//div[.='Return Payment Initiated Successfully!']")
	public WebElement success_toast;
	
	@FindBy(xpath = "//mat-error[contains(text(),' Return Reason is required ')]")
	public WebElement reason_error;
	
	@FindBy(xpath="//mat-label[contains(text(),'Report')]")
	public WebElement report_btn;
	
	@FindBy(xpath="//mat-label[contains(text(),'Home')]")
	public WebElement home_btn;
	
	@FindBy(xpath="(//button[@aria-label='Open calendar'])[1]")
	public WebElement calendar_icon;
	
	@FindBy(xpath = "//div[.=' 1 ']")
	public WebElement calendar_date;
	
	@FindBy(xpath = "//h1[contains(text(),'Realtime Payment Reversal')]")
	public WebElement verify_page;
	
	public void click_calendar_1stdate() {
		base.highLighterMethod(calendar_date);
		base.explicitWait(calendar_date);
		base.click(calendar_date);
	}
	
	public void click_calendar_iconbtn() {
		
		base.highLighterMethod(calendar_icon);
		base.explicitWait(calendar_icon);
		base.click(calendar_icon);
	}
	
	public void click_report_btn() {
		base.highLighterMethod(report_btn);
		base.explicitWait(report_btn);
		base.click(report_btn);
	}
	
	public void click_home_btn() {
		base.highLighterMethod(home_btn);
		base.explicitWait(home_btn);
		base.click(home_btn);
	}
	
	public void view_error() {
		base.highLighterMethod(reason_error);
		base.explicitWait(reason_error);
		boolean actual= reason_error.isDisplayed();
		Assert.assertEquals(actual, true);
	}
	
	public void view_toast() {
		base.highLighterMethod(success_toast);
		base.explicitWait(success_toast);
		boolean actual= success_toast.isDisplayed();
		Assert.assertEquals(actual, true);
	}
	
	public void click_search_btn() {
		base.highLighterMethod(search_btn);
		base.explicitWait(search_btn);
		base.click(search_btn);
	}
	
	public void click_edit_btn() {
		
		try {
			base.explicitWait(Editicon);
			base.highLighterMethod(Editicon);
			base.click(Editicon);
			
		} catch (StaleElementReferenceException e) {
			
			base.highLighterMethod(Editicon);
			base.explicitWait(Editicon);
			base.click(Editicon);
			
		}
	}
	
	public void click_confirm_btn() {
		base.highLighterMethod(confirm_btn);
		base.explicitWait(confirm_btn);
		base.click(confirm_btn);
	}
	
	public void click_yes_btn() {
		base.highLighterMethod(yes_btn);
		base.explicitWait(yes_btn);
		base.click(yes_btn);
	}
	
	public void verify_page() {
		base.explicitWait(verify_page);
		base.highLighterMethod(verify_page);	
	}
	
	public void send_remarks() {
		base.highLighterMethod(remarks);
		base.explicitWait(remarks);
		base.sendKeys(remarks, "remarks");
	}
	
	public void select_reason() throws InterruptedException {
		
		base.scrollToElement(reasonelemnt);
		base.highLighterMethod(reasonelemnt);
		base.click(reasonelemnt);
		base.highLighterMethod(reason_dropdown.get(1));
		base.explicitWait(reason_dropdown.get(1));
		base.click(reason_dropdown.get(1));
	}
	
	public void Assert_Table() {
		try {
		base.highLighterMethod(assert_table);
		base.explicitWait(assert_table);
		Assert.assertEquals(assert_table, assert_table);
		} catch (Exception e){
			System.out.println("No Records Found");
		}
	}
	
}
