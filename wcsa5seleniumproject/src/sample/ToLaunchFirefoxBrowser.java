package sample;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFirefoxBrowser {

	public static void main(String[] args) 
	{   
		//Relaive path for driver executable file
		
		 System.setProperty("webDriver.gecko.driver", "./drivers/geckodriver.exe");
			
		 new FirefoxDriver();  //Launch Firefox Browser
	

	}

}















































































