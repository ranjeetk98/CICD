package analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int limit =1;
	int counter =0;
	
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(counter<limit) {
			counter++;
			return true;
		}
		
		return false;
	}

}
