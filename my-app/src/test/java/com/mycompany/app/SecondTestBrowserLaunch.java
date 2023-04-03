package com.mycompany.app;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SecondTestBrowserLaunch {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  System.out.println("First Test");
	  driver.get("https://www.utkarshaaacademy.com");
	  String ExpectedTitle = "Utkarshaa Academy";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
  }
  @Test
  public void s() {
	  System.out.println("Second Test");
	  driver.get("https://www.google.com");
	  //String ExpectedTitle = "Google";             //.....This test Pass if we put this
	  String ExpectedTitle = "google";               //.....This test Fail if we put this
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, ExpectedTitle);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Execute before Every Test");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Execute after every Test");
	  driver.close();
  }

}
