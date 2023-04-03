package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataPTestA {
	public WebDriver driver;
	  @Test(dataProvider = "BookStore",dataProviderClass = DataPBaseTestB.class)
	  public void login(String username, String password) throws InterruptedException {
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://demoqa.com/login");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
		  UserName.sendKeys(username);
		  Password.sendKeys(password);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", loginBtn);
		  Thread.sleep(2000);
		  String currenturl ="https://demoqa.com/profile";
		  String actualurl=driver.getCurrentUrl();
		  Assert.assertEquals(currenturl, actualurl);
		  System.out.println("User Successfully loged in Bookstore");
		  
	  }
}
