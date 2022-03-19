package com.booking;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.testng.Assert;

import com.qa.base.TestBase;

public class StaySearch extends TestBase{
	
	public StaySearch() {
		PageFactory.initElements(new AjaxElementLocatorFactory(driver,5), this);
	}

	
	@FindBy(xpath = "//*[@id=\"b2indexPage\"]//span[contains(text(),'Stays')]")
	private WebElement stays;	
	
	@FindBy(xpath="//*[@class='hero-banner-wrapper']//div[contains(text(),'Find your next stay')]")
	private WebElement stayHeader;
	
	@FindBy(xpath="//*[@class=\"sb-destination-label-sr\"]//input[@type='search']")
	private static WebElement destination;
	
	@FindBy(xpath="//*[@aria-label=\"List of suggested destinations \"]//*[contains(@data-label,'New Delhi')][1]")
	private static WebElement desSuggestion;
	
	@FindBy(xpath="//*[contains(@class,'xp-calendar')]//*[contains(text(),'March 2022')]")
	private static WebElement month;
	
	@FindBy(xpath="//*[contains(@data-date,'2022-03-23')]")
	private static WebElement checkinDate;
	
	@FindBy(xpath="//*[contains(@data-date,'2022-04-01')]")
	private static WebElement checkoutDate;
	
	@FindBy(xpath="//*[contains(@class,'sb-searchbox-submit-col -submit-button')]")
	private static WebElement search;
	
	@FindBy(xpath="//a[contains(text(),'Top picks for long stays')]")
	private static WebElement topPicks;
	
	public String getTopPicks() {
		return topPicks.getText();
	}

	
	public void navigateToStays() {
		stays.click();
	}
	
	public String getStayHeader() {
		return stayHeader.getText();
	}
	
	
	
	public static void searchStay() {
		destination.sendKeys("New Delhi");
		desSuggestion.click();
		checkinDate.click();
		checkoutDate.click();
		search.click();
				
		
	}
	
	
}
