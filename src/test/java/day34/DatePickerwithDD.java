package day34;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerwithDD {
	static void Datepicker(WebDriver driver, String date , String month , String year)
	{

		//
		//logic of date , past or future
		//using hashmap month , create month obj of string months
		//compare current and expected month and year , then select the currect one i.e. expected
		//select year

		List<WebElement> yearoptions = driver.findElements(By.xpath("//select[@class='ui-datepicker-year']/option"));
		

		Select yearDrop = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		yearDrop.selectByVisibleText(year);

		Select monthDrop = new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		monthDrop.selectByVisibleText(month);

		
//		for(WebElement y:yearoptions)
//		{
//			if(y.getText().equals(year))
//			{
//				y.click();
//				break;
//			}
//		}
//		//select month
//
//		List<WebElement> monthoptions = driver.findElements(By.xpath("//select[@class='ui-datepicker-month']/option"));
//		for(WebElement m:monthoptions)
//		{
//			if(m.getText().equals(month))
//			{
//				m.click();
//				break;
//			}
//		}
		//select date
		
		driver.findElement(By.xpath("//tbody//td/a[text()='"+date+"']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on calender icon
		driver.findElement(By.xpath("//input[contains(@class,'Datepicker')]")).click();
		//
		//expected date
		String expectedyear = "2025";
		String expectedmonth = "Dec";
		String expecteddate = "11";
		
		Datepicker(driver,expecteddate,expectedmonth,expectedyear);
		
		
		

	}

}
