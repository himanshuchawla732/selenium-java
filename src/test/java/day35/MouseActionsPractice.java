package day35;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vinothqaacademy.com/mouse-event/");
		
		
		//Actions
		//mouse actions
		
		//first of all set up Actions class
		Actions act = new Actions(driver);
		//double click a element
		WebElement DCbtn= driver.findElement(By.xpath("//section/button[@id='doubleBtn']"));
		act.doubleClick(DCbtn).perform();
		
		//right click a element
		WebElement RCbtn= driver.findElement(By.xpath("//section/button[@id='rightBtn']"));
		act.contextClick(RCbtn).perform();
		List<WebElement> RCbtnoptions= driver.findElements(By.xpath("//div[@id='contextMenu']/button"));
		for(WebElement RCbtnoption:RCbtnoptions)
		{
			if(RCbtnoption.getText().equals("Copy"))
			{
				RCbtnoption.click();
			}
		}
		
		//drag and drop
		WebElement drag= driver.findElement(By.xpath("//div[@id='dragItem']"));
		WebElement drop= driver.findElement(By.xpath("//div[@id='dropZone']"));

		act.dragAndDrop(drag, drop).build().perform();
		
		//hover
		WebElement hoverbtn= driver.findElement(By.xpath("//div[@id='tooltipTarget']"));
		act.moveToElement(hoverbtn).perform();
		String hoverstatus = driver.findElement(By.xpath("//div/span[@id='tooltipStatus']")).getText();
		System.out.println(hoverstatus);
		
		//USE getAttribute to get the value of a key inside any tag
		
		
	}

}
