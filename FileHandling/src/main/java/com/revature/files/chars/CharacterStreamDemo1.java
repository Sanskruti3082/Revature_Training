package com.revature.files.chars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo1 {
public static void main(String[] args) {
	FileReader inputReader=null;
	FileWriter outputWriter=null;
	
	try {
		inputReader=new FileReader("E:\\filehandling\\myfile.jpg");
	    outputWriter=new FileWriter("E:\\filehandling\\myfilechars.jpg");
	    int c;
	    
	    while((c=inputReader.read())!=-1)
	    	outputWriter.write(c);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
//u will not be able to see the myfilechar img as it is not poss we cn use character for text n all for img vdos use byte