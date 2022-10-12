package hotelbookingtaskpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookpage {
	
	
	
	public WebDriver driver;
	
	
	public bookpage(WebDriver driver4) {
		// TODO Auto-generated constructor stub
	
	
		this.driver = driver4;
		
		PageFactory.initElements(driver, this);
	
	
	}
	
	@FindBy(xpath="//input[@id='first_name']")
	
	private WebElement firstnameElement;
	
	@FindBy(xpath="//input[@id='last_name']")
	
	private WebElement secondElement;
	
	@FindBy(xpath="//textarea[@id='address']")
	
	private WebElement addressElement;
	
	@FindBy(xpath="//input[@id='cc_num']")
	
	private WebElement ccElement;
	
	@FindBy(xpath="//select[@id='cc_type']")
	
	private WebElement ccvElement;
	
	@FindBy(xpath="//select[@id='cc_exp_month']")
	
	private WebElement monthElement;
	
	@FindBy(xpath="//select[@id='cc_exp_year']")
	
	private WebElement yearElement;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	
	private WebElement cvvElement;
	
	@FindBy(xpath="//input[@id='book_now']")
	
	private WebElement booknowElement;
	
	@FindBy(xpath="//input[@id='my_itinerary']")
	
	private WebElement waitElement;


	

	public WebElement getFirstnameElement() {
		return firstnameElement;
	}

	public WebElement getSecondElement() {
		return secondElement;
	}

	public WebElement getAddressElement() {
		return addressElement;
	}

	public WebElement getCcElement() {
		return ccElement;
	}

	public WebElement getCcvElement() {
		return ccvElement;
	}

	public WebElement getMonthElement() {
		return monthElement;
	}

	public WebElement getYearElement() {
		return yearElement;
	}

	public WebElement getCvvElement() {
		return cvvElement;
	}

	public WebElement getBooknowElement() {
		return booknowElement;
	}

	public WebElement getWaitElement() {
		return waitElement;
	}
	
	
	
	

}
