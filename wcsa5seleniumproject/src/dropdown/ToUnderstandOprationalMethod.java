package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToUnderstandOprationalMethod {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("file:///C:/Users/Admin/Desktop/WCSA5/Selenium%20Data/webelements/multiselect.html");
	     WebElement multiSelectDD = driver.findElement(By.id("menu"));
	    Select sel = new Select(multiSelectDD);
	    
	    //ismultiple method
	    boolean result = sel.isMultiple();
	    System.out.println(result);
	    
	    //getoption method using for loop
	  //  List<WebElement> dropdownoption = sel.getOptions();
	   // for(int i=0;i<dropdownoption.size();i++)
	   // {  
	    //	String options = dropdownoption.get(i).getText();
	    	//System.out.println(options);
	    //}
	    
	    //getoption method using for each loop
	    List<WebElement> ops = sel.getOptions();
	    for(WebElement we:ops)
	    {
	    	String textofops = we.getText();
	    	System.out.println(textofops);
	    }
	    
	    //get first selected
	    for(int i=4;i<7;i++)
	    {
	    	sel.selectByIndex(i);
	  
	    }
	    WebElement firstoption = sel.getFirstSelectedOption();
	    System.out.println("first selected option is:"+firstoption.getText());
	    
	    
	    
		
	}

}
