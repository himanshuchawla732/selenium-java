package day32;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHnadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/tables");
		
		//now finding table tr and th tags and their xpaths
		WebElement table1 = driver.findElement(By.xpath("//table[@id='table1']"));
		List<WebElement> tableheaders = driver.findElements(By.xpath("//table[@id='table1']//th[@class='header']"));
		List<WebElement> tablerows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
		List<WebElement> tablebodies = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr/td"));
		
		System.out.println(tableheaders.size());//number of columns
		System.out.println(tablerows.size());//number of rows
		System.out.println(tablebodies.size());//number to total elements in table except headers
		
//		for (WebElement header:tableheaders)
//		{
//			System.out.print(header.getText()+"\t");
//		}
//		
//		for (WebElement body:tablebodies)
//		{
//			System.out.print(body.getText()+"\t");
//		}
//		System.out.println();
		
		//finding specific element from rows //imagine matrix
		WebElement rxcspecific = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr[1]/td[1]"));
		System.out.print(rxcspecific.getText()+"\t");
		
		
		
		
		
		//using dynamic values in xpath using "+variable+"
		
//		for(int r = 1; r<=tablerows.size(); r++ )
//		{
//			for(int c=1; c<=tableheaders.size(); c++) 
//			{
//				WebElement rxc = driver.findElement(By.xpath("//table[@id='table1']//tbody/tr["+r+"]/td["+c+"]"));
//				System.out.print(rxc.getText()+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
	}

}
