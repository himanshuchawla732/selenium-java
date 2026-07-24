package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertss {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. open url
		String url = "https://the-internet.herokuapp.com/javascript_alerts";
		driver.get(url);
		
		//alert 1.
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		
		//alert 2.
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(5000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
//		myalert.accept();
		myalert.dismiss();
		
		
		//alert 3.
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(5000);
		Alert malert = driver.switchTo().alert();
		malert.sendKeys("dum dum tydyauuuu");
		malert.accept();
		
		

	}

}
