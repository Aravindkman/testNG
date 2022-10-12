package hotelbookingtaskpages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selectpage {
	
	
	
	public WebDriver driver;
	
	public selectpage(WebDriver driver3) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver3;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
			
	private	WebElement chooseElement;
	

	@FindBy(xpath="//input[@id='continue']")
			
	private	WebElement continueElement;

	
	public WebElement getChooseElement() {
		return chooseElement;
	}


	public WebElement getContinueElement() {
		return continueElement;
	}
	
		

}
