package com.mycompany.app;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdge {

	public static void main(String[] args) {
		
		WebDriver driver=new EdgeDriver();
		driver.get("https:\\www.facebook.com");

	}

}
