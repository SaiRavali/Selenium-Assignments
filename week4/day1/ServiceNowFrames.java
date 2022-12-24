package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ServiceNowFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//disable notifications

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		
		// Launch the service now URL
		driver.get("https://dev110326.service-now.com/");

		//1. switchTo() frame using ID /Name

		driver.switchTo().frame("gsft_main");

		//2. Enter username

		driver.findElement(By.id("user_name")).sendKeys("admin");

		//3. Enter password

		driver.findElement(By.id("user_password")).sendKeys("India@123");

		//4. Click Login button

		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		System.out.println(driver.getTitle());

	}

}











