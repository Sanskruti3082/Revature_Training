package Assignment;
import java.util.Scanner;
public class Prog2 {
   public static void main(String[] args) {
	
	   Scanner sc=new Scanner(System.in);
	   
	   int marks=sc.nextInt();
	   
	   if (marks>=0 && marks<25) 
	   {
		System.out.println("F grade");
	   }
	   else if (marks>=25 && marks<45) {
		System.out.println("E grade");
	   }
	   else if (marks>=45 && marks<50) {
		System.out.println("D grade");
	   }
	   else if (marks>=50 && marks<60) {
		System.out.println("C grade");
	   }
	   else if (marks>=60 && marks<80) {
		System.out.println("B grade");
	   }
	   else if (marks>=80 && marks<=100) {
		System.out.println("A grade");
	   }
	   else {
		System.out.println("Invalid input");
	   }
	  
}
}
