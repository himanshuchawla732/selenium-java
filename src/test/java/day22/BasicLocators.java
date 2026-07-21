package day22;

import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
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
				
				//Locators 
				
				//By name
				driver.findElement(By.name("Username")).sendKeys("NalashaaIsActive");
				driver.findElement(By.name("Password")).sendKeys("Admin@123");
				//By id
				driver.findElement(By.id("next")).click();
				//By linkText
				driver.findElement(By.linkText("OrangeHRM, Inc")).click();
				//By partialLinkText
				driver.findElement(By.partialLinkText("RM, I")).click();
				//By className
				List<WebElement> navLinks = driver.findElements(By.className("nav-link"));
				System.out.println(navLinks.size());
				//By tagName
				List<WebElement> atags = driver.findElements(By.tagName("a"));
				System.out.println(atags.size());
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				//3. close browser
				// driver.quit();
				//driver.close();

	}

}
