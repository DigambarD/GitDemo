package com.framework.tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.framework.lib.AppLib;

public class AbstractBaseTest {

	WebDriver driver;
	private AppLib app;
	
	@Parameters({"browser", "driverexe"})
	@BeforeMethod(alwaysRun=true)
	  public void Setup(@Optional("chrome")String browser, @Optional("D:\\Eclipse\\ChromeDrivers\\chromedriver.exe") String exe) throws Exception  {
		  	
		if(browser.equals("chrome")) {
		  	System.setProperty("webdriver.chrome.driver", exe);
			driver = new ChromeDriver();
		} else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", exe);
			driver = new FirefoxDriver();
		}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			app= new AppLib(driver);	  
	  }
	  @AfterMethod(alwaysRun=true)
	  public void tearDown() {
		  driver.close();
	  }
	  
	  public AppLib App() {
		  return app;
	  }
}
