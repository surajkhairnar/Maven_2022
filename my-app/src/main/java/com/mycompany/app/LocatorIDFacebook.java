package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIDFacebook 
{

	public static void main(String[] args)
    {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys("surajkhairnar@gmail.com");
		
		WebElement Password= driver.findElement(By.id("pass"));
		Password.sendKeys("Sairam@2023");
		
		//WebElement Log_in= driver.findElement(By.className("_42ft"));     //If ID not given use class but the value in class have 'Space' then use partial
		//Log_in.click();                                                  // If partial value repeated then preference for 1st one.
		
		
		
		

	}

}
