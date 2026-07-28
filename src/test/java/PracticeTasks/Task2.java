package PracticeTasks;


import java.util.List;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Task2 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		//open chrome
		WebDriver driver = new ChromeDriver();
		//maximize window
		driver.manage().window().maximize();
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicit wait
		//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
		
		Thread.sleep(5000);
		
		//check logo
		WebElement logo = driver.findElement(By.xpath("//div/img[@class='logo']"));
		System.out.println("is logo displayed : "+logo.isDisplayed());	
		//COUNT links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are : "+links.size());
		//click on add patient
//		driver.findElement(By.xpath("//button/img[contains(@src,'Plus.svg')]")).click();
//		driver.findElement(By.xpath("//li[@aria-label='Add new patient']/div/label")).click();
//		//filling patient details
//		//------->
//		//name
//		driver.findElement(By.xpath("//input[@id='m_patientInfoDTO.FirstName']")).sendKeys("HimsAutomation");
//		driver.findElement(By.xpath("//input[@id='m_patientInfoDTO.LastName']")).sendKeys("HimsAutomation");
//		//gender
//		driver.findElement(By.xpath("//span[@class='e-input-group-icon e-ddl-icon e-icons']")).click();
//		driver.findElement(By.xpath("//li[@data-value='M']")).click();
//		//DOB
//		//here use Keys.HOME to take pointer in start
//		driver.findElement(By.xpath("//div/input[contains(@id,'mask-')]")).sendKeys(Keys.HOME,"11112001");
//		//save
//		//driver.findElement(By.xpath("//button[@type='submit']/span")).click();
		
		//going to patient list and a particular patient
		WebElement AutoHims = driver.findElement(By.xpath("//td[@aria-colindex='1']//span[@title='AutoHims']"));
		//used for double click
		Actions actions = new Actions(driver);
		actions.doubleClick(AutoHims).perform();
		//click on legder
		driver.findElement(By.xpath("//img[contains(@src,'Ledger')]")).click();
		//click on plus icon
		driver.findElement(By.xpath("//button[@id='AddService']/i")).click();
//		Thread.sleep(2000);
		
		
		
		//search for patient
		//add clear button
		
		
		
		
		
		
		//xpath axes 
		//explicit wait
		//assertion
		
		
		
		
		
		
		//selecting procedural codes just by rowindex
		int rownumber = 1;
		for(int i=0; i<3; i++)
		{
			driver.findElement(By.xpath("//div[@class='row topnav']//tr[@aria-rowindex='"+rownumber+"']//span[contains(@class,'e-icons e-frame')]")).click();
			rownumber++;
		}
		//driver.findElement(By.xpath("//tr[@aria-rowindex='2']//span[contains(@class,'e-icons e-frame')]")).click();
		//driver.findElement(By.xpath("//tr[@aria-rowindex='3']//span[contains(@class,'e-icons e-frame')]")).click();
		//tbody[@role='rowgroup']//td[@tabindex='0']//label[@aria-label='checkbox']//span[contains(@class,'e-icons e-frame')]
		//click on select services button
		
		
		driver.findElement(By.xpath("(//button[@class='e-control e-btn e-lib sf-blue-oval-button'])[1]")).click();
		//add provider
//		driver.findElement(By.xpath("(//button/span[@class='fa fa-plus-square-o e-btn-icon'])[2]")).click();
//		driver.findElement(By.xpath("//div[contains(@class,'e-dialog e-lib pop-up-comp2')]//tr[@aria-rowindex='1']//span")).click();
//		driver.findElement(By.xpath("//button[text()='OK']")).click();
//		// add 3 in index to move to next provider
//		driver.findElement(By.xpath("(//button/span[@class='fa fa-plus-square-o e-btn-icon'])[5]")).click();
//		driver.findElement(By.xpath("//div[contains(@class,'e-dialog e-lib pop-up-comp2')]//tr[@aria-rowindex='1']//span")).click();
//		driver.findElement(By.xpath("//button[text()='OK']")).click();
		//using for loop to add all the providers in the list
		int index = 2;
		for (int i=1; i<=rownumber; i++)
		{
			driver.findElement(By.xpath("(//button/span[@class='fa fa-plus-square-o e-btn-icon'])["+index+"]")).click();
			driver.findElement(By.xpath("//div[contains(@class,'e-dialog e-lib pop-up-comp2')]//tr[@aria-rowindex='1']//span")).click();
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			index = index + 3;
		}
		//
		driver.findElement(By.xpath("(//button/i[@class='fa fa-save'])[2]")).click();
		//(//span/input[@aria-readonly='true'])[4]
				
		//click on save		
		driver.findElement(By.xpath("(//button[@class='e-control e-btn e-lib sf-blue-oval-button'])[2]")).click();
		//click on print
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='Print']")).click();
		driver.findElement(By.xpath("//button[text()='Create/Print']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.findElement(By.xpath("//button[text()='Create/Print']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();

		
		
		
		
		
		
	}

}
