package day38;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class SSLHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		//this will allow us to accept the insecure certificate and continue with the test
		options.setAcceptInsecureCerts(true); //without this line, we will get an error when we try to access the website with expired certificate
		
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		driver.manage().window().maximize();
		
		
		
		

	}

}
