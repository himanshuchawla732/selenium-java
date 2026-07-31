package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ScrollPagedemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Scroll down the page by 1000 pixels
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
		
		
		
		
		
	}

}
