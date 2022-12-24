package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingFrameAndAlert {

	public static void main(String[] args) {


		//disable notifications

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));


		//1. Load https://buythevalue.in/
		driver.get("https://buythevalue.in/");

		//2. Click on first product
		driver.findElement(By.xpath("//a[@class='product-title']")).click();


		//Handle Frame
		//3. Close chat widget

		driver.switchTo().frame(1);

		// For checking purpose just getting the text of the frame

		String frameText = driver.findElement(By.xpath("//div[@class=\"chat-head\"]//following::p")).getText();

		System.out.println(frameText);

		driver.findElement(By.xpath(".//div[@class='initial-message-bubble']//button")).click();

		driver.switchTo().defaultContent();

		//4. Enter the pincode 

		driver.findElement(By.xpath("(//input[@name='wk_zipcode'])")).sendKeys("524002");

		//5. Click on Check

		driver.findElement(By.xpath("//input[@type='button']")).click();
		

		//6. Click on ADD TO CART

		driver.findElement(By.xpath("(//button[@type='submit'])[4]")).click();

		//7. Click on View
		
		driver.findElement(By.xpath("(//a[text()='View Cart'])[2]")).click();

		//8. Click on CHECK OUT

		driver.findElement(By.xpath("//input[@id='checkout']")).click();

		//Handle alert

		//9. Accept the alert
	
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}

