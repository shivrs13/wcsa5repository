package actionsclassmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException 
	{
		//use to perform double click
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  //launch the actitime
		  
		  driver.get("http://desktop-5o2ugrj/login.do");
		  
		 // new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedCondition.titleContains());
		  driver.findElement(By.name("username")).sendKeys("admin");
		  driver.findElement(By.name("pwd")).sendKeys("manager");
		  driver.findElement(By.id("loginButton")).click();
		//  new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions .titleContains(null));
		  // click on setting Module..
	     	driver.findElement(By.xpath("//div[text()='Settings']/ancestor::a")).click();
	     // click on logo and color
	     	driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
	     	Thread.sleep(2000);
	     	
	     	// click on use custom logo
	     	driver.findElement(By.id("uploadNewLogoOption")).click();
	     	
	     	// click on button to select the file
	     //	driver.findElement(By.name("formCustomInterfaceLogo.logo")).click();
	     	// perform Double Click
	     	WebElement target = driver.findElement(By.name("formCustomInterfaceLogo.logo"));
	     	
	     	Actions act = new Actions(driver);
	     	act.doubleClick(target).perform();
	     	
	     	Thread.sleep(2000);
	     	 driver.quit();
          
	}

}
