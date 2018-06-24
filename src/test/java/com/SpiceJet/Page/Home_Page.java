package com.SpiceJet.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page {
	
	WebDriver driver;

	public Home_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public String oneWayButton = ".//*[@id='ctl00_mainContent_rbtnl_Trip_1']";
	public String leavingFromDropDown = ".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']";
	public String leavingFromSelect = ".//*[@id='dropdownGroup1']/div/ul[1]/li[23]/a";
	public String goingtoDropDown = ".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']";
	public String goingtoSelect = ".//*[@id='dropdownGroup1']/div/ul[1]/li[14]/a";
	public String journeyDateBox = ".//*[@id='flightSearchContainer']/div[3]/button";
	public String journeyDateSelect = ".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[6]/td[2]/a";
	public String adultDropDown = "//*[@id='ctl00_mainContent_ddl_Adult']";
	
	
	public WebElement getoneWayButton(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(oneWayButton)));
	}
	
	public WebElement getleavingFromDropDown(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(leavingFromDropDown)));
	}
	
	public WebElement getleavingFromSelect(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(leavingFromSelect)));
	}
	
	public WebElement getgoingtoDropDown(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(goingtoDropDown)));
	}
	
	public WebElement getgoingtoSelect(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(goingtoSelect)));
	}
	
	public WebElement getjourneyDateBox(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(journeyDateBox)));
	}
	
	public WebElement getjourneyDateSelect(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(journeyDateSelect)));
	}
	
	public WebElement getadultDropDown(WebDriver driver){
		return new WebDriverWait(driver,10000).until(ExpectedConditions.presenceOfElementLocated(By.xpath(adultDropDown)));
	}


}
