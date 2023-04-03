package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	
	public WebDriver driver;
	@Test
	public void assertdemo1(){
		ChromeOptions op=new ChromeOptions();
	    op.addArguments("--remote-allow-origins=*");
	    driver=new ChromeDriver(op);
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String FBCurrenttitle="Facebook – log in or sign up";   //...if we pass "f" then test get fail
		String FBActualtitle=driver.getTitle();
		Assert.assertEquals(FBCurrenttitle, FBActualtitle,"Assertion Pass due to first letter of title");    // Hard Assert Method-in this test fail and not jump to next step...
		System.out.println("Test Pass");
	
		
	}
	@Test
	public void softassertdemo() throws InterruptedException {
		driver.get("https://demoqa.com/login");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
		  UserName.sendKeys("ravi.nangare1");
		  Password.sendKeys("Qwert@123");
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", loginBtn);
		  Thread.sleep(2000);
		  String currenturl = "https://demoqa.com/profile";
		  String ActualPageUrl = driver.getCurrentUrl();
		  
		  SoftAssert sassert= new SoftAssert();            // Soft Assert Method-in this test fail but jump to next step...
		  sassert.assertEquals(ActualPageUrl,currenturl);
		  
		  System.out.println("User not Succesfully loged in");
		  sassert.assertAll();
	}

}
