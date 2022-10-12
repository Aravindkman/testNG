package hotelbookingrunnerclass;

//import hotelbookingtask.Baseutilclass;

import java.io.IOException;
import java.time.Duration;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import hotelbookingbaseclass.Baseutilclass;


public class Runnerclass extends Baseutilclass {
	
	

	
	

	public static WebDriver driver = Baseutilclass.chooseBrowser("chrome");
	
	public static pageobjectmanager manager = new pageobjectmanager(driver);
	
	public static Logger log = Logger.getLogger(Runnerclass.class);
	

	
	@BeforeMethod(groups = {"regression","sanity"},description = "Verify title")
	public void checking_Before_Title() {
		// TODO Auto-generated method stub
		
		System.out.println(driver.getTitle());

	}
	
	@AfterMethod
	public void checking_After_Title() {
		// TODO Auto-generated method stub
		
		System.out.println(driver.getTitle());

	}
	
	
	@Ignore
	@Test
	private void dummy_Method() {
		// TODO Auto-generated method stub
		log.info("dummy mesthod");
	}
	
	@Parameters({"URL"})
	@BeforeTest(groups = {"regression","sanity"},enabled = true,alwaysRun = true)
	public void openingbrowser(@Optional("https://adactinhotelapp.com/")String link) throws IOException  {
		// TODO Auto-generated method stub

		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Test Start");
		
		log.info("opening browser");
	
		
		
		enterUrl(link);

	screenshot("D:\\sel files\\1.png");
		
	}
	

	@AfterTest(groups = {"regression","sanity"},enabled = true)
	public void closingbrowser() {
		// TODO Auto-generated method stub
		

		exitformall();
		
		log.info("Test complete");

	}
	
	
	@Test(priority=1,groups = {"regression"},timeOut = 5000,retryAnalyzer = retryanalyser_demo.class)
	public void loginpage_Details() throws IOException {
		// TODO Auto-generated method stub
		
		
		excelfile("D:\\sel files\\Adactin data.xlsx", 0);
		
		
		 
		
		entertext(manager.getLogin().getUsernameElement(),particularcelldata(1, 0));
		
		entertext(manager.getLogin().getPasswordElement(), particularcelldata(1, 1));
		
		clickbutton(manager.getLogin().getLoginbuttonElement());

		checkingtitle("Search");
		
		screenshot("D:\\sel files\\2.png");

	}
	
	@Test(priority=2,dependsOnMethods ="loginpage_Details",groups = {"regression"} )
	public void searchpage_Details() throws IOException {
		// TODO Auto-generated method stub
		

		selectdropown(manager.getSearch().getLocationElement(), 1);
		
		selectdropown(manager.getSearch().getHotelElement(), 1);

		selectdropown(manager.getSearch().getRoomElement(), 2);
		
		selectdropown(manager.getSearch().getRoomno(),1);
		
		
		entertext(manager.getSearch().getCheckin(), "20/09/22");
	
		entertext(manager.getSearch().getCheckout(), "22/09/22");

			
		selectdropown(manager.getSearch().getPersons(),1);
				
		selectdropown(manager.getSearch().getChildElement(),0);

		

		clickbutton(manager.getSearch().getSearchElement());

		checkingtitle("Select");

		screenshot("D:\\sel files\\3.png");

	}
	
	
	
	
	
	
	@Test(priority=3,dependsOnMethods = {"searchpage_Details"},groups = {"regression"})
	public void selectpage_Details() throws IOException {
		// TODO Auto-generated method stub

		
		clickbutton(manager.getSelect().getChooseElement());
		
		clickbutton(manager.getSelect().getContinueElement());

		checkingtitle("Book");

		screenshot("D:\\sel files\\4.png");
		
		
	}
	
	@Test(priority = 4,dependsOnMethods ="selectpage_Details",groups = {"regression"})
	public void bookingpage_Details() throws IOException {
		// TODO Auto-generated method stub

		
	
		
		entertext(manager.getBook().getFirstnameElement(), "Manick");
		
		entertext(manager.getBook().getSecondElement(),"basha");

		entertext(manager.getBook().getAddressElement(),"998" + Keys.ENTER + "british colony" + Keys.ENTER);
		
		entertext(manager.getBook().getCcElement(),"9875624587456254");
		
		selectdropown(manager.getBook().getCcvElement(),2);
		
		selectdropown(manager.getBook().getMonthElement(),3);	
				
		selectdropown(manager.getBook().getYearElement(), 12);		
		
		entertext(manager.getBook().getCvvElement(),"987");
		
		clickbutton(manager.getBook().getBooknowElement());

				
		log.info("Waiting for the button visibility");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		

		clickbutton(manager.getBook().getWaitElement());
		
		checkingtitle("Select");

		screenshot("D:\\sel files\\5.png");
		
	}
	
	@Test(priority=5,groups = {"regression"})
	public void logoutpage_Details() throws IOException {
		// TODO Auto-generated method stub

		
		

		clickbutton(manager.getLogout().getLogoutbutton());

		checkingtitle("Logout");

		screenshot("D:\\sel files\\6.png");
		
		
		
		
	}
	
	
	
	


}
