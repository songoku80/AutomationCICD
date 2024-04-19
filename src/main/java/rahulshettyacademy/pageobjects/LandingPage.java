package rahulshettyacademy.pageobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import rahulshettyacademy.AbstractComponents.AbstractComponent;

public class LandingPage extends AbstractComponent {
	
	WebDriver driver;
	
	public LandingPage(WebDriver driver)	{
		
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, driver);
		
	}
	
	
	public void loginApplication(String email, String password)	{
		
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("userPassword")).sendKeys(password);
		driver.findElement(By.id("login")).click();
				
	}
	
	public void goTo()	{
		
		driver.get("https://rahulshettyacademy.com/client");	
	}
	
	
}
