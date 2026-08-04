package day38;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HeadlessTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Headless Testing
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new");    //comment this line ang GUI will be visible again
		// ⭐ MUST pass options into driver, or setting is IGNORED!
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
