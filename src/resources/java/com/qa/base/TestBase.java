package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	public TestBase() {
				
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Users\\rkumar6\\Workspace\\CICD\\src\\resources\\java\\com\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	
	}
		
	 
	 public static void initialization() {
		 
	 
		 if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {			 
		    System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
			driver = new ChromeDriver();		
		 }
		 
		 
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();			
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		 
	 }

}
