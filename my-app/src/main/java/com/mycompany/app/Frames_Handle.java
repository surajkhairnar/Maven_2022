package com.mycompany.app;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Handle 
{
	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();                 //................1st Step
		driver.get("https://demoqa.com/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		WebElement Frame_1=driver.findElement(By.xpath("//iframe[@id='frame1']"));    //......4th Step call Frame by using WEBELEMENT
		//driver.switchTo().frame(Frame_1);
		
		//driver.switchTo().frame(4);                            //......5th Step call Frame by using INDEX but generally avoid it used only where no adds found.
		
		driver.switchTo().frame("frame1");                        //..........................3rd Step call Frame by using ID or NAME
		WebElement Frame1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));   //.....2nd Step
		System.out.println(Frame1.getText());
		
		driver.switchTo().parentFrame();                                        //....8th Step Sitch from one Frame to another..before start of every new frame use this before it.
		
		driver.switchTo().frame("frame2");                                             //.....7th Step call Frame-2 by using ID or NAME
		WebElement Frame2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));   //.....6th Step
		System.out.println(Frame2.getText());
		
	}

}
