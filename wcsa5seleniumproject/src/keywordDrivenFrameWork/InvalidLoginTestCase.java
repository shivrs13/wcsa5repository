package keywordDrivenFrameWork;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest{
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		
		Flib flib = new Flib();
		
		int rc = flib.getLastRowCount(EXCEL_PATH, "invalidcred");
		
		for(int i=1;i<=rc;i++)
		{
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH,"invalidcred",i,0));
            driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH,"invalidcred",i,1));
            driver.findElement(By.id("loginButton")).click();
            driver.findElement(By.name("username")).clear();
		}
		
		bt.closeBrowser();
	}

}


