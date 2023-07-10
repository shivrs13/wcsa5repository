package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException 
	{
		//read the data from config.property file
		
		FileInputStream fis = new FileInputStream("./Data/config.properties");
		
		//create the object of properties class
		Properties prop = new Properties();
		
		//make a file ready to read
		prop.load(fis);
		
		//read perticular property from file
		String data = prop.getProperty("Passward");
		
		//print the property at consol
		System.out.println(data);
		

	}

}
