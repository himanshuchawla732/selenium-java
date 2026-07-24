package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlerthandleWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();
				
				//maximize window
				driver.manage().window().maximize();
				
				// introducing wait
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//explicit wait declaration
				WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(10));
				
				//2. open url
				String url = "https://the-internet.herokuapp.com/javascript_alerts";
				driver.get(url);
				
				driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
				Thread.sleep(5000);
				
				//explicit wait is used here
				Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
				System.out.println(myalert.getText());
				myalert.accept();

	}

}
