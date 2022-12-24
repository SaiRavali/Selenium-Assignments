package week4.day2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));


		//1. Load the URL
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");

		// find the frame 1
		WebElement frame1 = driver.findElement(By.id("frame1"));

		// switch to frame1
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//b[@id='topic']/following::input")).sendKeys("Selenium");

		// find the frame 3
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));

		// switch to frame 3
		driver.switchTo().frame(frame3);

		// find the checkbox

		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		if(! checkbox.isSelected()){
			checkbox.click();

		}	

		// switch to frame 2

		//before switching to frame 2, exit from frame 1 so used default content

		driver.switchTo().defaultContent();

		driver.switchTo().frame("frame2");

		//select from the dropdown
		WebElement dropdown = driver.findElement(By.id("animals"));

		Select dd1 = new Select(dropdown);
		//select the 'Baby Cat' 
		dd1.selectByVisibleText("Baby Cat");

		//		//switch to parent frame
		//		
		//		driver.switchTo().parentFrame();
		//		String text = driver.findElement(By.xpath("//b[@id='topic']/following::input")).getText();
		//		if(text.equals("Selenium")){
		//		System.out.println("Given Topic is Selenium");

	}
}



