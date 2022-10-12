 package hotelbookingbaseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;


import org.apache.poi.ss.usermodel.CellType;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Baseutilclass {

	
	public static Logger log = Logger.getLogger(Baseutilclass.class);
	
	
	public static WebDriver driver;

	public static XSSFSheet sheet;
	
	public static XSSFWorkbook workbk ;

	public static WebDriver chooseBrowser(String drivername) {
		// TODO Auto-generated method stub
		
	

		if (drivername.equalsIgnoreCase("chrome"))

		{
			
			WebDriverManager.chromedriver().setup();
			
			
			
			driver = new ChromeDriver();

			log.info("opening browser successful");

			
		}

		else if (drivername.equalsIgnoreCase("firefox"))

		{
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			

			
		}

		else if (drivername.equalsIgnoreCase("edge"))

		{
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();

			

			
		}
		
		return driver;
		
	

		// driver.manage().window().maximize();

	}

	public static String enterUrl(String url) {
		// TODO Auto-generated method stub

		driver.get(url);

		return url;
	}

	public static void entertext(WebElement element, String name) {

		element.sendKeys(name);

	}

	public static void clickbutton(WebElement element) {
		// TODO Auto-generated method stub

		element.click();

	}

	public static void selectdropown(WebElement element, int index) {
		// TODO Auto-generated method stub

		Select select = new Select(element);

		select.selectByIndex(index);

	}

	public static void selectdropownbyvalue(WebElement element, String value) {
		// TODO Auto-generated method stub

		Select select = new Select(element);

		select.selectByValue(value);

	}

	public static void selectdropownbyvisibletext(WebElement element, String index) {
		// TODO Auto-generated method stub

		Select select = new Select(element);

		select.selectByVisibleText(index);

	}

	public static void maximizewindow() {
		// TODO Auto-generated method stub

		driver.manage().window().maximize();

	}

	public static void screenshot(String location) throws IOException {
		// TODO Auto-generated method stub

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		File destination = new File(location);

		FileHandler.copy(source, destination);

	}

	public static void exitformall() {
		// TODO Auto-generated method stub

		driver.quit();

		log.info("closing browser");

	}
	
	

	public static void checkingtitle(String name) {
		// TODO Auto-generated method stub

		String title = driver.getTitle();
		
	

		if (title.contains(name)) 
		{
			
			log.info(name+ " sucess");
		
		} else

		{
			log.error(name+ " Not sucess");
		}
		
	}
	
	public static void excelfile(String name,int index) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream(name);
		
		workbk = new XSSFWorkbook(file);
		
		
		sheet = workbk.getSheetAt(index);
		
		}
	
	
	public static String particularcelldata(int rownum,int colnum) throws IOException {
		// TODO Auto-generated method stub
		

		
		XSSFCell cell = sheet.getRow(rownum).getCell(colnum);
		
		CellType type = cell.getCellType();
		
		String stringCellValue="";
		
		if(type.equals(CellType.STRING))
		{
			stringCellValue = cell.getStringCellValue();
		}
			
		else
		{
			double numericCellValue = cell.getNumericCellValue();
			
			int c =(int)numericCellValue;
			
			stringCellValue = String.valueOf(c);
			
			
		}
		return stringCellValue;

	}
	
	
	
		
	
}
