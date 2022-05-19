package com.framework.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;

import static org.testng.Assert.fail;


import org.testng.annotations.AfterClass;

public class DemoTest extends DataProviderTest {
	/*
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite Executed");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite Executed");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test Executed");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("After Test Executed");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class Executed");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("After Class Executed");
	  }
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Methods Executed");
	  }

	@AfterMethod
	  public void afterMethod() {
		System.out.println("After Methods Executed");
	}
	*/
  @Test(dependsOnMethods= {"test2","test3"}, alwaysRun=true)
  public void test1() {
	  System.out.println("Test1 Executed");
	  System.out.println("----------------------------------");
  }
  @Test
  public void test2() {
	  System.out.println("Test2 Executed");
	  System.out.println("----------------------------------");
	  fail("Test2 Fails");
  }
  @Test
  public void test3() {
	  System.out.println("Test3 Executed");
	  System.out.println("----------------------------------");
	  fail("Test3 Fails");
  }
  @Test
  public void test4() {
	  System.out.println("Test4 Executed");
	  System.out.println("----------------------------------");
  }
  @Test (dataProvider="dataProvide1", dataProviderClass = DataProviderTest.class)
  public void test5(String p1, String p2, String p3) {
	  System.out.println(p1);
	  System.out.println(p2);
	  System.out.println(p3);
	  System.out.println("----------------------------------");
  }

}
