package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotWay3 {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		//by creating object of browser specific classes
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		//creating obj and store it in same driver
	 	ChromeDriver cdriver = new ChromeDriver();
	 	cdriver.manage().window().maximize();
	 	cdriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 	Thread.sleep(2000);
	 	cdriver.get("https://www.selenium.dev");
	 	
	 	File src = cdriver.getScreenshotAs(OutputType.FILE); //output type of screenshot store in src
	 	
	 	File dest = new File("./screenshot/screenshot.jpg");//store it in the dest
	 	Files.copy(src, dest);
	 	
	 	
		

	}

}
