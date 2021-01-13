package cheapAir;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchApp {
	
		
		@Test
		public void launchUrl() throws InterruptedException {

			
//  		System.setProperty("webdriver.chrome.driver", "D:\\Users\\rkumar4\\Workspace\\CICD_selenium\\resources\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();			
			driver.get("https://www.cheapair.com/");			
			driver.manage().window().maximize();			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(5000);
			
			driver.close();
			driver.quit();
//			Jenkins job trigger test
			
		}

	
}
