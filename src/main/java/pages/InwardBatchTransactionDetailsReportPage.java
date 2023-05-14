package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class InwardBatchTransactionDetailsReportPage extends Drivers{
	
	 static baseClass base = new baseClass();
	 login loginn = new login();

	public InwardBatchTransactionDetailsReportPage() {
		
		PageFactory.initElements(driver, this);
		

	}
	
	@FindBy(xpath="(//mat-icon[.='remove_red_eye '])[1]")
	public WebElement view_icon;
	
	
	@FindBy(xpath="//th[@role='columnheader']")
	public List<WebElement> Column_names;
	
	@FindBy(xpath="(//mat-icon[.=\"arrow_drop_down_circle \"])[1]")
	public WebElement download_btn;
	
	
	public void click_viewicon_btn() throws InterruptedException
	{
		base.explicitWait(view_icon);
		base.highLighterMethod(view_icon);	
		Assert.assertEquals(view_icon.isDisplayed(), true);
		base.click(view_icon);
	}
	
	public void Verify_column_names() throws InterruptedException
	{
		for(int i =0;i<Column_names.size();i++)
		{
			base.highLighterMethod(Column_names.get(i));
			}
		for(WebElement Element:Column_names)
		{
			Element.isDisplayed();}
		}
    
    
	
	public void click_download_btn() throws InterruptedException
	{
		base.explicitWait(download_btn);
		base.highLighterMethod(download_btn);	
		Assert.assertEquals(download_btn.isDisplayed(), true);
		base.click(download_btn);
	}
}
