package com.hybrid.javaPageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPageObjectClass {

	WebDriver driver;
	
	@FindBy(xpath="//a[@id='w3loginbtn']")
	private WebElement Loginbtn;

	public MainPageObjectClass(WebDriver driver)
	{
		this.driver = driver;						//Uses Current class Driver
		PageFactory.initElements(driver, this);		//initeElements for initialization of object repository	
	}
	
	public void ClickOnLoginBtn()
	{
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Loginbtn.click(); 
	}
	
}

