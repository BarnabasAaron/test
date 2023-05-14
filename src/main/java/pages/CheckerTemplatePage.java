package pages;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class CheckerTemplatePage extends Drivers {

	static baseClass base = new baseClass();

	public CheckerTemplatePage() {

		PageFactory.initElements(driver, this);
	}
	
	Actions action = new Actions(driver);
	OutwardTransactionDetailReport outward = new OutwardTransactionDetailReport();
	
	@FindBy(xpath = "(//table[@role='table']/tbody/tr)")
	public List<WebElement> tablerow;

	@FindBy(xpath = "(//table[@role='table']/tbody/tr/td)")
	public List<WebElement> tablecolumn;
	
	@FindBy(xpath = "//input[@data-placeholder = 'Remarks']")
	public WebElement RemarksPopup_reject;
	
	@FindBy(xpath = "(//span[.='Reject'])[2]")
	public WebElement RejectPopup_btn;
	
	@FindBy(xpath = "//h3[contains(text(),'Template Configuration Approval List')]")
	public WebElement verify_table;
	
	@FindBy(xpath = "//button[@aria-label= 'Next page']")
	public WebElement next_page;
	
	
	
	public void Reject_RemarksPopup() throws EncryptedDocumentException, IOException {
		List<LinkedHashMap<String, String>> mapDataList = base.getExcelDataAsMap("data","BatchCreditTransfer");
		String options=mapDataList.get(0).get("remarks1");
		
//		String remarks = System.getProperty("Remarks");
		base.explicitWait(RemarksPopup_reject);
		base.highLighterMethod( RemarksPopup_reject);
		base.sendKeys(RemarksPopup_reject, options);
//		Assert.assertEquals(RemarksPopup_reject.getAttribute("value"), options);
		
		base.explicitWait(RejectPopup_btn);
		base.highLighterMethod( RejectPopup_btn);
		base.click(RejectPopup_btn);
	}
	
	public void verify_table() {
		base.explicitWait(verify_table);
		base.highLighterMethod(verify_table);
	}

	public void edittable() throws InterruptedException {
		try {
		for(int i=0;i<tablecolumn.size();i++) {
			System.out.println("tttttttttt"+MakerTemplatePage.uuid);
			if(tablecolumn.get(i).getText().contains(MakerTemplatePage.uuid))
			{
//				base.explicitWait(tablecolumn.get(i));
				base.highLighterMethod(tablecolumn.get(i));
				action.moveToElement(tablecolumn.get(i)).build().perform();
//				base.explicitWait(tablecolumn.get(i+6));
				base.highLighterMethod(tablecolumn.get(i+6));
				action.moveToElement(tablecolumn.get(i+6)).build().perform();
				WebElement abc = tablecolumn.get(i+6).findElement(By.tagName("mat-icon"));
				base.click(abc);
				break;
//				action.moveToElement(tablecolumn.get(i+6))
//				.click(tablecolumn.get(i+6))
//				.build()
//				.perform();
			}	
		}
		}catch(Exception e) {
			base.explicitWait(next_page);
			base.highLighterMethod(next_page);
			base.click(next_page);
			outward.waitforLoader();
			for(int i=0;i<tablecolumn.size();i++) {
				System.out.println("tttttttttt"+MakerTemplatePage.uuid);
				if(tablecolumn.get(i).getText().contains(MakerTemplatePage.uuid))
				{
//					base.explicitWait(tablecolumn.get(i));
					base.highLighterMethod(tablecolumn.get(i));
					action.moveToElement(tablecolumn.get(i)).build().perform();
//					base.explicitWait(tablecolumn.get(i+6));
					base.highLighterMethod(tablecolumn.get(i+6));
					action.moveToElement(tablecolumn.get(i+6)).build().perform();
					WebElement abc = tablecolumn.get(i+6).findElement(By.tagName("mat-icon"));
					base.click(abc);
					break;
//					action.moveToElement(tablecolumn.get(i+6))
//					.click(tablecolumn.get(i+6))
//					.build()
//					.perform();
				}	
			}
			
		}
	}
}
