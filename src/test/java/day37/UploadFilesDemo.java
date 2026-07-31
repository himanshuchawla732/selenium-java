package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFilesDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//upload file has a button , but actually it is a input button
		//in input we have to use sendkeys and the exact location of our file i.e. path/repo
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/upload");
		
		
		WebElement uploadbtn = driver.findElement(By.xpath("//input[@id='fileInput']"));
		uploadbtn.sendKeys("D:\\testss1.png");
		
//		JavascriptExecutor jsexc = (JavascriptExecutor)driver;
//		jsexc.executeScript("arguments[0].value='D:\\testss1.png';",uploadbtn);
		
		

	}

}
