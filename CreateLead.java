package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager ");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Ravali");
		driver.findElement(By.id("lastNameField")).sendKeys("G");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sai");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Lakshmi");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.name("description")).sendKeys("Testleaf Selenium Course");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("sairavali.g@gmail.com");
		
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select drpDown=new Select(state);
		drpDown.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Edit")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.xpath("(//textarea[@name='importantNote'])[1]")).sendKeys("Important Note");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
