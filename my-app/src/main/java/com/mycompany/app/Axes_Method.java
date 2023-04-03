package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Axes_Method 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		WebElement Button=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Button.click();
		
		WebElement SearchBt=driver.findElement(By.xpath("//input[@class='_3704LK']"));
		SearchBt.sendKeys("Laptops");
		
		
		WebElement SearchClick=driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		SearchClick.click();
		
		
		Thread.sleep(5000);
		//WebElement Lenovo=driver.findElement(By.xpath("(//div[@class='_2kHMtA']//div[@class='col col-7-12']//div[@class='_4rR01T'])[1]"));
		//Lenovo.click();
		
		WebElement Corei7=driver.findElement(By.xpath("//label[@class='_2iDkf8 t0pPfW']//following::div[@class='_24_Dny']//following-sibling::div[text()='Core i7']"));
		Corei7.click();
        
	}

}
