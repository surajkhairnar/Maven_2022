package com.mycompany.app;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_New_Window {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String MainWindow= driver.getWindowHandle();
		
		
		WebElement Services= driver.findElement(By.xpath("//div[text()='Services']"));
		Services.click();
		
		WebElement Remote=driver.findElement(By.xpath("//span[text()='Remote']"));
		Remote.click();
		
		WebElement MNC=driver.findElement(By.xpath("//span[text()='MNC']"));
		MNC.click();
		
		Set<String> ChildWindows= driver.getWindowHandles();
		for(String ChildWindow : ChildWindows)
		{
			if(!MainWindow.equalsIgnoreCase(ChildWindow))
			{
				driver.switchTo().window(ChildWindow);
				if(driver.getTitle().contains("Resume Writing Services - CV - Bio data | Naukri Fastforward"))
				{
					WebElement KnowMore=driver.findElement(By.xpath("//div[text()='PRIORITY APPLICANT']//following-sibling::div[text()='KNOW MORE']"));
					KnowMore.click();
				}
				else
				{
					System.out.println(driver.getTitle());
				}
			}
			driver.switchTo().window(MainWindow);
		}
		
		//driver.close();
		driver.quit();
		
		

	}

}
