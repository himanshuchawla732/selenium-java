package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDatePicker 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//jquery date picker
		//https://jqueryui.com/datepicker/
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//
		driver.switchTo().frame(0);
		//click on date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		//select date from date picker
		//first store the date
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String date = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td/a")).getText();
		//
		//print the displayed date
		// here the displayed date is having other class i.e. highlighted date
//		String highlightedDate = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td/a[contains(@class,'highlight')]")).getText();
//		System.out.println("Displayed date is: " + highlightedDate + "-" + month + "-" + year);
		
		
		//for past date 
		//click on previous button
		//take input from user for date, month and year
//		String inputDate = "15";
//		String inputMonth = "August";
//		String inputYear = "2023";
//		
//		
//		if(!year.equals(inputYear) || !month.equals(inputMonth)) 
//		{
//			while (!year.equals(inputYear) || !month.equals(inputMonth)) 
//			{
//				WebElement prev=driver.findElement(By.xpath("//a[@data-handler='prev']"));
//				prev.click();
//				year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//				month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			}
//			//now select the date
//			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td/a[text()='" + inputDate + "']")).click();	
//		}
		
		
		
		//for future date
		//click on next button
		//take input from user for date, month and year
//		String inputDate1 = "15";
//		String inputMonth1 = "August";
//		String inputYear1 = "2027";
//		
//		if(!(year.equals(inputYear1)) || !(month.equals(inputMonth1))) 
//		{
//			while (!year.equals(inputYear1) || !month.equals(inputMonth1)) 
//			{
//				WebElement next=driver.findElement(By.xpath("//a[@data-handler='next']/span"));
//				next.click();
//				year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//				month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			}
//			//now select the date
//			driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody//td/a[text()='" + inputDate1 + "']")).click();	
//		}

	}
	
}