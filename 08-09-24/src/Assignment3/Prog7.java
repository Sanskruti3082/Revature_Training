package Assignment3;
import java.util.Scanner;
public class Prog7 {
	    public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.print("Enter the sentence: ");
	        String sentence = sc.nextLine();
	        
	  
	        System.out.print("Enter the substring to be replaced: ");
	        String oldSubstring = sc.nextLine();
	        
	 
	        System.out.print("Enter the new substring: ");
	        String newSubstring = sc.nextLine();
	        

	        String newSentence = sentence.replace(oldSubstring, newSubstring);
	        
	     
	        System.out.println("The new sentence is: " + newSentence);

	    }
	}

