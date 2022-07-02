package com.hybrid.javaPageClasses;

import java.time.Duration;

import org.apache.commons.logging.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardObjects {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[text()='Log out']")
	private WebElement LogoutBtn;
	
	public DashboardObjects(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ClickonLogOut() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LogoutBtn.click();
		Thread.sleep(4000);
	}

}
