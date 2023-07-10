package writeExcelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLoginTestCase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		  driver.get("http://desktop-5o2ugrj/login.do");
		  
		  FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");//provide the path of excel file
		 //use Apache POI library call workbookfactory class
		  Workbook wb = WorkbookFactory.create(fis);//we are making file for ready to read
		  Sheet sheet = wb.getSheet("validcred");//using object reference variable wb,get into our excel sheet i.e.IPL
	      Row row = sheet.getRow(1);//get into the desired row
		  Cell cell = row.getCell(0);//get into the desired cell/column
		  String validUsername = cell.getStringCellValue();
		  Thread.sleep(2000);
		  
		  FileInputStream fis2 = new FileInputStream("./data/ActiTimeTestData.xlsx");//provide the path of excel file
			 //use Apache POI library call workbookfactory class
	      Workbook wb1 = WorkbookFactory.create(fis2);//we are making file for ready to read
		  Sheet sheet1 = wb1.getSheet("validcred");//using object reference variable wb,get into our excel sheet i.e.IPL
		  Row row1 = sheet1.getRow(1);//get into the desired row
		  Cell cell1 = row1.getCell(1);//get into the desired cell/column
		  String validPassward = cell1.getStringCellValue();
		  Thread.sleep(2000);
			  
		  driver.findElement(By.name("username")).sendKeys("validUsername");
	      driver.findElement(By.name("pwd")).sendKeys("validPassward");
		  Thread.sleep(2000);
		  driver.findElement(By.id("loginButton")).click();
		

	}

}
