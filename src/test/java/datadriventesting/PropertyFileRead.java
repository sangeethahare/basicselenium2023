package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileRead {

public static void main(String[] args) throws Throwable {
	//step1--open the file in java readable format
	FileInputStream file=new FileInputStream(".\\src\\test\\resources\\commondata.properties");
	//step 2-- create object of properties class
	Properties p=new Properties();
	//step 3--load the file input stream to properties
	p.load(file);
	//step4--use the key to get the value
	String un = p.getProperty("username");
	System.out.println("username="+un);
	String pwd = p.getProperty("password");
	System.out.println("password="+pwd);
}}
