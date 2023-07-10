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

public class AssignmentOnRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//apply Implicite wait
		
		driver.get("https://www.bluestone.com/"); // launch the bluestone web application.
		driver.findElement(By.id("denyBtn")).click(); // handle the hidden division popup.
		
		//click on watch jwellery
		Actions act = new Actions(driver);
		
		WebElement target = driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(2000);
		//Click and hold filter by text
		WebElement target2 = driver.findElement(By.xpath("//div[text()='Filter by']"));
		for(int i=1;i<=2;i++)
		{
			act.doubleClick(target2).perform();
			act.clickAndHold(target2).perform();
		}
		Thread.sleep(4000);
		//Copy the filter by text
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_C);
		
	
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_C);
		
		//identify the searchbox
		driver.findElement(By.id("search_query_top_elastic_search")).click();
		
		//paste the filter by text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		// verify 1 design Displayed or not
				if(driver.findElement(By.xpath("//span[text()='1 Designs']")).isDisplayed())
				{
					Thread.sleep(2000);
					driver.quit();
				}
				
				else 
				{
					System.out.println("Exception!!");
				}
		
		
		
		

	}

}
