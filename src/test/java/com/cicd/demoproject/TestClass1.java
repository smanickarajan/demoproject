package com.cicd.demoproject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() throws MalformedURLException {
		System.out.println("Started");
		DesiredCapabilities dr=DesiredCapabilities.chrome();
		dr.setBrowserName("chrome");
		dr.setPlatform(Platform.WINDOWS);
		
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		driver = new RemoteWebDriver(new URL("http://192.168.225.81:4444/wd/hub"), dr);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//System.out.println("Maximized");
	}

	@Test
	public void Test1() {
		System.out.println("Entering URL");
		driver.get("https://automationtalks.com/");
        System.out.println("Title of Test1 is "+driver.getTitle() );
	}
	
	@Test
	public void Test2() {
		System.out.println("Entering URL");
		driver.get("https://automationtalks.com/");
        System.out.println("Title of Test2 is "+driver.getTitle() );
	}
	
	@Test
	public void Test3() {
		System.out.println("Entering URL");
		driver.get("https://automationtalks.com/");
        System.out.println("Title of Test3 is "+driver.getTitle() );
	}
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
}
