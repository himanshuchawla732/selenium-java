package day33;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablewithPagination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find table
		//lets get all the elements of the table
		//get all the rows of the table
//		List<WebElement> rows = driver.findElements(By.xpath("(//div[@class='table-container']//tbody/tr)"));
//		int rowCount = rows.size();
//		for(int i=1;i<=rowCount;i++) {
//			//get all the columns of the table
//			List<WebElement> cols = driver.findElements(By.xpath("(//div[@class='table-container']//tbody/tr["+i+"]/td)"));
//			int colCount = cols.size();
//			for(int j=1;j<colCount;j++) {
//				String cellValue = driver.findElement(By.xpath("(//div[@class='table-container']//tbody/tr["+i+"]/td["+j+"])")).getText();
//				System.out.print(cellValue+" ");
//			}
//			System.out.println();
//		}
		//pagination
		//total pages
		List<WebElement> pages = driver.findElements(By.xpath("//div[@class='table-container']//ul[@class='pagination']/li"));
		int pageCount = pages.size();
		for(int p=1;p<=pageCount;p++) {
			driver.findElement(By.xpath("//ul[@class='pagination']/li["+p+"]/a")).click();
			//get all the rows of the table
			List<WebElement> rows1 = driver.findElements(By.xpath("(//div[@class='table-container']//tbody/tr)"));
			int rowCount1 = rows1.size();
			for(int i=1;i<=rowCount1;i++) {
				//get all the columns of the table
				List<WebElement> cols1 = driver.findElements(By.xpath("(//div[@class='table-container']//tbody/tr["+i+"]/td)"));
				int colCount1 = cols1.size();
				for(int j=1;j<colCount1;j++) {
					String cellValue = driver.findElement(By.xpath("(//div[@class='table-container']//tbody/tr["+i+"]/td["+j+"])")).getText();
					System.out.print(cellValue+" ");
				}
				System.out.println();
			}
		}

	}

}
