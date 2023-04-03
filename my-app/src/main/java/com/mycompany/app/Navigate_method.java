package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_method 
{

	public static void main(String[] args) 
	{
		WebDriver dd=new ChromeDriver();
		
		dd.get("https://www.google.com");
		dd.get("https://www.facebook.com");
		dd.get("https://amazon.com");
		dd.navigate().back();                               // This for back to page
		dd.navigate().forward();                            // This for next page
		dd.navigate().refresh();                            // This for refresh page
		dd.navigate().to("https://www.ddindia.com");        // This for url pass
		dd.navigate().to("https://www.myntra.com");         // This for String url pass
		

	}

}
