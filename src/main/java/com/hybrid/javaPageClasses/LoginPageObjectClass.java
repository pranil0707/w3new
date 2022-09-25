package com.hybrid.javaPageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjectClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement Email;
	
	@FindBy(xpath="//input[@name='current-password']")
	private WebElement Password;
	
	@FindBy(xpath="//span[text()='Log in']")
	private WebElement LogInBtn;
	
	@FindBy(xpath="//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
	private WebElement UpdateBtn;
	
	public LoginPageObjectClass(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void EnterCred(String mail) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Email.sendKeys(mail);	
	}
	
	public void EnterPass(String password) throws InterruptedException
	{
		Thread.sleep(2000);
		Password.sendKeys(password);
	}
	
	public void ClickOnLoginbtn() throws InterruptedException
	{
		Thread.sleep(2000);
		LogInBtn.click();
	}	
	
	public void ClickOnupdatebtn() throws InterruptedException
	{
		Thread.sleep(2000);
		UpdateBtn.click();
	}
	
}
