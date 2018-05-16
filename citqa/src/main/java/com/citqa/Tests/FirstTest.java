package com.citqa.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentTest;
import com.citqa.BaseSetup;




public class FirstTest extends BaseSetup
{
   
	WebDriver driver;
	ExtentReporter extent;
	ExtentTest test ;
	
	@BeforeClass
	public  void InitClass()
	{
		driver = getDriver("chrome");
		
		launchweb(driver,"https://catqa.yourcloudlibrary.com/");
	}
   
   @BeforeMethod
   public void InitMethod()
   {
	   
   }
   
  	
	@Test
	public void TestMethod1() 
	{
		Reporter.log("--------Test Started----------",0);
		System.out.println("Hello World!");
		Reporter.log("--------Test Ended------------",0);
		
		
	}
	
	@AfterClass
   public void endClass()
   {
		
		Reporter.getOutput(itr);
		driver.quit();
   }


}
