//Author:Barnabas

package pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;



public class RealTimeCreditTransferApprovalFirstScreen extends Drivers {

	public RealTimeCreditTransferApprovalFirstScreen() {
		
		PageFactory.initElements(driver, this);

	}
	
	RealTimeCreditTransferInitiationPage obj = new RealTimeCreditTransferInitiationPage();
	baseClass base = new baseClass();
	
	
	@FindBy(xpath = "//table[@role='table']")
	public WebElement table;
	
	@FindBy(xpath = "//table[@role='table']/tbody/tr")
	public List<WebElement> tableRow;
	
	@FindBy(xpath = "//table[@role='table']/tbody/tr/td")
	public List<WebElement> tableData;
	
	List<String> makerData = new ArrayList<String>(8);
	
	
	public void verifyDebtorACC() {
		
		Assert.assertEquals(tableData.get(1).getText(), obj.DebtorAccountNumber+" ");
	}
	
	
	public void verifyCreditorACC() {
		
		Assert.assertEquals(tableData.get(2).getText(), obj.CreditorAccountNumber+" ");
		
	}
	
	public void verifyDebtorName() {
		
		Assert.assertEquals(tableData.get(3).getText(), obj.DebtorName+" ");

	}
	
	public void verifyCreditorName() {
		
		Assert.assertEquals(tableData.get(4).getText(), obj.CreditorName+" ");

	}
	
	public void verifyTransactionAmount() {
		
		Assert.assertEquals(tableData.get(5).getText(), obj.SettledAmount);

	}
	
	public void verifyTransactionType() {
		
		Assert.assertEquals(tableData.get(7).getText(), obj.TransactionType+" ");

	}
	
	public void verifyChargeType() {
		
		Assert.assertEquals(tableData.get(8).getText(), obj.ChargeType+" ");

	}
	
	public void selectEyeIcon() {
		
		base.click(tableData.get(9));
	}
	
	
	
	
	public void add() {
		
		makerData.add(1, obj.DebtorAccountNumber);
		makerData.add(2, obj.CreditorAccountNumber);
		makerData.add(3, obj.DebtorName);
		makerData.add(4, obj.CreditorName);
		makerData.add(5, obj.TotalAmount);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
        Date date = new Date();  
        makerData.add(6, formatter.format(date));
        makerData.add(7, obj.TransactionType);
        makerData.add(8, obj.ChargeType);
		
	}
	
	public void verifyData(String data) {
		
		base.explicitWait(table);
		for(int i =0;i<tableRow.size();i++) {
			if(tableRow.get(i).getText().contains(data)){
				base.highLighterMethod(tableRow.get(i));
				break;
			}
		}
		
		
		for(int j =1;j<tableData.size();j++) {
			if(tableData.get(j).getText().contains(data)) {

				base.highLighterMethod(tableData.get(j));
				System.out.println(makerData.size()+"The maker size is");
				System.out.println(makerData.get(j)+"The maker size is");

				System.out.println(tableData.size()+"The maker size is");
				Assert.assertEquals(tableData.get(j).getText(), makerData.get(j));
				
			}
			
			if(j>8) {
				break;
			}


		}



	}

		
		
	}
	
	
	

