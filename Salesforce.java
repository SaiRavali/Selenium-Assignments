package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://login.salesforce.com/");
		
		// to maximize the window size
		
		driver.manage().window().maximize();

		// to locate a web element

		WebElement eleUserName = driver.findElement(By.id("username"));

		// Interact with the web element

		eleUserName.sendKeys("hari.radhakrishnan@qeagle.com");
		
		WebElement elePassword = driver.findElement(By.name("pw"));
		
		elePassword.sendKeys("Testleaf$321");
		
		WebElement eleLogin = driver.findElement(By.id("Login"));
		
		eleLogin.click();
		
		// close current window
		
		driver.close();
	}



	}


