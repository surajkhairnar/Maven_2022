package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Class_Name 
{

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//WebElement Email= driver.findElement(By.className("inputtext"));
		WebElement Email= driver.findElement(By.name("email"));
		Email.sendKeys("surajkhairnar@gmail.com");
		
		//WebElement Password= driver.findElement(By.className("_9npi"));
		WebElement Password =driver.findElement(By.name("pass"));
		Password.sendKeys("Sairam@23");
		
		//WebElement Login= driver.findElement(By.className("_42ft"));
		WebElement Login =driver.findElement(By.name("login"));
		Login.click();
		
		
		

	}

}
