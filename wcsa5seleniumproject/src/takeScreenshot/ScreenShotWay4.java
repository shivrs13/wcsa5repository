package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShotWay4 
{
    //upcast to remote webdriver
	
	public static void main(String[] args) throws InterruptedException, IOException 
	{System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	//upcast into remote webdriver
    RemoteWebDriver driver=new ChromeDriver();
 	driver.manage().window().maximize();
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 	Thread.sleep(2000);
 	driver.get("https://www.flipkart.com/");
 	
 	
 	// take screeshot using driver variable
 	File src = driver.getScreenshotAs(OutputType.FILE);
 	File dest = new File("./screenshot/flipkart.png");
	Files.copy(src, dest);
		

	}

}
