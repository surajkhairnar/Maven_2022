package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WaitDemo_Implicit 
{
	private static final Class<? extends Throwable> TimeoutException = null;

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//IMPLICIT WAIT (DYNAMIC).................................................................................................2) It gives at start of script
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement CreateNewAcccount =driver.findElement(By.xpath("//a[text()='Create new account']"));
		CreateNewAcccount.click();
		
		
		// STATIC WAIT.............................................................................................................1) It gives it particular step
		//Thread.sleep(5000);
		
		
		//EXPLICIT WAIT (DYNAMIC)..................................................................................................3) It gives at particular case
		// a) WebDriverWait
	//	 WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	   //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']"))).sendKeys("Suraj");
		//WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
		//FirstName.sendKeys("Suraj");
		
		// b) Fluent Wait
	    Wait<WebDriver>  wait1= new FluentWait<WebDriver>(driver)
	    		 .withTimeout(Duration.ofSeconds(60))
	    		 .pollingEvery(Duration.ofSeconds(10))
	    		 .ignoring(NoSuchElementException.class);
	     
	     driver.get("https://demoqa.com/dynamic-properties");
	     
	     WebElement EnableAfter= driver.findElement(By.xpath("//button[text()='Will enable 5 seconds']"));
	     WebElement ColourChange=driver.findElement(By.xpath("//button[@id='colorChange']"));
	     
	     System.out.println("Enable After Button is Enabled"+EnableAfter.isEnabled());
	     System.out.println("Colour Change Button color value"+ColourChange.getCssValue("color"));
	     
	     wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='visibleAfter']")));
	     
	     WebElement Visibleafter=driver.findElement(By.xpath("//button[@id='visibleAfter']"));
	     System.out.println("Visible after Button is Visible after 5 seconds"+Visibleafter.isDisplayed());
	     
	     System.out.println("Enable After Button is Enabled"+EnableAfter.isEnabled());
	     System.out.println("Colour Change Button color value"+ColourChange.getCssValue("color"));
	     
	     
	     
	    
		
	}

}
