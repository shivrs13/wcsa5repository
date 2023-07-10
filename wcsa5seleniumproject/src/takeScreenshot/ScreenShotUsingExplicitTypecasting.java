package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

public class ScreenShotUsingExplicitTypecasting {

	public static void main(String[] args) throws InterruptedException, IOException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 	WebDriver driver=new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 	Thread.sleep(2000);
		 	driver.get("https://www.google.com/");
		 	
		 	//typecasting from webdriver to takescreenshot
	
		TakesScreenshot ts=(TakesScreenshot)driver;
		//screenshot store in src
		 File src = ts.getScreenshotAs(OutputType.FILE);
		 
		 //give destination to store the screen shot i.e dest
		 File dest = new File("./screenshot/google.png");
		 Files.copy(src, dest);
		 

	}

}
