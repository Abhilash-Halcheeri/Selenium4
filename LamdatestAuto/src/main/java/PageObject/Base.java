package PageObject;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import HelperClass.helperClass;


public class Base {
	public RemoteWebDriver driver;
	String username = "abhi8187halcheeri";
	String accessKey = "kSmdZXQamUjkEK83UW4F6E1E0pxL4FdyIFzLVcgJaJFtZLfHGu";
	public String URL="https://www.lambdatest.com/selenium-playground/";
	 public Logger log;
	 public ExtentTest logger;
	 public ExtentReports report;
	
	@BeforeClass
	@Parameters(value={"browser","version","platform"})
	public void setUp(String browser, String version, String platform) throws Exception {
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	     capabilities.setCapability("browserName", browser);
	     capabilities.setCapability("version", version);
	     capabilities.setCapability("platform", platform); // If this cap isn't specified, it will just get the any available one
	     capabilities.setCapability("build", "LamdatestAuto");
	     capabilities.setCapability("name", "LamdatestAuto");
	     capabilities.setCapability("network", true); // To enable network logs
	     capabilities.setCapability("visual", true); // To enable step by step screenshot
	     capabilities.setCapability("video", true); // To enable video recording
	     capabilities.setCapability("console", true);
	
	
	
	
	//---------------------------
	
	/*public void setup()
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		// Configure your capabilities here
		caps.setCapability("platform", "Windows 10");
		caps.setCapability("browserName", "Chrome");
		caps.setCapability("version", "92.0");
		*/
//------------------------------------------------------
		try {
			driver = new RemoteWebDriver(new URL("https://" + username +":" + accessKey + "@hub.lambdatest.com/wd/hub"),capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log=Logger.getLogger("Base");
		PropertyConfigurator.configure("log4j.properties");
		
		driver.get(URL);
		
		
		
		
		
		
		
		report=new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter(new File(System.getProperty("user.dir")+"/Reports//LamdaTest"+helperClass.getcurrentDateTime()+".html"));
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("Abhi_Extent Report");
		report.attachReporter(spark);
		Reporter.log("setting Done", true);
	}




	@AfterMethod
	public void tearDown() {
		//driver.executeScript("lambda-status=" + Status);
		driver.quit();
	}


}

