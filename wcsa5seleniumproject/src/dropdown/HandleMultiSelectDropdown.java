package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleMultiSelectDropdown
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Desktop/WCSA5/Selenium%20Data/webelements/multiselect.html");
	     WebElement multiSelectDD = driver.findElement(By.id("menu"));
	    Select sel = new Select(multiSelectDD);
	    
	   //Using selection method
	    sel.selectByIndex(1);
	    Thread.sleep(2000);
	    sel.selectByVisibleText("rasmalai");
	    Thread.sleep(2000);
	    sel.selectByValue("v3");
	    
	    //Using deselection method
	    sel.deselectByIndex(1);
	    Thread.sleep(2000);
	    sel.deselectByVisibleText("rasmalai");
	    Thread.sleep(2000);
	    sel.deselectByValue("v3");
	    Thread.sleep(2000);
	    
	    //to select multiple options using for loop
	    for(int i=0;i<7;i++)
	    {
	    	sel.selectByIndex(i);
	    	Thread.sleep(1000);
	    }
	    Thread.sleep(3000);
	    //to deselect multiple options using for loop
	    for(int i=0;i<7;i++)
	    {
	    	sel.deselectByIndex(i);
	    	Thread.sleep(1000);
	    }
	    
	    	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	     
		 
		
		
	     
		
	}

	
}
