package Test;

import org.testng.annotations.Test;

import HelperClass.helperClass;
import PageObject.Base;
import PageObject.simpleform;

public class MessageVerify extends Base {
	
	simpleform s1;
	@Test
	public void test1()
	{
		driver.get(URL);
	s1=new simpleform(driver);
	log.info("Running Test1");
	s1.option();
	log.info("test 1 successfully completed");
	helperClass.captureScreenshots(driver);
	//logger.pass("MessageVerified Test  Completed");
	}

}
