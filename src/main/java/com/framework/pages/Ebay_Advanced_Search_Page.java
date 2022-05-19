package com.framework.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.framework.elements.Ebay_Advanced_Search_Page_Elements;
import com.framework.elements.Ebay_Search_Results_Page_Elements;

public class Ebay_Advanced_Search_Page {
	String AdvpageUrl = "https://www.ebay.com/sch/ebayadvsearch";
	WebDriver driver;
	Ebay_Advanced_Search_Page_Elements advSearchElements;
	Ebay_Search_Results_Page_Elements searchResultsElements;
	
	public Ebay_Advanced_Search_Page(WebDriver driver) {
		this.driver = driver;
		
		advSearchElements = new Ebay_Advanced_Search_Page_Elements(driver);
		searchResultsElements = new Ebay_Search_Results_Page_Elements(driver);
	}
	
	/**
	 * Is Advanced Search Button Enabled
	 */
	public boolean isSearchButtonEnabled(){
		return advSearchElements.advSearchBtn.isEnabled();
	}
	/**
	 * Click on Search Button
	 */
	public void clickSearchButton() {
		
		advSearchElements.advSearchBtn.click();
	}
	
	/**
	 * Get all category dropdown options
	 */
	public List<WebElement> getAllCatOptions(){
		return advSearchElements.allCatSearchBoxOptions;
	}
	
	/**
	 * Click on Ebay logo
	 */
	public void clickOnEbayLogo() {
		advSearchElements.ebayLogo.click();
	}
	/**
	 * Enter search string in keywords field
	 */
	public void enterSearchStringInKeywordField(String srcString) {
		advSearchElements.keywordfield.sendKeys(srcString);
	}
	
	/**
	 * Click advanced search button
	 */
	public void clickAdvSearchButton() {
		advSearchElements.advSearchBtn.click();
	}
	/**
	 * Get Page Url
	 */
	public String getPageUrl() {
		return AdvpageUrl;
	}

}
