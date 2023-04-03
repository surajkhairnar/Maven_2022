package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_Handle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement AlertButton=driver.findElement(By.xpath("//button[@id='alertButton']"));
		AlertButton.click();
		driver.switchTo().alert().accept();         //.....Handle Simple Alert 'OK'
		
		WebElement TimerAlertButton=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		TimerAlertButton.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));   //....Timer alerts required Wait
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement ConfirmButton=driver.findElement(By.xpath("//button[@id='confirmButton']"));
		ConfirmButton.click();
		System.out.println(driver.switchTo().alert().getText());   //.......Handle getText 'To print letter before handle Alert' 
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();         //...........Handle Dismiss Alert 'CANCEL'
		
		WebElement PromptButton=driver.findElement(By.xpath("//button[@id='promtButton']"));
		PromptButton.click();
		driver.switchTo().alert().sendKeys("Suraj Khairnar");     //.........Handle SendKey 'To enter words in CheckBox'
		driver.switchTo().alert().accept();

	}

}
