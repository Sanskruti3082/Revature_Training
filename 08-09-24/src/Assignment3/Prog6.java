package Assignment3;
import java.util.Arrays;
import java.util.Scanner;
public class Prog6 {
public static void main(String[] args) {
	       
	        Scanner s = new Scanner(System.in);
	        
	        String[] friends = new String[10];
	        
	    
	        System.out.println("Enter the names of 10 friends:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Friend " + (i + 1) + ": ");
	            friends[i] = s.nextLine();
	        }
	        
	        Arrays.sort(friends);
	        
	       
	        System.out.println("Friends names in alphabetical order:");
	        for (String friend : friends) {
	            System.out.println(friend);
	        }
	        
	      
	    }
	}

