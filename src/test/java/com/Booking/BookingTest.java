package com.Booking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class BookingTest extends TestBase {

    BookingTest(){
        super();
    }


    @BeforeMethod
    public void setup(){
        initializeBrowser(prop.getProperty("browser1"));
    }

    @Test
    public void launchBooking(){
        driver.get(prop.getProperty("bookingUrl"));
        WebElement element = driver.findElement(By.xpath("//*[@class='hero-banner-wrapper']//div[contains(text(),'Find your next stay')]"));
        String subHeading = element.getText();
        Assert.assertEquals(subHeading,"Find your next stay");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        
        driver.close();
        driver.quit();
    }
}
