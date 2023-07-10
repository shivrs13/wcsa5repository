package sample;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchChromeBrowser {

	public static void main(String[] args) 
	{   System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		new ChromeDriver();
		
	}

}
