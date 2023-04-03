package com.mycompany.app;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Tag_Name 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        
		//WebElement LoginBtn=driver.findElement(By.tagName("button"));                    // This are used for Single value
		//LoginBtn.click();
		
		List<WebElement> links= driver.findElements(By.tagName("a"));                   //This are used for multiple values
		System.out.println("Links on Facebook Page:"+links.size());
		
		List<WebElement> inputs= driver.findElements(By.tagName("input"));
		System.out.println("Input tags in Facebook Page:"+inputs.size());
	}

}
