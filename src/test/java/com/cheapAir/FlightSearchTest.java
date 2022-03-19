package com.cheapAir;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cheapAir.FlightSearchPage;
import com.qa.base.TestBase;

public class FlightSearchTest extends TestBase {

	FlightSearchPage flightSearch;
	
	public FlightSearchTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		initializeBrowser(prop.getProperty("browser1"));
		driver.get(prop.getProperty("cheapAirUrl"));
		flightSearch = new FlightSearchPage();
	}
	
	
	@Test
	public void searchFlight() {
		
		flightSearch.enterSource("Del");
	}
	
	
	@AfterMethod
	public void tearDown() throws InterruptedException {
		
		driver.close();
		driver.quit();
	}
	
}
