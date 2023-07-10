package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathcase12 {

	public static void main(String[] args) throws InterruptedException
	{ 
		System.setProperty("Webdriver.chrome.driver","./drivers/chromedriver.exe");
	   WebDriver driver =new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://twitter.com/i/flow/login");
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@name='text']")).sendKeys("shivani13");//case1 of xpath using unique attribute
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//span[text()='Next']")).click();//case2 of xpath by using text()function
	   
	  
		
	}

	}

