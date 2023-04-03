package com.mycompany.app;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Class_Mouse {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Actions act=new Actions(driver);
		
		WebElement Doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickme=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement Clickme=driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		WebElement DynamicProp=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		act.moveToElement(DynamicProp).perform();
		
		act.doubleClick(Doubleclick).perform();
		act.contextClick(RightClickme).perform();
		act.click(Clickme).perform();
		
		driver.get("https://demoqa.com/droppable");
		
		WebElement Dragable=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Dropable=driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div"));
		act.dragAndDrop(Dragable, Dropable).perform();
		
		driver.get("https://demoqa.com/menu");
		
		WebElement Menu1=driver.findElement(By.xpath("//a[text()='Main Item 1']"));
		WebElement Menu2=driver.findElement(By.xpath("//a[text()='Main Item 2']"));
		WebElement Menu3=driver.findElement(By.xpath("//a[text()='Main Item 3']"));
		WebElement SubSubList = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
		
		act.moveToElement(Menu1).perform();
		act.moveToElement(Menu3).perform();
		act.moveToElement(Menu2).perform();
		act.moveToElement(SubSubList).perform();
		
		

	}

}
