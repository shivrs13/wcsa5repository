package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Wcsa5 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/"); // launch the bluestone web application
		Thread.sleep(2000);
		driver.findElement(By.id("denyBtn")).click(); // handle the popup.
		driver.findElement(By.xpath("//span[text()='Offers ']")).click();
		driver.findElement(By.xpath("//span[text()='25% Off your first Gold Mine installment']")).click();
		Thread.sleep(2000);
		driver.close();

		

	}

}
