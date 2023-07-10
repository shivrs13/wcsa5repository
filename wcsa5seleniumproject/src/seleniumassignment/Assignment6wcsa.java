package seleniumassignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6wcsa {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/"); // launch the bluestone web application.
		driver.findElement(By.id("denyBtn")).click(); // handle the popup.
		WebElement targetcoins = driver.findElement(By.xpath("//a[text()='Coins ']"));
		Actions act = new Actions(driver);
		act.moveToElement(targetcoins).perform();//clicking on coins
		driver.findElement(By.xpath("//span[text()='50 gram'][1]")).click();
		driver.findElement(By.xpath("//a[text()='Coins']")).click();
		driver.findElement(By.xpath("//span[text()='weight (Gram)']")).click();
		
		Robot root = new Robot();
		for(int i=1;i<4;i++)
		{
			root.keyPress(KeyEvent.VK_TAB);
			root.keyRelease(KeyEvent.VK_TAB);
		}
		root.keyPress(KeyEvent.VK_ENTER);
		root.keyRelease(KeyEvent.VK_ENTER);
		
		

	}

}
