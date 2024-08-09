package Assignment3;
import java.util.Scanner;
public class Prog3 {
public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter a string:");
	        String inputString = sc.nextLine();
	        
	    
	        
	        int vowel = 0;
	        int consonant = 0;
	        int digit = 0;
	        int whiteSpace = 0;
	        
	        String lowerCaseString = inputString.toLowerCase();
	        
	       
	        for (char ch : lowerCaseString.toCharArray()) {
	           
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowel++;
	            }
	            
	            else if (Character.isDigit(ch)) {
	                digit++;
	            }
	           
	            else if (Character.isWhitespace(ch)) {
	                whiteSpace++;
	            }
	      
	            else if (Character.isLetter(ch)) {
	                consonant++;
	            }
	        }
	        
	       
	        System.out.println("Number of vowels: " + vowel);
	        System.out.println("Number of consonants: " + consonant);
	        System.out.println("Number of digits: " + digit);
	        System.out.println("Number of white space characters: " + whiteSpace);
	    }
	

}

