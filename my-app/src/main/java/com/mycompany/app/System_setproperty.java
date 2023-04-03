package com.mycompany.app;

public class System_setproperty 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");  // This method of"System.setProperty" used in Previus versions of Selenium for call URL
        //System.setProperty("webdriver.edge.driver", "Path");
        //System.setProperty("webdriver.gecko.driver", "Path");     // Firefox called gecko
	}

}
