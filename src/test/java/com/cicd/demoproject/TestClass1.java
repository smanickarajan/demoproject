package com.cicd.demoproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	public static WebDriver driver;

	@BeforeMethod
	public void launchDriver() {
		System.out.println("Started");
		System.setProperty("webdriver.chrome.driver", "F:\\softwares\\chromedriver.exe");
		driver = new ChromeDriver();
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
