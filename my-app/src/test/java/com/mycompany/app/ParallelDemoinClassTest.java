package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelDemoinClassTest {
  @Test(threadPoolSize = 4,invocationCount = 4,timeOut = 70000)
  public void ParallelTest() {
	  System.out.println("The thread ID for Edge is"+Thread.currentThread().getId());
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.google.com");
  }
}
