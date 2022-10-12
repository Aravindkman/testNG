package hotelbookingrunnerclass;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;



public class retryanalyser_demo implements IRetryAnalyzer {
	
	
	
	
	int start = 1;
	
	int finish = 3;
	
	

	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(start<finish)
		{
			
			
			start++;
			return true;
		}
		return false;
	}
	
	
	
	

}
