package com.framework.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ebay_Home_Sanity extends AbstractBaseTest{
	 
  @Test(groups = {"P0","P1"})
  public void empty_search_test() throws Exception {
	  
	  	App().Flow().navigateToUrl(App().pages().HomePage().getPageUrl());
		
		App().Flow().maxmizethebrowser();
	  
	  	Assert.assertTrue(App().pages().HomePage().isSearchButtonEnabled(), "Verify Search Button Enabled");
	
		App().pages().HomePage().clickSearchButton();
			
		String expectedUrl = "https://www.ebay.com/n/all-categories";
		String expectedTitle = "Shop by Category | eBay";
		
		String newUrl = App().Flow().getCurrentPageUrl();
		String newTitle = App().Flow().getCurrentPageTitle();
		
		System.out.println(newUrl);
		System.out.println(newTitle);
		
		Assert.assertEquals(newUrl, expectedUrl, "Verify URL of the new Page");
		Assert.assertEquals(newTitle, expectedTitle, "Verify Title of the new Page");
		
		  
  }
  @Test(groups = {"P2","P1"})
  public void empty_Search_test_softassert() throws InterruptedException {
	
	  	App().Flow().navigateToUrl(App().pages().HomePage().getPageUrl());
		
	  	App().Flow().maxmizethebrowser();
		
		SoftAssert sa = new SoftAssert();
	  
	  	sa.assertTrue(App().pages().HomePage().isSearchButtonEnabled(), "Verify Search Button Enabled");
	
	  	App().pages().HomePage().clickSearchButton();
		
		String expectedUrl = "https://www.ebay.com/n/all-categories";
		String expectedTitle = "Shop by Category | eBay";
		
		String newUrl = App().Flow().getCurrentPageUrl();
		String newTitle = App().Flow().getCurrentPageTitle();
		
		System.out.println(newUrl);
		System.out.println(newTitle);
		
		sa.assertEquals(newUrl, expectedUrl, "Verify URL of the new Page");
		sa.assertEquals(newTitle, expectedTitle, "Verify Title of the new Page");
		
		sa.assertAll();
  }
}
