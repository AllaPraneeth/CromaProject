package com.qa.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class TestBase

	{
		WebDriver driver;
		 
		 
	
		@Parameters({"Browser","Url"})
		@BeforeClass
		public void setUp(String Browser,String Url)
		{
			if(Browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\gopi\\eclipse-workspace\\FacebookProject\\Drivers\\chromedriver.exe");
				driver= new ChromeDriver();
				
			}
			
			else if(Browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","C:\\Users\\gopi\\eclipse-workspace\\CromaProject\\Drivers\\geckodriver.exe");
				driver= new FirefoxDriver();
				
			}
			 
					  driver.get(Url);
		}
	    @AfterClass
		public void tearDown() throws InterruptedException 
		{
			driver.close();
		}


	    public void captureScreenShot(WebDriver driver,String tname) throws IOException
		{
			TakesScreenshot screenShot=(TakesScreenshot) driver;
			File Sources=screenShot.getScreenshotAs(OutputType.FILE);
			String Dest= System.getProperty("user.dir")+"/Screenshots/"+tname+".png";
			FileUtils.copyFile(Sources,new File(Dest));
			
		}
		
	}

