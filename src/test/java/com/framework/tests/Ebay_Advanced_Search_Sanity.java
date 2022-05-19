package com.framework.tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ebay_Advanced_Search_Sanity extends AbstractBaseTest {
	  
	 @Test(groups = {"P0"})
	  public void empty_Advanced_Search_Test() throws Exception {
		  	App().Flow().navigateToUrl(App().pages().AdvancedSearchPage().getPageUrl());
			
		  	App().Flow().maxmizethebrowser();
			
		  	String expectedUrl = "https://www.ebay.com/n/all-categories";
			String expectedTitle = "Shop by Category | eBay";
			
		//	WebElement searchBtn = advSearchElements.advSearchBtn;
			
			Assert.assertTrue(App().pages().AdvancedSearchPage().isSearchButtonEnabled(), "Verify Search Button Enabled");
			
			App().pages().AdvancedSearchPage().clickSearchButton();
						
			String newUrl = App().Flow().getCurrentPageUrl();
			String newTitle = App().Flow().getCurrentPageTitle();
			
			System.out.println(newUrl);
			System.out.println(newTitle);
			
			Assert.assertEquals(newUrl, expectedUrl, "Verify URL of the new Page");
			Assert.assertEquals(newTitle, expectedTitle, "Verify Title of the new Page");
				
	  }
	  
	 @Test(groups = {"P2","P3"})
	  public void category_options_in_ascending_order_test() throws Exception {
		  App().Flow().navigateToUrl(App().pages().AdvancedSearchPage().getPageUrl());
			
		  App().Flow().maxmizethebrowser();
		  
		  List<WebElement> category_options = App().pages().AdvancedSearchPage().getAllCatOptions();
		  
		  List<String> arr1 = new ArrayList<String>();
		  
		  for(WebElement option: category_options) {
			  arr1.add(option.getText());
		  }
		  
		  List<String> arr2 = new ArrayList<String>(arr1);
		  Collections.sort(arr2);
		  System.out.println("Actual List:"+arr1);
		  System.out.println("Sorted List:"+arr2);
		  Assert.assertTrue(arr1.equals(arr2), "Verify Category Items Sorted");
		  
	  }
	 @Test(groups = {"P0","P1"})
	  public void ebay_logo_link_navigates_home_page_test() throws Exception {
		  App().Flow().navigateToUrl(App().pages().AdvancedSearchPage().getPageUrl());			
		  App().Flow().maxmizethebrowser();
			
		  String expectedURL = "https://www.ebay.com/";
		  String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		  
		  App().pages().AdvancedSearchPage().clickOnEbayLogo();;
		  String newUrl = App().Flow().getCurrentPageUrl();
		  String newTitle = App().Flow().getCurrentPageTitle();
		  
		  System.out.println(newUrl);
		  System.out.println(newTitle);
		  
		  Assert.assertEquals(newUrl, expectedURL, "Verfify URL of the new page");
		  Assert.assertEquals(newTitle, expectedTitle, "Verfify Title of the new page");
	  }
	  
	 @Test(groups = {"P1"})
	  public void advanced_search_keywords_test() throws Exception {
		  App().Flow().navigateToUrl(App().pages().AdvancedSearchPage().getPageUrl());
			
		  App().Flow().maxmizethebrowser();
			
		  String keyword1 = "unlocked";
		  String keyword2 = "IOS";
		  String searchString = keyword1 + " " + keyword2;
		  App().pages().AdvancedSearchPage().enterSearchStringInKeywordField(searchString);
		  App().pages().AdvancedSearchPage().clickAdvSearchButton();
		  
		  String firstResulttitle = App().pages().SearchResultPage().getFirstResultTitle();
		  
		  Assert.assertTrue(firstResulttitle.toLowerCase().contains(keyword1), "Result Title contains First Keyword"+keyword1);
		  Assert.assertTrue(firstResulttitle.toLowerCase().contains(keyword1), "Result Title contains Second Keyword"+keyword2);
	  }
}
