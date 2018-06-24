 package com.SpiceJet.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SpiceJet.Business.Home;
import com.SpiceJet.Java.Base;
import com.SpiceJet.Java.Constant;
import com.SpiceJet.Java.DataImportFromExcel;

public class Smoke {
	
	WebDriver driver;
	Base b = new Base();
	Home home = new Home(driver);


	@BeforeClass
	
	public void setUp(){
		
		driver = b.getDriver("Firefox");
		driver.manage().window().maximize();
		DataImportFromExcel dataImportFromExcel = new DataImportFromExcel();
		driver.get(dataImportFromExcel.baseURL);
	}
	
	@Test
	
	public void test(){
		
		home.takeScreenshot(driver);
		home.FlightBooking(driver);
		
	}
	
	@AfterClass
	
	public void quitBrowser(){
		
	}
}
