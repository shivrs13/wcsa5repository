package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathnetflix2
{
	//xpath case2 using text() function
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.netflix.com/in/Login");
	      Thread.sleep(2000);
	     driver.findElement(By.xpath("//label[text()='Email or phone number']")).sendKeys("shivani@gmail.com");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//label[text()='Password']")).sendKeys("shivani@123");
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[text()='Sign In']")).click();
	      
	      
	      
	      
		
	}

	

}
