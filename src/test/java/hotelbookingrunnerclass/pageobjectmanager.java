package hotelbookingrunnerclass;

import org.openqa.selenium.WebDriver;

import hotelbookingtaskpages.bookpage;
import hotelbookingtaskpages.loginpage;
import hotelbookingtaskpages.logoutpage;
import hotelbookingtaskpages.searchpage;
import hotelbookingtaskpages.selectpage;

public class pageobjectmanager {
	
	public WebDriver driver ;
	
	private loginpage login;
	private searchpage search;
	private selectpage select;
	private bookpage book;
	private logoutpage logout;
	
	
	
	public pageobjectmanager(WebDriver driver0) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver0;
	}
	public loginpage getLogin() {
		
		login = new loginpage(driver);
		
		return login;
	}
	public searchpage getSearch() {
		
		search = new searchpage(driver);
		
		return search;
	}
	public selectpage getSelect() {
		
		select = new selectpage(driver);
		
		return select;
	}
	public bookpage getBook() {
		
		book = new bookpage(driver);
		
		return book;
	}
	public logoutpage getLogout() {
		
		logout = new logoutpage(driver);
		
		return logout;
	}
	

}
