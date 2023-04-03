package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_LinkText_PartialLinkText 
{

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//WebElement ForgottPass= driver.findElement(By.linkText("Forgotten password?"));
		//ForgottPass.click();
		
		//WebElement Createapage= driver.findElement(By.linkText("Create a Page"));
		//Createapage.click();
		
		//WebElement contactuploding=driver.findElement(By.partialLinkText("Contact"));
		//contactuploding.click();
		
		//WebElement places=driver.findElement(By.linkText("Places"));
		//places.click();
		
		WebElement Votinginformationcentre=driver.findElement(By.partialLinkText("Voting"));
		Votinginformationcentre.click();
		
		

	}

}
