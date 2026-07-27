package day31;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Bootstrapdd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		//finding and clicking dd element
		WebElement tutorials= driver.findElement(By.xpath("//button[@id='menu1']"));
		tutorials.click();
		//getting all the options
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='menu']//li[@role='presentation']"));
		System.out.println(options.size());
		//get all options name 
		for(int i=0 ; i<options.size(); i++) 
		{
			System.out.println(options.get(i).getText());
		}
		//choose any one 
		for(WebElement op:options)
		{
			if(op.getText().equals("JavaScript"))
			{
				op.click();
				break;
			}
		}
		

	}

}
