package keywordDrivenFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	public String readExcelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(rowCount);
		String data = cell.getStringCellValue();
		return data;
	}

	public int getLastRowCount(String excelPath,String sheetName)throws EncryptedDocumentException, IOException
	{   
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file
	    Workbook wb = WorkbookFactory.create(fis); // make the file for ready to read
	    Sheet sheet = wb.getSheet(sheetName);// get into the sheet
	    int rc = sheet.getLastRowNum();
		return rc;
    }
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);// provide the path of file
	    Workbook wb = WorkbookFactory.create(fis); // make the file for ready to read
	    Sheet sheet = wb.getSheet(sheetName);// get into the sheet
	     Row row = sheet.getRow(rowCount); // get into the desired row
	    Cell cell = row.createCell(cellCount);//get into the desired cell/column
	    cell.setCellValue(data);
	    FileOutputStream fos=new FileOutputStream(excelPath);
	    wb.write(fos);
	}
	
	//it is used to read the data from property file
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		//create the object of properties class
				Properties prop = new Properties();
				
				//make a file ready to read
				prop.load(fis);
				
				//read perticular property from file
				String data = prop.getProperty("Passward");
				
				return data;
	}

	 
	}


