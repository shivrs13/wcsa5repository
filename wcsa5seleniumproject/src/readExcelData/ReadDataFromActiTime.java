package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromActiTime {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Read data from actitime sheet
        //implementation of read the data from excelsheet of valid credentials:creating obj
		
	   FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");//provide the path of excel file
	   
	   //use Apache POI library call workbookfactory class
	   
	  Workbook wb = WorkbookFactory.create(fis);//we are making file for ready to read
	  
	  Sheet sheet = wb.getSheet("validcred");//using object reference variable wb,get into our excel sheet i.e.IPL
	 
	  //to read username and passward
	  Row row = sheet.getRow(1);//get into the desired row
	  Cell cell = row.getCell(1);//get into the desired cell/column
	  String data = cell.getStringCellValue();//read the data from cell
	  System.out.println(data);
	  
	  
	

	}

}
