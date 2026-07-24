package day29;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandleing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		// such kind of sites , takes username and password in link only 
		//so open the link with this username and password
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
