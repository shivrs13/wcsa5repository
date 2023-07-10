package javaScriptExecuter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//Launch the browser
	 	WebDriver driver=new ChromeDriver();
	 	//maximize the browser
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 	Thread.sleep(2000);
	 	driver.get("file:///C:/Users/Admin/Desktop/WCSA5/disabledelement.html");
	 	
	 	driver.findElement(By.id("i1")).sendKeys("admin");
	 	//driver.findElement(By.id("i2")).sendKeys("manager");
	 	Thread.sleep(2000);
	 	JavascriptExecutor jse = (JavascriptExecutor)driver;
	 	//generate alert popup
	 	jse.executeScript("alert('Hello There')");
	 	
	 	driver.switchTo().alert().accept();
	 	//to handle disabled webelement
	 	jse.executeScript("document.getElementById('i2').value='manager'");
	 	Thread.sleep(2000);
	 	
	

	}

}
