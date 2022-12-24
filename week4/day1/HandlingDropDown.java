package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));


		//1. Load https://buythevalue.in/
		driver.get("https://leafground.com/select.xhtml;jsessionid=node01b6hhw7csjf211q4hnvqtdlyg710515.node0");
		
		//1.Which is your favorite UI Automation tool?
		
		WebElement ui = driver.findElement(By.className("ui-selectonemenu"));
		
		Select dd1 = new Select(ui);
		dd1.selectByVisibleText("Selenium");
		
		//2.Choose your preferred country.
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath(".//div[@class='ui-selectonemenu-items-wrapper']//following::li[3]")).click();
		
		//4.Choose the Course
		
		driver.findElement(By.xpath("//h5[text()='Choose the Course']/following::div/button")).click();
		
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		
		//4.Choose language randomly
		
		driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::label)[3]")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		
		//5.Choose "TWO" irrespective of language
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='ui-helper-hidden-accessible']/following-sibling::label)[4]")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		System.out.println("Title of the page is:" +driver.getTitle() );

	}

}
