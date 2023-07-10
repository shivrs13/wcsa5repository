package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollLeftright {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launch the browser
	 	WebDriver driver=new ChromeDriver();
	 	//maximize the browser
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 	Thread.sleep(2000);
	 	driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		//perform scroll right
		jse.executeScript("window.scrollBy(5000,0)");
		Thread.sleep(2000);
		//perform scroll left
		jse.executeScript("window.scrollBy(-5000,0)");

	}

}
