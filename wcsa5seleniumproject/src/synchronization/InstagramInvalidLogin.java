package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramInvalidLogin {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("bhatshivani19@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Vani@19");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}
}



