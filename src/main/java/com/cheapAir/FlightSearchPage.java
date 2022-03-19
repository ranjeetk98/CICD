package com.cheapAir;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class FlightSearchPage extends TestBase{

	
	@FindBy(xpath="//*[@id=\"from1\"]") 
	WebElement source;
	
	
	 public FlightSearchPage() {
		  PageFactory.initElements(driver, this);		
	}
	 
	 public void enterSource(String src) {
		 source.clear();
		 source.sendKeys(src);
	 }
}
