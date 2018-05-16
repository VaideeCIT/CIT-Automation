package com.citqa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseSetup {

	
	public ITestResult itr;
	
	   public WebDriver getDriver(String browsername)
	   {
			WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "E:\\Share\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://catqa.yourcloudlibrary.com");
			
			System.out.println(((RemoteWebDriver) driver).getCapabilities().getVersion());
			
			return driver;
	   }
	   
	   public void launchweb(WebDriver driver, String url) {
		   try {
		   
			   driver.get(url);
			   
		   } catch(Exception e) {
		   
			   System.out.println("Error in launching the page: "+url +"\n"+e.getMessage().toString());		  
		   }
	   }
	   
	
}
