package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		String url="https://www.google.com";
		driver.get(url);

	}
	
}