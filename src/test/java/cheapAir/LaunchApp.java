package cheapAir;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class LaunchApp {
	
		
		@Test
		public void launchUrl() throws InterruptedException, MalformedURLException {


			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName(BrowserType.CHROME);	
			
			WebDriver driver = new RemoteWebDriver(new URL("http://3.129.13.97:4545/wd/hub"),cap);			
			
			driver.get("https://www.cheapair.com/");			
			driver.manage().window().maximize();			
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
			Thread.sleep(5000);
			
			driver.close();
			driver.quit();
			
		}

	
}
