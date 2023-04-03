package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorIDUtkarshaaacedmy 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://utkarshaaacademy.com");
		driver.get("https://utkarshaaacademy.com/automation-practice/");
		
		WebElement FirstName= driver.findElement(By.id("name-firstname"));
		FirstName.sendKeys("Suraj");
		
		WebElement LastName= driver.findElement(By.id("name-lastname"));
		LastName.sendKeys("Khairnar");
		
		WebElement Phone= driver.findElement(By.id("phone"));
		Phone.sendKeys("9403589847");
		
		WebElement Email= driver.findElement(By.id("email"));
		Email.sendKeys("surajkhairnar@gmail.com");
		
		WebElement Date= driver.findElement(By.id("date"));
		Date.sendKeys("06-02-2023");
		
		WebElement Time=driver.findElement(By.id("time-morning"));
		Time.click();
		
		WebElement SpecialNote= driver.findElement(By.id("special-notes"));
		SpecialNote.sendKeys("I am interested for Selenium Automation Practice");
		
		

	}

}
