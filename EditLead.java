package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws Exception {


		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Ravali");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		System.out.println("The page title is:" +driver.getTitle());
		
		if(driver.getTitle().contains("View")){
		System.out.println("I confirm the title has View Lead");
		
		} 
		else 
			System.out.println("The title doesnot have word View Lead");
			
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();;
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Sirius");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.close();
		
	}	
		
}
		
		
		
		
		




























/*http://leaftaps.com/opentaps/control/main

 * 1	Launch the browser
 * 2	Enter the username
 * 3	Enter the password
 * 4	Click Login
 * 5	Click crm/sfa link
 * 6	Click Leads link
 * 7	Click Find leads
 * 8	Enter first name
 * 9	Click Find leads button
 * 10 Click on first resulting lead
 * 11 Verify title of the page
 * 12 Click Edit
 * 13 Change the company name
 * 14 Click Update
 * 15 Confirm the changed name appears
 * 16 Close the browser (Do not log out)
 */