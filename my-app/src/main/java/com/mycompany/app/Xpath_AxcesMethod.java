package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_AxcesMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		WebElement SearchButton=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		SearchButton.sendKeys("Mobiles");
		
		WebElement SearchClick=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchClick.click();
		
		//WebElement OnePlusNord=driver.findElement(By.xpath("//h2[contains(@class,'a-size-mini a-spacing')]//span[contains(text(),'OnePlus Nord N200 | 5G ') ]"));
		//OnePlusNord.click();   //Variable so use generally  text...
		
        WebElement Boy=driver.findElement(By.xpath("//input[@type='checkbox']//following::span[text()='Boys']"));      //Following Method
        Boy.click();   
        
        
       // WebElement Amazon=driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']//following::span[text()='Amazon.com']"));  //Following Method
        //Amazon.click();
        
        
        WebElement Wooden=driver.findElement(By.xpath("//span[contains(text(),'Wooden Baby Crib Mobiles Nut')]"));
        Wooden.click();
        
        
         
        WebElement under=driver.findElement(By.xpath("//span[text()='$25 to $50']"));
        under.click();
        
        WebElement go=driver.findElement(By.xpath("//input[@class='a-button-input']"));
        go.click();
        
	}

}
