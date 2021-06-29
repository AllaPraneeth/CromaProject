package com.qa.testscript;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.pages.PageCroma;



public class TC_Links_02  extends TestBase {
	@Test

	public void Links() {	 
		PageCroma links=new PageCroma(driver);
		
			
	
			links.getelectronicslinks().click();
		Set<String>	windowHandles=driver.getWindowHandles();
		Iterator<String> iterator=windowHandles.iterator();
		while(iterator.hasNext()) {
			String WindId=iterator.next();
			WebDriver window=driver.switchTo().window(WindId);
			System.out.println(window.getTitle());
			
			java.util.List<WebElement> Links = window.findElements(By.tagName("a"));
		System.out.println("total no.links present on the window with id# :" +WindId +"are:" + Links.size());
		}

		}

	}


