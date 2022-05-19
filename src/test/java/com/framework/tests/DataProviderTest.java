package com.framework.tests;

import com.framework.lib.ReadExcelLib;

import org.testng.annotations.DataProvider;

public class DataProviderTest {


  @DataProvider
  public Object[][] dataProvide1() {
   
	  ReadExcelLib excel = new ReadExcelLib();
	  String file = "D:\\Oct_Test_Workspace\\TestNGFrameworkData\\TestData\\TestData.xlsx";
	  return excel.Get_Excel_Data(file, "Sheet1", 3);
   
  }
}
