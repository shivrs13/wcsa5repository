package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BluestoneFrameHandle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/"); // launch the bluestone web application
		Thread.sleep(2000);
        driver.findElement(By.id("denyBtn")).click(); // handle the popup.
		Thread.sleep(2000);
		//identify frame by using xpath
		//WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		//handle the frame by switch to controls to frame using //iframe after inspect
		driver.switchTo().frame(3);
		
		driver.findElement(By.id("chat-icon")).click();//clicking on chat icon
		Thread.sleep(2000);
		
		//handle the frame by switch to control on main web page
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.id("chat-fc-name")).sendKeys("shivani");
		driver.findElement(By.id("chat-fc-email")).sendKeys("abc@gamil.com");
		driver.findElement(By.id("chat-fc-phone")).sendKeys("1234567890");
		
		
		

	}

}
