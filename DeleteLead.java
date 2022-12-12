package week2.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
			
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			
			driver.findElement(By.name("phoneNumber")).sendKeys("8056317686");
			
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			
			driver.findElement(By.linkText("Delete")).click();
			
			driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
			
			Thread.sleep(4000);
			
			String text = driver.findElement(By.className("x-paging-info")).getText();
			
			System.out.println(text);
			
			if (text.equals("No records to display")) {
				System.out.println("Text is matched");
			} else {
				System.out.println("Text is not matched");
			}
			driver.close();

	}

}






























//Delete Lead:
//	1	Launch the browser
//	2	Enter the username
//	3	Enter the password
//	4	Click Login
//	5	Click crm/sfa link
//	6	Click Leads link
//	7	Click Find leads
//	8	Click on Phone
//	9	Enter phone number
//	10	Click find leads button
//	11	Capture lead ID of First Resulting lead
//	12	Click First Resulting lead
//	13	Click Delete
//	14	Click Find leads
//	15	Enter captured lead ID
//	16	Click find leads button
//	17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
//	18	Close the browser (Do not log out)