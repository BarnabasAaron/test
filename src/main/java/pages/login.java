package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseClass.baseClass;
import driver.Drivers;

public class login extends Drivers {
	static baseClass base = new baseClass();


	public login() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(id ="username")
	public WebElement username;

	@FindBy(id = "password")
	public WebElement login_password; 

	@FindBy(id = "kc-login")
	public  WebElement btn_signin;

	@FindBy(xpath="//span[@id='input-error']")
	public  WebElement error_msg;



	public void username_field(String Username) {
		base.highLighterMethod(username);
		Assert.assertEquals(base.isDisplayed(username), true);
		base.sendKeys( username, Username);
		Assert.assertEquals(username.getAttribute("value"), Username);
	}

	public void password_field(String password) {
		
		base.highLighterMethod(login_password);
		Assert.assertEquals(base.isDisplayed(login_password), true);
		base.sendKeys(login_password, password);
		Assert.assertEquals(login_password.getAttribute("value"), password);
	}

	public void signin_button() {
		base.highLighterMethod(btn_signin);
		Assert.assertEquals(base.isDisplayed(btn_signin), true);
		base.click(btn_signin);
	}

	public boolean errorMessage() {

		boolean displayed=base.isDisplayed(error_msg);
		Assert.assertEquals(displayed, true);
		return displayed;
	}


}
