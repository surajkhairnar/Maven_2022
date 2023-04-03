package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Chrome_Options {

	public static void main(String[] args) 
	{
		//FirefoxOptions options=new FirefoxOptions();            // ....We can also use Firefox Driver
		ChromeOptions options=new ChromeOptions();            //...........................FirstLine
		options.addArguments("start-maximized");              // ...........................Second Line(MAXIMIZE WINDOW)
		//options.addArguments("--incognito");                  // ...........................Second Line (FOR INCOGNITO MODE)
	  //options.addArguments("--headless");                   //............................Second Line(For Background Operation or only result found window not seen) It saves Memory
		//options.addArguments("window-size=280,653");         // ............................TO SET WINDOW SIZE
		options.addArguments("--disable-notifications");     // ............................TO DISABLE POP-UP OR NOTIFICATIONS
		
		WebDriver driver=new ChromeDriver(options);
		//WebDriver driver=new FirefoxDriver(options);
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

	}

}
