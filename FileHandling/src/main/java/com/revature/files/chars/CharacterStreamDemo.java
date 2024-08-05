package com.revature.files.chars;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
	public static void main(String[] args) {
		FileReader inputReader=null;
		FileWriter outputWriter=null;
		
		try {
			inputReader=new FileReader("E:\\filehandling\\hello.txt");
		    outputWriter=new FileWriter("E:\\filehandling\\helloAgainChars.txt");
			int c;
		    try {
				while((c=inputReader.read())!=-1)
					outputWriter.write(c);
				   
				    outputWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
