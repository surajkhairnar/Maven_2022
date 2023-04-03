package com.mycompany.app;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locator_Css_Combining 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement Email=driver.findElement(By.cssSelector("input.inputtext._55r1._6luy#email[name='email']")); //Combination of TagName+Class+ID+Name
		Email.sendKeys("surajkhairnar@gmail.com");
		
		WebElement Password= driver.findElement(By.cssSelector("div._6lux>div>input._9npi"));  // (Parent+class)+Child+(2nd Child+Class)
		Password.sendKeys("123456");
		
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/reg/");
		
		//driver.findElement(By.cssSelector("select#day>option:nth-of-type(19)")).click();      //Parent>Cild:nth-of-type(index)
		//driver.findElement(By.cssSelector("select#month>option:nth-of-type(3)")).click();     //Parent>Cild:nth-of-type(index)
		//driver.findElement(By.cssSelector("select#year>option:nth-of-type(38)")).click();     //Parent>Cild:nth-of-type(index)
		
		WebElement FirstName=driver.findElement(By.cssSelector("input[name^='fir']"));
		FirstName.sendKeys("Suraj");
		
		WebElement Mobile=driver.findElement(By.cssSelector("input[name$='email__']"));
		Mobile.sendKeys("9403589847");
		
		WebElement NewPassword=driver.findElement(By.cssSelector("input[id*='_step_']"));
		NewPassword.sendKeys("123456");
		
		
		Select day=new Select(driver.findElement(By.id("day")));                    //Select Method
		day.selectByIndex(18);
		//day.selectByValue("30");
		//day.selectByVisibleText("12");
		
		Select month=new Select(driver.findElement(By.id("month")));               //Select Method
		month.selectByIndex(2);
		//month.selectByValue("30");
		//month.selectByVisibleText("Sep");
		
		Select year=new Select(driver.findElement(By.id("year")));                //Select Method
		//year.selectByIndex(37);                  
		//year.selectByValue("1986");
		year.selectByVisibleText("1986");
		
		
	
		WebElement Male=driver.findElement(By.cssSelector("input[value='2']"));
		Male.click();
		
		

	}

}
