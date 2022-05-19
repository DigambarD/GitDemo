package com.framework.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ebay_Search_Results_Page_Elements {
	WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Apple iPhone XS 64GB Unlocked Smartphone - Very Good')]") public WebElement firstSearchresult;

	public Ebay_Search_Results_Page_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
