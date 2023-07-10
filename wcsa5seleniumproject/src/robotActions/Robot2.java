package robotActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot2 {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 	WebDriver driver=new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 	Thread.sleep(2000);
		 	driver.get("https://www.selenium.dev/");
		 	WebElement target = driver.findElement(By.xpath("//span[text()='Downloads']"));
		 	Actions act = new Actions(driver);
			Thread.sleep(2000);
			act.contextClick(target).perform();
			Robot robot=new Robot();
			for(int i=0;i<6;i++)
			{
				robot.keyPress(KeyEvent.VK_PAGE_DOWN);
				robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		    }
			
	           robot.keyPress(KeyEvent.VK_ENTER);
		 	
		
		

	}

}
