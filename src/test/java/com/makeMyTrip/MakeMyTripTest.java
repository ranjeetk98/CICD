package com.makeMyTrip;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;

public class MakeMyTripTest extends TestBase {

    @BeforeMethod
    public void setup(){
        initializeBrowser(prop.getProperty("browser2"));
    }

    @Test
    public void launchMakeMyTrip(){
        driver.get(prop.getProperty("makeMyTripUrl"));
        String actual = driver.findElement(By.xpath("//img[contains(@alt,'Make My Trip')]")).getAttribute("alt");
        Assert.assertEquals(actual,"Make My Trip");

    }




    @AfterMethod
    public void tearDown() throws InterruptedException {

    	
		driver.close();
		driver.quit();
    }
}

