package com.framework.lib;

import org.openqa.selenium.WebDriver;

import com.framework.pages.Ebay_Advanced_Search_Page;
import com.framework.pages.Ebay_Home_Page;
import com.framework.pages.Ebay_Search_Results_Page;

public class PageLib {

	private WebDriver driver;
	private Ebay_Home_Page homepage;
	private Ebay_Advanced_Search_Page advSearchpage;
	private Ebay_Search_Results_Page srcResultPage;
	
	public PageLib(WebDriver driver) {
		this.driver = driver;
		homepage = new Ebay_Home_Page(driver);
		advSearchpage = new Ebay_Advanced_Search_Page(driver);
		srcResultPage = new Ebay_Search_Results_Page(driver);
	}
	
	public Ebay_Home_Page HomePage(){
		return homepage;
	}
	public Ebay_Advanced_Search_Page AdvancedSearchPage() {
		return advSearchpage;
	}
	public Ebay_Search_Results_Page SearchResultPage() {
		return srcResultPage;
	}
}
