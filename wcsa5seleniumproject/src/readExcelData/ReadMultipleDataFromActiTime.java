package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromActiTime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Read data from acttime sheet
        //implementation of read multiple values/data from excelsheet by using for loop
		for(int i=1;i<=4;i++)
		{
		 FileInputStream fis = new FileInputStream("./data/ActiTimeTestdata.xlsx");//provide the path of excel file
		 
		 //use Apache POI library call workbookfactory class
		   
		  Workbook wb = WorkbookFactory.create(fis);//we are making file for ready to read
		  
		  Sheet sheet = wb.getSheet("invalidcred");//using object reference variable wb,get into our excel sheet i.e.IPL
		 
		  
		  Row row = sheet.getRow(i);//get into the desired row
		 
		  Cell cell = row.getCell(0);//get into the desired cell/column
		  
		  String data = cell.getStringCellValue();//read the data from cell
		 Thread.sleep(2000);
		 System.out.println(data);
		  }
		for(int i=1;i<=4;i++)
		{
		 FileInputStream fis = new FileInputStream("./data/ActiTimeTestdata.xlsx");//provide the path of excel file
		 
		 //use Apache POI library call workbookfactory class
		   
		  Workbook wb = WorkbookFactory.create(fis);//we are making file for ready to read
		  
		  Sheet sheet = wb.getSheet("invalidcred");//using object reference variable wb,get into our excel sheet i.e.IPL
		 
		 
		  Row row = sheet.getRow(i);//get into the desired row
		 
		  Cell cell = row.getCell(1);//get into the desired cell/column
		  
		  String data = cell.getStringCellValue();//read the data from cell
		 Thread.sleep(2000);
		 System.out.println(data);
		   
		}

	}

}
