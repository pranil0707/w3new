package com.hybrid.TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.java.Utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	ReadConfig r = new ReadConfig();
	
	String Url = r.getBaseurl();
	String browser = r.getBrowser();
	
	@BeforeSuite
	public void setup()
	{
		
		switch (browser.toLowerCase()) {
		case "chrome":
						WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						
						break;

		case "firefox":
						WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver();
			
						break;
			
		case "edge":
						WebDriverManager.edgedriver().setup();
						driver = new EdgeDriver();
			
						break;	
				
		default:
						driver= null;	
						break;
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	
	}
	
	@AfterSuite
	public void TearUp() 
	{
		driver.close();
		
	}
}
