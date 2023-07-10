package assignmentPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathinsta3 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement( By.xpath("//input[@autocorrect='off' and @name='username']")).sendKeys("bhatshivani19@gmail.com");
		Thread.sleep(2000);
		driver.findElement( By.xpath("//input[@autocorrect='off' and @type='password']")).sendKeys("Vani@19");
		Thread.sleep(2000);
		driver.findElement( By.xpath("//button[@class='_acan _acap _acas _aj1-' and(text()='Log in')]")).click();
		
		
		
	}
	}



