package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesIFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ui.vision/demo/webtest/frames");
		
		//WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		//main page to frame 1 switch
		//switch using (index , name , WebElement)
		//find xpath of frame 1
		//driver.switchTo().frame(0);//by index
		
		WebElement Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));//by WebElement
		driver.switchTo().frame(Frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("frame1 typing test");
		
		
		
		//back to main page
		//coz can't jump from one to another
		//mainpage to another frame , everytime
		driver.switchTo().defaultContent();
		
		
		
		//find xpath of frame 2
		WebElement Frame2 = driver.findElement(By.xpath("//frameset/frame[@src='frame_2.html']"));//by WebElement
		driver.switchTo().frame(Frame2);
		driver.findElement(By.xpath("//form/div/input[@name='mytext2']")).sendKeys("frame2 typing test");
		
		
		//back to main page
		//coz can't jump from one to another
		//mainpage to another frame , everytime
		driver.switchTo().defaultContent();
		
		
		//iframe inside frame 3
		WebElement Frame3 = driver.findElement(By.xpath("//frameset/frame[@src='frame_3.html']"));//by WebElement
		driver.switchTo().frame(Frame3);
		driver.findElement(By.xpath("//form/div/input[@name='mytext3']")).sendKeys("frame3 typing test");
		
		
		//now here we need to switch into iframe
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i9'] //div[@class='AB7Lab Id5V1']")).click();
		driver.findElement(By.xpath("//div[@id='i27'] //div[@class='uHMk6b fsHoPb']")).click();
		driver.findElement(By.xpath("//div[@class='lRwqcd'] //span[@class='NPEfkd RveJvd snByac']")).click();
		
		
		//now back to main page this will always take to TOP Page
		driver.switchTo().defaultContent();

		//frame 5
		WebElement Frame5 = driver.findElement(By.xpath("//frameset/frame[@src='frame_5.html']"));//by WebElement
		driver.switchTo().frame(Frame5);
		driver.findElement(By.xpath("//form/div/input[@name='mytext5']")).sendKeys("frame5 typing test");
		driver.findElement(By.linkText("https://a9t9.com")).click();
		System.out.println("lofo displayed -> " + driver.findElement(By.xpath("//img[@class='responsive-img']")).isDisplayed());
		
		
		
		

	}

}
