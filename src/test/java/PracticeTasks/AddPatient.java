package PracticeTasks;


import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddPatient {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//open chrome
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//2. open url
		String url = "https://qa1.eclipseehrcloud.net/";
		driver.get(url);
		//Locators 
		//login
		//By name
		driver.findElement(By.name("Username")).sendKeys("NalashaaIsActive");
		driver.findElement(By.name("Password")).sendKeys("Admin@123");
		//By id
		driver.findElement(By.id("next")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//check logo
		WebElement logo = driver.findElement(By.xpath("//div/img[@class='logo']"));
		System.out.println(logo.isDisplayed());		
		//click on add patient
		driver.findElement(By.xpath("//button/img[contains(@src,'Plus.svg')]")).click();
		driver.findElement(By.xpath("//li[@aria-label='Add new patient']/div/label")).click();
		//filling patient details
		//------->
		//name
		driver.findElement(By.xpath("//input[@id='m_patientInfoDTO.FirstName']")).sendKeys("HimsAutomation");
		driver.findElement(By.xpath("//input[@id='m_patientInfoDTO.LastName']")).sendKeys("HimsAutomation");
		//gender
		driver.findElement(By.xpath("//span[@class='e-input-group-icon e-ddl-icon e-icons']")).click();
		driver.findElement(By.xpath("//li[@data-value='M']")).click();
		//DOB
		//here use Keys.HOME to take pointer in start
		driver.findElement(By.xpath("//div/input[contains(@id,'mask-')]")).sendKeys(Keys.HOME,"11112001");
		//save
		driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		
		//all mandatory fields are done with save 
		//COUNT links
		
		
		
	}

}
