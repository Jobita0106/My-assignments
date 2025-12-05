package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//label[text()='FLIGHTS']")).click();
		 Set<String> windowHandle = driver.getWindowHandles();
		 
		 List<String> windowList = new ArrayList<String>(windowHandle);

	        String Window1 = windowList.get(0);//parent

	        String Window2 = windowList.get(1);//child

	        driver.switchTo().window(Window2);
	        String window = driver.getTitle();
	        System.out.println("Flights Window Title:"+window);

	        driver.switchTo().window(Window1);
	        driver.close();
		 
	}

}
