package pages;





import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;



public class makerHomepage extends Drivers {

	static baseClass base = new baseClass();

	public makerHomepage() {

		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath="//h1[contains(.,'Home')]")
	public WebElement Home_page;

	@FindBy(xpath="//mat-label[.='Utility']")
	public WebElement Utility_btn;

	@FindBy(xpath = "//mat-label[contains(text(),'Report')]")
	public WebElement report;
	
	
	@FindBy(xpath = "//body[@class='mat-typography']")
	public WebElement whiteScreen;
	
	@FindBys({@FindBy(xpath = "//div[@id='spinner']")})
	private List<WebElement> bothcriteria;
	
	@FindBy(xpath = "//div[@id='spinner']")
	public WebElement loader;
	
	@FindBy(xpath = "//mat-icon[text()='notifications']")
	public WebElement bellIcon;
	
	@FindBy(xpath="//mat-icon[text()='home ']")
	public WebElement home;
	
	@FindBy(xpath="//mat-icon[text()='dashboard ']")
	public WebElement dashboard;
	
	@FindBy(xpath = "//h4[contains(text(),'Inward Payment Processing')]")
	public WebElement InwardPaymentProcessing_btn;
	
	@FindBy(xpath = "//a[contains(text(),'Realtime Payment Reversal Approval')]")
	public WebElement RealtimePaymentReversalApproval_btn;
	
	@FindBy(xpath = "//button[@aria-label='Example icon-button with a menu']")
	public WebElement changeAccessDropdown;

	@FindBy(xpath = "//span[text()='Admin']")
	public WebElement adminOption;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'arrow_drop_down')]")
	public WebElement arrow_dropdown;
	
	@FindBy(xpath = "//span[contains(text(),'Admin')]")
	public WebElement admin_btn;
	
	@FindBy(xpath = "//mat-label[contains(text(),'Settings')]")
	public WebElement settings_btn;
	
	public void click_settings_btn() throws InterruptedException

	{
		base.explicitWait(settings_btn);
		base.highLighterMethod(settings_btn);
		Assert.assertEquals(settings_btn.getText(), "Settings");
		base.click(settings_btn);
	}
	
	public void click_arrow_btn() throws InterruptedException

	{
		base.explicitWait(arrow_dropdown);
		base.highLighterMethod(arrow_dropdown);
		Assert.assertEquals(arrow_dropdown.getText(), "arrow_drop_down");
		base.click(arrow_dropdown);
	}
	
	public void click_admin_btn() throws InterruptedException

	{
		base.explicitWait(admin_btn);
		base.highLighterMethod(admin_btn);
		Assert.assertEquals(admin_btn.getText(), "Admin");
		base.click(admin_btn);
	}
	
	public void click_utility_btn() throws InterruptedException

	{
		base.explicitWait(Utility_btn);
		base.highLighterMethod(Utility_btn);
		Assert.assertEquals(Utility_btn.isDisplayed(), true);
		base.click(Utility_btn);
	}

	public void verify_homepage_text()  {
		base.explicitWait(Home_page);
		base.highLighterMethod(Home_page);
		boolean actual= Home_page.isDisplayed();
		Assert.assertEquals(actual, true);		
	}


	public void clickReport() throws InterruptedException {

		base.highLighterMethod(report);
		Assert.assertEquals(report.isDisplayed(), true);
		base.click(report);
	}
	
	public void Click_InwardPaymentProcessing_btn() throws InterruptedException {
		base.explicitWait(InwardPaymentProcessing_btn);
		base.highLighterMethod(InwardPaymentProcessing_btn);
		Assert.assertEquals(InwardPaymentProcessing_btn.isDisplayed(), true);
		base.click(InwardPaymentProcessing_btn);
	
	}
	
	public void Click_RealtimePaymentReversalApproval_btn() throws InterruptedException{
		base.explicitWait(RealtimePaymentReversalApproval_btn);
		base.highLighterMethod(RealtimePaymentReversalApproval_btn);
		Assert.assertEquals(RealtimePaymentReversalApproval_btn.isDisplayed(), true);
		base.click(RealtimePaymentReversalApproval_btn);	
	}
	
	
	public void clickOptionToChangeAdmin() {
		
		base.explicitWait(changeAccessDropdown);
		base.highLighterMethod(changeAccessDropdown);
		base.click(changeAccessDropdown);
		
		base.explicitWait(adminOption);
		base.highLighterMethod(adminOption);
		base.click(adminOption);
		
	}
	





}


