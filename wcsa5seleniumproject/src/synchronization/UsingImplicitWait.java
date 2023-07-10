package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {
	public static void main(String[] args)
	{
	System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.instagram.com/accounts/login/");
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("shivanik");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("shivani123");
	driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		
	}

	

	}


