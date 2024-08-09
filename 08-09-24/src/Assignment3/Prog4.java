package Assignment3;

import java.util.Scanner;

public class Prog4 {
	    public static void main(String[] args) {
	        
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter a string:");
	        String inputString= sc.nextLine();
	        
	        String newString=inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        
	        if (isPalindrome(newString)) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }
	   
	    private static boolean isPalindrome(String str) {
	       
	        StringBuilder original = new StringBuilder(str);
	        
	     
	        StringBuilder reversed = new StringBuilder(str).reverse();
	        
	        return original.toString().equals(reversed.toString());
	    }
	}

