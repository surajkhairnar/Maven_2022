package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_CssSelector 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		
		//WebElement Email=driver.findElement(By.cssSelector("input[id='email']"));
		//Email.sendKeys("surajkhairnar@gmail.com");
		
		//WebElement Password=driver.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy _9npi']"));
		//Password.sendKeys("Sairam@23");
		
		//WebElement Login= driver.findElement(By.cssSelector("button._42ft._4jy0._6lth._4jy6._4jy1.selected._51sy"));   // Class sathi . aani value madhe space kadhun tithe pn .
		//Login.click();
		
		//WebElement ForgottenPass= driver.findElement(By.linkText("Forgotten password?"));
		//ForgottenPass.click();
		
        WebElement Createnewacc=driver.findElement(By.cssSelector("a._42ft._4jy0._6lti._4jy6._4jy2.selected._51sy"));
        Createnewacc.click();
	}

}
