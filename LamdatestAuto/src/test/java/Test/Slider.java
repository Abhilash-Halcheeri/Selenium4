package Test;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import HelperClass.helperClass;
import PageObject.Base;
import PageObject.slider;

public class Slider extends Base {
	
	@Test
	public void SliderbarTest()
	{
		slider sl=new slider(driver);
		sl.DragAndDrop();
		log.info("Slider test is Started");
		sl.slider();
		log.info("Slider test is completed");
		helperClass.captureScreenshots(driver);	
		//logger.pass("Slider Test  Completed");
	}
	

}
