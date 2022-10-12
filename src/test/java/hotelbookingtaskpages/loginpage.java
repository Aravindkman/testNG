package hotelbookingtaskpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {

	public WebDriver driver;
	
	public loginpage(WebDriver driver1) {
		// TODO Auto-generated constructor stub

		this.driver = driver1;

		PageFactory.initElements(driver, this);

	}

	

	@FindBy(xpath = "//input[@name='username']")

	private WebElement usernameElement;

	@FindBy(xpath = "//input[@id='password']")

	private WebElement passwordElement;

	@FindBy(xpath = "//input[@id='login']")

	private WebElement loginbuttonElement;
	
	
	
	
	
	
	
	public WebElement getUsernameElement() {
		return usernameElement;

	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public WebElement getLoginbuttonElement() {
		return loginbuttonElement;
	}
	
	

	

}
