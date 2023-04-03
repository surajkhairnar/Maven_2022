package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_startwith_Text 
{
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dell.com");
		
		//WebElement Shopnow=driver.findElement(By.xpath("//a[text()='Shop Now'][1]"));
		//Shopnow.click();
		
		//WebElement Workstation=driver.findElement(By.xpath("//div[text()='Workstations']"));                 //TEXT()
		//Workstation.click();
		
		WebElement Search=driver.findElement(By.xpath("//input[@id='mh-search-input' or @class='mh-search-input']"));     //OR METHOD
		Search.sendKeys("i5");
		
		WebElement DellSupport=driver.findElement(By.xpath("//h2[starts-with(@class,'dds__h2 dds__mb')]"));               //STARTS with
		DellSupport.click();
		
		
		
	}

}
