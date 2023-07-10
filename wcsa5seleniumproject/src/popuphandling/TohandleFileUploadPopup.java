package popuphandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TohandleFileUploadPopup {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 Thread.sleep(2000);
		 //launch the window application
		 driver.get("http://desktop-5o2ugrj/login.do");
		  
		
		  driver.findElement(By.name("username")).sendKeys("admin");
		  Thread.sleep(2000);
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
		  Thread.sleep(2000); 
		  // click on setting Module..
	     	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
	     // click on logo and color
	     	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	     	Thread.sleep(2000);
	     	// click on use custom logo
	     	driver.findElement(By.id("uploadNewLogoOption")).click();
	     	// perform Double Click
	     	WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	     	
		 Actions act = new Actions(driver);
		 Thread.sleep(2000);
	     act.doubleClick(target).perform();
	    
	     File dest = new File("./autoitprograms/VBfileupload.exe");
	     String abspath = dest.getAbsolutePath();
	     Runtime.getRuntime().exec(abspath);	
	     Thread.sleep(2000);
	     driver.quit();
		

	}

}