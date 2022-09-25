package com.hybrid.TestClass;

import org.testng.annotations.Test;

import com.hybrid.javaPageClasses.DashboardObjects;
import com.hybrid.javaPageClasses.LoginPageObjectClass;
import com.hybrid.javaPageClasses.MainPageObjectClass;

public class TC_LoginTestCases extends BaseClass {

	@Test(priority = 1)
	public void SetupStart() throws InterruptedException
	{
			driver.get(Url);
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
	}
	
	@Test(priority = 2)
	public void ClickonLoginBtn1()
	{
			MainPageObjectClass mp = new MainPageObjectClass(driver);
			mp.ClickOnLoginBtn();
	}

	@Test(priority = 3)
	public void EnterCread1() throws InterruptedException
	{
			LoginPageObjectClass lp= new LoginPageObjectClass(driver);
			lp.EnterCred("iampranilpalse@gmail.com");
			lp.EnterPass("iamJERRY@77");
			lp.ClickOnLoginbtn();
			Thread.sleep(9000);
			lp.ClickOnupdatebtn();
			Thread.sleep(5000);
	}
	
	@Test(priority = 4)
	public void ClickOnLogOut1() throws InterruptedException
	{
		
			DashboardObjects d = new DashboardObjects(driver);
			d.ClickonLogOut();	
	}
}
