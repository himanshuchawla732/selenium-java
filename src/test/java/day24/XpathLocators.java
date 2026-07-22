package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {

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
		
		//Xpath
		//Absolute and Relative 
		// most of the time Relative Xpath hi use honge 
		//abs. xpath syntax- /html/body/header/div[1]/div[5]/div[2]/div/input
		//relative xpath syntax - //tagname[@attribute='value']
		
//		driver.findElement(By.xpath("//a[@id=\"reports\"]")).click();
//		driver.findElement(By.xpath("//i[@class=\"fa fa-line-chart\"]")).click();
		
		driver.findElement(By.xpath("//img[@src=\"../img/Plus.svg\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"1\"]/div/label")).click();
		
		
		
		
		
		
		
		
		
		
	}

}
