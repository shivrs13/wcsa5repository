package methodsOfWebDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//launch the browser
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 	Thread.sleep(2000);
		  //launch the web application
		  driver.get("http://omayo.blogspot.com/");
		//getting address of current window or parent window
		  String parenthandle = driver.getWindowHandle();
		  System.out.println("Address of parent window:"+parenthandle);
		  
		

	}

}
