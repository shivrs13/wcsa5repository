package seleniumassignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2wcsa5 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/"); // launch the bluestone web application.
		driver.findElement(By.id("denyBtn")).click(); // handle the popup.
		WebElement targetcoins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(targetcoins).perform();//clicking on coins
		driver.findElement(By.xpath("//span[.='1 gram' and (@data-p='gold-coins-weight-1gms,m')]")).click();
		driver.close();

	}

}
