package day38;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		File file = new File(System.getProperty("user.dir") + "//crx//SelectorsHub.crx");
		options.addExtensions(file);//this is how we add extensions to chrome browser
		//version mismatch so extension is not added to the chrome
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
		driver.get("https://www.google.com");

		
	}

}
