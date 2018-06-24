package com.SpiceJet.Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	WebDriver driver;

	public WebDriver getDriver(String string) {
		
		if(string.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver","/Users/user2/Downloads/geckodriver");
			driver= new FirefoxDriver();
		} 
		else if(string.equals("Chrome")){
			driver= new ChromeDriver();
		}else if (string.equals("IE")){
			driver = new InternetExplorerDriver();
		}
		// TODO Auto-generated method stub
		return driver;
	}

	
}
