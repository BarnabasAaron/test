package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class MakerAdminUserConfiguration extends Drivers {

	static baseClass base = new baseClass();

	public MakerAdminUserConfiguration() {


		PageFactory.initElements(driver, this);

	}


	@FindBy(xpath = "//div[text()=' Roles ']")
	public WebElement rolesMenu;

	@FindBy(xpath = "//div[text()=' Departments ']")
	public WebElement departmentMenu;

	@FindBy(tagName = "table")
	public WebElement table;

	@FindBy(xpath = "//table//tr")
	public List<WebElement> tableRow;

	@FindBy(xpath = "//table//tr//td")
	public List<WebElement> tableData;

	@FindBy(xpath = "//mat-slide-toggle[@formcontrolname='isSelected']")
	public List<WebElement> toggle;
	
	
	public void clickRolesMenu() {

		base.click(rolesMenu);
	}


	public void clickDepartmentMenu() {

		base.click(departmentMenu);

	}

	public void selectToggleForRoles(String name) {

		base.explicitWait(table);
		for(int i =0;i<tableRow.size();i++) {
			if(tableRow.get(i).getText().contains(name)){
				base.mouseHover(tableRow.get(i));
				base.highLighterMethod(tableRow.get(i));
				break;
			}
		}
		for(int j =1;j<tableData.size();j++) {
			if(tableData.get(j).getText().contains(name)) {

				base.highLighterMethod(tableData.get(j+2));
				for(int k=j-1;k<j;k++) {
					
					base.click(tableData.get(j+2));
				}
				
				break;

			}

		}
	}
	
	public void selectToggleForDepartments(String name) {

		base.explicitWait(table);
		for(int i =0;i<tableRow.size();i++) {
			if(tableRow.get(i).getText().contains(name)){
				base.highLighterMethod(tableRow.get(i));
				base.highLighterMethod(toggle.get(i));
				base.click(toggle.get(i));
				break;
			}
		}

	}
}
