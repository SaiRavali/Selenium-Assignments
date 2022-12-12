package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class LaunchApplication {

	public static void main(String[] args) {
		
		// To open a browser (Chrome)
		
		ChromeDriver driver = new ChromeDriver();
		// SafariDriver driver1= new SafariDriver();
		
		//To load the application URL
		
	driver.get("https://facebook.com/");
	//driver1.get("https://facebook.com/");
		
		
	}

}
