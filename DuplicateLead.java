package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

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
		
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		
		driver.findElement(By.name("emailAddress")).sendKeys("sairavali.g@gmail.com");
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		if(driver.getTitle().contains("Dulpcate")){
			System.out.println("I confirm the title has Duplicate Lead");
			
			} 
			else 
				System.out.println("The title doesnot have word Duplicate Lead");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.close();

	}

}














//1. Launch the browser
//2	Enter the username
//3	Enter the password
//4	Click Login
//5	Click crm/sfa link
//6	Click Leads link
//7	Click Find leads
//8	Click on Email
//9	Enter Email
//10	Click find leads button
//11	Capture name of First Resulting lead
//12	Click First Resulting lead
//13	Click Duplicate Lead
//14	Verify the title as 'Duplicate Lead'
//15	Click Create Lead
//16	Confirm the duplicated lead name is same as captured name
//17	Close the browser (Do not log out)