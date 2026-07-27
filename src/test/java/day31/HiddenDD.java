package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HiddenDD {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//finding and clicking dd element
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
//
		driver.findElement(By.xpath("//li[contains(@class,'oxd-main-menu-item')] //span[text()='PIM']")).click();
		//now finding dd
		//used SelectorHUB for this element
		WebElement jt = driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
		jt.click();
		//now start findinf hidden options
		//use developer mode to make options visible
		//then find best xpaths
		//choose one option
		//driver.findElement(By.xpath("//span[normalize-space()='HR Associate']")).click();
		//find all options loop--
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<WebElement> jtops = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(jtops.size());
		for(WebElement jtop:jtops)
		{
			System.out.println(jtop.getText());
		}

		
		
		
		
	}

}
