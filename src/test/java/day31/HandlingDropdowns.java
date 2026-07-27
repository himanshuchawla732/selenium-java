package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		//simple , SELECT is there in html
		//drpdwn click
		WebElement countryddeles= driver.findElement(By.xpath("//select[@id='country']"));
		countryddeles.click();
		
		//crate options and then select it
		Select countryddop = new Select(countryddeles);
		//1. by visibletext
		//countryddop.selectByVisibleText("Japan");
		//2. by value
		//countryddop.selectByValue("uk");
		//3. by index
		//countryddop.selectByIndex(5);
		
		// now counting total options 
		List<WebElement> countries = countryddop.getOptions();
		System.out.println(countries.size());
		
//		for(WebElement country:countries)
//		{
//			System.out.println(country.getText());
//		}
		for(int i =0 ; i<countries.size() ; i++)
		{
			System.out.println(countries.get(i).getText());
		}
		
		
		
		

	}

}
