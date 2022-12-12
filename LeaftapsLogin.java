package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsLogin {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leaftaps.com/opentaps");

		// to locate a web element

		WebElement eleUser = driver.findElement(By.id("username"));

		// Interact with the web element

		eleUser.sendKeys("DemoSalesmanager");
		
		WebElement elePassword = driver.findElement(By.name("PASSWORD"));
		
		elePassword.sendKeys("crmsfa");
		
		WebElement eleLogin = driver.findElement(By.className("decorativeSubmit"));
		
		eleLogin.click();
		
		driver.quit();
	}

}
