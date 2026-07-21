package day23;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//CSS Selectors
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
		
		//CSS Selectors -Tag+[ID,Class,Attribute, ID+Class]
		//Tag+ID
//		driver.findElement(By.cssSelector("a#scheduler")).click();
		//Tag+Class
//		List<WebElement> hims = driver.findElements(By.cssSelector("li.nav-item"));
//		System.out.println(hims.size());
		//Tag+Attributes
		//driver.findElement(By.cssSelector("tag[attribute='value']")).click();
//		driver.findElement(By.cssSelector("a[id='reports']")).click();
		//Tag+ID+Class
		//driver.findElement(By.cssSelector("tag#idvalue.classvalue")).click();
//		driver.findElement(By.cssSelector("a#scheduler.nav-item")).click();
		
		
	}

}
