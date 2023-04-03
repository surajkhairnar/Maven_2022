package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleDependentMethodsTest {
	public WebDriver driver;
	@Test()
	public void OpenBrowser() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  @Test()
	  public void SignIn() throws InterruptedException {                  //......if we use 'L' in place of'l' then preference for Capital 1st
		  driver.get("https://demoqa.com/login");
		  WebElement UserName = driver.findElement(By.xpath("//input[@id='userName']"));
		  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login']"));
		  UserName.sendKeys("ravi.nangare");
		  Password.sendKeys("Qwerty@123");
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", loginBtn);
		  Thread.sleep(2000);
		  System.out.println("Login Test Successfull");
	  }
	  @Test(dependsOnMethods = {"SignIn","OpenBrowser"})
	  public void Logout() {
		  WebElement LogoutBtn = driver.findElement(By.xpath("//button[text()='Log out']"));
		  LogoutBtn.click();
		  System.out.println("Logout Test");
		  driver.close();
  }
}
