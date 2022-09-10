package Test;

import org.testng.annotations.Test;

import HelperClass.helperClass;
import PageObject.Base;
import PageObject.FormFill;


public class Form extends Base{

	@Test
	public void FormTest() throws InterruptedException
	{
		FormFill ff=new FormFill(driver);
		log.info("Form test is Started");
		ff.input();

		ff.Form();
		log.info("Successfully enterd the creadentials");
		ff.submitButton();
		log.info("Form submitted");
		helperClass.captureScreenshots(driver);
		
//logger.pass("Test1 Completed");
	}

}
