package day33;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableWithPaginationHavingBootstrap {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
		URL myurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(myurl);
		
		//Locators 
		
		//By name
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		//By id
//		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//go to PIM page
		driver.findElement(By.xpath("//nav[@aria-label='Sidepanel']//ul//a[contains(@href,'Pim')]")).click();

		//go to pages
		////make sure proper indexing is used for this
		int pageCount = driver.findElements(By.xpath("//ul[@class='oxd-pagination__ul']//button[@class='oxd-pagination-page-item oxd-pagination-page-item--page']")).size();
		for (int i = 1; i <= pageCount; i++) {
			String pageXpath = "(//ul[@class='oxd-pagination__ul']//button[@class='oxd-pagination-page-item oxd-pagination-page-item--page'])["+i+"]";
			driver.findElement(By.xpath(pageXpath)).click();
			int rowCount = driver.findElements(By.xpath("((//div[@role='rowgroup'])[2]//div[@role='row'])")).size();
			for (int j = 1; j <= rowCount; j++) {
				String rowXpath = "((//div[@role='rowgroup'])[2]//div[@role='row'])["+j+"]";
				for (int k = 1; k <= 5; k++) {
					String cellXpath = rowXpath+"/div[@role='cell']["+k+"]";
					String cellText = driver.findElement(By.xpath(cellXpath)).getText();
					System.out.print(cellText + " | ");
					
					
				}
			}
		}
		
		
	}

}
