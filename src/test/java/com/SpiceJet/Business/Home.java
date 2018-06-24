package com.SpiceJet.Business;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SpiceJet.Java.DataImportFromExcel;
import com.SpiceJet.Page.Home_Page;

public class Home extends Home_Page{

	public Home(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
	}

	public void FlightBooking(WebDriver driver) {
		// TODO Auto-generated method stub
		DataImportFromExcel dataImportFromExcel = new DataImportFromExcel();
		
		getoneWayButton(driver).click();
		getleavingFromDropDown(driver).sendKeys(dataImportFromExcel.leaveingFrom);
		getleavingFromSelect(driver).click();
		getgoingtoDropDown(driver).sendKeys(dataImportFromExcel.goingTo);
		getgoingtoSelect(driver).click();
		getjourneyDateBox(driver).click();
		getjourneyDateSelect(driver).click();
		
		
		Select s= new Select(getadultDropDown(driver));
		s.selectByValue("4");
		System.out.println(getadultDropDown(driver).getText());
		
	}

	public void takeScreenshot(WebDriver driver) {
		// TODO Auto-generated method stub
		long curDate = System.currentTimeMillis();
		
		
		try {
			File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("323289_" + curDate + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
