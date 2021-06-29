package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageCroma {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"search\"]")
	WebElement SearchBox;
	public WebElement getSearchBox()
	{
		return SearchBox;
    }
	
	@FindBy(xpath="//*[@id=\"230117\"]/div[3]/div[2]/div/button[1]")
	WebElement AddToCart;
	public WebElement getAddToCart()
	{
		return  AddToCart;
    }
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div[2]/div/div[6]/a/span[1]")
	WebElement cartBtn;
	public WebElement getcartBtn()
	{
		return cartBtn;
    }

	@FindBy(xpath="/html/body/div[4]/div[3]/div/div/div/div/div/div[1]/input")
	WebElement pincode;
	public WebElement getpincode()
	{
		return pincode;
    }
	@FindBy(id="apply-pincode-btn")
	WebElement sumbitbtn;
	public WebElement getsumbitbtn()
	{
		return sumbitbtn;
    }
	
	@FindBy(xpath="//*[@id=\"container\"]/div[1]/div[2]/div/a/img")
	WebElement cromalink;
	
	public WebElement getcromalink() {
		return  cromalink;
	}

	@FindBy(xpath="//*[@id=\"homedatael\"]/div[2]/div/div/div[1]/div/div[1]/div/div/label/a")
	WebElement electronicslinks;
	
	public WebElement getelectronicslinks() {
		return electronicslinks;
	}
	


	
	
	
	public PageCroma(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
}
