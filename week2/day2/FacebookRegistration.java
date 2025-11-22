package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class FacebookRegistration {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Jobita");
		driver.findElement(By.name("lastname")).sendKeys("Christy");
		WebElement dayName = driver.findElement(By.id("day"));
	    Select day = new Select(dayName);
	    day.selectByVisibleText("1");
	    WebElement monthName = driver.findElement(By.id("month"));
	    Select month = new Select(monthName);
	    month.selectByVisibleText("Jun");
	    WebElement yearName = driver.findElement(By.id("year"));
	    Select year = new Select(yearName);
	    year.selectByVisibleText("2002");
	    driver.findElements(By.name("sex")).get(0).click();
	    driver.findElement(By.name("reg_email__")).sendKeys("christyjobi4567@gmail.com");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("Testing@4567");
	    driver.findElement(By.name("websubmit")).click();	    
	    
		
		

	}

}
