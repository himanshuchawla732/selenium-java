package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDD {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//ul[@role='listbox']//li//div[@role='option'])[4]")).click();
		//this will click on the 4th suggestion in the auto-suggest dropdown
		
	}
}