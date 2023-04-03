package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_get_multiple 
{

	public static void main(String[] args) 
	{
		WebDriver ff=new ChromeDriver();
		
		String google="https://www.google.com";
		
		ff.get("https://www.facebook.com");
		ff.get("https://www.amazon.com");
		ff.get("https://www.myntra.com");
		ff.get(google);

	}

}
