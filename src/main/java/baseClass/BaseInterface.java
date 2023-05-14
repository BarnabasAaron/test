package baseClass;

import java.util.List;

import org.openqa.selenium.WebElement;

public interface BaseInterface {


	

	/**
	 * In this function url is accepted as String to open the url 
	 * 
	 * 
	 * @param url - The url should be passed
	 */
	public void openURL(String url);
	/**
	 * 
	 * This function closes the browser
	 */
	public void close();
	/**
	 * 
	 * This function quits the browser
	 */
	public void quit();



	/**
	 * This function is used for switching the windows
	 */
	void switchToWindow();


	/**
	 * This function is used to select values from drop down by using value
	 * @param element - The Webelement of drop down
	 * @param value - The value of drop down
	 */
	void selectDropdownUsingValue(WebElement element,String value);
	/**
	 * This function is used to select values from drop down by using value
	 * @param element - The Webelement of drop down
	 * @param text - The text of drop down	
	 */
	void selectDropdownUsingText(WebElement element,String text);
	/**
	 * This function is used to select values from drop down by using index
	 * @param element - The webElement of drop down
	 * @param index - The index of the value
	 */
	void selectDropdownUsingIndex(WebElement element,int index);

	/**
	 * This function is used to click a particular element
	 * @param element - Webelement of the element that needs to be clicked
	 */
	void click(WebElement element);
	/**
	 * This function is used to send data as text works as sendkeys
	 * @param element - Webelement of the element that needs to send text
	 * @param value - The text that needs to be send
	 */
	void sendKeys(WebElement element, String value);
	/**
	 * This function is required to get title of the page
	 * @return
	 */
	String getTitle();
	/**
	 * This function is required to get URL of the current page
	 * @return
	 */
	String getURL();
	/**
	 * This function is used to check whether the element is enabled
	 * @param element - The webelement that needs to be checked
	 * @return true if web element is present
	 */
	boolean isEnabled(WebElement element);
	/**
	 * This function is used to check whether the element is displayed
	 * @param element - The web element that needs to be checked
	 * @return true if web element is present
	 */
	boolean isDisplayed(WebElement element);
	/**
	 * This function is used to check whether the element is selected
	 * @param element - The web element that needs to be checked
	 * @return true if web element is present
	 */
	boolean isSelected(WebElement element);
	/**
	 * This function is used to clear the elements present
	 * @param element - The webelement that needs to be clear
	 */
	void clear(WebElement element);
	/**
	 * This function is used for getting list of elements
	 * @param element
	 * @return
	 */
	List<String> getAllText(List<WebElement> element);



}


