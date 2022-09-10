package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FormFill {
	WebDriver ldriver;
	String str="United States";
	String expctd="Thanks for contacting us, we will get back to you shortly.";


	public  FormFill(WebDriver driver) 
	{
		ldriver=driver;
		PageFactory.initElements(driver,this);

	}
	@FindBy(xpath="//a[contains(text(),'Input Form Submit')]")
	WebElement inputbutton;

	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;

	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	@FindBy(xpath="//input[@id='inputEmail4']")
	WebElement email;

	@FindBy(xpath="//input[@id='inputPassword4']")
	WebElement password;

	@FindBy(xpath="//input[@id='company']")
	WebElement company;
	@FindBy(xpath="//input[@id='websitename']")
	WebElement website;


	@FindBy(xpath="//input[@id='inputCity']")
	WebElement city;

	@FindBy(xpath="//input[@id='inputAddress1']")
	WebElement add1;
	@FindBy(xpath="//input[@id='inputAddress2']")
	WebElement add2;

	@FindBy(xpath="	//input[@id='inputState']")
	WebElement state;
	@FindBy(xpath="//input[@id='inputZip']")
	WebElement zipcode;


	@FindBy(xpath="//select[@name='country']")
	WebElement country;

	@FindBy(xpath="//button[contains(text(),'Submit')]")
	WebElement submit2;

	@FindBy(xpath="//div[@class='loginform border border-gray-90 mt-20 p-20']")
	WebElement text;


	public void input()
	{
		inputbutton.click();


	}

	public void Form() throws InterruptedException
	{
		name.sendKeys("Abhilash");
		Thread.sleep(1000);
		email.sendKeys("abhi8187hal@gmail.com");
		Thread.sleep(1000);
		password.sendKeys("123456");
		Thread.sleep(1000);
		company.sendKeys("ABCD");
		website.sendKeys("NA");
		Thread.sleep(1000);

		city.sendKeys("Bengaluru");
		Thread.sleep(1000);
		add1.sendKeys("Bengaluru");
		Thread.sleep(1000);
		add2.sendKeys("Bengaluru");
		Thread.sleep(1000);

		state.sendKeys("Karnataka");
		Thread.sleep(1000);
		zipcode.sendKeys("123456");
		Thread.sleep(1000);

		Select dd=new Select(country);

		dd.selectByVisibleText(str);
		Thread.sleep(3000);
	}

	public void submitButton() throws InterruptedException
	{
		submit2.click();
		Thread.sleep(2000);
		String txt=text.getText();
		Assert.assertEquals(txt, expctd);
		System.out.println("Result :"+txt);
	}




}


