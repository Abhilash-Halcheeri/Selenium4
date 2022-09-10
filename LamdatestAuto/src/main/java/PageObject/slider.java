package PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class slider {
	WebDriver ldriver;
	public  slider(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[contains(text(),'Drag & Drop Sliders')]")
	WebElement dd;

	@FindBy(xpath="//output[@id='rangeSuccess']")
	WebElement slider;



	public void DragAndDrop()

	{

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		WebDriverWait wait = new WebDriverWait(ldriver,10);
		wait.until(ExpectedConditions.elementToBeClickable(dd)).click();;
		//dd.click();


	}
	public void slider()
	{
slider.click();
		Actions ac=new Actions(ldriver);
		ac.dragAndDropBy(slider, 95,15).perform();
		System.out.println(slider.getText());
	}
}



