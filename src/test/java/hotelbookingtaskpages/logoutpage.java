package hotelbookingtaskpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutpage {
	
	public WebDriver driver;
	
	public logoutpage(WebDriver driver5) {
		// TODO Auto-generated constructor stub
		
		this.driver=driver5;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='logout']")
	
	private WebElement logoutbutton;

	public WebElement getLogoutbutton() {
		return logoutbutton;
	}

	
	
	


}
