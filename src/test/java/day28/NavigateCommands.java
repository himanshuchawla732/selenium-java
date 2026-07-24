package day28;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommands {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		// introducing wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//2. open url
//		String url = "https://qa.eclipseehrcloud.net/";
//		driver.get(url);
		
		//2. navigate url
		URL myurl = new URL("https://opensource-demo.orangehrmlive.com/");
		driver.navigate().to(myurl);
		
		//Locators 
		
		//By name
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//By id
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		// navigate methods
		//navigate backward
//		driver.navigate().back();
//		//navigate forward
//		driver.navigate().forward();
//		//navigate for refreshing
//		driver.navigate().refresh();

		
//		Set<String> idsh = driver.getWindowHandles();
//		System.out.println(idsh);
//		
//		for(String oneid : idsh)
//		{
//			System.out.println("This Browser's id is "+oneid);
//		}
		
		
		Set<String> idset = driver.getWindowHandles();
		List<String> idlist = new ArrayList<String>(idset);
		
		for (String browseridis:idlist)
		{
			System.out.println(browseridis);
		}
		
		String pids= idlist.get(0);
		String cids = idlist.get(1);
		
		driver.switchTo().window(cids);
		driver.switchTo().window(pids);
		driver.close();
		
		

	}
}
