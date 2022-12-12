package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://acme-test.uipath.com/login");
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");

		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("Title of the page is: " +driver.getTitle());
		
		driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
		
		
	}

}



//1. Load url "https://acme-test.uipath.com/login"
//2. Enter email as "kumar.testleaf@gmail.com"
//3. Enter Password as "leaf@12"
//4. Click login button
//5. Get the title of the page and print
//6. Click on Log Out
//7. Close the browser (use -driver.close())