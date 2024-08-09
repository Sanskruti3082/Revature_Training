package Assignment3;

import java.util.Scanner;

public class Prog2 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	
	System.out.println("Enter your full name");
	String fullName=s.nextLine();
	
	s.close();
	String[] nameP=fullName.split(" ");
	
	if(nameP.length<3)
{
     System.out.println("Please enter full name");
     return;
}
	String fName=nameP[0];
	String mName=nameP[1];
	String lName=nameP[2];
	
	String firstInitial=fName.substring(0,1).toUpperCase();
	String middleInitial=mName.substring(0,1).toUpperCase();
	
	String abbreviateName=firstInitial+"."+middleInitial+"."+lName;
	System.out.println(abbreviateName);
}
}
