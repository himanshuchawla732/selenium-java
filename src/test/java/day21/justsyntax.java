package day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class justsyntax {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//1.start browser 
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. open url
		String url = "https://qa.eclipseehrcloud.net/";
		driver.get(url);
		
		
		//4. locate elemend and sendskeys
		driver.findElement(By.id("UserId")).sendKeys("NalashaaIsActive");
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.id("next")).click();
		
		//3. close browser
		// driver.quit();
		//driver.close();

	}

}
