package Testcases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC3 {
	WebDriver driver = null;
	@Test
	public void my_test()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Alka\\workspace2\\Integration\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		 Set<String> Ids= driver.getWindowHandles();
		 Iterator<String> It = Ids.iterator();
		 String ParentId = It.next();
		 String childId = It.next();
		 driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		 
		 
		
	}

}
