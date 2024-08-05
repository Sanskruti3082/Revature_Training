package com.revature.files.bytes;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ByteStreamDemo1 {
	public static void main(String[] args) {
		
	FileInputStream input;
	FileOutputStream output;
	
	try {
		input= new FileInputStream("E:\\filehandling\\myfile.txt");
		   output=new FileOutputStream("E:\\filehandling\\myfilebyte.txt");
		int c;
		while((c=input.read())!=-1)
	    	//System.out.println(c);
			output.write(c);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
