package com.framework.pages;

import org.openqa.selenium.WebDriver;

import com.framework.elements.Ebay_Search_Results_Page_Elements;

public class Ebay_Search_Results_Page {
	
	
	WebDriver driver;
	Ebay_Search_Results_Page_Elements searchResultsElements;
	
	public Ebay_Search_Results_Page(WebDriver driver) {
		this.driver =driver;
		searchResultsElements = new Ebay_Search_Results_Page_Elements(driver);
	}
	
	/**
	 * Get first result title
	 */
	public String getFirstResultTitle() {
		return searchResultsElements.firstSearchresult.getText().trim();
	}

}
