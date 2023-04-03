package com.mycompany.app;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFrom_congigeration_Properties {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Selenium_september_2022\\configeration.properties"); // ...1st step to call conf.file
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver=new ChromeDriver();    //..2nd step to call the webdriver by using "Key"
		driver.get(prop.getProperty("testurl"));
		
		WebElement Emailaddress=driver.findElement(By.xpath("//input[@id='email']"));  //...3rd inter username
		Emailaddress.sendKeys(prop.getProperty("username"));
		
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));    //....4th inter password
		password.sendKeys(prop.getProperty("password"));
		
		WebElement login=driver.findElement(By.tagName("button"));
		login.click();
		
		
		
		
		
		

	}

}
