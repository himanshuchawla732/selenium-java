package day36;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getLocation for getting coordinate of source(x,y)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vinothqaacademy.com/mouse-event/");
		//get Actions class
		Actions act = new Actions(driver);
		//slider source
		WebElement slider = driver.findElement(By.xpath("//div[contains(@class,'slider')][@role='slider']"));
		//getLocation
		System.out.println(slider.getLocation()); //(324,1380)
		//this will add x and y axis into current slider
		act.dragAndDropBy(slider, 300, 0).perform();
		System.out.println(slider.getLocation());//(624.1380)
		
		
		
		
		
		
		
		
	}

}
