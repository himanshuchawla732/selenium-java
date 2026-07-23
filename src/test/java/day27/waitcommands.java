package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitcommands {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//2. open url
		String url = "https://qa.eclipseehrcloud.net/";
		driver.get(url);
		
		//Locators 
		
		//By name
		driver.findElement(By.name("Username")).sendKeys("NalashaaIsActive");
		driver.findElement(By.name("Password")).sendKeys("Admin@123");
		//By id
		driver.findElement(By.id("next")).click();
		
		//Thread.sleep(milliseconds);
		
		// actual webdriver waits are 2 (implicit and explicit)
		//implicit wait 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//use it one time just after the window start
		
		//explicitly wait
		//first initialize then use it
		//WebDriverWait myexpwait = new WebDriverWait.(driver, Duration.ofSeconds(time));
		//wait.until(ExpectedConditions.conditionName(parameters));
		
		
	}

}
