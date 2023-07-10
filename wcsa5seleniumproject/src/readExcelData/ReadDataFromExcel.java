package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//Read data from IPL sheet
        //implementation of read the data from excel:creating obj
		
	   FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");//provide the path of excel file
	   
	   //use Apache POI library call workbookfactory class
	   
	  Workbook wb = WorkbookFactory.create(fis);//we are making file for ready to read
	  
	  Sheet sheet = wb.getSheet("IPL");//using object reference variable wb,get into our excel sheet i.e.IPL
	 
	  //to read name of player & team
	  Row row = sheet.getRow(2);//get into the desired row
	  Cell cell = row.getCell(0);//get into the desired cell/column
	  String data = cell.getStringCellValue();//read the data from cell
	  System.out.println(data);
	  
	  
	  
		
		

	}

}
