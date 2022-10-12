package hotelbookingtaskpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage {

	public WebDriver driver;

	public searchpage(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")

	private WebElement locationElement;

	@FindBy(xpath = "//select[@id='hotels']")

	private WebElement hotelElement;
	
	@FindBy(xpath = "//select[@id='room_type']")

	private WebElement roomElement;

	@FindBy(xpath = "//select[@id='room_nos']")

	private WebElement roomno;

	@FindBy(xpath = "//input[@id='datepick_in']")

	private WebElement checkin;

	@FindBy(xpath = "//input[@id='datepick_out']")

	private WebElement checkout;

	@FindBy(xpath = "//select[@id='adult_room']")

	private WebElement persons;

	@FindBy(xpath = "//select[@id='child_room']")

	private WebElement childElement;

	@FindBy(xpath = "//input[@id='Submit']")

	private WebElement searchElement;


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocationElement() {
		return locationElement;
	}

	public WebElement getHotelElement() {
		return hotelElement;
	}

	public WebElement getRoomElement() {
		return roomElement;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public WebElement getPersons() {
		return persons;
	}

	public WebElement getChildElement() {
		return childElement;
	}

	public WebElement getSearchElement() {
		return searchElement;
	}

	
}
