package com.revature.files.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class EmployeeSerialize {
	private static final Logger logger = LoggerFactory.getLogger(EmployeeSerialize.class);
public static void main(String[] args) {
	
	FileOutputStream fos=null;
	ObjectOutputStream oos;
	
	Employee emp=null;
	
	//write employee object to file
	try {
		
		logger.trace("Trace");
		logger.debug("Debug");
		logger.info("Info");
		logger.warn("Warn");
		logger.error("Error");
		logger.debug("Opening file for writing Object");
		System.out.println("Opening file for writing object");
		fos=new FileOutputStream("E:\\filehandling\\employee.dat");
	    oos=new ObjectOutputStream(fos);
	    logger.info("Creating Object");
	    emp=new Employee(101,"Sanskruti","Student");
	    oos.writeObject(emp);
	   logger.info("Object written to file -- Serialized");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//till now nothing will print
	
// Read Employee Object to a file

	FileInputStream fis=null;
	ObjectInputStream ois;
Employee fromFileEmployee;

try {
	fis=new FileInputStream("E:\\filehandling\\employee.dat");
    ois=new ObjectInputStream(fis);
    fromFileEmployee=(Employee) ois.readObject();
    System.out.println(fromFileEmployee);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}
}

//employee.dat