package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();

		driver.findElement(By.name("firstname")).sendKeys("Sai");
		driver.findElement(By.name("lastname")).sendKeys("Ravali");

		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9003093548");

		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("testleaf@123");

		WebElement eleDay = driver.findElement(By.id("day"));
		Select day=new Select(eleDay);
		day.selectByIndex(29);

		WebElement eleMonth = driver.findElement(By.id("month"));
		Select month=new Select(eleMonth);
		month.selectByVisibleText("Jan");

		WebElement eleYear= driver.findElement(By.id("year"));
		Select year=new Select(eleYear);
		year.selectByVisibleText("1993");

		driver.findElement(By.xpath("//label[text()='Female']")).click();

		driver.close();



	}

}


//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
         
















//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 