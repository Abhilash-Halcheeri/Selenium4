package HelperClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class helperClass {
	
	public static void captureScreenshots(WebDriver driver)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(src,new File("./screenshots/lamdatest"+getcurrentDateTime()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static  String getcurrentDateTime()
	{
		DateFormat customformat= new SimpleDateFormat("MM-DD-yyyy_hh_mm_ss ");
		
	   Date currentDate=new Date();
	    return customformat.format(currentDate);
	}}



