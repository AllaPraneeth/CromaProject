package com.qa.testscript;

import java.io.IOException;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.PageCroma;

import com.qa.utility.ExcelUtility;


public class TC_Searching_01 extends TestBase {
	@Test(dataProvider="getData")
	
	public void searching(String Itemname) throws InterruptedException, IOException {
		PageCroma search=new PageCroma(driver);
		
		driver.manage().window().maximize();
		search.getSearchBox().sendKeys(Itemname);
		search.getSearchBox().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		search.getAddToCart().click();
		Thread.sleep(3000);
		search.getcartBtn().click();
		Thread.sleep(4000);
		search.getpincode().sendKeys("502032");
		search.getsumbitbtn().click();
		String title =driver.getTitle();
		if(title.contains(Itemname)) 
		{
			 Reporter.log("Item is Searched",true);
	  Assert.assertTrue(true);
		}
		else
		{
			captureScreenShot(driver,"searching");
			 Reporter.log("Item is not searched",true);
			  Assert.assertTrue(false);

		}
		
		
		}
	@DataProvider
	public String[][] getData() throws IOException
	{
		String xFile ="C:\\Users\\gopi\\eclipse-workspace\\FacebookProject\\src\\test\\java\\com\\qa\\testdata\\Book1.xlsx";
		String xSheet ="Sheet1";
		
		int rowCount =ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount =ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		
		String[][] data =new String[rowCount][cellCount];
		
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++)
			{
				data[i-1][j]=ExcelUtility.getCellData(xFile, xSheet, i, j);
		}
		}
		return data;
	}
}
	
	
		
		
	
	
		
	
	


