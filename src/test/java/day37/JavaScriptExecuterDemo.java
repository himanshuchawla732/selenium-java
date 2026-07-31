package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sometimes click and sendkeys throw elemenetINTERCEPTED..or ElementNotInteractableException error , to handle this we use jsexc
		//know the inheritance and typecasting
		//
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//jsexc sendkeys
		JavascriptExecutor jsexc = (JavascriptExecutor) driver;
		WebElement namefield = driver.findElement(By.xpath("//input[@id='name']"));
		jsexc.executeScript("arguments[0].value='Hims';",namefield);
		
		//jsexc click
		WebElement toglbtn = driver.findElement(By.xpath("//button[@onclick='toggleButton(this)']"));
		jsexc.executeScript("arguments[0].click();",toglbtn);
		
		//
		
		//Highlight an Element
		jsexc.executeScript("arguments[0].style.border ='3px solid red'", namefield);	
				
		//Scroll to Element
		WebElement footerlinks= driver.findElement(By.xpath("//div/h2[text()='Footer Links']"));
		jsexc.executeScript("arguments[0].scrollIntoView(true)", footerlinks);
				
		//Methods/interfaces of parent are NOT directly available in child.
		//Get Title
		String title = (String) jsexc.executeScript("return document.title");
		System.out.println(title);
					

	}

}
