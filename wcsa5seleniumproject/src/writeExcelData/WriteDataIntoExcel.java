package writeExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//Write the data into excel sheet
		 FileInputStream fis = new FileInputStream("./data/Testdata.xlsx");//provide the path of excel file
		
		 //use Apache POI package library call workbookfactory class
		    Workbook wb = WorkbookFactory.create(fis);//we are making file for ready to read

		 Sheet sheet = wb.getSheet("IPL"); //read the sheet
		 //create the row by using sheet(I)
		 Row row = sheet.createRow(11);
    
		 //create the cell by using Row(I)
		 Cell cell = row.createCell(0);
		 
		 //write the data into cell
		 cell.setCellValue("PUNE");
		 FileOutputStream fos = new FileOutputStream("./data/Testdata.xlsx");
		 
		 wb.write(fos);
		 
		  
		

	}

}
