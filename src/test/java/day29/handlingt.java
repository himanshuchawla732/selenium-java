package day29;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingt {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. open url
		String url = "https://testautomationpractice.blogspot.com/";
		driver.get(url);
		
		//2. navigate url
//		URL myurl = null;
//		try {
//			myurl = new URL("https://opensource-demo.orangehrmlive.com/");
//		} catch (MalformedURLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver.navigate().to(myurl);
		
		//Locators 
		
		//By name
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.id("next")).click();
		//By id
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
//		for (WebElement checkbox:checkboxes)
//		{
//			checkbox.click();
//		}
		//select lasst 3 checkbox dynamically
		for(int i=checkboxes.size() - 1 ;i>checkboxes.size()-4 ; i--)
		{
			checkboxes.get(i).click();
		}
		


	}

}
