package day38;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;


public class TakeScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//just like javascript executer we can take screenshot in selenium using TakesScreenshot interface
		TakesScreenshot ts = (TakesScreenshot) driver;
		//full page ss
//		File fullpage =ts.getScreenshotAs(OutputType.FILE);
//		File dest = new File(System.getProperty("user.dir") + "/screenshots/fullpage.png");
//		fullpage.renameTo(dest);
				
		//particular area ss
		WebElement footer = driver.findElement(By.xpath("//div[@data-sfe='false']"));
		File footerarea = footer.getScreenshotAs(OutputType.FILE);
		File dest1 = new File(System.getProperty("user.dir") + "/screenshots/footerarea.png");
		footerarea.renameTo(dest1);
		
		//particular element ss
		WebElement logo = driver.findElement(By.cssSelector("svg[aria-label='Google']"));
		File logoarea = logo.getScreenshotAs(OutputType.FILE);
		File dest2 = new File(System.getProperty("user.dir") + "/screenshots/logoarea.png");
		logoarea.renameTo(dest2);
		
		
	}

}
