package Assignment3;
import java.util.Scanner;
public class Prog5 {
 public static boolean isPalindrome(String s) {
	        int left = 0;
	        int right = s.length() - 1;
	        while (left < right) {
	            if (s.charAt(left) != s.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

public static String find(String input) {
	        StringBuilder result = new StringBuilder(input);
	        int length = input.length();

	        for (int i = 0; i < length; i++) {
	            for (int j = i + 2; j <= length; j++) {  
	                String substring = input.substring(i, j);
	                if (isPalindrome(substring)) {
	                    System.out.println("Palindrome: " + substring + " at positions: " + i + " to " + (j-1));
	                   
	                    for (int k = i; k < j; k++) {
	                        result.setCharAt(k, '*');
	                    }
	                }
	            }
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);
	        
	       
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        
	        String output = find(input);
	        
	       
	        System.out.println("Original String: " + input);
	        System.out.println("Modified String: " + output);
	        
	       
	    }
	}

	


