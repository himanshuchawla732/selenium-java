package day36;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//getLocation for getting coordinate of source(x,y)
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
//		driver.get("https://text-compare.com/");
//		//
//		WebElement text1 = driver.findElement(By.xpath("//textarea[@id='inputText1']"));
//		WebElement text2 = driver.findElement(By.xpath("//textarea[@id='inputText2']"));
//		//sendkeys
//		text1.sendKeys("dum dum tyadyau");
//		//ctrl A
//		Actions act = new Actions(driver);
//		act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
//		//ctrl C
//		act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();
//		// Tab to change to text area 2
//		act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
//		//ctrl V
//		act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();
//		//
//		//compare click
//		driver.findElement(By.xpath("//div[text()='Compare!']")).click();
		
		
		
		
//		driver.get("https://demo.nopcommerce.com/");
//		//get Actions class
//		Actions act = new Actions(driver);
//		WebElement regpg = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
//		//ctrl + click open the link in new tab
//		act.keyDown(Keys.CONTROL).click(regpg).keyUp(Keys.CONTROL).perform();
//		//get the window ids
//		List<String> ids = new ArrayList(driver.getWindowHandles());
//		driver.switchTo().window(ids.get(1));
		
		
		
		
		
		
		
		driver.get("https://text-compare.com/");
		//open a new tab and than open this link
		driver.switchTo().newWindow(WindowType.TAB);
		//this link will opwn in new tab
		driver.get("https://demo.nopcommerce.com/");
		
		
//	
	}

}
