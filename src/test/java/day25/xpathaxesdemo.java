package day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathaxesdemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. open url
		String url = "https://qa.eclipseehrcloud.net/";
		driver.get(url);
		
		//Locators 
		
		//By name
		driver.findElement(By.name("Username")).sendKeys("NalashaaIsActive");
		driver.findElement(By.name("Password")).sendKeys("Admin@123");
		//By id
		driver.findElement(By.id("next")).click();
		
		
		//
		

	}

}
