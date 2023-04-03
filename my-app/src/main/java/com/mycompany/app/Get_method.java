package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_method 
{

	public static void main(String[] args) 
	{
		WebDriver dd=new ChromeDriver();
		
		//String url="https://www.amazon.com";                 By using String we can call 
		
		//dd.get(url);
		
		dd.get("https://www.google.com");                     // By only "get" we can call url

	}

}
