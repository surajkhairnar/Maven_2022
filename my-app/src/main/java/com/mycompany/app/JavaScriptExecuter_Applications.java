package com.mycompany.app;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter_Applications {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://www.google.com'");   //.......To call WebPage use window.location='...'
		
		js.executeScript("alert('Wecome to Google')");                  //.......To create alert use alert('..')
		driver.switchTo().alert().accept();                             //.......To accept alert.
		
		WebElement SearchTextbox=driver.findElement(By.xpath("//input[@class='gLFyf']"));
		//SearchTextbox.sendKeys("Indian Cricket Team");               // 1st By normal method
		js.executeScript("arguments[0].value='Indian cricket Team'",SearchTextbox );   // 2nd By javascript
		
		WebElement GoogleSearchbtn=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']"));
		js.executeScript("arguments[0].click()",GoogleSearchbtn );   //By javascript
		
		//System.out.println(driver.getTitle());                        //...Print Title by Normal method
		//System.out.println(driver.getCurrentUrl());                    //...Print Url by Normal method
		//System.out.println(driver.getPageSource());
		
		String url=js.executeScript("return document.URL;").toString();   //...Print URL by js. method
		System.out.println(url);
		
		String Title=js.executeScript("return document.title;").toString();   //...Print Title by js. method
		System.out.println(Title);
		
		String Domain=js.executeScript("return document.domain;").toString();   //...Print domain by js. method
		System.out.println(Domain);
		
		js.executeScript("window.scrollBy(0,600)");      //....Scroll Vertically
		
		Thread.sleep(5000);
		
		WebElement G=driver.findElement(By.xpath("(//span[@class='SJajHc'])[1]"));    // If We want Scroll upto some Word use this method
		js.executeScript("arguments[0].scrollIntoView(true)", G);
		
		
		
		
		
		
		
	
	}

}
