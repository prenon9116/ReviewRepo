package utility;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadFile {
	//To Read property file
	public static Properties readPropertyFile(String fileName) throws IOException {
		FileInputStream file = new FileInputStream(new File(fileName));
					/*
					 *To read any file we have to stream that file. FileInputStream can stream any type of file
					 *the fileInputStream constructor wants the location of the propertyFile or we can just create 
					 *a new object of File class and put the propertyFile name in the constructor
					 */
		
		Properties prop = new Properties();
					/*
					 * after the file is streamed we create an object of the Properties class as the file is a propertiesFile
					 */
		prop.load(file); //the load method loads the streamed file as a property file
		
		return prop; //we return the value of prop = new Properties() so that we can have the same reference of properties class in which we load our properties file in
		
	}

}
