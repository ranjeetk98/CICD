package com.Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.StaySearch;
import com.qa.base.TestBase;

public class BookingTest extends TestBase {
	
	StaySearch staySearch;

    BookingTest(){
        super();
    }


    @BeforeMethod
    public void setup(){
        initializeBrowser(prop.getProperty("browser1"));
        driver.get(prop.getProperty("bookingUrl"));
        staySearch = new StaySearch();
    }

   @Test
    public void launchBooking(){
        
        staySearch.navigateToStays();
        String subHeading = staySearch.getStayHeader();     
        Assert.assertEquals(subHeading,"Find your next stay");
    }
    
    @Test
    public void searchStay() throws InterruptedException {  	
    	StaySearch.searchStay();
    	Assert.assertEquals(staySearch.getTopPicks(), "Top picks for long stays");   
    	
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        
        driver.close();
        driver.quit();
    }
}
