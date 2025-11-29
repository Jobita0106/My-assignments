package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		  options.addArguments("guest");
		  
		  ChromeDriver driver = new ChromeDriver(options);
		  driver.get("http://leaftaps.com/opentaps/.");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf Solutions");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jobita");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Christy");
		  driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("JC");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jobitachristy0106@gmail.com");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9344295390");
		  
		  WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		  Select stateName = new Select(state);
		  stateName.selectByVisibleText("New York");
		    
		  driver.findElement(By.className("smallSubmit")).click();
		  driver.findElement(By.linkText("Edit")).click();
		  
		  WebElement descriptionName = driver.findElement(By.id("updateLeadForm_description"));
		  descriptionName.clear();
		     
		  driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Important note: Lead updated successfully.");
		  driver.findElement(By.className("smallSubmit")).click();
		  System.out.println(driver.getTitle());
	      driver.quit();

	}

}
