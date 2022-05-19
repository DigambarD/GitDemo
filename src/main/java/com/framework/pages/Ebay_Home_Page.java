package com.framework.pages;

import org.openqa.selenium.WebDriver;

import com.framework.elements.Ebay_Home_Page_Elements;

public class Ebay_Home_Page {
	
	String pageUrl = "https://www.ebay.com/";
	WebDriver driver;
	Ebay_Home_Page_Elements homepageElements;
	
	public Ebay_Home_Page(WebDriver driver) {
		this.driver=driver;
		homepageElements = new Ebay_Home_Page_Elements(driver);
	}
	
	/**
	 * Click on Search Button
	 */
	public void clickSearchButton() {
		
		homepageElements.searchBtn.click();
	}
	
	/**
	 * Is Search Button Enabled
	 */
	public boolean isSearchButtonEnabled() {
		return homepageElements.searchBtn.isEnabled();
	}
	/**
	 * Get Page Url
	 */
	public String getPageUrl() {
		return pageUrl;
	}

}
