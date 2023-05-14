package baseClass;
//Version 1.1
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driver.Drivers;


public class baseClass extends Drivers implements BaseInterface  {

	Select options;
	static Actions action = null;


	public void openURL(String url) {

		driver.get(url);
		System.out.println();

	}

	public void close() {
		driver.close();

	}

	public void quit() {

		driver.quit();
	}

	public void enterKey(WebElement ele) {
		
		ele.sendKeys(Keys.ENTER);
	}

	public void switchToWindow() {

		String currentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> i = allWindows.iterator();
		while(i.hasNext()){
			String childwindow = i.next();
			if(!childwindow.equalsIgnoreCase(currentWindow)){
				driver.switchTo().window(childwindow);
				System.out.println("The child window is "+childwindow);
			} else {
				System.out.println("There are no children");
			}
		}

	}

	public void selectDropdownUsingValue(WebElement element, String value) {

		options = new Select(element);
		options.selectByValue(value);



	}

	public void selectDropdownUsingText(WebElement element, String text) {

		options = new Select(element);
		options.selectByVisibleText(text);
	}

	public void selectDropdownUsingIndex(WebElement element, int index) {

		options = new Select(element);
		options.selectByIndex(index);
	}

	public void click(WebElement element) {

		if (isDisplayed(element)) {

			try {
				element.click();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}


	}

	public void sendKeys(WebElement element, String strValue) {
		if (isDisplayed(element)) {
			try {
				element.click();
				element.clear();
				element.sendKeys(strValue);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	

	public String getTitle() {

		String title=driver.getTitle();
		return title;
	}

	public String getURL() {

		String url =driver.getCurrentUrl();
		return url;
	}

	public boolean isEnabled(WebElement element) {

		boolean value=element.isEnabled();
		return value;
	}

	public  boolean isDisplayed(WebElement element) {
		boolean blnValue = false;
		try {
			if (element.isDisplayed()) {
				blnValue = true;
			}
		}

		catch (NoSuchElementException e) {
			blnValue = false;
		}
		return blnValue;
	}

	public boolean isSelected(WebElement element) {

		boolean value=element.isSelected();
		return value;
	}

	public void clear(WebElement element) {
		element.click();

	}

	public List<String> getAllText(List<WebElement> element) {

		List<String> strList = new ArrayList<String>();
		for (int i = 0; i < element.size(); i++) {
			strList.add(element.get(i).getText());
		}
		return strList;
	}

	public void assertElements(String Expected,String Actual) {

		Assert.assertEquals(Expected, Actual);

	}

	public static String loadProperties(String value) throws FileNotFoundException, IOException {

		String data = null;		
		//			Properties property = new Properties();
		//			property.load(new FileInputStream("C:\\Users\\Daranabas\\eclipse-workspace\\framework\\src\\test\\resources\\data.properties"));
		//			data = property.getProperty(value);
		Properties property = new Properties();
		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\test\\resources\\data.properties";
		property.load(new FileInputStream(otherFolder));
		data = property.getProperty(value);

		return data;
	}


	//			public void uploadFile(WebElement element,String path) {
	//				
	//				element.sendKeys(path);
	//				
	//			}

	public void downloadFileStatus(String downloadedLocation,String filename) throws InterruptedException {
		Thread.sleep(30000);
		File fileLocation = new File(downloadedLocation);
		File [] totalFiles=fileLocation.listFiles();
		System.out.println("The list aee"+fileLocation.listFiles());
		for(File file: totalFiles) {

			if(file.getName().equals(filename)) {

				System.out.println("The file is downloaded");
				break;
			}
			else
			{
				System.out.println("The file is not downloaded");
			}
		}
	}


	public void switchFrame(int index) {

		driver.switchTo().frame(index);

	}

	public void switchtodefaultFrame() {

		driver.switchTo().defaultContent();
	}



	public void highLighterMethod( WebElement element) {


		try {
			if (isDisplayed(element)) {
				JavascriptExecutor js = (JavascriptExecutor) driver ;
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid yellow;');", element);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void highLighterForListOfElements(List<WebElement> element)
			throws InterruptedException {
		if (element.size() > 0) {
			for (WebElement element1 : element) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'border: solid yellow;');", element1);
				Thread.sleep(500);
			}
		}
	}

	public void clickWait(WebElement wb) {
		//This wait is used for waiting until the element is been removed from the dom
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.stalenessOf(wb));


	}

	public void explicitWait(WebElement element)  {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOf(element));

		} catch (Exception e) {
		}
	}


	public void dismissloader(List<WebElement> element, WebElement element1) {

		
		int i = 1;
		if(element1.isDisplayed()==true) {
			while (element.size()>=i) {

				//This loop will end when the size becomes as 0 so then the loader will be 0
			}	

		}


	}

	public static void takeSnapShot() throws Exception{

		//Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot =((TakesScreenshot)driver);

		//Call getScreenshotAs method to create image file

		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

		//Move image file to new destination

		File DestFile=new File(loadProperties("downloadPath"));

		//Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

		System.out.println("File save aichu");

	}

	public static void waitUntilFileToDownload(String folderLocation) throws InterruptedException {
		File directory = new File(folderLocation);
		boolean downloadinFilePresence = false;
		File[] filesList =null;
		LOOP:   
			while(true) {
				filesList =  directory.listFiles();
				for (File file : filesList) {
					downloadinFilePresence = file.getName().contains(".crdownload");
				}
				if(downloadinFilePresence) {
					for(;downloadinFilePresence;) {
						Thread.sleep(5000);
						continue LOOP;
					}
				}else {
					break;
				}
			}
	}

	public void verifyFileDownloaded(String nameOfDocumentWithFormat) throws InterruptedException {

		Thread.sleep(5000);
		File fileLocation = new File("C:\\Users\\DB-L-172\\Downloads"); 
		File[] totalFile=fileLocation.listFiles();

		for (File file : totalFile) {

			if(file.getName().contains(nameOfDocumentWithFormat)) {

				System.out.println("The file has been downloaded in the specific path");
				break;

			}


		}


	}

	public void mouseHover(WebElement element) {
		action = new Actions(driver);
		action.moveToElement(element).build().perform();	
	}

	public void implicitWait() {

		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);

	}

	public List<LinkedHashMap<String, String>> getExcelDataAsMap(String excelFileName, String sheetName) throws EncryptedDocumentException, IOException {
		// Create a Workbook

		String path = System.getProperty("user.dir");
		String otherFolder = path + "\\src\\main\\resources\\excels\\sample009.xlsx";
		Workbook wb = WorkbookFactory.create(new File(path+"\\src\\main\\resources\\excels\\"+excelFileName+".xlsx"));
		// Get sheet with the given name "Sheet1"
		Sheet s = wb.getSheet(sheetName);
		// Initialized an empty List which retain order
		List<LinkedHashMap<String, String>> dataList = new ArrayList<>();
		// Get data set count which will be equal to cell counts of any row
		int countOfDataSet = s.getRow(0).getPhysicalNumberOfCells();
		// Skipping first column as it is field names
		for (int i = 1; i < countOfDataSet; i++) {
			// Creating a map to store each data set individually
			LinkedHashMap<String, String> data  = new LinkedHashMap<>();
			// Get the row i.e field names count
			int rowCount = s.getPhysicalNumberOfRows();
			// Now we need to iterate all rows but cell should increases once all row is done
			// i.e. (1,1),(2,1),(3,1),(4,1),(5,1) - First iteration
			//      (1,2),(2,2),(3,2),(4,2),(5,2) - Second iteration
			//      (1,3),(2,3),(3,3),(4,3),(5,3) - Third iteration
			for(int j = 1; j<rowCount ; j++) {
				Row r = s.getRow(j);
				// Field name is constant as 0th index
				DataFormatter dtb = new DataFormatter();
				String fieldName=dtb.formatCellValue(r.getCell(0));
				String fieldValue =dtb.formatCellValue(r.getCell(1));
				//String fieldName = r.getCell(0).getStringCellValue();
				//String fieldValue = r.getCell(i).getStringCellValue();
				// Add data in map
				data.put(fieldName, fieldValue);

			}
			// Add map to list after each iteration
			dataList.add(data);
			wb.close();

		}
		return dataList;
		
	}

	public void highLighterMethod(List<WebElement> element) {
		// TODO Auto-generated method stub
		try {
			{
				JavascriptExecutor js = (JavascriptExecutor) driver ;
				js.executeScript("arguments[0].setAttribute('style', 'border: 2px solid yellow;');", element);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void scrollToElement(WebElement ele) {
		
		ele.sendKeys(Keys.ARROW_DOWN);
	}
}





