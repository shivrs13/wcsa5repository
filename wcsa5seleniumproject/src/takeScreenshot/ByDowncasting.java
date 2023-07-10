package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDowncasting
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 	WebDriver driver=new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 	Thread.sleep(2000);
		 	driver.get("https://www.facebook.com/login/");
	
		 RemoteWebDriver rwd = (RemoteWebDriver)driver;
		 File src = rwd.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./screenshot/Facebook.png");
		 Files.copy(src, dest);
		 
		 

		

	}

}
