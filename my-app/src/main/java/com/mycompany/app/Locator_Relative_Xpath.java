package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Relative_Xpath 
{
	public static void main (String args[]) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		//WebElement All=driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']"));    // Relative x-path
		//All.click();
		
		//WebElement Signinex=driver.findElement(By.xpath("//a[@class='a-button-text']"));   // 1)Relative x-path or Basic x-path
		//Signinex.click();
		
		//WebElement dressshopnow=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[6]/div/div[3]/a"));   // Full Xpath
		//dressshopnow.click();
		
		//WebElement MakeYourLifeBook=driver.findElement(By.xpath("//img[contains(@alt,'Make Your')]"));    // 2)Contains method
		//MakeYourLifeBook.click();
		
		//WebElement cust=driver.findElement(By.partialLinkText("Sell"));   
		//cust.click();
		
		WebElement returnsorder= driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute' and @id='nav-orders']")); // By AND Method
		returnsorder.click();
		
	
	}

}
